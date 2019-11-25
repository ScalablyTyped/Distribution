package typings.googlemaps.google.maps

import typings.googlemaps.googlemapsStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerShapeCircle extends MarkerShape {
  /**
    * Coords is **[x1,y1,r]** where x1,y2 are the coordinates of the center of
    * the circle, and r is the radius of the circle.
    */
  var coords: js.Tuple3[Double, Double, Double]
  var `type`: circle
}

object MarkerShapeCircle {
  @scala.inline
  def apply(coords: js.Tuple3[Double, Double, Double], `type`: circle): MarkerShapeCircle = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShapeCircle]
  }
}

