package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseBusinessManager extends StObject {
  
  var top_posts_unit: PostsInsightsFeedResponseTopPostsUnit
}
object PostsInsightsFeedResponseBusinessManager {
  
  @scala.inline
  def apply(top_posts_unit: PostsInsightsFeedResponseTopPostsUnit): PostsInsightsFeedResponseBusinessManager = {
    val __obj = js.Dynamic.literal(top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseBusinessManager]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseBusinessManagerMutableBuilder[Self <: PostsInsightsFeedResponseBusinessManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTop_posts_unit(value: PostsInsightsFeedResponseTopPostsUnit): Self = StObject.set(x, "top_posts_unit", value.asInstanceOf[js.Any])
  }
}
