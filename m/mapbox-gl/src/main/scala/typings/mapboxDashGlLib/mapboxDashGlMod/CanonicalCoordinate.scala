package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanonicalCoordinate extends js.Object {
  var key: scala.Double
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
  def equals(coord: CanonicalCoordinate): scala.Boolean
}

object CanonicalCoordinate {
  @scala.inline
  def apply(
    equals: CanonicalCoordinate => scala.Boolean,
    key: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): CanonicalCoordinate = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), key = key, x = x, y = y, z = z)
  
    __obj.asInstanceOf[CanonicalCoordinate]
  }
}

