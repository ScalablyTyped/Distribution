package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerShapeRect extends MarkerShape {
  /**
    * Coords is **[x1,y1,x2,y2]** where x1,y1 are the coordinates of the
    * upper-left corner of the rectangle and x2,y2 are the coordinates of the
    * lower-right coordinates of the rectangle.
    */
  var coords: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var `type`: googlemapsLib.googlemapsLibStrings.rect
}

object MarkerShapeRect {
  @scala.inline
  def apply(
    coords: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    `type`: googlemapsLib.googlemapsLibStrings.rect
  ): MarkerShapeRect = {
    val __obj = js.Dynamic.literal(coords = coords)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MarkerShapeRect]
  }
}

