package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseOwner extends StObject {
  
  var lat: Double
  
  var lng: String
  
  var location_dict: LocationRepositoryStoryResponseLocationDict
  
  var name: String
  
  var pk: Double
  
  var profile_pic_url: String
  
  var profile_pic_username: String
  
  var short_name: String
  
  var `type`: String
}
object LocationRepositoryStoryResponseOwner {
  
  @scala.inline
  def apply(
    lat: Double,
    lng: String,
    location_dict: LocationRepositoryStoryResponseLocationDict,
    name: String,
    pk: Double,
    profile_pic_url: String,
    profile_pic_username: String,
    short_name: String,
    `type`: String
  ): LocationRepositoryStoryResponseOwner = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], location_dict = location_dict.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], profile_pic_username = profile_pic_username.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseOwner]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseOwnerMutableBuilder[Self <: LocationRepositoryStoryResponseOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_dict(value: LocationRepositoryStoryResponseLocationDict): Self = StObject.set(x, "location_dict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_username(value: String): Self = StObject.set(x, "profile_pic_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
