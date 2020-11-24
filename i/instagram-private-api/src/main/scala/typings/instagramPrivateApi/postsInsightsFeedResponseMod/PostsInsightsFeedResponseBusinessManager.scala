package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseBusinessManager extends js.Object {
  
  var top_posts_unit: PostsInsightsFeedResponseTopPostsUnit = js.native
}
object PostsInsightsFeedResponseBusinessManager {
  
  @scala.inline
  def apply(top_posts_unit: PostsInsightsFeedResponseTopPostsUnit): PostsInsightsFeedResponseBusinessManager = {
    val __obj = js.Dynamic.literal(top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseBusinessManager]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseBusinessManagerOps[Self <: PostsInsightsFeedResponseBusinessManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTop_posts_unit(value: PostsInsightsFeedResponseTopPostsUnit): Self = this.set("top_posts_unit", value.asInstanceOf[js.Any])
  }
}
