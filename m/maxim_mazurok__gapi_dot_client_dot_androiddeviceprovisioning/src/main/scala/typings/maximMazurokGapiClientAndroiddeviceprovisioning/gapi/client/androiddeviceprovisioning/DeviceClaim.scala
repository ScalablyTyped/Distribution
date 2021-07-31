package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceClaim extends StObject {
  
  /** The ID of the Customer that purchased the device. */
  var ownerCompanyId: js.UndefOr[String] = js.undefined
  
  /** The ID of the reseller that claimed the device. */
  var resellerId: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of claim made on the device. */
  var sectionType: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the device will exit ‘vacation mode’. This value is present iff the device is in 'vacation mode'. */
  var vacationModeExpireTime: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the device was put into ‘vacation mode’. This value is present iff the device is in 'vacation mode'. */
  var vacationModeStartTime: js.UndefOr[String] = js.undefined
}
object DeviceClaim {
  
  @scala.inline
  def apply(): DeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceClaim]
  }
  
  @scala.inline
  implicit class DeviceClaimMutableBuilder[Self <: DeviceClaim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerCompanyId(value: String): Self = StObject.set(x, "ownerCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerCompanyIdUndefined: Self = StObject.set(x, "ownerCompanyId", js.undefined)
    
    @scala.inline
    def setResellerId(value: String): Self = StObject.set(x, "resellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResellerIdUndefined: Self = StObject.set(x, "resellerId", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
    
    @scala.inline
    def setVacationModeExpireTime(value: String): Self = StObject.set(x, "vacationModeExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVacationModeExpireTimeUndefined: Self = StObject.set(x, "vacationModeExpireTime", js.undefined)
    
    @scala.inline
    def setVacationModeStartTime(value: String): Self = StObject.set(x, "vacationModeStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVacationModeStartTimeUndefined: Self = StObject.set(x, "vacationModeStartTime", js.undefined)
  }
}
