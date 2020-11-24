package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayDevice extends js.Object {
  
  /** Defines whether the instance has Display enabled. */
  var enableDisplay: js.UndefOr[Boolean] = js.native
}
object DisplayDevice {
  
  @scala.inline
  def apply(): DisplayDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayDevice]
  }
  
  @scala.inline
  implicit class DisplayDeviceOps[Self <: DisplayDevice] (val x: Self) extends AnyVal {
    
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
    def setEnableDisplay(value: Boolean): Self = this.set("enableDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDisplay: Self = this.set("enableDisplay", js.undefined)
  }
}
