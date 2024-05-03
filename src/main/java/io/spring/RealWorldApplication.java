package io.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.spring.core.article.Article;

@SpringBootApplication
public class RealWorldApplication {

  public static void main(String[] args) {
    Article article = new Article("123", "456", "body");
    article.doSomeTasks("title", "desc", "body");
    SpringApplication.run(RealWorldApplication.class, args);
    print("hello world");
  }
}
