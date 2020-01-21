package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuOperatorsDate extends js.Object {
  @JSName("eq")
  var eq_FFilterMenuOperatorsDate: js.UndefOr[String] = js.undefined
  var gt: js.UndefOr[String] = js.undefined
  var gte: js.UndefOr[String] = js.undefined
  var isnotnull: js.UndefOr[String] = js.undefined
  var isnull: js.UndefOr[String] = js.undefined
  var lt: js.UndefOr[String] = js.undefined
  var lte: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
}

object FilterMenuOperatorsDate {
  @scala.inline
  def apply(
    eq: String = null,
    gt: String = null,
    gte: String = null,
    isnotnull: String = null,
    isnull: String = null,
    lt: String = null,
    lte: String = null,
    neq: String = null
  ): FilterMenuOperatorsDate = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull.asInstanceOf[js.Any])
    if (isnull != null) __obj.updateDynamic("isnull")(isnull.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterMenuOperatorsDate]
  }
}

