package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceTransportReadOptionsData extends StObject {
  
  var filter: js.UndefOr[DataSourceFilters] = js.undefined
  
  var group: js.UndefOr[js.Array[DataSourceGroupItem]] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[js.Array[DataSourceSortItem]] = js.undefined
  
  var take: js.UndefOr[Double] = js.undefined
}
object DataSourceTransportReadOptionsData {
  
  @scala.inline
  def apply(): DataSourceTransportReadOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportReadOptionsData]
  }
  
  @scala.inline
  implicit class DataSourceTransportReadOptionsDataMutableBuilder[Self <: DataSourceTransportReadOptionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: DataSourceFilters): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[DataSourceGroupItem]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: DataSourceGroupItem*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSort(value: js.Array[DataSourceSortItem]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortVarargs(value: DataSourceSortItem*): Self = StObject.set(x, "sort", js.Array(value :_*))
    
    @scala.inline
    def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
  }
}
