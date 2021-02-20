package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "MercatorCoordinate")
@js.native
class MercatorCoordinate protected () extends StObject {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  
  /**
    * Returns the distance of 1 meter in MercatorCoordinate units at this latitude.
    *
    * For coordinates in real world units using meters, this naturally provides the
    * scale to transform into MercatorCoordinates.
    */
  def meterInMercatorCoordinateUnits(): Double = js.native
  
  /** Returns the altitude in meters of the coordinate. */
  def toAltitude(): Double = js.native
  
  /** Returns the LngLat for the coordinate. */
  def toLngLat(): LngLat = js.native
  
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
}
/* static members */
object MercatorCoordinate {
  
  /** Project a LngLat to a MercatorCoordinate. */
  @JSImport("mapbox-gl", "MercatorCoordinate.fromLngLat")
  @js.native
  def fromLngLat(lngLatLike: LngLatLike): MercatorCoordinate = js.native
  @JSImport("mapbox-gl", "MercatorCoordinate.fromLngLat")
  @js.native
  def fromLngLat(lngLatLike: LngLatLike, altitude: Double): MercatorCoordinate = js.native
}
