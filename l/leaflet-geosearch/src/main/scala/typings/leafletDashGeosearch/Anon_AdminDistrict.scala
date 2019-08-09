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
    val __obj = js.Dynamic.literal(adminDistrict = adminDistrict, adminDistrict2 = adminDistrict2, countryRegion = countryRegion, formattedAddress = formattedAddress, landmark = landmark, locality = locality, neighborhood = neighborhood)
  
    __obj.asInstanceOf[Anon_AdminDistrict]
  }
}

