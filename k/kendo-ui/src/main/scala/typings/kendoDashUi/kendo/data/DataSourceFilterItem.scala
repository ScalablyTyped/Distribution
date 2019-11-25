package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilterItem extends DataSourceFilter {
  var field: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String | js.Function] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataSourceFilterItem {
  @scala.inline
  def apply(field: String = null, operator: String | js.Function = null, value: js.Any = null): DataSourceFilterItem = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceFilterItem]
  }
}

