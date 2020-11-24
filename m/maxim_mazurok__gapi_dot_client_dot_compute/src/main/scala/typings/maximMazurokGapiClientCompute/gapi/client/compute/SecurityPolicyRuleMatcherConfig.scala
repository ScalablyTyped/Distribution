package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyRuleMatcherConfig extends js.Object {
  
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
  implicit class SecurityPolicyRuleMatcherConfigOps[Self <: SecurityPolicyRuleMatcherConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSrcIpRangesVarargs(value: String*): Self = this.set("srcIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setSrcIpRanges(value: js.Array[String]): Self = this.set("srcIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcIpRanges: Self = this.set("srcIpRanges", js.undefined)
  }
}
