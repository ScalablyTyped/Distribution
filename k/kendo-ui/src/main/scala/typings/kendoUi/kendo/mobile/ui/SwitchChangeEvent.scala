package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchChangeEvent
  extends StObject
     with SwitchEvent {
  
  var checked: js.UndefOr[js.Any] = js.undefined
}
object SwitchChangeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Switch): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchChangeEvent]
  }
  
  @scala.inline
  implicit class SwitchChangeEventMutableBuilder[Self <: SwitchChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: js.Any): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
