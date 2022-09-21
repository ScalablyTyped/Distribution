package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPoliciesListAssociationsResponse extends StObject {
  
  /** A list of associations. */
  var associations: js.UndefOr[js.Array[FirewallPolicyAssociation]] = js.undefined
  
  /** [Output Only] Type of firewallPolicy associations. Always compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations. */
  var kind: js.UndefOr[String] = js.undefined
}
object FirewallPoliciesListAssociationsResponse {
  
  inline def apply(): FirewallPoliciesListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPoliciesListAssociationsResponse]
  }
  
  extension [Self <: FirewallPoliciesListAssociationsResponse](x: Self) {
    
    inline def setAssociations(value: js.Array[FirewallPolicyAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: FirewallPolicyAssociation*): Self = StObject.set(x, "associations", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
