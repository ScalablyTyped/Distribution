package typings.mapboxGeoViewport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lat extends StObject {
    
    var lat: Double
    
    var lon: Double
  }
  object Lat {
    
    inline def apply(lat: Double, lon: Double): Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
}
