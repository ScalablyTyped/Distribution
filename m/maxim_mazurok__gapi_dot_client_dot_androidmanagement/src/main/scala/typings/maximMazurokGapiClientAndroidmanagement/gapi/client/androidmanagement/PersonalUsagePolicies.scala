package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonalUsagePolicies extends StObject {
  
  /** Account types that can't be managed by the user. */
  var accountTypesWithManagementDisabled: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether camera is disabled. */
  var cameraDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Controls how long the work profile can stay off. The duration must be at least 3 days. */
  var maxDaysWithWorkOff: js.UndefOr[Double] = js.undefined
  
  /** Policy applied to applications in the personal profile. */
  var personalApplications: js.UndefOr[js.Array[PersonalApplicationPolicy]] = js.undefined
  
  /** Used together with personalApplications to control how apps in the personal profile are allowed or blocked. */
  var personalPlayStoreMode: js.UndefOr[String] = js.undefined
  
  /** Whether screen capture is disabled. */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.undefined
}
object PersonalUsagePolicies {
  
  inline def apply(): PersonalUsagePolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonalUsagePolicies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonalUsagePolicies] (val x: Self) extends AnyVal {
    
    inline def setAccountTypesWithManagementDisabled(value: js.Array[String]): Self = StObject.set(x, "accountTypesWithManagementDisabled", value.asInstanceOf[js.Any])
    
    inline def setAccountTypesWithManagementDisabledUndefined: Self = StObject.set(x, "accountTypesWithManagementDisabled", js.undefined)
    
    inline def setAccountTypesWithManagementDisabledVarargs(value: String*): Self = StObject.set(x, "accountTypesWithManagementDisabled", js.Array(value*))
    
    inline def setCameraDisabled(value: Boolean): Self = StObject.set(x, "cameraDisabled", value.asInstanceOf[js.Any])
    
    inline def setCameraDisabledUndefined: Self = StObject.set(x, "cameraDisabled", js.undefined)
    
    inline def setMaxDaysWithWorkOff(value: Double): Self = StObject.set(x, "maxDaysWithWorkOff", value.asInstanceOf[js.Any])
    
    inline def setMaxDaysWithWorkOffUndefined: Self = StObject.set(x, "maxDaysWithWorkOff", js.undefined)
    
    inline def setPersonalApplications(value: js.Array[PersonalApplicationPolicy]): Self = StObject.set(x, "personalApplications", value.asInstanceOf[js.Any])
    
    inline def setPersonalApplicationsUndefined: Self = StObject.set(x, "personalApplications", js.undefined)
    
    inline def setPersonalApplicationsVarargs(value: PersonalApplicationPolicy*): Self = StObject.set(x, "personalApplications", js.Array(value*))
    
    inline def setPersonalPlayStoreMode(value: String): Self = StObject.set(x, "personalPlayStoreMode", value.asInstanceOf[js.Any])
    
    inline def setPersonalPlayStoreModeUndefined: Self = StObject.set(x, "personalPlayStoreMode", js.undefined)
    
    inline def setScreenCaptureDisabled(value: Boolean): Self = StObject.set(x, "screenCaptureDisabled", value.asInstanceOf[js.Any])
    
    inline def setScreenCaptureDisabledUndefined: Self = StObject.set(x, "screenCaptureDisabled", js.undefined)
  }
}
