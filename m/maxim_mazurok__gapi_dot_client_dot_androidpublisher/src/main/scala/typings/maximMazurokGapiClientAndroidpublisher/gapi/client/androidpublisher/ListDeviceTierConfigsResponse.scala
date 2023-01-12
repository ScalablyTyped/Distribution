package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceTierConfigsResponse extends StObject {
  
  /** Device tier configs created by the developer. */
  var deviceTierConfigs: js.UndefOr[js.Array[DeviceTierConfig]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDeviceTierConfigsResponse {
  
  inline def apply(): ListDeviceTierConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceTierConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeviceTierConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceTierConfigs(value: js.Array[DeviceTierConfig]): Self = StObject.set(x, "deviceTierConfigs", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierConfigsUndefined: Self = StObject.set(x, "deviceTierConfigs", js.undefined)
    
    inline def setDeviceTierConfigsVarargs(value: DeviceTierConfig*): Self = StObject.set(x, "deviceTierConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
