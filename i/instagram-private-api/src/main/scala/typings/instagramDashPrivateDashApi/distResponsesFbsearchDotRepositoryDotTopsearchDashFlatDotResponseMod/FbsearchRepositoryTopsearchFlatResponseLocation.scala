package typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryTopsearchFlatResponseLocation extends js.Object {
  var address: String
  var city: String
  var external_source: String
  var facebook_places_id: Double
  var lat: Double
  var lng: Double
  var name: String
  var pk: Double
  var short_name: String
}

object FbsearchRepositoryTopsearchFlatResponseLocation {
  @scala.inline
  def apply(
    address: String,
    city: String,
    external_source: String,
    facebook_places_id: Double,
    lat: Double,
    lng: Double,
    name: String,
    pk: Double,
    short_name: String
  ): FbsearchRepositoryTopsearchFlatResponseLocation = {
    val __obj = js.Dynamic.literal(address = address, city = city, external_source = external_source, facebook_places_id = facebook_places_id, lat = lat, lng = lng, name = name, pk = pk, short_name = short_name)
  
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseLocation]
  }
}

