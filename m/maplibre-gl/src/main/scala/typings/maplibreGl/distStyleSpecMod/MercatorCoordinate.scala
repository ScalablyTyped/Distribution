package typings.maplibreGl.distStyleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MercatorCoordinate extends StObject {
  
  /**
  	 * Returns the distance of 1 meter in `MercatorCoordinate` units at this latitude.
  	 *
  	 * For coordinates in real world units using meters, this naturally provides the scale
  	 * to transform into `MercatorCoordinate`s.
  	 *
  	 * @returns {number} Distance of 1 meter in `MercatorCoordinate` units.
  	 */
  def meterInMercatorCoordinateUnits(): Double
  
  /**
  	 * Returns the altitude in meters of the coordinate.
  	 *
  	 * @returns {number} The altitude in meters.
  	 * @example
  	 * var coord = new maplibregl.MercatorCoordinate(0, 0, 0.02);
  	 * coord.toAltitude(); // 6914.281956295339
  	 */
  def toAltitude(): Double
  
  /**
  	 * Returns the `LngLat` for the coordinate.
  	 *
  	 * @returns {LngLat} The `LngLat` object.
  	 * @example
  	 * var coord = new maplibregl.MercatorCoordinate(0.5, 0.5, 0);
  	 * var lngLat = coord.toLngLat(); // LngLat(0, 0)
  	 */
  def toLngLat(): LngLat
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object MercatorCoordinate {
  
  inline def apply(
    meterInMercatorCoordinateUnits: () => Double,
    toAltitude: () => Double,
    toLngLat: () => LngLat,
    x: Double,
    y: Double,
    z: Double
  ): MercatorCoordinate = {
    val __obj = js.Dynamic.literal(meterInMercatorCoordinateUnits = js.Any.fromFunction0(meterInMercatorCoordinateUnits), toAltitude = js.Any.fromFunction0(toAltitude), toLngLat = js.Any.fromFunction0(toLngLat), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[MercatorCoordinate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MercatorCoordinate] (val x: Self) extends AnyVal {
    
    inline def setMeterInMercatorCoordinateUnits(value: () => Double): Self = StObject.set(x, "meterInMercatorCoordinateUnits", js.Any.fromFunction0(value))
    
    inline def setToAltitude(value: () => Double): Self = StObject.set(x, "toAltitude", js.Any.fromFunction0(value))
    
    inline def setToLngLat(value: () => LngLat): Self = StObject.set(x, "toLngLat", js.Any.fromFunction0(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
