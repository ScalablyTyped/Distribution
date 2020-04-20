package typings.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCity extends js.Object {
  var city: String
  var country: String
  var country_code: String
  var county: String
  var house_number: String
  var postcode: String
  var road: String
  var state: String
  var state_district: String
  var town: String
}

object AnonCity {
  @scala.inline
  def apply(
    city: String,
    country: String,
    country_code: String,
    county: String,
    house_number: String,
    postcode: String,
    road: String,
    state: String,
    state_district: String,
    town: String
  ): AnonCity = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], house_number = house_number.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], road = road.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], state_district = state_district.asInstanceOf[js.Any], town = town.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCity]
  }
}

