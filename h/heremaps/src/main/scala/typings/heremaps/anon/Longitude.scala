package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Longitude extends StObject {
  
  var Latitude: Double
  
  var Longitude: Double
}
object Longitude {
  
  inline def apply(Latitude: Double, Longitude: Double): Longitude = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longitude]
  }
  
  extension [Self <: Longitude](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
  }
}
