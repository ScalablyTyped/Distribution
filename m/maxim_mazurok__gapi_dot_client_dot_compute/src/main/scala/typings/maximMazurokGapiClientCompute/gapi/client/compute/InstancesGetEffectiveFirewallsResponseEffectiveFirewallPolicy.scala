package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy extends StObject {
  
  /** [Output Only] Deprecated, please use short name instead. The display name of the firewall policy. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The name of the firewall policy. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The rules that apply to the network. */
  var rules: js.UndefOr[js.Array[FirewallPolicyRule]] = js.undefined
  
  /** [Output Only] The short name of the firewall policy. */
  var shortName: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The type of the firewall policy. */
  var `type`: js.UndefOr[String] = js.undefined
}
object InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy {
  
  inline def apply(): InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: js.Array[FirewallPolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: FirewallPolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
