package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilters extends DataSourceFilter {
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
  var logic: js.UndefOr[String] = js.undefined
}

object DataSourceFilters {
  @scala.inline
  def apply(filters: js.Array[DataSourceFilter] = null, logic: String = null): DataSourceFilters = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (logic != null) __obj.updateDynamic("logic")(logic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceFilters]
  }
}

