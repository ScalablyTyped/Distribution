package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseLocation extends StObject {
  
  var address: String
  
  var city: String
  
  var external_source: String
  
  var facebook_places_id: String
  
  var lat: String
  
  var lng: String
  
  var name: String
  
  var pk: Double
  
  var short_name: String
}
object LocationFeedResponseLocation {
  
  inline def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: String,
    lat: String,
    lng: String,
    name: String,
    pk: Double,
    short_name: String
  ): LocationFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseLocation]
  }
  
  extension [Self <: LocationFeedResponseLocation](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
    
    inline def setFacebook_places_id(value: String): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
    
    inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
  }
}
