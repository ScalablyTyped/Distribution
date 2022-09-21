package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisksAddResourcePoliciesRequest extends StObject {
  
  /**
    * Full or relative path to the resource policy to be added to this disk. You can only specify one resource policy.
    */
  var resourcePolicies: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDisksAddResourcePoliciesRequest {
  
  inline def apply(): SchemaDisksAddResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksAddResourcePoliciesRequest]
  }
  
  extension [Self <: SchemaDisksAddResourcePoliciesRequest](x: Self) {
    
    inline def setResourcePolicies(value: js.Array[String]): Self = StObject.set(x, "resourcePolicies", value.asInstanceOf[js.Any])
    
    inline def setResourcePoliciesNull: Self = StObject.set(x, "resourcePolicies", null)
    
    inline def setResourcePoliciesUndefined: Self = StObject.set(x, "resourcePolicies", js.undefined)
    
    inline def setResourcePoliciesVarargs(value: String*): Self = StObject.set(x, "resourcePolicies", js.Array(value*))
  }
}
