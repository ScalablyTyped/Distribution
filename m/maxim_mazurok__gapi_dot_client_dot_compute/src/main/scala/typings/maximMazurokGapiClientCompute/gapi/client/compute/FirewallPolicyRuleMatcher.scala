package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyRuleMatcher extends StObject {
  
  /** CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 256. */
  var destIpRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Pairs of IP protocols and ports that the rule should match. */
  var layer4Configs: js.UndefOr[js.Array[FirewallPolicyRuleMatcherLayer4Config]] = js.undefined
  
  /** CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256. */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.undefined
}
object FirewallPolicyRuleMatcher {
  
  inline def apply(): FirewallPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyRuleMatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallPolicyRuleMatcher] (val x: Self) extends AnyVal {
    
    inline def setDestIpRanges(value: js.Array[String]): Self = StObject.set(x, "destIpRanges", value.asInstanceOf[js.Any])
    
    inline def setDestIpRangesUndefined: Self = StObject.set(x, "destIpRanges", js.undefined)
    
    inline def setDestIpRangesVarargs(value: String*): Self = StObject.set(x, "destIpRanges", js.Array(value*))
    
    inline def setLayer4Configs(value: js.Array[FirewallPolicyRuleMatcherLayer4Config]): Self = StObject.set(x, "layer4Configs", value.asInstanceOf[js.Any])
    
    inline def setLayer4ConfigsUndefined: Self = StObject.set(x, "layer4Configs", js.undefined)
    
    inline def setLayer4ConfigsVarargs(value: FirewallPolicyRuleMatcherLayer4Config*): Self = StObject.set(x, "layer4Configs", js.Array(value*))
    
    inline def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    inline def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value*))
  }
}
