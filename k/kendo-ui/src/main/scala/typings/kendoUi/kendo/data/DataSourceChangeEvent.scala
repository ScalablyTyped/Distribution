package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceChangeEvent
  extends StObject
     with DataSourceEvent {
  
  var action: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var items: js.UndefOr[js.Array[DataSourceItemOrGroup]] = js.undefined
  
  var node: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[Model] = js.undefined
}
object DataSourceChangeEvent {
  
  inline def apply(): DataSourceChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceChangeEvent]
  }
  
  extension [Self <: DataSourceChangeEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItems(value: js.Array[DataSourceItemOrGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DataSourceItemOrGroup*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setValue(value: Model): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
