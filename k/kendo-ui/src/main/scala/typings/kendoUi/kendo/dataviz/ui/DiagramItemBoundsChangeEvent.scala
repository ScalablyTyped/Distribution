package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.diagram.Rect
import typings.kendoUi.kendo.dataviz.diagram.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramItemBoundsChangeEvent
  extends StObject
     with DiagramEvent {
  
  var bounds: js.UndefOr[Rect] = js.undefined
  
  var item: js.UndefOr[Shape] = js.undefined
}
object DiagramItemBoundsChangeEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramItemBoundsChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramItemBoundsChangeEvent]
  }
  
  @scala.inline
  implicit class DiagramItemBoundsChangeEventMutableBuilder[Self <: DiagramItemBoundsChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setItem(value: Shape): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
