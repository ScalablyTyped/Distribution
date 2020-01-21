package typings.instagramPrivateApi.locationRepositorySearchResponseMod

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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], external_id_source = external_id_source.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], minimum_age = minimum_age.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRepositorySearchResponseVenuesItem]
  }
}

