package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourcePushEvent
  extends StObject
     with DataSourceEvent {
  
  var items: js.UndefOr[js.Array[DataSourceItemOrGroup]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourcePushEvent {
  
  inline def apply(): DataSourcePushEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourcePushEvent]
  }
  
  extension [Self <: DataSourcePushEvent](x: Self) {
    
    inline def setItems(value: js.Array[DataSourceItemOrGroup]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DataSourceItemOrGroup*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
