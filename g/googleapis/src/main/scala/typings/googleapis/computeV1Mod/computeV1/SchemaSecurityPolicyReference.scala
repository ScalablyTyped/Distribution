package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyReference extends StObject {
  
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object SchemaSecurityPolicyReference {
  
  inline def apply(): SchemaSecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyReference]
  }
  
  extension [Self <: SchemaSecurityPolicyReference](x: Self) {
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
