package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MercatorCoordinate")
@js.native
class MercatorCoordinate protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  /** The x component of the position. */
  var x: Double = js.native
  /** The y component of the position. */
  var y: Double = js.native
  /**
    * The z component of the position.
    *
    * @default 0
    */
  var z: js.UndefOr[Double] = js.native
  /** Returns the altitude in meters of the coordinate. */
  def toAltitude(): Double = js.native
  /** Returns the LngLat for the coordinate. */
  def toLngLat(): LngLat = js.native
}

/* static members */
@JSImport("mapbox-gl", "MercatorCoordinate")
@js.native
object MercatorCoordinate extends js.Object {
  /** Project a LngLat to a MercatorCoordinate. */
  def fromLngLat(lngLatLike: LngLatLike): MercatorCoordinate = js.native
  def fromLngLat(lngLatLike: LngLatLike, altitude: Double): MercatorCoordinate = js.native
}

