package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Point")
@js.native
class Point protected () extends js.Object {
  /** A point on a two-dimensional plane. */
  def this(x: scala.Double, y: scala.Double) = this()
  /** The X coordinate */
  var x: scala.Double = js.native
  /** The Y coordinate */
  var y: scala.Double = js.native
  /** Compares two Points */
  def equals(other: Point): scala.Boolean = js.native
}

