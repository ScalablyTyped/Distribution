package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerShapeRect
  extends StObject
     with MarkerShape {
  
  /**
    * Coords is **[x1,y1,x2,y2]** where x1,y1 are the coordinates of the
    * upper-left corner of the rectangle and x2,y2 are the coordinates of the
    * lower-right coordinates of the rectangle.
    */
  var coords: js.Tuple4[Double, Double, Double, Double]
  
  var `type`: rect
}
object MarkerShapeRect {
  
  inline def apply(coords: js.Tuple4[Double, Double, Double, Double]): MarkerShapeRect = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[MarkerShapeRect]
  }
  
  extension [Self <: MarkerShapeRect](x: Self) {
    
    inline def setCoords(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
