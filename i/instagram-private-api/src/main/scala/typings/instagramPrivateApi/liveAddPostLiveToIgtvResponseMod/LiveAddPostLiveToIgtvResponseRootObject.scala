package typings.instagramPrivateApi.liveAddPostLiveToIgtvResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveAddPostLiveToIgtvResponseRootObject extends js.Object {
  
  var igtv_post_id: Double = js.native
  
  var status: String = js.native
  
  var success: Boolean = js.native
}
object LiveAddPostLiveToIgtvResponseRootObject {
  
  @scala.inline
  def apply(igtv_post_id: Double, status: String, success: Boolean): LiveAddPostLiveToIgtvResponseRootObject = {
    val __obj = js.Dynamic.literal(igtv_post_id = igtv_post_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddPostLiveToIgtvResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveAddPostLiveToIgtvResponseRootObjectOps[Self <: LiveAddPostLiveToIgtvResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setIgtv_post_id(value: Double): Self = this.set("igtv_post_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
