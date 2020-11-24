package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse extends js.Object {
  
  /** Resultant DeviceUser object for the action. */
  var deviceUser: js.UndefOr[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
}
object GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponseOps[Self <: GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse] (val x: Self) extends AnyVal {
    
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
    def setDeviceUser(value: GoogleAppsCloudidentityDevicesV1DeviceUser): Self = this.set("deviceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceUser: Self = this.set("deviceUser", js.undefined)
  }
}
