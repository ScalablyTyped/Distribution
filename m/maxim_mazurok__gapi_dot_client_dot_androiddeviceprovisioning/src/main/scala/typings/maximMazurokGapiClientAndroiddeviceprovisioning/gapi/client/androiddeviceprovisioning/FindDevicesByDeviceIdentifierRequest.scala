package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindDevicesByDeviceIdentifierRequest extends StObject {
  
  /** Required. Required. The device identifier to search for. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  
  /** Required. The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive. */
  var limit: js.UndefOr[String] = js.undefined
  
  /** A token specifying which result page to return. */
  var pageToken: js.UndefOr[String] = js.undefined
}
object FindDevicesByDeviceIdentifierRequest {
  
  inline def apply(): FindDevicesByDeviceIdentifierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindDevicesByDeviceIdentifierRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
