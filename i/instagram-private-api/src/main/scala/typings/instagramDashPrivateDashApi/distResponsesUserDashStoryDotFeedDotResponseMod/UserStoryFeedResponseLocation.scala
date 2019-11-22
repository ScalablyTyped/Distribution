package typings.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserStoryFeedResponseLocation extends js.Object {
  var address: String
  var city: String
  var external_source: String
  var facebook_places_id: Double
  var lat: Double
  var lng: String | Double
  var name: String
  var pk: Double
  var short_name: String
}

object UserStoryFeedResponseLocation {
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: Double,
    lat: Double,
    lng: String | Double,
    name: String,
    pk: Double,
    short_name: String
  ): UserStoryFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address, city = city, external_source = external_source, facebook_places_id = facebook_places_id, lat = lat, lng = lng.asInstanceOf[js.Any], name = name, pk = pk, short_name = short_name)
  
    __obj.asInstanceOf[UserStoryFeedResponseLocation]
  }
}

