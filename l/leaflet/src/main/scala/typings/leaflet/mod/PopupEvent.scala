package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupEvent
  extends StObject
     with LeafletEvent {
  
  @JSName("popup")
  var popup_PopupEvent: Popup_
}
object PopupEvent {
  
  inline def apply(layer: Any, popup: Popup_, propagatedFrom: Any, sourceTarget: Any, target: Any, `type`: String): PopupEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupEvent] (val x: Self) extends AnyVal {
    
    inline def setPopup(value: Popup_): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
