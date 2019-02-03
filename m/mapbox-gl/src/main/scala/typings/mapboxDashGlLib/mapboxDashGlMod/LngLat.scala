package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "LngLat")
@js.native
class LngLat protected ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLat {
  def this(lng: scala.Double, lat: scala.Double) = this()
  /* CompleteClass */
  override var lat: scala.Double = js.native
  /* CompleteClass */
  override var lng: scala.Double = js.native
  /** Return a LngLat as an array */
  /* CompleteClass */
  override def toArray(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def toBounds(radius: scala.Double): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatBounds = js.native
  /** Return a new LngLat object whose longitude is wrapped to the range (-180, 180). */
  /* CompleteClass */
  override def wrap(): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLat = js.native
}

/* static members */
@JSImport("mapbox-gl", "LngLat")
@js.native
object LngLat extends js.Object {
  def convert(input: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatLike): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLat = js.native
}

