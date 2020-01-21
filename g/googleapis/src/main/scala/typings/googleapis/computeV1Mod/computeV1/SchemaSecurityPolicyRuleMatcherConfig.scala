package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyRuleMatcherConfig extends js.Object {
  /**
    * CIDR IP address range.
    */
  var srcIpRanges: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSecurityPolicyRuleMatcherConfig {
  @scala.inline
  def apply(srcIpRanges: js.Array[String] = null): SchemaSecurityPolicyRuleMatcherConfig = {
    val __obj = js.Dynamic.literal()
    if (srcIpRanges != null) __obj.updateDynamic("srcIpRanges")(srcIpRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityPolicyRuleMatcherConfig]
  }
}

