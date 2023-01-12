package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworksGetEffectiveFirewallsResponse extends StObject {
  
  /** Effective firewalls from firewall policy. */
  var firewallPolicys: js.UndefOr[js.Array[NetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]] = js.undefined
  
  /** Effective firewalls on the network. */
  var firewalls: js.UndefOr[js.Array[Firewall]] = js.undefined
}
object NetworksGetEffectiveFirewallsResponse {
  
  inline def apply(): NetworksGetEffectiveFirewallsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksGetEffectiveFirewallsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworksGetEffectiveFirewallsResponse] (val x: Self) extends AnyVal {
    
    inline def setFirewallPolicys(value: js.Array[NetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]): Self = StObject.set(x, "firewallPolicys", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicysUndefined: Self = StObject.set(x, "firewallPolicys", js.undefined)
    
    inline def setFirewallPolicysVarargs(value: NetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy*): Self = StObject.set(x, "firewallPolicys", js.Array(value*))
    
    inline def setFirewalls(value: js.Array[Firewall]): Self = StObject.set(x, "firewalls", value.asInstanceOf[js.Any])
    
    inline def setFirewallsUndefined: Self = StObject.set(x, "firewalls", js.undefined)
    
    inline def setFirewallsVarargs(value: Firewall*): Self = StObject.set(x, "firewalls", js.Array(value*))
  }
}
