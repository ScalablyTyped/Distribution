package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseLocationDict extends js.Object {
  var address: String
  var city: String
  var external_source: String
  var facebook_places_id: Double
  var lat: Double
  var lng: String
  var name: String
  var pk: Double
  var short_name: String
}

object LocationRepositoryStoryResponseLocationDict {
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: Double,
    lat: Double,
    lng: String,
    name: String,
    pk: Double,
    short_name: String
  ): LocationRepositoryStoryResponseLocationDict = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseLocationDict]
  }
}

