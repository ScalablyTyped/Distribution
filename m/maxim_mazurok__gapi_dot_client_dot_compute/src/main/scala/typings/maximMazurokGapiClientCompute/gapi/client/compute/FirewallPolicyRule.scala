package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyRule extends StObject {
  
  /** The Action to perform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502. */
  var action: js.UndefOr[String] = js.undefined
  
  /** An optional description for this resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The direction in which this rule applies. */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified,
    * the firewall policy rule will be enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to
    * BigQuery or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
    */
  var enableLogging: js.UndefOr[Boolean] = js.undefined
  
  /** [Output only] Type of the resource. Always compute#firewallPolicyRule for firewall policy rules */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced. */
  var `match`: js.UndefOr[FirewallPolicyRuleMatcher] = js.undefined
  
  /**
    * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0
    * is the highest priority and 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Calculation of the complexity of a single firewall policy rule. */
  var ruleTupleCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of network resource URLs to which this rule applies. This field allows you to control which network's VMs get this rule. If this field is left blank, all VMs within the
    * organization will receive the rule.
    */
  var targetResources: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of service accounts indicating the sets of instances that are applied with this rule. */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.undefined
}
object FirewallPolicyRule {
  
  inline def apply(): FirewallPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyRule]
  }
  
  extension [Self <: FirewallPolicyRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMatch(value: FirewallPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRuleTupleCount(value: Double): Self = StObject.set(x, "ruleTupleCount", value.asInstanceOf[js.Any])
    
    inline def setRuleTupleCountUndefined: Self = StObject.set(x, "ruleTupleCount", js.undefined)
    
    inline def setTargetResources(value: js.Array[String]): Self = StObject.set(x, "targetResources", value.asInstanceOf[js.Any])
    
    inline def setTargetResourcesUndefined: Self = StObject.set(x, "targetResources", js.undefined)
    
    inline def setTargetResourcesVarargs(value: String*): Self = StObject.set(x, "targetResources", js.Array(value*))
    
    inline def setTargetServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "targetServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setTargetServiceAccountsUndefined: Self = StObject.set(x, "targetServiceAccounts", js.undefined)
    
    inline def setTargetServiceAccountsVarargs(value: String*): Self = StObject.set(x, "targetServiceAccounts", js.Array(value*))
  }
}
