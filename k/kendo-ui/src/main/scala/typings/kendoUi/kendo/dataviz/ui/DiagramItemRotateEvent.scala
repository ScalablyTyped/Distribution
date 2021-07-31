package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.diagram.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramItemRotateEvent
  extends StObject
     with DiagramEvent {
  
  var item: js.UndefOr[Shape] = js.undefined
}
object DiagramItemRotateEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramItemRotateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramItemRotateEvent]
  }
  
  @scala.inline
  implicit class DiagramItemRotateEventMutableBuilder[Self <: DiagramItemRotateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Shape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
