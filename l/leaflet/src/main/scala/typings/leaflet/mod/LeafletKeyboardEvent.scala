package typings.leaflet.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafletKeyboardEvent
  extends StObject
     with LeafletEvent {
  
  var originalEvent: KeyboardEvent
}
object LeafletKeyboardEvent {
  
  inline def apply(
    layer: Any,
    originalEvent: KeyboardEvent,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): LeafletKeyboardEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletKeyboardEvent]
  }
  
  extension [Self <: LeafletKeyboardEvent](x: Self) {
    
    inline def setOriginalEvent(value: KeyboardEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
