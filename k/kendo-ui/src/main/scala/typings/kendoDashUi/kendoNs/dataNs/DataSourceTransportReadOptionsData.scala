package typings.kendoDashUi.kendoNs.dataNs

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
    skip: Int | Double = null,
    sort: js.Array[DataSourceSortItem] = null,
    take: Int | Double = null
  ): DataSourceTransportReadOptionsData = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportReadOptionsData]
  }
}

