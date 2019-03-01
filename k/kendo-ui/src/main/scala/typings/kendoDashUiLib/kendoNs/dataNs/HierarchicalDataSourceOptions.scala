package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchicalDataSourceOptions extends DataSourceOptions {
  @JSName("schema")
  var schema_HierarchicalDataSourceOptions: js.UndefOr[HierarchicalDataSourceSchema] = js.undefined
}

object HierarchicalDataSourceOptions {
  @scala.inline
  def apply(
    aggregate: js.Array[DataSourceAggregateItem] = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    batch: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ DataSourceChangeEvent, scala.Unit] = null,
    data: js.Any = null,
    error: js.Function1[/* e */ DataSourceErrorEvent, scala.Unit] = null,
    filter: js.Any = null,
    group: DataSourceGroupItem | js.Array[DataSourceGroupItem] = null,
    inPlaceSort: js.UndefOr[scala.Boolean] = js.undefined,
    offlineStorage: js.Any = null,
    page: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    push: js.Function1[/* e */ DataSourcePushEvent, scala.Unit] = null,
    requestEnd: js.Function1[/* e */ DataSourceRequestEndEvent, scala.Unit] = null,
    requestStart: js.Function1[/* e */ DataSourceRequestStartEvent, scala.Unit] = null,
    schema: HierarchicalDataSourceSchema = null,
    serverAggregates: js.UndefOr[scala.Boolean] = js.undefined,
    serverFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    serverGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    serverPaging: js.UndefOr[scala.Boolean] = js.undefined,
    serverSorting: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Any = null,
    sync: js.Function1[/* e */ DataSourceEvent, scala.Unit] = null,
    transport: DataSourceTransport = null,
    `type`: java.lang.String = null
  ): HierarchicalDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    if (change != null) __obj.updateDynamic("change")(change)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceSort)) __obj.updateDynamic("inPlaceSort")(inPlaceSort)
    if (offlineStorage != null) __obj.updateDynamic("offlineStorage")(offlineStorage)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push)
    if (requestEnd != null) __obj.updateDynamic("requestEnd")(requestEnd)
    if (requestStart != null) __obj.updateDynamic("requestStart")(requestStart)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(serverAggregates)) __obj.updateDynamic("serverAggregates")(serverAggregates)
    if (!js.isUndefined(serverFiltering)) __obj.updateDynamic("serverFiltering")(serverFiltering)
    if (!js.isUndefined(serverGrouping)) __obj.updateDynamic("serverGrouping")(serverGrouping)
    if (!js.isUndefined(serverPaging)) __obj.updateDynamic("serverPaging")(serverPaging)
    if (!js.isUndefined(serverSorting)) __obj.updateDynamic("serverSorting")(serverSorting)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HierarchicalDataSourceOptions]
  }
}

