package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimDeviceResponse extends StObject {
  
  /** The device ID of the claimed device. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** The resource name of the device in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. */
  var deviceName: js.UndefOr[String] = js.undefined
}
object ClaimDeviceResponse {
  
  inline def apply(): ClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
  }
}
