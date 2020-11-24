package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalUsagePolicies extends js.Object {
  
  /** Account types that can't be managed by the user. */
  var accountTypesWithManagementDisabled: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether camera is disabled. */
  var cameraDisabled: js.UndefOr[Boolean] = js.native
  
  /** Controls how long the work profile can stay off. */
  var maxDaysWithWorkOff: js.UndefOr[Double] = js.native
  
  /** Policy applied to applications in the personal profile. */
  var personalApplications: js.UndefOr[js.Array[PersonalApplicationPolicy]] = js.native
  
  /** Used together with personalApplications to control how apps in the personal profile are allowed or blocked. */
  var personalPlayStoreMode: js.UndefOr[String] = js.native
  
  /** Whether screen capture is disabled. */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.native
}
object PersonalUsagePolicies {
  
  @scala.inline
  def apply(): PersonalUsagePolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonalUsagePolicies]
  }
  
  @scala.inline
  implicit class PersonalUsagePoliciesOps[Self <: PersonalUsagePolicies] (val x: Self) extends AnyVal {
    
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
    def setAccountTypesWithManagementDisabledVarargs(value: String*): Self = this.set("accountTypesWithManagementDisabled", js.Array(value :_*))
    
    @scala.inline
    def setAccountTypesWithManagementDisabled(value: js.Array[String]): Self = this.set("accountTypesWithManagementDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountTypesWithManagementDisabled: Self = this.set("accountTypesWithManagementDisabled", js.undefined)
    
    @scala.inline
    def setCameraDisabled(value: Boolean): Self = this.set("cameraDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraDisabled: Self = this.set("cameraDisabled", js.undefined)
    
    @scala.inline
    def setMaxDaysWithWorkOff(value: Double): Self = this.set("maxDaysWithWorkOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDaysWithWorkOff: Self = this.set("maxDaysWithWorkOff", js.undefined)
    
    @scala.inline
    def setPersonalApplicationsVarargs(value: PersonalApplicationPolicy*): Self = this.set("personalApplications", js.Array(value :_*))
    
    @scala.inline
    def setPersonalApplications(value: js.Array[PersonalApplicationPolicy]): Self = this.set("personalApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalApplications: Self = this.set("personalApplications", js.undefined)
    
    @scala.inline
    def setPersonalPlayStoreMode(value: String): Self = this.set("personalPlayStoreMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalPlayStoreMode: Self = this.set("personalPlayStoreMode", js.undefined)
    
    @scala.inline
    def setScreenCaptureDisabled(value: Boolean): Self = this.set("screenCaptureDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenCaptureDisabled: Self = this.set("screenCaptureDisabled", js.undefined)
  }
}
