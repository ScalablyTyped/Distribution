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
  
  inline def apply(): DataSourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilters]
  }
  
  extension [Self <: DataSourceFilters](x: Self) {
    
    inline def setFilters(value: js.Array[DataSourceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: DataSourceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setLogic(value: String): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
    
    inline def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
  }
}
