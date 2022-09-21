package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthentication extends StObject {
  
  /**
    * Defines a set of authentication providers that a service supports.
    */
  var providers: js.UndefOr[js.Array[SchemaAuthProvider]] = js.undefined
  
  /**
    * A list of authentication rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SchemaAuthenticationRule]] = js.undefined
}
object SchemaAuthentication {
  
  inline def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  
  extension [Self <: SchemaAuthentication](x: Self) {
    
    inline def setProviders(value: js.Array[SchemaAuthProvider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: SchemaAuthProvider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setRules(value: js.Array[SchemaAuthenticationRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaAuthenticationRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
