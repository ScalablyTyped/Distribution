package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LngLat extends _LngLatLike {
  var lat: scala.Double
  var lng: scala.Double
  /** Return a LngLat as an array */
  def toArray(): js.Array[scala.Double]
  def toBounds(radius: scala.Double): LngLatBounds
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  def wrap(): LngLat
}

object LngLat {
  @scala.inline
  def apply(
    lat: scala.Double,
    lng: scala.Double,
    toArray: () => js.Array[scala.Double],
    toBounds: scala.Double => LngLatBounds,
    toString: () => java.lang.String,
    wrap: () => LngLat
  ): LngLat = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng, toArray = js.Any.fromFunction0(toArray), toBounds = js.Any.fromFunction1(toBounds), toString = js.Any.fromFunction0(toString), wrap = js.Any.fromFunction0(wrap))
  
    __obj.asInstanceOf[LngLat]
  }
}

