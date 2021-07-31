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
  
  @scala.inline
  def apply(): ClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimDeviceResponse]
  }
  
  @scala.inline
  implicit class ClaimDeviceResponseMutableBuilder[Self <: ClaimDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
  }
}
