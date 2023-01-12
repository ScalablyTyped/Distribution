package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckBoxGroupFocusEvent
  extends StObject
     with CheckBoxGroupEvent {
  
  var target: js.UndefOr[JQuery] = js.undefined
}
object CheckBoxGroupFocusEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: CheckBoxGroup): CheckBoxGroupFocusEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxGroupFocusEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckBoxGroupFocusEvent] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
