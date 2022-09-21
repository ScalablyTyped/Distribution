package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOAuthRequirements extends StObject {
  
  /**
    * UNIMPLEMENTED: If enabled, ESF will allow OAuth credentials with any scope, more details in http://go/esf-oauth-any-scope. WARNING: Enabling this option will bring security risks. Customers enabling this feature accidentally may have the risk of losing authentication enforcement. Please reach out to api-auth@ and esf-team@ for approval and allowlisting before you enable this option.
    */
  var allowAnyScope: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing any of these scopes will be accepted. Example: canonical_scopes: https://www.googleapis.com/auth/calendar, https://www.googleapis.com/auth/calendar.read
    */
  var canonicalScopes: js.UndefOr[String | Null] = js.undefined
}
object SchemaOAuthRequirements {
  
  inline def apply(): SchemaOAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOAuthRequirements]
  }
  
  extension [Self <: SchemaOAuthRequirements](x: Self) {
    
    inline def setAllowAnyScope(value: Boolean): Self = StObject.set(x, "allowAnyScope", value.asInstanceOf[js.Any])
    
    inline def setAllowAnyScopeNull: Self = StObject.set(x, "allowAnyScope", null)
    
    inline def setAllowAnyScopeUndefined: Self = StObject.set(x, "allowAnyScope", js.undefined)
    
    inline def setCanonicalScopes(value: String): Self = StObject.set(x, "canonicalScopes", value.asInstanceOf[js.Any])
    
    inline def setCanonicalScopesNull: Self = StObject.set(x, "canonicalScopes", null)
    
    inline def setCanonicalScopesUndefined: Self = StObject.set(x, "canonicalScopes", js.undefined)
  }
}
