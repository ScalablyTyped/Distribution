package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFirewallPolicyRuleMatcher extends StObject {
  
  /**
    * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
    */
  var destIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Pairs of IP protocols and ports that the rule should match.
    */
  var layer4Configs: js.UndefOr[js.Array[SchemaFirewallPolicyRuleMatcherLayer4Config]] = js.undefined
  
  /**
    * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
    */
  var srcIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
    */
  var srcSecureTags: js.UndefOr[js.Array[SchemaFirewallPolicyRuleSecureTag]] = js.undefined
}
object SchemaFirewallPolicyRuleMatcher {
  
  inline def apply(): SchemaFirewallPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallPolicyRuleMatcher]
  }
  
  extension [Self <: SchemaFirewallPolicyRuleMatcher](x: Self) {
    
    inline def setDestIpRanges(value: js.Array[String]): Self = StObject.set(x, "destIpRanges", value.asInstanceOf[js.Any])
    
    inline def setDestIpRangesNull: Self = StObject.set(x, "destIpRanges", null)
    
    inline def setDestIpRangesUndefined: Self = StObject.set(x, "destIpRanges", js.undefined)
    
    inline def setDestIpRangesVarargs(value: String*): Self = StObject.set(x, "destIpRanges", js.Array(value*))
    
    inline def setLayer4Configs(value: js.Array[SchemaFirewallPolicyRuleMatcherLayer4Config]): Self = StObject.set(x, "layer4Configs", value.asInstanceOf[js.Any])
    
    inline def setLayer4ConfigsUndefined: Self = StObject.set(x, "layer4Configs", js.undefined)
    
    inline def setLayer4ConfigsVarargs(value: SchemaFirewallPolicyRuleMatcherLayer4Config*): Self = StObject.set(x, "layer4Configs", js.Array(value*))
    
    inline def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSrcIpRangesNull: Self = StObject.set(x, "srcIpRanges", null)
    
    inline def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    inline def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value*))
    
    inline def setSrcSecureTags(value: js.Array[SchemaFirewallPolicyRuleSecureTag]): Self = StObject.set(x, "srcSecureTags", value.asInstanceOf[js.Any])
    
    inline def setSrcSecureTagsUndefined: Self = StObject.set(x, "srcSecureTags", js.undefined)
    
    inline def setSrcSecureTagsVarargs(value: SchemaFirewallPolicyRuleSecureTag*): Self = StObject.set(x, "srcSecureTags", js.Array(value*))
  }
}
