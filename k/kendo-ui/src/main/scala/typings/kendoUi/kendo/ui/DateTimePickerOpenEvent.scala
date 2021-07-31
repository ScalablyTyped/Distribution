package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimePickerOpenEvent
  extends StObject
     with DateTimePickerEvent {
  
  var view: js.UndefOr[String] = js.undefined
}
object DateTimePickerOpenEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DateTimePicker): DateTimePickerOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimePickerOpenEvent]
  }
  
  @scala.inline
  implicit class DateTimePickerOpenEventMutableBuilder[Self <: DateTimePickerOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
