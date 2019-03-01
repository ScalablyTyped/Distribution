package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuOperatorsNumber extends js.Object {
  @JSName("eq")
  var eq_FFilterMenuOperatorsNumber: js.UndefOr[java.lang.String] = js.undefined
  var gt: js.UndefOr[java.lang.String] = js.undefined
  var gte: js.UndefOr[java.lang.String] = js.undefined
  var isnotnull: js.UndefOr[java.lang.String] = js.undefined
  var isnull: js.UndefOr[java.lang.String] = js.undefined
  var lt: js.UndefOr[java.lang.String] = js.undefined
  var lte: js.UndefOr[java.lang.String] = js.undefined
  var neq: js.UndefOr[java.lang.String] = js.undefined
}

object FilterMenuOperatorsNumber {
  @scala.inline
  def apply(
    eq: java.lang.String = null,
    gt: java.lang.String = null,
    gte: java.lang.String = null,
    isnotnull: java.lang.String = null,
    isnull: java.lang.String = null,
    lt: java.lang.String = null,
    lte: java.lang.String = null,
    neq: java.lang.String = null
  ): FilterMenuOperatorsNumber = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (gt != null) __obj.updateDynamic("gt")(gt)
    if (gte != null) __obj.updateDynamic("gte")(gte)
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull)
    if (isnull != null) __obj.updateDynamic("isnull")(isnull)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (lte != null) __obj.updateDynamic("lte")(lte)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    __obj.asInstanceOf[FilterMenuOperatorsNumber]
  }
}

