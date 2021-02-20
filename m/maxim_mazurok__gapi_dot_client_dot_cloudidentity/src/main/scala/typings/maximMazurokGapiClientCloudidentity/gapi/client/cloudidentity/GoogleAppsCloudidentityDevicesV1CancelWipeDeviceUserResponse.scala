package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse extends StObject {
  
  /** Resultant DeviceUser object for the action. */
  var deviceUser: js.UndefOr[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.native
}
object GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceUser(value: GoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
