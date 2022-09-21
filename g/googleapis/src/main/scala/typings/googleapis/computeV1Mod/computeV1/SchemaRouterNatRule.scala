package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterNatRule extends StObject {
  
  /**
    * The action to be enforced for traffic that matches this rule.
    */
  var action: js.UndefOr[SchemaRouterNatRuleAction] = js.undefined
  
  /**
    * An optional description of this rule.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CEL expression that specifies the match condition that egress traffic from a VM is evaluated against. If it evaluates to true, the corresponding `action` is enforced. The following examples are valid match expressions for public NAT: "inIpRange(destination.ip, '1.1.0.0/16') || inIpRange(destination.ip, '2.2.0.0/16')" "destination.ip == '1.1.0.1' || destination.ip == '8.8.8.8'" The following example is a valid match expression for private NAT: "nexthop.hub == 'https://networkconnectivity.googleapis.com/v1alpha1/projects/my-project/global/hub/hub-1'"
    */
  var `match`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An integer uniquely identifying a rule in the list. The rule number must be a positive value between 0 and 65000, and must be unique among rules within a NAT.
    */
  var ruleNumber: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRouterNatRule {
  
  inline def apply(): SchemaRouterNatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNatRule]
  }
  
  extension [Self <: SchemaRouterNatRule](x: Self) {
    
    inline def setAction(value: SchemaRouterNatRuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchNull: Self = StObject.set(x, "match", null)
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setRuleNumber(value: Double): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberNull: Self = StObject.set(x, "ruleNumber", null)
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "ruleNumber", js.undefined)
  }
}
