package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridNavigateEvent
  extends StObject
     with GridEvent {
  
  var element: js.UndefOr[JQuery] = js.undefined
}
object GridNavigateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridNavigateEvent]
  }
  
  @scala.inline
  implicit class GridNavigateEventMutableBuilder[Self <: GridNavigateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: JQuery): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
