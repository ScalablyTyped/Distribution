package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayersControlEvent
  extends StObject
     with LayerEvent {
  
  var name: String
}
object LayersControlEvent {
  
  inline def apply(
    layer: Layer,
    name: String,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String
  ): LayersControlEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersControlEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayersControlEvent] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
