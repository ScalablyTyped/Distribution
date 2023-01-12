package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservableObjectEvent extends StObject {
  
  var field: js.UndefOr[String] = js.undefined
  
  var sender: js.UndefOr[ObservableObject] = js.undefined
}
object ObservableObjectEvent {
  
  inline def apply(): ObservableObjectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableObjectEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservableObjectEvent] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setSender(value: ObservableObject): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
