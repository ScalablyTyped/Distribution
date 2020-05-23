package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportParameterMapData extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceParameterMapDataAggregate]] = js.undefined
  var filter: js.UndefOr[DataSourceParameterMapDataFilter] = js.undefined
  var group: js.UndefOr[js.Array[DataSourceParameterMapDataGroup]] = js.undefined
  var models: js.UndefOr[js.Array[Model]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[js.Array[DataSourceParameterMapDataSort]] = js.undefined
  var take: js.UndefOr[Double] = js.undefined
}

object DataSourceTransportParameterMapData {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceParameterMapDataAggregate] = null,
    filter: DataSourceParameterMapDataFilter = null,
    group: js.Array[DataSourceParameterMapDataGroup] = null,
    models: js.Array[Model] = null,
    page: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined,
    sort: js.Array[DataSourceParameterMapDataSort] = null,
    take: js.UndefOr[Double] = js.undefined
  ): DataSourceTransportParameterMapData = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(take)) __obj.updateDynamic("take")(take.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportParameterMapData]
  }
}

