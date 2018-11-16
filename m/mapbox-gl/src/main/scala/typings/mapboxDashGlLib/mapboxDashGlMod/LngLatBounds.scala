package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "LngLatBounds")
@js.native
class LngLatBounds ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatBounds {
  def this(boundsLike: js.Tuple2[
      mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatLike, 
      mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatLike
    ]) = this()
  def this(boundsLike: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) = this()
  def this(sw: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatLike, ne: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatLike) = this()
}

@JSImport("mapbox-gl", "LngLatBounds")
@js.native
object LngLatBounds extends js.Object {
  /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
  def convert(input: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatBoundsLike): mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLatBounds = js.native
}

