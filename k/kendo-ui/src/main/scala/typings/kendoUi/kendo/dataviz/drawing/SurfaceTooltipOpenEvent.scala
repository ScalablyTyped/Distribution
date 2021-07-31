package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceTooltipOpenEvent
  extends StObject
     with SurfaceEvent {
  
  var element: js.UndefOr[typings.kendoUi.kendo.drawing.Element] = js.undefined
  
  var target: js.UndefOr[typings.kendoUi.kendo.drawing.Element] = js.undefined
}
object SurfaceTooltipOpenEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Surface): SurfaceTooltipOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltipOpenEvent]
  }
  
  @scala.inline
  implicit class SurfaceTooltipOpenEventMutableBuilder[Self <: SurfaceTooltipOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: typings.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setTarget(value: typings.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
