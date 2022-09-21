package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroupCompareItem extends StObject {
  
  var field: String
  
  var items: js.Array[Any]
  
  var value: Any
}
object DataSourceGroupCompareItem {
  
  inline def apply(field: String, items: js.Array[Any], value: Any): DataSourceGroupCompareItem = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroupCompareItem]
  }
  
  extension [Self <: DataSourceGroupCompareItem](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
