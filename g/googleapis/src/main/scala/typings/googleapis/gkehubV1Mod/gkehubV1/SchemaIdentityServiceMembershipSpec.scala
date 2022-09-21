package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentityServiceMembershipSpec extends StObject {
  
  /**
    * A member may support multiple auth methods.
    */
  var authMethods: js.UndefOr[js.Array[SchemaIdentityServiceAuthMethod]] = js.undefined
}
object SchemaIdentityServiceMembershipSpec {
  
  inline def apply(): SchemaIdentityServiceMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityServiceMembershipSpec]
  }
  
  extension [Self <: SchemaIdentityServiceMembershipSpec](x: Self) {
    
    inline def setAuthMethods(value: js.Array[SchemaIdentityServiceAuthMethod]): Self = StObject.set(x, "authMethods", value.asInstanceOf[js.Any])
    
    inline def setAuthMethodsUndefined: Self = StObject.set(x, "authMethods", js.undefined)
    
    inline def setAuthMethodsVarargs(value: SchemaIdentityServiceAuthMethod*): Self = StObject.set(x, "authMethods", js.Array(value*))
  }
}
