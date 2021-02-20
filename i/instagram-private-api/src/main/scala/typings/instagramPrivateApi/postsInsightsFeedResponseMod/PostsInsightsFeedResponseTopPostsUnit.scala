package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseTopPostsUnit extends StObject {
  
  var top_posts: PostsInsightsFeedResponseTopPosts = js.native
}
object PostsInsightsFeedResponseTopPostsUnit {
  
  @scala.inline
  def apply(top_posts: PostsInsightsFeedResponseTopPosts): PostsInsightsFeedResponseTopPostsUnit = {
    val __obj = js.Dynamic.literal(top_posts = top_posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPostsUnit]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseTopPostsUnitMutableBuilder[Self <: PostsInsightsFeedResponseTopPostsUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTop_posts(value: PostsInsightsFeedResponseTopPosts): Self = StObject.set(x, "top_posts", value.asInstanceOf[js.Any])
  }
}
