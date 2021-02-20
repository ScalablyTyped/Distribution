package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyRuleMatcherConfig extends StObject {
  
  /** CIDR IP address range. Maximum number of src_ip_ranges allowed is 10. */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}
object SecurityPolicyRuleMatcherConfig {
  
  @scala.inline
  def apply(): SecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyRuleMatcherConfig]
  }
  
  @scala.inline
  implicit class SecurityPolicyRuleMatcherConfigMutableBuilder[Self <: SecurityPolicyRuleMatcherConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrcIpRanges(value: js.Array[String]): Self = StObject.set(x, "srcIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcIpRangesUndefined: Self = StObject.set(x, "srcIpRanges", js.undefined)
    
    @scala.inline
    def setSrcIpRangesVarargs(value: String*): Self = StObject.set(x, "srcIpRanges", js.Array(value :_*))
  }
}
