package typings.mapboxGl.anon

import typings.mapboxGl.mod._LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lon
  extends StObject
     with _LngLatLike {
  
  var lat: Double
  
  var lon: Double
}
object Lon {
  
  inline def apply(lat: Double, lon: Double): Lon = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
  
  extension [Self <: Lon](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
  }
}
