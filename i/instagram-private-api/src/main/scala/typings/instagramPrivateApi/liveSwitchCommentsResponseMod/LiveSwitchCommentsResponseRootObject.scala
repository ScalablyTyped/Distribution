package typings.instagramPrivateApi.liveSwitchCommentsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveSwitchCommentsResponseRootObject extends js.Object {
  
  var comment_muted: Double = js.native
  
  var status: String = js.native
}
object LiveSwitchCommentsResponseRootObject {
  
  @scala.inline
  def apply(comment_muted: Double, status: String): LiveSwitchCommentsResponseRootObject = {
    val __obj = js.Dynamic.literal(comment_muted = comment_muted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveSwitchCommentsResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveSwitchCommentsResponseRootObjectOps[Self <: LiveSwitchCommentsResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setComment_muted(value: Double): Self = this.set("comment_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
