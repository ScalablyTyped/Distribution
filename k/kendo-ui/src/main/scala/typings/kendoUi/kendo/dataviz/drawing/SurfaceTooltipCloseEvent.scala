package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceTooltipCloseEvent
  extends StObject
     with SurfaceEvent {
  
  var element: js.UndefOr[typings.kendoUi.kendo.drawing.Element] = js.undefined
  
  var target: js.UndefOr[typings.kendoUi.kendo.drawing.Element] = js.undefined
}
object SurfaceTooltipCloseEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Surface): SurfaceTooltipCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltipCloseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceTooltipCloseEvent] (val x: Self) extends AnyVal {
    
    inline def setElement(value: typings.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setTarget(value: typings.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
