package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseLocation extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var external_source: js.UndefOr[String] = js.undefined
  var facebook_places_id: js.UndefOr[Double] = js.undefined
  var lat: Double
  var lng: String | Double
  var location_dict: js.UndefOr[LocationRepositoryStoryResponseLocationDict] = js.undefined
  var name: String
  var pk: Double
  var profile_pic_url: js.UndefOr[String] = js.undefined
  var profile_pic_username: js.UndefOr[String] = js.undefined
  var short_name: String
  var `type`: js.UndefOr[String] = js.undefined
}

object LocationRepositoryStoryResponseLocation {
  @scala.inline
  def apply(
    lat: Double,
    lng: String | Double,
    name: String,
    pk: Double,
    short_name: String,
    address: String = null,
    city: String = null,
    external_source: String = null,
    facebook_places_id: Int | Double = null,
    location_dict: LocationRepositoryStoryResponseLocationDict = null,
    profile_pic_url: String = null,
    profile_pic_username: String = null,
    `type`: String = null
  ): LocationRepositoryStoryResponseLocation = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (external_source != null) __obj.updateDynamic("external_source")(external_source.asInstanceOf[js.Any])
    if (facebook_places_id != null) __obj.updateDynamic("facebook_places_id")(facebook_places_id.asInstanceOf[js.Any])
    if (location_dict != null) __obj.updateDynamic("location_dict")(location_dict.asInstanceOf[js.Any])
    if (profile_pic_url != null) __obj.updateDynamic("profile_pic_url")(profile_pic_url.asInstanceOf[js.Any])
    if (profile_pic_username != null) __obj.updateDynamic("profile_pic_username")(profile_pic_username.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseLocation]
  }
}

