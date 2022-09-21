package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddRolesRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project\}/global/networks/{network\} {project\} is a project number, as in '12345' {network\} is a network name.
    */
  var consumerNetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. List of policy bindings to add to shared VPC host project.
    */
  var policyBinding: js.UndefOr[js.Array[SchemaPolicyBinding]] = js.undefined
}
object SchemaAddRolesRequest {
  
  inline def apply(): SchemaAddRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddRolesRequest]
  }
  
  extension [Self <: SchemaAddRolesRequest](x: Self) {
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkNull: Self = StObject.set(x, "consumerNetwork", null)
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    inline def setPolicyBinding(value: js.Array[SchemaPolicyBinding]): Self = StObject.set(x, "policyBinding", value.asInstanceOf[js.Any])
    
    inline def setPolicyBindingUndefined: Self = StObject.set(x, "policyBinding", js.undefined)
    
    inline def setPolicyBindingVarargs(value: SchemaPolicyBinding*): Self = StObject.set(x, "policyBinding", js.Array(value*))
  }
}
