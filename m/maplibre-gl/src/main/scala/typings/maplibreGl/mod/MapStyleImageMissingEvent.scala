package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.styleimagemissing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyleImageMissingEvent
  extends StObject
     with MapLibreEvent[scala.Unit] {
  
  var id: String
  
  @JSName("type")
  var type_MapStyleImageMissingEvent: styleimagemissing
}
object MapStyleImageMissingEvent {
  
  inline def apply(id: String, originalEvent: scala.Unit, target: Map): MapStyleImageMissingEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("styleimagemissing")
    __obj.asInstanceOf[MapStyleImageMissingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapStyleImageMissingEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: styleimagemissing): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
