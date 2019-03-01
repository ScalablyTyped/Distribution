package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportParameterMapData extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceParameterMapDataAggregate]] = js.undefined
  var filter: js.UndefOr[DataSourceParameterMapDataFilter] = js.undefined
  var group: js.UndefOr[js.Array[DataSourceParameterMapDataGroup]] = js.undefined
  var models: js.UndefOr[js.Array[Model]] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var sort: js.UndefOr[js.Array[DataSourceParameterMapDataSort]] = js.undefined
  var take: js.UndefOr[scala.Double] = js.undefined
}

object DataSourceTransportParameterMapData {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceParameterMapDataAggregate] = null,
    filter: DataSourceParameterMapDataFilter = null,
    group: js.Array[DataSourceParameterMapDataGroup] = null,
    models: js.Array[Model] = null,
    page: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    skip: scala.Int | scala.Double = null,
    sort: js.Array[DataSourceParameterMapDataSort] = null,
    take: scala.Int | scala.Double = null
  ): DataSourceTransportParameterMapData = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group)
    if (models != null) __obj.updateDynamic("models")(models)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportParameterMapData]
  }
}

