package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDataSourceOptions extends DataSourceOptions {
  var columns: js.UndefOr[js.Array[PivotDataSourceAxisOptions | String]] = js.undefined
  var measures: js.UndefOr[js.Array[String] | PivotDataSourceMeasureOptions] = js.undefined
  var rows: js.UndefOr[js.Array[PivotDataSourceAxisOptions | String]] = js.undefined
  @JSName("schema")
  var schema_PivotDataSourceOptions: js.UndefOr[PivotSchema] = js.undefined
  @JSName("transport")
  var transport_PivotDataSourceOptions: js.UndefOr[PivotTransport] = js.undefined
}

object PivotDataSourceOptions {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceAggregateItem] = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    batch: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ DataSourceChangeEvent => Unit = null,
    columns: js.Array[PivotDataSourceAxisOptions | String] = null,
    data: js.Any = null,
    error: /* e */ DataSourceErrorEvent => Unit = null,
    filter: js.Any = null,
    group: DataSourceGroupItem | js.Array[DataSourceGroupItem] = null,
    inPlaceSort: js.UndefOr[Boolean] = js.undefined,
    measures: js.Array[String] | PivotDataSourceMeasureOptions = null,
    offlineStorage: js.Any = null,
    page: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    push: /* e */ DataSourcePushEvent => Unit = null,
    requestEnd: /* e */ DataSourceRequestEndEvent => Unit = null,
    requestStart: /* e */ DataSourceRequestStartEvent => Unit = null,
    rows: js.Array[PivotDataSourceAxisOptions | String] = null,
    schema: PivotSchema = null,
    serverAggregates: js.UndefOr[Boolean] = js.undefined,
    serverFiltering: js.UndefOr[Boolean] = js.undefined,
    serverGrouping: js.UndefOr[Boolean] = js.undefined,
    serverPaging: js.UndefOr[Boolean] = js.undefined,
    serverSorting: js.UndefOr[Boolean] = js.undefined,
    sort: js.Any = null,
    sync: /* e */ DataSourceEvent => Unit = null,
    transport: PivotTransport = null,
    `type`: String = null
  ): PivotDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceSort)) __obj.updateDynamic("inPlaceSort")(inPlaceSort.get.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1(push))
    if (requestEnd != null) __obj.updateDynamic("requestEnd")(js.Any.fromFunction1(requestEnd))
    if (requestStart != null) __obj.updateDynamic("requestStart")(js.Any.fromFunction1(requestStart))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(serverAggregates)) __obj.updateDynamic("serverAggregates")(serverAggregates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverFiltering)) __obj.updateDynamic("serverFiltering")(serverFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverGrouping)) __obj.updateDynamic("serverGrouping")(serverGrouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverPaging)) __obj.updateDynamic("serverPaging")(serverPaging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSorting)) __obj.updateDynamic("serverSorting")(serverSorting.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDataSourceOptions]
  }
}

