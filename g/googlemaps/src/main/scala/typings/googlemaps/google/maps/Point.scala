package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The X coordinate */
  var x: Double
  /** The Y coordinate */
  var y: Double
  /** Compares two Points */
  def equals(other: Point): Boolean
}

object Point {
  @scala.inline
  def apply(equals: Point => Boolean, x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

