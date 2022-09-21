package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceErrorEvent
  extends StObject
     with DataSourceEvent {
  
  var errorThrown: Any
  
  var errors: js.UndefOr[Any] = js.undefined
  
  var status: String
  
  var xhr: JQueryXHR
}
object DataSourceErrorEvent {
  
  inline def apply(errorThrown: Any, status: String, xhr: JQueryXHR): DataSourceErrorEvent = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceErrorEvent]
  }
  
  extension [Self <: DataSourceErrorEvent](x: Self) {
    
    inline def setErrorThrown(value: Any): Self = StObject.set(x, "errorThrown", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setXhr(value: JQueryXHR): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
