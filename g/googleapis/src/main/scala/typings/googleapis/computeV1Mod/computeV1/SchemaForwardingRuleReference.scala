package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaForwardingRuleReference extends js.Object {
  var forwardingRule: js.UndefOr[String] = js.native
}

object SchemaForwardingRuleReference {
  @scala.inline
  def apply(forwardingRule: String = null): SchemaForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    if (forwardingRule != null) __obj.updateDynamic("forwardingRule")(forwardingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaForwardingRuleReference]
  }
}

