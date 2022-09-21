package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacedGlyphBoxes extends StObject {
  
  var placedGlyphBoxes: Box
  
  var shift: ^
}
object PlacedGlyphBoxes {
  
  inline def apply(placedGlyphBoxes: Box, shift: ^): PlacedGlyphBoxes = {
    val __obj = js.Dynamic.literal(placedGlyphBoxes = placedGlyphBoxes.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacedGlyphBoxes]
  }
  
  extension [Self <: PlacedGlyphBoxes](x: Self) {
    
    inline def setPlacedGlyphBoxes(value: Box): Self = StObject.set(x, "placedGlyphBoxes", value.asInstanceOf[js.Any])
    
    inline def setShift(value: ^): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
  }
}
