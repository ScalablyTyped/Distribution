package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.circle
import typings.googlemaps.googlemapsStrings.poly
import typings.googlemaps.googlemapsStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait MarkerShape extends js.Object

object MarkerShape {
  @scala.inline
  def MarkerShapeCircle(coords: js.Tuple3[Double, Double, Double], `type`: circle): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
  @scala.inline
  def MarkerShapeRect(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
  @scala.inline
  def MarkerShapePoly(coords: MarkerShapePolyCoords, `type`: poly): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
}

