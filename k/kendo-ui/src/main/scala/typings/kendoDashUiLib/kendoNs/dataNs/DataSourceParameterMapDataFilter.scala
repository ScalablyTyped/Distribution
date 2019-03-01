package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameterMapDataFilter extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var filters: js.UndefOr[js.Array[DataSourceParameterMapDataFilter]] = js.undefined
  var logic: js.UndefOr[java.lang.String] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataSourceParameterMapDataFilter {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    filters: js.Array[DataSourceParameterMapDataFilter] = null,
    logic: java.lang.String = null,
    operator: java.lang.String = null,
    value: js.Any = null
  ): DataSourceParameterMapDataFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (logic != null) __obj.updateDynamic("logic")(logic)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataSourceParameterMapDataFilter]
  }
}

