package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceOptions extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceAggregateItem]] = js.native
  var autoSync: js.UndefOr[Boolean] = js.native
  var batch: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ DataSourceChangeEvent, Unit]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Function1[/* e */ DataSourceErrorEvent, Unit]] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var group: js.UndefOr[DataSourceGroupItem | js.Array[DataSourceGroupItem]] = js.native
  var inPlaceSort: js.UndefOr[Boolean] = js.native
  var offlineStorage: js.UndefOr[js.Any] = js.native
  var page: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var push: js.UndefOr[js.Function1[/* e */ DataSourcePushEvent, Unit]] = js.native
  var requestEnd: js.UndefOr[js.Function1[/* e */ DataSourceRequestEndEvent, Unit]] = js.native
  var requestStart: js.UndefOr[js.Function1[/* e */ DataSourceRequestStartEvent, Unit]] = js.native
  var schema: js.UndefOr[DataSourceSchema] = js.native
  var serverAggregates: js.UndefOr[Boolean] = js.native
  var serverFiltering: js.UndefOr[Boolean] = js.native
  var serverGrouping: js.UndefOr[Boolean] = js.native
  var serverPaging: js.UndefOr[Boolean] = js.native
  var serverSorting: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[js.Any] = js.native
  var sync: js.UndefOr[js.Function1[/* e */ DataSourceEvent, Unit]] = js.native
  var transport: js.UndefOr[DataSourceTransport] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceOptions {
  @scala.inline
  def apply(): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions]
  }
  @scala.inline
  implicit class DataSourceOptionsOps[Self <: DataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregateVarargs(value: DataSourceAggregateItem*): Self = this.set("aggregate", js.Array(value :_*))
    @scala.inline
    def setAggregate(value: js.Array[DataSourceAggregateItem]): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    @scala.inline
    def setAutoSync(value: Boolean): Self = this.set("autoSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSync: Self = this.set("autoSync", js.undefined)
    @scala.inline
    def setBatch(value: Boolean): Self = this.set("batch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    @scala.inline
    def setChange(value: /* e */ DataSourceChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: /* e */ DataSourceErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setGroupVarargs(value: DataSourceGroupItem*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: DataSourceGroupItem | js.Array[DataSourceGroupItem]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setInPlaceSort(value: Boolean): Self = this.set("inPlaceSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInPlaceSort: Self = this.set("inPlaceSort", js.undefined)
    @scala.inline
    def setOfflineStorage(value: js.Any): Self = this.set("offlineStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfflineStorage: Self = this.set("offlineStorage", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPush(value: /* e */ DataSourcePushEvent => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setRequestEnd(value: /* e */ DataSourceRequestEndEvent => Unit): Self = this.set("requestEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestEnd: Self = this.set("requestEnd", js.undefined)
    @scala.inline
    def setRequestStart(value: /* e */ DataSourceRequestStartEvent => Unit): Self = this.set("requestStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestStart: Self = this.set("requestStart", js.undefined)
    @scala.inline
    def setSchema(value: DataSourceSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setServerAggregates(value: Boolean): Self = this.set("serverAggregates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerAggregates: Self = this.set("serverAggregates", js.undefined)
    @scala.inline
    def setServerFiltering(value: Boolean): Self = this.set("serverFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerFiltering: Self = this.set("serverFiltering", js.undefined)
    @scala.inline
    def setServerGrouping(value: Boolean): Self = this.set("serverGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerGrouping: Self = this.set("serverGrouping", js.undefined)
    @scala.inline
    def setServerPaging(value: Boolean): Self = this.set("serverPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerPaging: Self = this.set("serverPaging", js.undefined)
    @scala.inline
    def setServerSorting(value: Boolean): Self = this.set("serverSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSorting: Self = this.set("serverSorting", js.undefined)
    @scala.inline
    def setSort(value: js.Any): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSync(value: /* e */ DataSourceEvent => Unit): Self = this.set("sync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    @scala.inline
    def setTransport(value: DataSourceTransport): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

