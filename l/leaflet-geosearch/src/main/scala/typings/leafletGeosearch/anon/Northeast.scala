package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersProviderMod.LatLng
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Northeast] (val x: Self) extends AnyVal {
    
    inline def setNortheast(value: LatLng): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: LatLng): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
