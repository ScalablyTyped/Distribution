package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceParameterMapDataFilter extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Array[DataSourceParameterMapDataFilter]] = js.undefined
  var logic: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataSourceParameterMapDataFilter {
  @scala.inline
  def apply(
    field: String = null,
    filters: js.Array[DataSourceParameterMapDataFilter] = null,
    logic: String = null,
    operator: String = null,
    value: js.Any = null
  ): DataSourceParameterMapDataFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (logic != null) __obj.updateDynamic("logic")(logic.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceParameterMapDataFilter]
  }
}

