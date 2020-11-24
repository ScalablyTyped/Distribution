package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseRootObject extends js.Object {
  
  var data: PostsInsightsFeedResponseData = js.native
}
object PostsInsightsFeedResponseRootObject {
  
  @scala.inline
  def apply(data: PostsInsightsFeedResponseData): PostsInsightsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseRootObjectOps[Self <: PostsInsightsFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setData(value: PostsInsightsFeedResponseData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
