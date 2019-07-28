package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Point")
@js.native
class Point protected () extends js.Object {
  /** A point on a two-dimensional plane. */
  def this(x: Double, y: Double) = this()
  /** The X coordinate */
  var x: Double = js.native
  /** The Y coordinate */
  var y: Double = js.native
  /** Compares two Points */
  def equals(other: Point): Boolean = js.native
}

