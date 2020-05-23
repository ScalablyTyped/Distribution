package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportReadOptionsData extends js.Object {
  var filter: js.UndefOr[DataSourceFilters] = js.undefined
  var group: js.UndefOr[js.Array[DataSourceGroupItem]] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Array[DataSourceSortItem]] = js.undefined
  var take: js.UndefOr[Double] = js.undefined
}

object DataSourceTransportReadOptionsData {
  @scala.inline
  def apply(
    filter: DataSourceFilters = null,
    group: js.Array[DataSourceGroupItem] = null,
    skip: js.UndefOr[Double] = js.undefined,
    sort: js.Array[DataSourceSortItem] = null,
    take: js.UndefOr[Double] = js.undefined
  ): DataSourceTransportReadOptionsData = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(take)) __obj.updateDynamic("take")(take.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportReadOptionsData]
  }
}

