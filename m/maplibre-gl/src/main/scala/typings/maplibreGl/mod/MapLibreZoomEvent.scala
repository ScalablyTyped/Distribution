package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.boxzoomcancel
import typings.maplibreGl.maplibreGlStrings.boxzoomend
import typings.maplibreGl.maplibreGlStrings.boxzoomstart
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLibreZoomEvent extends StObject {
  
  var originalEvent: MouseEvent
  
  var target: Map
  
  var `type`: boxzoomstart | boxzoomend | boxzoomcancel
}
object MapLibreZoomEvent {
  
  inline def apply(originalEvent: MouseEvent, target: Map, `type`: boxzoomstart | boxzoomend | boxzoomcancel): MapLibreZoomEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLibreZoomEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapLibreZoomEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: boxzoomstart | boxzoomend | boxzoomcancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
