package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerShapeCircle
  extends StObject
     with MarkerShape {
  
  /**
    * Coords is **[x1,y1,r]** where x1,y2 are the coordinates of the center of
    * the circle, and r is the radius of the circle.
    */
  var coords: js.Tuple3[Double, Double, Double]
  
  var `type`: circle
}
object MarkerShapeCircle {
  
  inline def apply(coords: js.Tuple3[Double, Double, Double]): MarkerShapeCircle = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[MarkerShapeCircle]
  }
  
  extension [Self <: MarkerShapeCircle](x: Self) {
    
    inline def setCoords(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
