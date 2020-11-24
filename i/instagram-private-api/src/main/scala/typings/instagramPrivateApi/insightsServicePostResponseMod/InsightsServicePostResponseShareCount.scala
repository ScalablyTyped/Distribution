package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseShareCount extends js.Object {
  
  var post: InsightsServicePostResponsePost = js.native
  
  var tray: InsightsServicePostResponseTray = js.native
}
object InsightsServicePostResponseShareCount {
  
  @scala.inline
  def apply(post: InsightsServicePostResponsePost, tray: InsightsServicePostResponseTray): InsightsServicePostResponseShareCount = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseShareCount]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseShareCountOps[Self <: InsightsServicePostResponseShareCount] (val x: Self) extends AnyVal {
    
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
    def setPost(value: InsightsServicePostResponsePost): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTray(value: InsightsServicePostResponseTray): Self = this.set("tray", value.asInstanceOf[js.Any])
  }
}
