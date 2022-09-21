package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPoliciesScopedList extends StObject {
  
  /**
    * A list of SecurityPolicies contained in this scope.
    */
  var securityPolicies: js.UndefOr[js.Array[SchemaSecurityPolicy]] = js.undefined
  
  /**
    * Informational warning which replaces the list of security policies when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaSecurityPoliciesScopedList {
  
  inline def apply(): SchemaSecurityPoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPoliciesScopedList]
  }
  
  extension [Self <: SchemaSecurityPoliciesScopedList](x: Self) {
    
    inline def setSecurityPolicies(value: js.Array[SchemaSecurityPolicy]): Self = StObject.set(x, "securityPolicies", value.asInstanceOf[js.Any])
    
    inline def setSecurityPoliciesUndefined: Self = StObject.set(x, "securityPolicies", js.undefined)
    
    inline def setSecurityPoliciesVarargs(value: SchemaSecurityPolicy*): Self = StObject.set(x, "securityPolicies", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
