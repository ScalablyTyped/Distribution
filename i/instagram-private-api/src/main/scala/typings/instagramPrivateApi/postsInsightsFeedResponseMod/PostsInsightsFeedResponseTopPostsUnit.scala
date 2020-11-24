package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseTopPostsUnit extends js.Object {
  
  var top_posts: PostsInsightsFeedResponseTopPosts = js.native
}
object PostsInsightsFeedResponseTopPostsUnit {
  
  @scala.inline
  def apply(top_posts: PostsInsightsFeedResponseTopPosts): PostsInsightsFeedResponseTopPostsUnit = {
    val __obj = js.Dynamic.literal(top_posts = top_posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTopPostsUnit]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseTopPostsUnitOps[Self <: PostsInsightsFeedResponseTopPostsUnit] (val x: Self) extends AnyVal {
    
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
    def setTop_posts(value: PostsInsightsFeedResponseTopPosts): Self = this.set("top_posts", value.asInstanceOf[js.Any])
  }
}
