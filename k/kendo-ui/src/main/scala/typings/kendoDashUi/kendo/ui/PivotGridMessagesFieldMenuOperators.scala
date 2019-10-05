package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridMessagesFieldMenuOperators extends js.Object {
  var contains: js.UndefOr[String] = js.undefined
  var doesnotcontain: js.UndefOr[String] = js.undefined
  var endswith: js.UndefOr[String] = js.undefined
  @JSName("eq")
  var eq_FPivotGridMessagesFieldMenuOperators: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
  var startswith: js.UndefOr[String] = js.undefined
}

object PivotGridMessagesFieldMenuOperators {
  @scala.inline
  def apply(
    contains: String = null,
    doesnotcontain: String = null,
    endswith: String = null,
    eq: String = null,
    neq: String = null,
    startswith: String = null
  ): PivotGridMessagesFieldMenuOperators = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (doesnotcontain != null) __obj.updateDynamic("doesnotcontain")(doesnotcontain)
    if (endswith != null) __obj.updateDynamic("endswith")(endswith)
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    if (startswith != null) __obj.updateDynamic("startswith")(startswith)
    __obj.asInstanceOf[PivotGridMessagesFieldMenuOperators]
  }
}

