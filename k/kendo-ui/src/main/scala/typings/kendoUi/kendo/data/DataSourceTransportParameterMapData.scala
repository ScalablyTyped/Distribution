package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportParameterMapData extends StObject {
  
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
  
  inline def apply(): DataSourceTransportParameterMapData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportParameterMapData]
  }
  
  extension [Self <: DataSourceTransportParameterMapData](x: Self) {
    
    inline def setAggregate(value: js.Array[DataSourceParameterMapDataAggregate]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setAggregateVarargs(value: DataSourceParameterMapDataAggregate*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
    inline def setFilter(value: DataSourceParameterMapDataFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGroup(value: js.Array[DataSourceParameterMapDataGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: DataSourceParameterMapDataGroup*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    inline def setModels(value: js.Array[Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: js.Array[DataSourceParameterMapDataSort]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: DataSourceParameterMapDataSort*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
  }
}
