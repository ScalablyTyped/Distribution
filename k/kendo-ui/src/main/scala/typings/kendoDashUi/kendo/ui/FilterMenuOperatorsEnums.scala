package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuOperatorsEnums extends js.Object {
  @JSName("eq")
  var eq_FFilterMenuOperatorsEnums: js.UndefOr[String] = js.undefined
  var isnotnull: js.UndefOr[String] = js.undefined
  var isnull: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
}

object FilterMenuOperatorsEnums {
  @scala.inline
  def apply(eq: String = null, isnotnull: String = null, isnull: String = null, neq: String = null): FilterMenuOperatorsEnums = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull)
    if (isnull != null) __obj.updateDynamic("isnull")(isnull)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    __obj.asInstanceOf[FilterMenuOperatorsEnums]
  }
}

