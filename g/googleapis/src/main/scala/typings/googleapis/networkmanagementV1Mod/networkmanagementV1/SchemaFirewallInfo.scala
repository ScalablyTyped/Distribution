package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallInfo extends StObject {
  
  /**
    * Possible values: ALLOW, DENY
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Possible values: INGRESS, EGRESS
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The firewall rule's type.
    */
  var firewallRuleType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the VPC network that the firewall rule is associated with. This field is not applicable to hierarchical firewall policy rules.
    */
  var networkUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The hierarchical firewall policy that this rule is associated with. This field is not applicable to VPC firewall rules.
    */
  var policy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The priority of the firewall rule.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The target service accounts specified by the firewall rule.
    */
  var targetServiceAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The target tags defined by the VPC firewall rule. This field is not applicable to hierarchical firewall policy rules.
    */
  var targetTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URI of the VPC firewall rule. This field is not applicable to implied firewall rules or hierarchical firewall policy rules.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaFirewallInfo {
  
  inline def apply(): SchemaFirewallInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallInfo]
  }
  
  extension [Self <: SchemaFirewallInfo](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirewallRuleType(value: String): Self = StObject.set(x, "firewallRuleType", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleTypeNull: Self = StObject.set(x, "firewallRuleType", null)
    
    inline def setFirewallRuleTypeUndefined: Self = StObject.set(x, "firewallRuleType", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriNull: Self = StObject.set(x, "networkUri", null)
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTargetServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "targetServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setTargetServiceAccountsNull: Self = StObject.set(x, "targetServiceAccounts", null)
    
    inline def setTargetServiceAccountsUndefined: Self = StObject.set(x, "targetServiceAccounts", js.undefined)
    
    inline def setTargetServiceAccountsVarargs(value: String*): Self = StObject.set(x, "targetServiceAccounts", js.Array(value*))
    
    inline def setTargetTags(value: js.Array[String]): Self = StObject.set(x, "targetTags", value.asInstanceOf[js.Any])
    
    inline def setTargetTagsNull: Self = StObject.set(x, "targetTags", null)
    
    inline def setTargetTagsUndefined: Self = StObject.set(x, "targetTags", js.undefined)
    
    inline def setTargetTagsVarargs(value: String*): Self = StObject.set(x, "targetTags", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
