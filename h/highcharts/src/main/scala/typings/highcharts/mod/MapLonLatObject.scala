package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A latitude/longitude object.
  */
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
  
  extension [Self <: MapLonLatObject](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
