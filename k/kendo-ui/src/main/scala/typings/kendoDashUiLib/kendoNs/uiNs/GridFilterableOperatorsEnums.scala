package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterableOperatorsEnums extends js.Object {
  @JSName("eq")
  var eq_FGridFilterableOperatorsEnums: js.UndefOr[java.lang.String] = js.undefined
  var isnotnull: js.UndefOr[java.lang.String] = js.undefined
  var isnull: js.UndefOr[java.lang.String] = js.undefined
  var neq: js.UndefOr[java.lang.String] = js.undefined
}

object GridFilterableOperatorsEnums {
  @scala.inline
  def apply(
    eq: java.lang.String = null,
    isnotnull: java.lang.String = null,
    isnull: java.lang.String = null,
    neq: java.lang.String = null
  ): GridFilterableOperatorsEnums = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq)
    if (isnotnull != null) __obj.updateDynamic("isnotnull")(isnotnull)
    if (isnull != null) __obj.updateDynamic("isnull")(isnull)
    if (neq != null) __obj.updateDynamic("neq")(neq)
    __obj.asInstanceOf[GridFilterableOperatorsEnums]
  }
}

