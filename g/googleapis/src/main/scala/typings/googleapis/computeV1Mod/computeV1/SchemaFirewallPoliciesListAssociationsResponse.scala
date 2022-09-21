package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallPoliciesListAssociationsResponse extends StObject {
  
  /**
    * A list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaFirewallPolicyAssociation]] = js.undefined
  
  /**
    * [Output Only] Type of firewallPolicy associations. Always compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaFirewallPoliciesListAssociationsResponse {
  
  inline def apply(): SchemaFirewallPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallPoliciesListAssociationsResponse]
  }
  
  extension [Self <: SchemaFirewallPoliciesListAssociationsResponse](x: Self) {
    
    inline def setAssociations(value: js.Array[SchemaFirewallPolicyAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: SchemaFirewallPolicyAssociation*): Self = StObject.set(x, "associations", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
