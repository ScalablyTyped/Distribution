package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponsePolicy extends StObject {
  
  /**
    * User-provided description for this Response Policy.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the resource; defined by the server (output only).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of network names specifying networks to which this policy is applied.
    */
  var networks: js.UndefOr[js.Array[SchemaResponsePolicyNetwork]] = js.undefined
  
  /**
    * User assigned name for this Response Policy.
    */
  var responsePolicyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaResponsePolicy {
  
  inline def apply(): SchemaResponsePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponsePolicy]
  }
  
  extension [Self <: SchemaResponsePolicy](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworks(value: js.Array[SchemaResponsePolicyNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaResponsePolicyNetwork*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setResponsePolicyName(value: String): Self = StObject.set(x, "responsePolicyName", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyNameNull: Self = StObject.set(x, "responsePolicyName", null)
    
    inline def setResponsePolicyNameUndefined: Self = StObject.set(x, "responsePolicyName", js.undefined)
  }
}
