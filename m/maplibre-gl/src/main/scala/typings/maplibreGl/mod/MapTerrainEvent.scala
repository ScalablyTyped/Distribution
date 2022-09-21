package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.terrain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTerrainEvent extends StObject {
  
  var `type`: terrain
}
object MapTerrainEvent {
  
  inline def apply(): MapTerrainEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("terrain")
    __obj.asInstanceOf[MapTerrainEvent]
  }
  
  extension [Self <: MapTerrainEvent](x: Self) {
    
    inline def setType(value: terrain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
