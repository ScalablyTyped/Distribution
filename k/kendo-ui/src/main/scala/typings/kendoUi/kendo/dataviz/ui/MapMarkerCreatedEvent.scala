package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.Marker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMarkerCreatedEvent
  extends StObject
     with MapEvent {
  
  var layer: js.UndefOr[Marker] = js.undefined
  
  var marker: js.UndefOr[Marker] = js.undefined
}
object MapMarkerCreatedEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Map): MapMarkerCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerCreatedEvent]
  }
  
  @scala.inline
  implicit class MapMarkerCreatedEventMutableBuilder[Self <: MapMarkerCreatedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: Marker): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
  }
}
