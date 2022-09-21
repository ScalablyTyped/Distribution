package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRuleMatcherConfig extends StObject {
  
  /**
    * CIDR IP address range. Maximum number of src_ip_ranges allowed is 10.
    */
  var srcIpRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSecurityPolicyRuleMatcherConfig {
  
  inline def apply(): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyRuleMatcherConfig](x: Self) {
    
    inline def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSrcIpRangesNull: Self = StObject.set(x, "srcIpRanges", null)
    
    inline def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    inline def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value*))
  }
}
