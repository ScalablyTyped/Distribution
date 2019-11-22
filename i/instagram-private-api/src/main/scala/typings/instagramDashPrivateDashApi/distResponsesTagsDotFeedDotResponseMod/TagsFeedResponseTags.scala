package typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsFeedResponseTags extends js.Object {
  var address: String
  var city: String
  var external_source: String
  var facebook_places_id: String
  var lat: String
  var lng: String
  var name: String
  var pk: Double
  var short_name: String
}

object TagsFeedResponseTags {
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: String,
    lat: String,
    lng: String,
    name: String,
    pk: Double,
    short_name: String
  ): TagsFeedResponseTags = {
    val __obj = js.Dynamic.literal(address = address, city = city, external_source = external_source, facebook_places_id = facebook_places_id, lat = lat, lng = lng, name = name, pk = pk, short_name = short_name)
  
    __obj.asInstanceOf[TagsFeedResponseTags]
  }
}

