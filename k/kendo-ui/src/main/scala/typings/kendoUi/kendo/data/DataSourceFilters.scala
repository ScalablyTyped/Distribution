package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceFilters
  extends StObject
     with DataSourceFilter {
  
  var filters: js.UndefOr[js.Array[DataSourceFilter]] = js.undefined
  
  var logic: js.UndefOr[String] = js.undefined
}
object DataSourceFilters {
  
  @scala.inline
  def apply(): DataSourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilters]
  }
  
  @scala.inline
  implicit class DataSourceFiltersMutableBuilder[Self <: DataSourceFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[DataSourceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DataSourceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setLogic(value: String): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
  }
}
