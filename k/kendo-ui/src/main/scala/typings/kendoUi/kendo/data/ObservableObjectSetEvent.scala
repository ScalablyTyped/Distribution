package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservableObjectSetEvent
  extends StObject
     with ObservableObjectEvent {
  
  var preventDefault: js.UndefOr[js.Function] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object ObservableObjectSetEvent {
  
  inline def apply(): ObservableObjectSetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableObjectSetEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservableObjectSetEvent] (val x: Self) extends AnyVal {
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
