package typings.googlemaps.global.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Point")
@js.native
class Point protected ()
  extends typings.googlemaps.google.maps.Point {
  /** A point on a two-dimensional plane. */
  def this(x: Double, y: Double) = this()
  /** The X coordinate */
  /* CompleteClass */
  override var x: Double = js.native
  /** The Y coordinate */
  /* CompleteClass */
  override var y: Double = js.native
  /** Compares two Points */
  /* CompleteClass */
  override def equals(other: typings.googlemaps.google.maps.Point): Boolean = js.native
}

