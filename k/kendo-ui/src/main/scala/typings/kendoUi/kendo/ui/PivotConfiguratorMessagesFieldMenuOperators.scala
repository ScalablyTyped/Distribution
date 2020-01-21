package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorMessagesFieldMenuOperators extends js.Object {
  var contains: js.UndefOr[String] = js.undefined
  var doesnotcontain: js.UndefOr[String] = js.undefined
  var endswith: js.UndefOr[String] = js.undefined
  @JSName("eq")
  var eq_FPivotConfiguratorMessagesFieldMenuOperators: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
  var startswith: js.UndefOr[String] = js.undefined
}

object PivotConfiguratorMessagesFieldMenuOperators {
  @scala.inline
  def apply(
    contains: String = null,
    doesnotcontain: String = null,
    endswith: String = null,
    eq: String = null,
    neq: String = null,
    startswith: String = null
  ): PivotConfiguratorMessagesFieldMenuOperators = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (doesnotcontain != null) __obj.updateDynamic("doesnotcontain")(doesnotcontain.asInstanceOf[js.Any])
    if (endswith != null) __obj.updateDynamic("endswith")(endswith.asInstanceOf[js.Any])
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    if (startswith != null) __obj.updateDynamic("startswith")(startswith.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotConfiguratorMessagesFieldMenuOperators]
  }
}

