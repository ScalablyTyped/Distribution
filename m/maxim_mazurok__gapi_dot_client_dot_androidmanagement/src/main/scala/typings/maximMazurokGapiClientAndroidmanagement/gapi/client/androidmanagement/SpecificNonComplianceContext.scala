package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecificNonComplianceContext extends StObject {
  
  /** Additional context for non-compliance related to Wi-Fi configuration. See ONC_WIFI_INVALID_VALUE and ONC_WIFI_API_LEVEL */
  var oncWifiContext: js.UndefOr[OncWifiContext] = js.undefined
  
  /** Additional context for non-compliance related to password policies. See PASSWORD_POLICIES_PASSWORD_EXPIRED and PASSWORD_POLICIES_PASSWORD_NOT_SUFFICIENT. */
  var passwordPoliciesContext: js.UndefOr[PasswordPoliciesContext] = js.undefined
}
object SpecificNonComplianceContext {
  
  inline def apply(): SpecificNonComplianceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificNonComplianceContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecificNonComplianceContext] (val x: Self) extends AnyVal {
    
    inline def setOncWifiContext(value: OncWifiContext): Self = StObject.set(x, "oncWifiContext", value.asInstanceOf[js.Any])
    
    inline def setOncWifiContextUndefined: Self = StObject.set(x, "oncWifiContext", js.undefined)
    
    inline def setPasswordPoliciesContext(value: PasswordPoliciesContext): Self = StObject.set(x, "passwordPoliciesContext", value.asInstanceOf[js.Any])
    
    inline def setPasswordPoliciesContextUndefined: Self = StObject.set(x, "passwordPoliciesContext", js.undefined)
  }
}
