package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceFilterItem
  extends StObject
     with DataSourceFilter {
  
  var field: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[String | js.Function] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object DataSourceFilterItem {
  
  inline def apply(): DataSourceFilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFilterItem]
  }
  
  extension [Self <: DataSourceFilterItem](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOperator(value: String | js.Function): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
