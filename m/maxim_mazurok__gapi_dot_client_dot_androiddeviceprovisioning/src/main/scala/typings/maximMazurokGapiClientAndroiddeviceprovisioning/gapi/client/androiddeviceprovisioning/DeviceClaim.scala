package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceClaim extends js.Object {
  
  /** The ID of the Customer that purchased the device. */
  var ownerCompanyId: js.UndefOr[String] = js.native
  
  /** The ID of the reseller that claimed the device. */
  var resellerId: js.UndefOr[String] = js.native
  
  /** Output only. The type of claim made on the device. */
  var sectionType: js.UndefOr[String] = js.native
  
  /** The timestamp when the device will exit ‘vacation mode’. This value is present iff the device is in 'vacation mode'. */
  var vacationModeExpireTime: js.UndefOr[String] = js.native
  
  /** The timestamp when the device was put into ‘vacation mode’. This value is present iff the device is in 'vacation mode'. */
  var vacationModeStartTime: js.UndefOr[String] = js.native
}
object DeviceClaim {
  
  @scala.inline
  def apply(): DeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceClaim]
  }
  
  @scala.inline
  implicit class DeviceClaimOps[Self <: DeviceClaim] (val x: Self) extends AnyVal {
    
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
    def setOwnerCompanyId(value: String): Self = this.set("ownerCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerCompanyId: Self = this.set("ownerCompanyId", js.undefined)
    
    @scala.inline
    def setResellerId(value: String): Self = this.set("resellerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResellerId: Self = this.set("resellerId", js.undefined)
    
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
    
    @scala.inline
    def setVacationModeExpireTime(value: String): Self = this.set("vacationModeExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVacationModeExpireTime: Self = this.set("vacationModeExpireTime", js.undefined)
    
    @scala.inline
    def setVacationModeStartTime(value: String): Self = this.set("vacationModeStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVacationModeStartTime: Self = this.set("vacationModeStartTime", js.undefined)
  }
}
