package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaForwardingRulesScopedList extends js.Object {
  /**
    * A list of forwarding rules contained in this scope.
    */
  var forwardingRules: js.UndefOr[js.Array[SchemaForwardingRule]] = js.native
  /**
    * Informational warning which replaces the list of forwarding rules when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaForwardingRulesScopedList {
  @scala.inline
  def apply(forwardingRules: js.Array[SchemaForwardingRule] = null, warning: Code = null): SchemaForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    if (forwardingRules != null) __obj.updateDynamic("forwardingRules")(forwardingRules.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaForwardingRulesScopedList]
  }
}

