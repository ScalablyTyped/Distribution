package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesGetEffectiveFirewallsResponse extends StObject {
  
  /**
    * Effective firewalls from firewall policies.
    */
  var firewallPolicys: js.UndefOr[js.Array[SchemaInstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy]] = js.undefined
  
  /**
    * Effective firewalls on the instance.
    */
  var firewalls: js.UndefOr[js.Array[SchemaFirewall]] = js.undefined
}
object SchemaInstancesGetEffectiveFirewallsResponse {
  
  inline def apply(): SchemaInstancesGetEffectiveFirewallsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesGetEffectiveFirewallsResponse]
  }
  
  extension [Self <: SchemaInstancesGetEffectiveFirewallsResponse](x: Self) {
    
    inline def setFirewallPolicys(value: js.Array[SchemaInstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy]): Self = StObject.set(x, "firewallPolicys", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicysUndefined: Self = StObject.set(x, "firewallPolicys", js.undefined)
    
    inline def setFirewallPolicysVarargs(value: SchemaInstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy*): Self = StObject.set(x, "firewallPolicys", js.Array(value*))
    
    inline def setFirewalls(value: js.Array[SchemaFirewall]): Self = StObject.set(x, "firewalls", value.asInstanceOf[js.Any])
    
    inline def setFirewallsUndefined: Self = StObject.set(x, "firewalls", js.undefined)
    
    inline def setFirewallsVarargs(value: SchemaFirewall*): Self = StObject.set(x, "firewalls", js.Array(value*))
  }
}
