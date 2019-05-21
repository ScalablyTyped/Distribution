package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerShapePoly extends MarkerShape {
  /**
    * Coords is **[x1,y1,x2,y2...xn,yn]** where each x,y pair contains the
    * coordinates of one vertex of the polygon.
    */
  var coords: MarkerShapePolyCoords
  var `type`: googlemapsLib.googlemapsLibStrings.poly
}

object MarkerShapePoly {
  @scala.inline
  def apply(coords: MarkerShapePolyCoords, `type`: googlemapsLib.googlemapsLibStrings.poly): MarkerShapePoly = {
    val __obj = js.Dynamic.literal(coords = coords)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MarkerShapePoly]
  }
}

