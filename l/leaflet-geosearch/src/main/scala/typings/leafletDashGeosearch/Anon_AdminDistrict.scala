package typings.leafletDashGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdminDistrict extends js.Object {
  var adminDistrict: String
  var adminDistrict2: String
  var countryRegion: String
  var formattedAddress: String
  var landmark: String
  var locality: String
  var neighborhood: String
}

object Anon_AdminDistrict {
  @scala.inline
  def apply(
    adminDistrict: String,
    adminDistrict2: String,
    countryRegion: String,
    formattedAddress: String,
    landmark: String,
    locality: String,
    neighborhood: String
  ): Anon_AdminDistrict = {
    val __obj = js.Dynamic.literal(adminDistrict = adminDistrict.asInstanceOf[js.Any], adminDistrict2 = adminDistrict2.asInstanceOf[js.Any], countryRegion = countryRegion.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], landmark = landmark.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], neighborhood = neighborhood.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdminDistrict]
  }
}

