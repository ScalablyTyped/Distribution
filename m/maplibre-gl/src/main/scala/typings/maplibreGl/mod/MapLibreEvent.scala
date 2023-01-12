package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLibreEvent[TOrig] extends StObject {
  
  var originalEvent: TOrig
  
  var target: Map
  
  var `type`: String
}
object MapLibreEvent {
  
  inline def apply[TOrig](originalEvent: TOrig, target: Map, `type`: String): MapLibreEvent[TOrig] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLibreEvent[TOrig]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapLibreEvent[?], TOrig] (val x: Self & MapLibreEvent[TOrig]) extends AnyVal {
    
    inline def setOriginalEvent(value: TOrig): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
