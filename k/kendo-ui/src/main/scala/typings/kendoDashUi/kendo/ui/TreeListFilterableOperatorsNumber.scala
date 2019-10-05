package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterableOperatorsNumber extends js.Object {
  @JSName("eq")
  var eq_FTreeListFilterableOperatorsNumber: js.UndefOr[String] = js.undefined
  var gt: js.UndefOr[String] = js.undefined
  var gte: js.UndefOr[String] = js.undefined
  var isnotnull: js.UndefOr[String] = js.undefined
  var isnull: js.UndefOr[String] = js.undefined
  var lt: js.UndefOr[String] = js.undefined
  var lte: js.UndefOr[String] = js.undefined
  var neq: js.UndefOr[String] = js.undefined
}

object TreeListFilterableOperatorsNumber {
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
  ): TreeListFilterableOperatorsNumber = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (gt != null) __obj.updateDynamic("gt")(gt)
    if (gte != null) __obj.updateDynamic("gte")(gte)
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull)
    if (isnull != null) __obj.updateDynamic("isnull")(isnull)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (lte != null) __obj.updateDynamic("lte")(lte)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    __obj.asInstanceOf[TreeListFilterableOperatorsNumber]
  }
}

