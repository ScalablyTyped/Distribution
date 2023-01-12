package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarOpenEvent
  extends StObject
     with ToolBarEvent {
  
  var SplitButton: js.UndefOr[JQuery] = js.undefined
}
object ToolBarOpenEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ToolBar): ToolBarOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarOpenEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolBarOpenEvent] (val x: Self) extends AnyVal {
    
    inline def setSplitButton(value: JQuery): Self = StObject.set(x, "SplitButton", value.asInstanceOf[js.Any])
    
    inline def setSplitButtonUndefined: Self = StObject.set(x, "SplitButton", js.undefined)
  }
}
