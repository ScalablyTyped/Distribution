package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindDevicesByDeviceIdentifierRequest extends js.Object {
  
  /** Required. Required. The device identifier to search for. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  
  /** Required. The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive. */
  var limit: js.UndefOr[String] = js.native
  
  /** A token specifying which result page to return. */
  var pageToken: js.UndefOr[String] = js.native
}
object FindDevicesByDeviceIdentifierRequest {
  
  @scala.inline
  def apply(): FindDevicesByDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierRequest]
  }
  
  @scala.inline
  implicit class FindDevicesByDeviceIdentifierRequestOps[Self <: FindDevicesByDeviceIdentifierRequest] (val x: Self) extends AnyVal {
    
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
    def setDeviceIdentifier(value: DeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
