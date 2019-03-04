package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

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
    equals: js.Function1[CanonicalCoordinate, scala.Boolean],
    key: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): CanonicalCoordinate = {
    val __obj = js.Dynamic.literal(equals = equals, key = key, x = x, y = y, z = z)
  
    __obj.asInstanceOf[CanonicalCoordinate]
  }
}

