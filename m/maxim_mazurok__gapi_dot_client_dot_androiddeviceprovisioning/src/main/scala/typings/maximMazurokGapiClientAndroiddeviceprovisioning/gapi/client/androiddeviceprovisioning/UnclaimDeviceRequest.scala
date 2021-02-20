package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnclaimDeviceRequest extends StObject {
  
  /** Required. The device ID returned by `ClaimDevice`. */
  var deviceId: js.UndefOr[String] = js.native
  
  /** Required. The device identifier you used when you claimed this device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  
  /** Required. The section type of the device's provisioning record. */
  var sectionType: js.UndefOr[String] = js.native
  
  /** The duration of the vacation unlock starting from when the request is processed. (1 day is treated as 24 hours) */
  var vacationModeDays: js.UndefOr[Double] = js.native
  
  /** The expiration time of the vacation unlock. */
  var vacationModeExpireTime: js.UndefOr[String] = js.native
}
object UnclaimDeviceRequest {
  
  @scala.inline
  def apply(): UnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnclaimDeviceRequest]
  }
  
  @scala.inline
  implicit class UnclaimDeviceRequestMutableBuilder[Self <: UnclaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
    
    @scala.inline
    def setVacationModeDays(value: Double): Self = StObject.set(x, "vacationModeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVacationModeDaysUndefined: Self = StObject.set(x, "vacationModeDays", js.undefined)
    
    @scala.inline
    def setVacationModeExpireTime(value: String): Self = StObject.set(x, "vacationModeExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVacationModeExpireTimeUndefined: Self = StObject.set(x, "vacationModeExpireTime", js.undefined)
  }
}
