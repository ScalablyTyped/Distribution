package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse extends StObject {
  
  /** Resultant DeviceUser object for the action. */
  var deviceUser: js.UndefOr[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceUserResponse](x: Self) {
    
    inline def setDeviceUser(value: GoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
