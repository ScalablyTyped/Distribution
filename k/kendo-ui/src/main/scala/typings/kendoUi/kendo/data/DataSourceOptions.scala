package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceOptions extends StObject {
  
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
  implicit class DataSourceOptionsMutableBuilder[Self <: DataSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: js.Array[DataSourceAggregateItem]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setAggregateVarargs(value: DataSourceAggregateItem*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
    @scala.inline
    def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    @scala.inline
    def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ DataSourceChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ DataSourceErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroup(value: DataSourceGroupItem | js.Array[DataSourceGroupItem]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: DataSourceGroupItem*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setInPlaceSort(value: Boolean): Self = StObject.set(x, "inPlaceSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPlaceSortUndefined: Self = StObject.set(x, "inPlaceSort", js.undefined)
    
    @scala.inline
    def setOfflineStorage(value: js.Any): Self = StObject.set(x, "offlineStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfflineStorageUndefined: Self = StObject.set(x, "offlineStorage", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPush(value: /* e */ DataSourcePushEvent => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setRequestEnd(value: /* e */ DataSourceRequestEndEvent => Unit): Self = StObject.set(x, "requestEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestEndUndefined: Self = StObject.set(x, "requestEnd", js.undefined)
    
    @scala.inline
    def setRequestStart(value: /* e */ DataSourceRequestStartEvent => Unit): Self = StObject.set(x, "requestStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestStartUndefined: Self = StObject.set(x, "requestStart", js.undefined)
    
    @scala.inline
    def setSchema(value: DataSourceSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setServerAggregates(value: Boolean): Self = StObject.set(x, "serverAggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerAggregatesUndefined: Self = StObject.set(x, "serverAggregates", js.undefined)
    
    @scala.inline
    def setServerFiltering(value: Boolean): Self = StObject.set(x, "serverFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerFilteringUndefined: Self = StObject.set(x, "serverFiltering", js.undefined)
    
    @scala.inline
    def setServerGrouping(value: Boolean): Self = StObject.set(x, "serverGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupingUndefined: Self = StObject.set(x, "serverGrouping", js.undefined)
    
    @scala.inline
    def setServerPaging(value: Boolean): Self = StObject.set(x, "serverPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPagingUndefined: Self = StObject.set(x, "serverPaging", js.undefined)
    
    @scala.inline
    def setServerSorting(value: Boolean): Self = StObject.set(x, "serverSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSortingUndefined: Self = StObject.set(x, "serverSorting", js.undefined)
    
    @scala.inline
    def setSort(value: js.Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSync(value: /* e */ DataSourceEvent => Unit): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    @scala.inline
    def setTransport(value: DataSourceTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
