package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRepositoryStoryResponseLocation extends js.Object {
  
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
  implicit class LocationRepositoryStoryResponseLocationOps[Self <: LocationRepositoryStoryResponseLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: String | Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setExternal_source(value: String): Self = this.set("external_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_source: Self = this.set("external_source", js.undefined)
    
    @scala.inline
    def setFacebook_places_id(value: Double): Self = this.set("facebook_places_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebook_places_id: Self = this.set("facebook_places_id", js.undefined)
    
    @scala.inline
    def setLocation_dict(value: LocationRepositoryStoryResponseLocationDict): Self = this.set("location_dict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation_dict: Self = this.set("location_dict", js.undefined)
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_pic_url: Self = this.set("profile_pic_url", js.undefined)
    
    @scala.inline
    def setProfile_pic_username(value: String): Self = this.set("profile_pic_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_pic_username: Self = this.set("profile_pic_username", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
