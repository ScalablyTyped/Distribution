package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "MercatorCoordinate")
@js.native
open class MercatorCoordinate protected () extends StObject {
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  
  /**
  	 * Returns the distance of 1 meter in `MercatorCoordinate` units at this latitude.
  	 *
  	 * For coordinates in real world units using meters, this naturally provides the scale
  	 * to transform into `MercatorCoordinate`s.
  	 *
  	 * @returns {number} Distance of 1 meter in `MercatorCoordinate` units.
  	 */
  def meterInMercatorCoordinateUnits(): Double = js.native
  
  /**
  	 * Returns the altitude in meters of the coordinate.
  	 *
  	 * @returns {number} The altitude in meters.
  	 * @example
  	 * var coord = new maplibregl.MercatorCoordinate(0, 0, 0.02);
  	 * coord.toAltitude(); // 6914.281956295339
  	 */
  def toAltitude(): Double = js.native
  
  /**
  	 * Returns the `LngLat` for the coordinate.
  	 *
  	 * @returns {LngLat} The `LngLat` object.
  	 * @example
  	 * var coord = new maplibregl.MercatorCoordinate(0.5, 0.5, 0);
  	 * var lngLat = coord.toLngLat(); // LngLat(0, 0)
  	 */
  def toLngLat(): LngLat = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var z: Double = js.native
}
/* static members */
object MercatorCoordinate {
  
  @JSImport("maplibre-gl", "MercatorCoordinate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Project a `LngLat` to a `MercatorCoordinate`.
  	 *
  	 * @param {LngLatLike} lngLatLike The location to project.
  	 * @param {number} altitude The altitude in meters of the position.
  	 * @returns {MercatorCoordinate} The projected mercator coordinate.
  	 * @example
  	 * var coord = maplibregl.MercatorCoordinate.fromLngLat({ lng: 0, lat: 0}, 0);
  	 * coord; // MercatorCoordinate(0.5, 0.5, 0)
  	 */
  inline def fromLngLat(lngLatLike: LngLatLike): MercatorCoordinate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any]).asInstanceOf[MercatorCoordinate]
  inline def fromLngLat(lngLatLike: LngLatLike, altitude: Double): MercatorCoordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("fromLngLat")(lngLatLike.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[MercatorCoordinate]
}
