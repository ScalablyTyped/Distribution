package typings.kendoUi.kendo.dataviz.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurfaceMouseenterEvent extends SurfaceEvent {
  
  var element: js.UndefOr[typings.kendoUi.kendo.drawing.Element] = js.native
  
  var originalEvent: js.UndefOr[js.Any] = js.native
}
object SurfaceMouseenterEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Surface): SurfaceMouseenterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceMouseenterEvent]
  }
  
  @scala.inline
  implicit class SurfaceMouseenterEventMutableBuilder[Self <: SurfaceMouseenterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: typings.kendoUi.kendo.drawing.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
