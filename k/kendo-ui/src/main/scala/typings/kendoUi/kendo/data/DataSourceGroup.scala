package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroup
  extends StObject
     with DataSourceItemOrGroup {
  
  var aggregates: js.Array[Any]
  
  var field: String
  
  var hasSubgroups: Boolean
  
  var items: js.Array[DataSourceItemOrGroup]
  
  var value: Any
}
object DataSourceGroup {
  
  inline def apply(
    aggregates: js.Array[Any],
    field: String,
    hasSubgroups: Boolean,
    items: js.Array[DataSourceItemOrGroup],
    value: Any
  ): DataSourceGroup = {
    val __obj = js.Dynamic.literal(aggregates = aggregates.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasSubgroups = hasSubgroups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroup]
  }
  
  extension [Self <: DataSourceGroup](x: Self) {
    
    inline def setAggregates(value: js.Array[Any]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesVarargs(value: Any*): Self = StObject.set(x, "aggregates", js.Array(value*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setHasSubgroups(value: Boolean): Self = StObject.set(x, "hasSubgroups", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[DataSourceItemOrGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DataSourceItemOrGroup*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
