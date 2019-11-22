package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotSearchDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositorySearchResponseVenuesItem extends js.Object {
  var address: String
  var external_id: String
  var external_id_source: String
  var lat: Double
  var lng: Double
  var minimum_age: Double
  var name: String
}

object LocationRepositorySearchResponseVenuesItem {
  @scala.inline
  def apply(
    address: String,
    external_id: String,
    external_id_source: String,
    lat: Double,
    lng: Double,
    minimum_age: Double,
    name: String
  ): LocationRepositorySearchResponseVenuesItem = {
    val __obj = js.Dynamic.literal(address = address, external_id = external_id, external_id_source = external_id_source, lat = lat, lng = lng, minimum_age = minimum_age, name = name)
  
    __obj.asInstanceOf[LocationRepositorySearchResponseVenuesItem]
  }
}

