package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object defines the clickable region of a marker image. The shape
  * consists of two properties — `type` and `coord` — which define the
  * non-transparent region of an image.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerShape Maps JavaScript API}
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlemaps.google.maps.MarkerShapeCircle
  - typings.googlemaps.google.maps.MarkerShapeRect
  - typings.googlemaps.google.maps.MarkerShapePoly
*/
trait MarkerShape extends StObject
object MarkerShape {
  
  inline def MarkerShapeCircle(coords: js.Tuple3[Double, Double, Double]): typings.googlemaps.google.maps.MarkerShapeCircle = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("circle")
    __obj.asInstanceOf[typings.googlemaps.google.maps.MarkerShapeCircle]
  }
  
  inline def MarkerShapePoly(coords: MarkerShapePolyCoords): typings.googlemaps.google.maps.MarkerShapePoly = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("poly")
    __obj.asInstanceOf[typings.googlemaps.google.maps.MarkerShapePoly]
  }
  
  inline def MarkerShapeRect(coords: js.Tuple4[Double, Double, Double, Double]): typings.googlemaps.google.maps.MarkerShapeRect = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[typings.googlemaps.google.maps.MarkerShapeRect]
  }
}
