package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceRegistriesResponse extends StObject {
  
  /** The registries that matched the query. */
  var deviceRegistries: js.UndefOr[js.Array[DeviceRegistry]] = js.native
  
  /** If not empty, indicates that there may be more registries that match the request; this value should be passed in a new `ListDeviceRegistriesRequest`. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListDeviceRegistriesResponse {
  
  @scala.inline
  def apply(): ListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceRegistriesResponse]
  }
  
  @scala.inline
  implicit class ListDeviceRegistriesResponseMutableBuilder[Self <: ListDeviceRegistriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceRegistries(value: js.Array[DeviceRegistry]): Self = StObject.set(x, "deviceRegistries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceRegistriesUndefined: Self = StObject.set(x, "deviceRegistries", js.undefined)
    
    @scala.inline
    def setDeviceRegistriesVarargs(value: DeviceRegistry*): Self = StObject.set(x, "deviceRegistries", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
