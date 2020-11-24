package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseShareCount extends js.Object {
  
  var tray: PostsInsightsFeedResponseTray = js.native
}
object PostsInsightsFeedResponseShareCount {
  
  @scala.inline
  def apply(tray: PostsInsightsFeedResponseTray): PostsInsightsFeedResponseShareCount = {
    val __obj = js.Dynamic.literal(tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseShareCount]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseShareCountOps[Self <: PostsInsightsFeedResponseShareCount] (val x: Self) extends AnyVal {
    
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
    def setTray(value: PostsInsightsFeedResponseTray): Self = this.set("tray", value.asInstanceOf[js.Any])
  }
}
