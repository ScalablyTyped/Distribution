package typings.ipfsCore.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRTCStarDiscovery extends js.Object {
  
  /**
    * - A boolean value for whether or not
    * webRTCStar should be active.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object WebRTCStarDiscovery {
  
  @scala.inline
  def apply(): WebRTCStarDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebRTCStarDiscovery]
  }
  
  @scala.inline
  implicit class WebRTCStarDiscoveryOps[Self <: WebRTCStarDiscovery] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
}
