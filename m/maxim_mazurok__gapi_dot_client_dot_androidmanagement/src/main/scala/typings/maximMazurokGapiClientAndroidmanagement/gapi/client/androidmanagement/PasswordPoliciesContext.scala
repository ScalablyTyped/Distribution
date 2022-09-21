package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordPoliciesContext extends StObject {
  
  /** The scope of non-compliant password. */
  var passwordPolicyScope: js.UndefOr[String] = js.undefined
}
object PasswordPoliciesContext {
  
  inline def apply(): PasswordPoliciesContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPoliciesContext]
  }
  
  extension [Self <: PasswordPoliciesContext](x: Self) {
    
    inline def setPasswordPolicyScope(value: String): Self = StObject.set(x, "passwordPolicyScope", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicyScopeUndefined: Self = StObject.set(x, "passwordPolicyScope", js.undefined)
  }
}
