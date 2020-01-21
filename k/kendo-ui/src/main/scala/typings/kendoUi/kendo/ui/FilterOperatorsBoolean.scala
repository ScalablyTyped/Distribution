package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperatorsBoolean extends js.Object {
  @JSName("eq")
  var eq_FFilterOperatorsBoolean: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
}

object FilterOperatorsBoolean {
  @scala.inline
  def apply(eq: String = null, neq: String = null): FilterOperatorsBoolean = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperatorsBoolean]
  }
}

