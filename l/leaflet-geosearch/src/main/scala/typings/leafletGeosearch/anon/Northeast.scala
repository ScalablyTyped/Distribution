package typings.leafletGeosearch.anon

import typings.leafletGeosearch.providerMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Northeast extends StObject {
  
  var northeast: LatLng
  
  var southwest: LatLng
}
object Northeast {
  
  inline def apply(northeast: LatLng, southwest: LatLng): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
  
  extension [Self <: Northeast](x: Self) {
    
    inline def setNortheast(value: LatLng): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: LatLng): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
