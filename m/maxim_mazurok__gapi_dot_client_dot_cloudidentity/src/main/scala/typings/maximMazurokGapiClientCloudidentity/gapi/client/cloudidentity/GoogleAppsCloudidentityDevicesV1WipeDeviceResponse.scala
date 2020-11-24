package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1WipeDeviceResponse extends js.Object {
  
  /** Resultant Device object for the action. Note that asset tags will not be returned in the device object. */
  var device: js.UndefOr[GoogleAppsCloudidentityDevicesV1Device] = js.native
}
object GoogleAppsCloudidentityDevicesV1WipeDeviceResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1WipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1WipeDeviceResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1WipeDeviceResponseOps[Self <: GoogleAppsCloudidentityDevicesV1WipeDeviceResponse] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: GoogleAppsCloudidentityDevicesV1Device): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
}
