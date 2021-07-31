package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroupCompareItem extends StObject {
  
  var field: String
  
  var items: js.Array[js.Any]
  
  var value: js.Any
}
object DataSourceGroupCompareItem {
  
  @scala.inline
  def apply(field: String, items: js.Array[js.Any], value: js.Any): DataSourceGroupCompareItem = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroupCompareItem]
  }
  
  @scala.inline
  implicit class DataSourceGroupCompareItemMutableBuilder[Self <: DataSourceGroupCompareItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
