package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMercatorCoordinate extends StObject {
  
  def meterInMercatorCoordinateUnits(): js.Object
  
  def toAltitude(): js.Object
  
  def toLngLat(): js.Object
  
  var x: Double
  
  var y: Double
}
object IMercatorCoordinate {
  
  inline def apply(
    meterInMercatorCoordinateUnits: () => js.Object,
    toAltitude: () => js.Object,
    toLngLat: () => js.Object,
    x: Double,
    y: Double
  ): IMercatorCoordinate = {
    val __obj = js.Dynamic.literal(meterInMercatorCoordinateUnits = js.Any.fromFunction0(meterInMercatorCoordinateUnits), toAltitude = js.Any.fromFunction0(toAltitude), toLngLat = js.Any.fromFunction0(toLngLat), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMercatorCoordinate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMercatorCoordinate] (val x: Self) extends AnyVal {
    
    inline def setMeterInMercatorCoordinateUnits(value: () => js.Object): Self = StObject.set(x, "meterInMercatorCoordinateUnits", js.Any.fromFunction0(value))
    
    inline def setToAltitude(value: () => js.Object): Self = StObject.set(x, "toAltitude", js.Any.fromFunction0(value))
    
    inline def setToLngLat(value: () => js.Object): Self = StObject.set(x, "toLngLat", js.Any.fromFunction0(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
