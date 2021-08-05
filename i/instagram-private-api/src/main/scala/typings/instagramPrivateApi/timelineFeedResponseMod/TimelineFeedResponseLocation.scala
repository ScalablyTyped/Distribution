package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseLocation extends StObject {
  
  var address: String
  
  var city: String
  
  var external_source: String
  
  var facebook_places_id: Double | String
  
  var lat: Double
  
  var lng: Double
  
  var name: String
  
  var pk: Double | String
  
  var short_name: String
}
object TimelineFeedResponseLocation {
  
  inline def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: Double | String,
    lat: Double,
    lng: Double,
    name: String,
    pk: Double | String,
    short_name: String
  ): TimelineFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseLocation]
  }
  
  extension [Self <: TimelineFeedResponseLocation](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
    
    inline def setFacebook_places_id(value: Double | String): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPk(value: Double | String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
  }
}
