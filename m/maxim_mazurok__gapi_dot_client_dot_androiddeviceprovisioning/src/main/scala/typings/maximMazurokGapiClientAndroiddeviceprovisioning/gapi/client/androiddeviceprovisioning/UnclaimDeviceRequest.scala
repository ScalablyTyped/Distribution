package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnclaimDeviceRequest extends js.Object {
  
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
  implicit class UnclaimDeviceRequestOps[Self <: UnclaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
    
    @scala.inline
    def setVacationModeDays(value: Double): Self = this.set("vacationModeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVacationModeDays: Self = this.set("vacationModeDays", js.undefined)
    
    @scala.inline
    def setVacationModeExpireTime(value: String): Self = this.set("vacationModeExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVacationModeExpireTime: Self = this.set("vacationModeExpireTime", js.undefined)
  }
}
