package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservableObjectSetEvent
  extends StObject
     with ObservableObjectEvent {
  
  var preventDefault: js.UndefOr[js.Function] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object ObservableObjectSetEvent {
  
  @scala.inline
  def apply(): ObservableObjectSetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservableObjectSetEvent]
  }
  
  @scala.inline
  implicit class ObservableObjectSetEventMutableBuilder[Self <: ObservableObjectSetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
