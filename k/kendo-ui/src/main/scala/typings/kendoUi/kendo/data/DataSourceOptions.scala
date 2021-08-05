package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceOptions extends StObject {
  
  var aggregate: js.UndefOr[js.Array[DataSourceAggregateItem]] = js.undefined
  
  var autoSync: js.UndefOr[Boolean] = js.undefined
  
  var batch: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ DataSourceChangeEvent, Unit]] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ DataSourceErrorEvent, Unit]] = js.undefined
  
  var filter: js.UndefOr[js.Any] = js.undefined
  
  var group: js.UndefOr[DataSourceGroupItem | js.Array[DataSourceGroupItem]] = js.undefined
  
  var inPlaceSort: js.UndefOr[Boolean] = js.undefined
  
  var offlineStorage: js.UndefOr[js.Any] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var push: js.UndefOr[js.Function1[/* e */ DataSourcePushEvent, Unit]] = js.undefined
  
  var requestEnd: js.UndefOr[js.Function1[/* e */ DataSourceRequestEndEvent, Unit]] = js.undefined
  
  var requestStart: js.UndefOr[js.Function1[/* e */ DataSourceRequestStartEvent, Unit]] = js.undefined
  
  var schema: js.UndefOr[DataSourceSchema] = js.undefined
  
  var serverAggregates: js.UndefOr[Boolean] = js.undefined
  
  var serverFiltering: js.UndefOr[Boolean] = js.undefined
  
  var serverGrouping: js.UndefOr[Boolean] = js.undefined
  
  var serverPaging: js.UndefOr[Boolean] = js.undefined
  
  var serverSorting: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[js.Any] = js.undefined
  
  var sync: js.UndefOr[js.Function1[/* e */ DataSourceEvent, Unit]] = js.undefined
  
  var transport: js.UndefOr[DataSourceTransport] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceOptions {
  
  inline def apply(): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions]
  }
  
  extension [Self <: DataSourceOptions](x: Self) {
    
    inline def setAggregate(value: js.Array[DataSourceAggregateItem]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setAggregateVarargs(value: DataSourceAggregateItem*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
    inline def setAutoSync(value: Boolean): Self = StObject.set(x, "autoSync", value.asInstanceOf[js.Any])
    
    inline def setAutoSyncUndefined: Self = StObject.set(x, "autoSync", js.undefined)
    
    inline def setBatch(value: Boolean): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setChange(value: /* e */ DataSourceChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: /* e */ DataSourceErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: DataSourceGroupItem | js.Array[DataSourceGroupItem]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: DataSourceGroupItem*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    inline def setInPlaceSort(value: Boolean): Self = StObject.set(x, "inPlaceSort", value.asInstanceOf[js.Any])
    
    inline def setInPlaceSortUndefined: Self = StObject.set(x, "inPlaceSort", js.undefined)
    
    inline def setOfflineStorage(value: js.Any): Self = StObject.set(x, "offlineStorage", value.asInstanceOf[js.Any])
    
    inline def setOfflineStorageUndefined: Self = StObject.set(x, "offlineStorage", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPush(value: /* e */ DataSourcePushEvent => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setRequestEnd(value: /* e */ DataSourceRequestEndEvent => Unit): Self = StObject.set(x, "requestEnd", js.Any.fromFunction1(value))
    
    inline def setRequestEndUndefined: Self = StObject.set(x, "requestEnd", js.undefined)
    
    inline def setRequestStart(value: /* e */ DataSourceRequestStartEvent => Unit): Self = StObject.set(x, "requestStart", js.Any.fromFunction1(value))
    
    inline def setRequestStartUndefined: Self = StObject.set(x, "requestStart", js.undefined)
    
    inline def setSchema(value: DataSourceSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setServerAggregates(value: Boolean): Self = StObject.set(x, "serverAggregates", value.asInstanceOf[js.Any])
    
    inline def setServerAggregatesUndefined: Self = StObject.set(x, "serverAggregates", js.undefined)
    
    inline def setServerFiltering(value: Boolean): Self = StObject.set(x, "serverFiltering", value.asInstanceOf[js.Any])
    
    inline def setServerFilteringUndefined: Self = StObject.set(x, "serverFiltering", js.undefined)
    
    inline def setServerGrouping(value: Boolean): Self = StObject.set(x, "serverGrouping", value.asInstanceOf[js.Any])
    
    inline def setServerGroupingUndefined: Self = StObject.set(x, "serverGrouping", js.undefined)
    
    inline def setServerPaging(value: Boolean): Self = StObject.set(x, "serverPaging", value.asInstanceOf[js.Any])
    
    inline def setServerPagingUndefined: Self = StObject.set(x, "serverPaging", js.undefined)
    
    inline def setServerSorting(value: Boolean): Self = StObject.set(x, "serverSorting", value.asInstanceOf[js.Any])
    
    inline def setServerSortingUndefined: Self = StObject.set(x, "serverSorting", js.undefined)
    
    inline def setSort(value: js.Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSync(value: /* e */ DataSourceEvent => Unit): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setTransport(value: DataSourceTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
