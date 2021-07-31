package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceParameterMapDataFilter extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[js.Array[DataSourceParameterMapDataFilter]] = js.undefined
  
  var logic: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object DataSourceParameterMapDataFilter {
  
  @scala.inline
  def apply(): DataSourceParameterMapDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameterMapDataFilter]
  }
  
  @scala.inline
  implicit class DataSourceParameterMapDataFilterMutableBuilder[Self <: DataSourceParameterMapDataFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilters(value: js.Array[DataSourceParameterMapDataFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DataSourceParameterMapDataFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setLogic(value: String): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
