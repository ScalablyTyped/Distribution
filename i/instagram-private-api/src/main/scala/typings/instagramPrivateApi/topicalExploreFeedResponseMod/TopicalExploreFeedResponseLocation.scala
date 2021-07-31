package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseLocation extends StObject {
  
  var address: String
  
  var city: String
  
  var external_source: String
  
  var facebook_places_id: Double
  
  var lat: Double
  
  var lng: Double
  
  var name: String
  
  var pk: Double
  
  var short_name: String
}
object TopicalExploreFeedResponseLocation {
  
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: Double,
    lat: Double,
    lng: Double,
    name: String,
    pk: Double,
    short_name: String
  ): TopicalExploreFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseLocation]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseLocationMutableBuilder[Self <: TopicalExploreFeedResponseLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebook_places_id(value: Double): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
  }
}
