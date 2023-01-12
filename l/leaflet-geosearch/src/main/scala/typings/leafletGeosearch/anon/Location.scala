package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersProviderMod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var location: LatLng
  
  var location_type: String
  
  var viewport: Northeast
}
object Location {
  
  inline def apply(location: LatLng, location_type: String, viewport: Northeast): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocation_type(value: String): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Northeast): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
