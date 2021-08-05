package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceGroup
  extends StObject
     with DataSourceItemOrGroup {
  
  var aggregates: js.Array[js.Any]
  
  var field: String
  
  var hasSubgroups: Boolean
  
  var items: js.Array[DataSourceItemOrGroup]
  
  var value: js.Any
}
object DataSourceGroup {
  
  inline def apply(
    aggregates: js.Array[js.Any],
    field: String,
    hasSubgroups: Boolean,
    items: js.Array[DataSourceItemOrGroup],
    value: js.Any
  ): DataSourceGroup = {
    val __obj = js.Dynamic.literal(aggregates = aggregates.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasSubgroups = hasSubgroups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceGroup]
  }
  
  extension [Self <: DataSourceGroup](x: Self) {
    
    inline def setAggregates(value: js.Array[js.Any]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesVarargs(value: js.Any*): Self = StObject.set(x, "aggregates", js.Array(value :_*))
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setHasSubgroups(value: Boolean): Self = StObject.set(x, "hasSubgroups", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[DataSourceItemOrGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DataSourceItemOrGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
