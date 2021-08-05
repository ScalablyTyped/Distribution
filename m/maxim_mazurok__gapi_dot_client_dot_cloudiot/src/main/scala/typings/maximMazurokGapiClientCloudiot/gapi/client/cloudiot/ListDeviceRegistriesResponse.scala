package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceRegistriesResponse extends StObject {
  
  /** The registries that matched the query. */
  var deviceRegistries: js.UndefOr[js.Array[DeviceRegistry]] = js.undefined
  
  /** If not empty, indicates that there may be more registries that match the request; this value should be passed in a new `ListDeviceRegistriesRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDeviceRegistriesResponse {
  
  inline def apply(): ListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceRegistriesResponse]
  }
  
  extension [Self <: ListDeviceRegistriesResponse](x: Self) {
    
    inline def setDeviceRegistries(value: js.Array[DeviceRegistry]): Self = StObject.set(x, "deviceRegistries", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistriesUndefined: Self = StObject.set(x, "deviceRegistries", js.undefined)
    
    inline def setDeviceRegistriesVarargs(value: DeviceRegistry*): Self = StObject.set(x, "deviceRegistries", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
