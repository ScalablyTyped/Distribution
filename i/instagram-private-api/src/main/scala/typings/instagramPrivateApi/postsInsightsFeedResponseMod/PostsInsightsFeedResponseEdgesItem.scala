package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseEdgesItem extends js.Object {
  
  var cursor: js.UndefOr[String] = js.native
  
  var node: PostsInsightsFeedResponseNode = js.native
}
object PostsInsightsFeedResponseEdgesItem {
  
  @scala.inline
  def apply(node: PostsInsightsFeedResponseNode): PostsInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseEdgesItem]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseEdgesItemOps[Self <: PostsInsightsFeedResponseEdgesItem] (val x: Self) extends AnyVal {
    
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
    def setNode(value: PostsInsightsFeedResponseNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
  }
}
