package typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseLocation extends js.Object {
  var address: String
  var city: String
  var external_source: String
  var facebook_places_id: String | Double
  var lat: Double | String
  var lng: Double | String
  var name: String
  var pk: Double | String
  var short_name: String
}

object TagFeedResponseLocation {
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: String | Double,
    lat: Double | String,
    lng: Double | String,
    name: String,
    pk: Double | String,
    short_name: String
  ): TagFeedResponseLocation = {
    val __obj = js.Dynamic.literal(address = address, city = city, external_source = external_source, facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name, pk = pk.asInstanceOf[js.Any], short_name = short_name)
  
    __obj.asInstanceOf[TagFeedResponseLocation]
  }
}

