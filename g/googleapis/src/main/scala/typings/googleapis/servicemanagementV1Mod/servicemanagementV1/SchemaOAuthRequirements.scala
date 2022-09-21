package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOAuthRequirements extends StObject {
  
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
    
    inline def setCanonicalScopes(value: String): Self = StObject.set(x, "canonicalScopes", value.asInstanceOf[js.Any])
    
    inline def setCanonicalScopesNull: Self = StObject.set(x, "canonicalScopes", null)
    
    inline def setCanonicalScopesUndefined: Self = StObject.set(x, "canonicalScopes", js.undefined)
  }
}
