package com.jfinal.qy.weixin.sdk.msg.send;

import java.util.ArrayList;
import java.util.List;


/**
 * 图文混排的消息
 * 
 * @author Javen
 * 
 */
public class QiYeNewsMsg extends QiYeBaseMsg {
	/**
	 * 图文消息个数，限制为10条以内
	 */
	private int ArticleCount;
	/**
	 * 多条图文消息信息，默认第一个item为大图
	 */
	private News news;


	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}


	public QiYeNewsMsg(int articleCount,News news) {
		super();
		ArticleCount = articleCount;
		this.news = news;
	}

	

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public QiYeNewsMsg() {
		super();
	}
}
