package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.layer.Shape
import typings.kendoUi.kendo.drawing.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapShapeMouseEnterEvent
  extends StObject
     with MapEvent {
  
  var layer: js.UndefOr[Shape] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  
  var shape: js.UndefOr[Element] = js.undefined
}
object MapShapeMouseEnterEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Map): MapShapeMouseEnterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapShapeMouseEnterEvent]
  }
  
  @scala.inline
  implicit class MapShapeMouseEnterEventMutableBuilder[Self <: MapShapeMouseEnterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: Shape): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setShape(value: Element): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
