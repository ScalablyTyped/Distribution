package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesListResponse extends js.Object {
  
  /** A managed device. */
  var device: js.UndefOr[js.Array[Device]] = js.native
}
object DevicesListResponse {
  
  @scala.inline
  def apply(): DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesListResponse]
  }
  
  @scala.inline
  implicit class DevicesListResponseOps[Self <: DevicesListResponse] (val x: Self) extends AnyVal {
    
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
    def setDeviceVarargs(value: Device*): Self = this.set("device", js.Array(value :_*))
    
    @scala.inline
    def setDevice(value: js.Array[Device]): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
}
