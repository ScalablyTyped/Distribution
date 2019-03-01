package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilters extends DataSourceFilter {
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
  var logic: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceFilters {
  @scala.inline
  def apply(filters: js.Array[DataSourceFilter] = null, logic: java.lang.String = null): DataSourceFilters = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (logic != null) __obj.updateDynamic("logic")(logic)
    __obj.asInstanceOf[DataSourceFilters]
  }
}

