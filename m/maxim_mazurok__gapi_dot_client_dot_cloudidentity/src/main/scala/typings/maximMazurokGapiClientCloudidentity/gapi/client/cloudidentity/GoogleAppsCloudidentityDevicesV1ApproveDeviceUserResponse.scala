package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1ApproveDeviceUserResponse extends StObject {
  
  /** Resultant DeviceUser object for the action. */
  var deviceUser: js.UndefOr[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1ApproveDeviceUserResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ApproveDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ApproveDeviceUserResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ApproveDeviceUserResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1ApproveDeviceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceUser(value: GoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
