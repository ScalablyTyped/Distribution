package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddRolesResponse extends StObject {
  
  /**
    * Required. List of policy bindings that were added to the shared VPC host project.
    */
  var policyBinding: js.UndefOr[js.Array[SchemaPolicyBinding]] = js.undefined
}
object SchemaAddRolesResponse {
  
  inline def apply(): SchemaAddRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddRolesResponse]
  }
  
  extension [Self <: SchemaAddRolesResponse](x: Self) {
    
    inline def setPolicyBinding(value: js.Array[SchemaPolicyBinding]): Self = StObject.set(x, "policyBinding", value.asInstanceOf[js.Any])
    
    inline def setPolicyBindingUndefined: Self = StObject.set(x, "policyBinding", js.undefined)
    
    inline def setPolicyBindingVarargs(value: SchemaPolicyBinding*): Self = StObject.set(x, "policyBinding", js.Array(value*))
  }
}
