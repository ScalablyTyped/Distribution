package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerDataSourceOptions extends HierarchicalDataSourceOptions {
  @JSName("schema")
  var schema_FileManagerDataSourceOptions: js.UndefOr[FileManagerDataSourceSchema] = js.undefined
}

object FileManagerDataSourceOptions {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceAggregateItem] = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    batch: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ DataSourceChangeEvent => Unit = null,
    data: js.Any = null,
    error: /* e */ DataSourceErrorEvent => Unit = null,
    filter: js.Any = null,
    group: DataSourceGroupItem | js.Array[DataSourceGroupItem] = null,
    inPlaceSort: js.UndefOr[Boolean] = js.undefined,
    offlineStorage: js.Any = null,
    page: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    push: /* e */ DataSourcePushEvent => Unit = null,
    requestEnd: /* e */ DataSourceRequestEndEvent => Unit = null,
    requestStart: /* e */ DataSourceRequestStartEvent => Unit = null,
    schema: FileManagerDataSourceSchema = null,
    serverAggregates: js.UndefOr[Boolean] = js.undefined,
    serverFiltering: js.UndefOr[Boolean] = js.undefined,
    serverGrouping: js.UndefOr[Boolean] = js.undefined,
    serverPaging: js.UndefOr[Boolean] = js.undefined,
    serverSorting: js.UndefOr[Boolean] = js.undefined,
    sort: js.Any = null,
    sync: /* e */ DataSourceEvent => Unit = null,
    transport: DataSourceTransport = null,
    `type`: String = null
  ): FileManagerDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceSort)) __obj.updateDynamic("inPlaceSort")(inPlaceSort.get.asInstanceOf[js.Any])
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction1(push))
    if (requestEnd != null) __obj.updateDynamic("requestEnd")(js.Any.fromFunction1(requestEnd))
    if (requestStart != null) __obj.updateDynamic("requestStart")(js.Any.fromFunction1(requestStart))
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
    __obj.asInstanceOf[FileManagerDataSourceOptions]
  }
}

