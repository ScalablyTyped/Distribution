package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseTopPostsUnit extends StObject {
  
  var top_posts: PostsInsightsFeedResponseTopPosts
}
object PostsInsightsFeedResponseTopPostsUnit {
  
  inline def apply(top_posts: PostsInsightsFeedResponseTopPosts): PostsInsightsFeedResponseTopPostsUnit = {
    val __obj = js.Dynamic.literal(top_posts = top_posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPostsUnit]
  }
  
  extension [Self <: PostsInsightsFeedResponseTopPostsUnit](x: Self) {
    
    inline def setTop_posts(value: PostsInsightsFeedResponseTopPosts): Self = StObject.set(x, "top_posts", value.asInstanceOf[js.Any])
  }
}
