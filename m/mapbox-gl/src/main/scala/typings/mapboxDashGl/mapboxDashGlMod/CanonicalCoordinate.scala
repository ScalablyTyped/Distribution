package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanonicalCoordinate extends js.Object {
  var key: Double
  var x: Double
  var y: Double
  var z: Double
  def equals(coord: CanonicalCoordinate): Boolean
}

object CanonicalCoordinate {
  @scala.inline
  def apply(equals: CanonicalCoordinate => Boolean, key: Double, x: Double, y: Double, z: Double): CanonicalCoordinate = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), key = key, x = x, y = y, z = z)
  
    __obj.asInstanceOf[CanonicalCoordinate]
  }
}

