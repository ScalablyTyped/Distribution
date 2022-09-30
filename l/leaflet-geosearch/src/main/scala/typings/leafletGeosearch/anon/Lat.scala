package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat extends StObject {
  
  var lat: String
  
  var lng: String
}
object Lat {
  
  inline def apply(lat: String, lng: String): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  extension [Self <: Lat](x: Self) {
    
    inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
