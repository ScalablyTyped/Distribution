package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseLocation extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(address = address, city = city, external_source = external_source, facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat, lng = lng, name = name, pk = pk.asInstanceOf[js.Any], short_name = short_name)
  
    __obj.asInstanceOf[TimelineFeedResponseLocation]
  }
}

