package typings.instagramDashPrivateDashApi.distResponsesUsertagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsertagsFeedResponseLocation extends js.Object {
  var address: String
  var city: String
  var external_source: String
  var facebook_places_id: Double | String
  var lat: Double | String
  var lng: Double
  var name: String
  var pk: Double
  var short_name: String
}

object UsertagsFeedResponseLocation {
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: Double | String,
    lat: Double | String,
    lng: Double,
    name: String,
    pk: Double,
    short_name: String
  ): UsertagsFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address, city = city, external_source = external_source, facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng, name = name, pk = pk, short_name = short_name)
  
    __obj.asInstanceOf[UsertagsFeedResponseLocation]
  }
}

