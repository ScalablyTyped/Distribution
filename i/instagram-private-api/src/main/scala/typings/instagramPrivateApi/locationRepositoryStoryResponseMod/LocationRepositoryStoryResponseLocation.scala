package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRepositoryStoryResponseLocation extends StObject {
  
  var address: js.UndefOr[String] = js.native
  
  var city: js.UndefOr[String] = js.native
  
  var external_source: js.UndefOr[String] = js.native
  
  var facebook_places_id: js.UndefOr[Double] = js.native
  
  var lat: Double = js.native
  
  var lng: String | Double = js.native
  
  var location_dict: js.UndefOr[LocationRepositoryStoryResponseLocationDict] = js.native
  
  var name: String = js.native
  
  var pk: Double = js.native
  
  var profile_pic_url: js.UndefOr[String] = js.native
  
  var profile_pic_username: js.UndefOr[String] = js.native
  
  var short_name: String = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object LocationRepositoryStoryResponseLocation {
  
  @scala.inline
  def apply(lat: Double, lng: String | Double, name: String, pk: Double, short_name: String): LocationRepositoryStoryResponseLocation = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseLocation]
  }
  
  @scala.inline
  implicit class LocationRepositoryStoryResponseLocationMutableBuilder[Self <: LocationRepositoryStoryResponseLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_sourceUndefined: Self = StObject.set(x, "external_source", js.undefined)
    
    @scala.inline
    def setFacebook_places_id(value: Double): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebook_places_idUndefined: Self = StObject.set(x, "facebook_places_id", js.undefined)
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: String | Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_dict(value: LocationRepositoryStoryResponseLocationDict): Self = StObject.set(x, "location_dict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_dictUndefined: Self = StObject.set(x, "location_dict", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_urlUndefined: Self = StObject.set(x, "profile_pic_url", js.undefined)
    
    @scala.inline
    def setProfile_pic_username(value: String): Self = StObject.set(x, "profile_pic_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_usernameUndefined: Self = StObject.set(x, "profile_pic_username", js.undefined)
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
