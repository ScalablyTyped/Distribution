package typings.leafletDashGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
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

object Anon_City {
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
  ): Anon_City = {
    val __obj = js.Dynamic.literal(city = city, country = country, country_code = country_code, county = county, house_number = house_number, postcode = postcode, road = road, state = state, state_district = state_district, town = town)
  
    __obj.asInstanceOf[Anon_City]
  }
}

