package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRepositoryStoryResponseOwner extends js.Object {
  
  var lat: Double = js.native
  
  var lng: String = js.native
  
  var location_dict: LocationRepositoryStoryResponseLocationDict = js.native
  
  var name: String = js.native
  
  var pk: Double = js.native
  
  var profile_pic_url: String = js.native
  
  var profile_pic_username: String = js.native
  
  var short_name: String = js.native
  
  var `type`: String = js.native
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
  implicit class LocationRepositoryStoryResponseOwnerOps[Self <: LocationRepositoryStoryResponseOwner] (val x: Self) extends AnyVal {
    
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
    def setLng(value: String): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_dict(value: LocationRepositoryStoryResponseLocationDict): Self = this.set("location_dict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_username(value: String): Self = this.set("profile_pic_username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
