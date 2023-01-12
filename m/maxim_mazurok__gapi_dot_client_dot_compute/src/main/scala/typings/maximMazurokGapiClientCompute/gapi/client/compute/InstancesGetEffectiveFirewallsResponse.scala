package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesGetEffectiveFirewallsResponse extends StObject {
  
  /** Effective firewalls from firewall policies. */
  var firewallPolicys: js.UndefOr[js.Array[InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy]] = js.undefined
  
  /** Effective firewalls on the instance. */
  var firewalls: js.UndefOr[js.Array[Firewall]] = js.undefined
}
object InstancesGetEffectiveFirewallsResponse {
  
  inline def apply(): InstancesGetEffectiveFirewallsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesGetEffectiveFirewallsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesGetEffectiveFirewallsResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallPolicys(value: js.Array[InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy]): Self = StObject.set(x, "firewallPolicys", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicysUndefined: Self = StObject.set(x, "firewallPolicys", js.undefined)
    
    inline def setFirewallPolicysVarargs(value: InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy*): Self = StObject.set(x, "firewallPolicys", js.Array(value*))
    
    inline def setFirewalls(value: js.Array[Firewall]): Self = StObject.set(x, "firewalls", value.asInstanceOf[js.Any])
    
    inline def setFirewallsUndefined: Self = StObject.set(x, "firewalls", js.undefined)
    
    inline def setFirewallsVarargs(value: Firewall*): Self = StObject.set(x, "firewalls", js.Array(value*))
  }
}
