package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoDial extends js.Object {
  
  var autoDial: Boolean = js.native
  
  var bootstrap: Enabled = js.native
  
  var webRTCStar: Enabled = js.native
}
object AutoDial {
  
  @scala.inline
  def apply(autoDial: Boolean, bootstrap: Enabled, webRTCStar: Enabled): AutoDial = {
    val __obj = js.Dynamic.literal(autoDial = autoDial.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any], webRTCStar = webRTCStar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDial]
  }
  
  @scala.inline
  implicit class AutoDialOps[Self <: AutoDial] (val x: Self) extends AnyVal {
    
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
    def setAutoDial(value: Boolean): Self = this.set("autoDial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrap(value: Enabled): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebRTCStar(value: Enabled): Self = this.set("webRTCStar", value.asInstanceOf[js.Any])
  }
}
