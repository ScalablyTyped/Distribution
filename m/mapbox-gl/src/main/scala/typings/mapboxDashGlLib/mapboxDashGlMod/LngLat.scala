package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "LngLat")
@js.native
class LngLat protected () extends _LngLatLike {
  def this(lng: scala.Double, lat: scala.Double) = this()
  var lat: scala.Double = js.native
  var lng: scala.Double = js.native
  /** Return a LngLat as an array */
  def toArray(): js.Array[scala.Double] = js.native
  def toBounds(radius: scala.Double): LngLatBounds = js.native
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  def wrap(): LngLat = js.native
}

/* static members */
@JSImport("mapbox-gl", "LngLat")
@js.native
object LngLat extends js.Object {
  def convert(input: mapboxDashGlLib.mapboxDashGlMod.LngLatLike): mapboxDashGlLib.mapboxDashGlMod.LngLat = js.native
}

