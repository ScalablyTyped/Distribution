package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerUnclaim extends StObject {
  
  /** Required. Device ID of the device. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** Required. Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  
  /** Required. The section type of the device's provisioning record. */
  var sectionType: js.UndefOr[String] = js.undefined
  
  /** Optional. The duration of the vacation unlock starting from when the request is processed. (1 day is treated as 24 hours) */
  var vacationModeDays: js.UndefOr[Double] = js.undefined
  
  /** Optional. The expiration time of the vacation unlock. */
  var vacationModeExpireTime: js.UndefOr[String] = js.undefined
}
object PartnerUnclaim {
  
  @scala.inline
  def apply(): PartnerUnclaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerUnclaim]
  }
  
  @scala.inline
  implicit class PartnerUnclaimMutableBuilder[Self <: PartnerUnclaim] (val x: Self) extends AnyVal {
    
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
