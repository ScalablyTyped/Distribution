package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLonLatObject extends StObject {
  
  /**
    * The latitude.
    */
  var lat: Double
  
  /**
    * The longitude.
    */
  var lon: Double
}
object MapLonLatObject {
  
  inline def apply(lat: Double, lon: Double): MapLonLatObject = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLonLatObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapLonLatObject] (val x: Self) extends AnyVal {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
