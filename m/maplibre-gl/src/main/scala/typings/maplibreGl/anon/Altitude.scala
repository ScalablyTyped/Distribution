package typings.maplibreGl.anon

import typings.maplibreGl.mod.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Altitude extends StObject {
  
  var altitude: Double
  
  var lngLat: LngLat
}
object Altitude {
  
  inline def apply(altitude: Double, lngLat: LngLat): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
  
  extension [Self <: Altitude](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setLngLat(value: LngLat): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
  }
}
