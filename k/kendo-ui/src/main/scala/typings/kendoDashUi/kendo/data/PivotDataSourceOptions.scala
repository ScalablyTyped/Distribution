package typings.kendoDashUi.kendo.data

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
    page: Int | Double = null,
    pageSize: Int | Double = null,
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
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceSort)) __obj.updateDynamic("inPlaceSort")(inPlaceSort)
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1(push))
    if (requestEnd != null) __obj.updateDynamic("requestEnd")(js.Any.fromFunction1(requestEnd))
    if (requestStart != null) __obj.updateDynamic("requestStart")(js.Any.fromFunction1(requestStart))
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(serverAggregates)) __obj.updateDynamic("serverAggregates")(serverAggregates)
    if (!js.isUndefined(serverFiltering)) __obj.updateDynamic("serverFiltering")(serverFiltering)
    if (!js.isUndefined(serverGrouping)) __obj.updateDynamic("serverGrouping")(serverGrouping)
    if (!js.isUndefined(serverPaging)) __obj.updateDynamic("serverPaging")(serverPaging)
    if (!js.isUndefined(serverSorting)) __obj.updateDynamic("serverSorting")(serverSorting)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PivotDataSourceOptions]
  }
}

