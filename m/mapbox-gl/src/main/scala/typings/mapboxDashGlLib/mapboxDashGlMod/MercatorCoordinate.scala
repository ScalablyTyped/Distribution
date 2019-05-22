package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MercatorCoordinate")
@js.native
class MercatorCoordinate protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  /** The x component of the position. */
  var x: scala.Double = js.native
  /** The y component of the position. */
  var y: scala.Double = js.native
  /**
    * The z component of the position.
    *
    * @default 0
    */
  var z: js.UndefOr[scala.Double] = js.native
  /** Returns the altitude in meters of the coordinate. */
  def toAltitude(): scala.Double = js.native
  /** Returns the LngLat for the coordinate. */
  def toLngLat(): LngLat = js.native
}

/* static members */
@JSImport("mapbox-gl", "MercatorCoordinate")
@js.native
object MercatorCoordinate extends js.Object {
  /** Project a LngLat to a MercatorCoordinate. */
  def fromLngLat(lngLatLike: mapboxDashGlLib.mapboxDashGlMod.LngLatLike): mapboxDashGlLib.mapboxDashGlMod.MercatorCoordinate = js.native
  def fromLngLat(lngLatLike: mapboxDashGlLib.mapboxDashGlMod.LngLatLike, altitude: scala.Double): mapboxDashGlLib.mapboxDashGlMod.MercatorCoordinate = js.native
}

