package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse extends StObject {
  
  /** Devices meeting the list restrictions. */
  var deviceUsers: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1DeviceUser]] = js.undefined
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse](x: Self) {
    
    inline def setDeviceUsers(value: js.Array[GoogleAppsCloudidentityDevicesV1DeviceUser]): Self = StObject.set(x, "deviceUsers", value.asInstanceOf[js.Any])
    
    inline def setDeviceUsersUndefined: Self = StObject.set(x, "deviceUsers", js.undefined)
    
    inline def setDeviceUsersVarargs(value: GoogleAppsCloudidentityDevicesV1DeviceUser*): Self = StObject.set(x, "deviceUsers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
