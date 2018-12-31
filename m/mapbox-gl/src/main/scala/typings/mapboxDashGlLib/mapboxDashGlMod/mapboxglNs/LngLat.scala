package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LngLat extends js.Object {
  var lat: scala.Double
  var lng: scala.Double
  /** Return a LngLat as an array */
  def toArray(): js.Array[scala.Double]
  def toBounds(radius: scala.Double): LngLatBounds
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  def wrap(): LngLat
}

