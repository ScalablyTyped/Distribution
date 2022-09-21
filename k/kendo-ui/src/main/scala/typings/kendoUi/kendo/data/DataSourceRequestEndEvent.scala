package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRequestEndEvent
  extends StObject
     with DataSourceEvent {
  
  var response: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceRequestEndEvent {
  
  inline def apply(): DataSourceRequestEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRequestEndEvent]
  }
  
  extension [Self <: DataSourceRequestEndEvent](x: Self) {
    
    inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
