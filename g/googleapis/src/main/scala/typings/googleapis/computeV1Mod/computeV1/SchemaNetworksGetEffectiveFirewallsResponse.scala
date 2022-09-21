package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksGetEffectiveFirewallsResponse extends StObject {
  
  /**
    * Effective firewalls from firewall policy.
    */
  var firewallPolicys: js.UndefOr[js.Array[SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]] = js.undefined
  
  /**
    * Effective firewalls on the network.
    */
  var firewalls: js.UndefOr[js.Array[SchemaFirewall]] = js.undefined
}
object SchemaNetworksGetEffectiveFirewallsResponse {
  
  inline def apply(): SchemaNetworksGetEffectiveFirewallsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksGetEffectiveFirewallsResponse]
  }
  
  extension [Self <: SchemaNetworksGetEffectiveFirewallsResponse](x: Self) {
    
    inline def setFirewallPolicys(value: js.Array[SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]): Self = StObject.set(x, "firewallPolicys", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicysUndefined: Self = StObject.set(x, "firewallPolicys", js.undefined)
    
    inline def setFirewallPolicysVarargs(value: SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy*): Self = StObject.set(x, "firewallPolicys", js.Array(value*))
    
    inline def setFirewalls(value: js.Array[SchemaFirewall]): Self = StObject.set(x, "firewalls", value.asInstanceOf[js.Any])
    
    inline def setFirewallsUndefined: Self = StObject.set(x, "firewalls", js.undefined)
    
    inline def setFirewallsVarargs(value: SchemaFirewall*): Self = StObject.set(x, "firewalls", js.Array(value*))
  }
}
