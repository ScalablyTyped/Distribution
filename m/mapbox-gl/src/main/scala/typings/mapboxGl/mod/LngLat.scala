package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "LngLat")
@js.native
class LngLat protected () extends _LngLatLike {
  def this(lng: Double, lat: Double) = this()
  var lat: Double = js.native
  var lng: Double = js.native
  /** Returns the approximate distance between a pair of coordinates in meters
    * Uses the Haversine Formula (from R.W. Sinnott, "Virtues of the Haversine", Sky and Telescope, vol. 68, no. 2, 1984, p. 159) */
  def distanceTo(lngLat: LngLat): Double = js.native
  /** Return a LngLat as an array */
  def toArray(): js.Array[Double] = js.native
  def toBounds(radius: Double): LngLatBounds = js.native
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  def wrap(): LngLat = js.native
}

/* static members */
@JSImport("mapbox-gl", "LngLat")
@js.native
object LngLat extends js.Object {
  def convert(input: LngLatLike): LngLat = js.native
}

