package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseOwner extends js.Object {
  var lat: Double
  var lng: String
  var location_dict: LocationRepositoryStoryResponseLocation_dict
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
    location_dict: LocationRepositoryStoryResponseLocation_dict,
    name: String,
    pk: Double,
    profile_pic_url: String,
    profile_pic_username: String,
    short_name: String,
    `type`: String
  ): LocationRepositoryStoryResponseOwner = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng, location_dict = location_dict, name = name, pk = pk, profile_pic_url = profile_pic_url, profile_pic_username = profile_pic_username, short_name = short_name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocationRepositoryStoryResponseOwner]
  }
}

