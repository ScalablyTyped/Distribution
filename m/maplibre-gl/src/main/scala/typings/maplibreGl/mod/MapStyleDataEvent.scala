package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.style_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyleDataEvent
  extends StObject
     with MapLibreEvent[scala.Unit] {
  
  var dataType: style_
}
object MapStyleDataEvent {
  
  inline def apply(originalEvent: scala.Unit, target: Map, `type`: String): MapStyleDataEvent = {
    val __obj = js.Dynamic.literal(dataType = "style", originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleDataEvent]
  }
  
  extension [Self <: MapStyleDataEvent](x: Self) {
    
    inline def setDataType(value: style_): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
  }
}
