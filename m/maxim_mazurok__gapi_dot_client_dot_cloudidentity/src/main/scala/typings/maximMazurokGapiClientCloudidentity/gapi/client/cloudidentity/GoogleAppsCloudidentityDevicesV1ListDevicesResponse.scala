package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1ListDevicesResponse extends StObject {
  
  /** Devices meeting the list restrictions. */
  var devices: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1Device]] = js.undefined
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1ListDevicesResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListDevicesResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1ListDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[GoogleAppsCloudidentityDevicesV1Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: GoogleAppsCloudidentityDevicesV1Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
