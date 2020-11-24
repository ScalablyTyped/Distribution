package typings.instagramPrivateApi.checkpointResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckpointResponseChallenge extends js.Object {
  
  var api_path: String = js.native
  
  var hide_webview_header: Boolean = js.native
  
  var lock: Boolean = js.native
  
  var logout: Boolean = js.native
  
  var native_flow: Boolean = js.native
  
  var url: String = js.native
}
object CheckpointResponseChallenge {
  
  @scala.inline
  def apply(
    api_path: String,
    hide_webview_header: Boolean,
    lock: Boolean,
    logout: Boolean,
    native_flow: Boolean,
    url: String
  ): CheckpointResponseChallenge = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], hide_webview_header = hide_webview_header.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], native_flow = native_flow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointResponseChallenge]
  }
  
  @scala.inline
  implicit class CheckpointResponseChallengeOps[Self <: CheckpointResponseChallenge] (val x: Self) extends AnyVal {
    
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
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_webview_header(value: Boolean): Self = this.set("hide_webview_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogout(value: Boolean): Self = this.set("logout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative_flow(value: Boolean): Self = this.set("native_flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
