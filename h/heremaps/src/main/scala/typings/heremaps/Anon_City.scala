package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: String
  var country: String
  var countryCode: String
  var county: String
  var district: String
  var house: String
  var postalCode: String
  var stateCode: String
  var street: String
  var text: String
}

object Anon_City {
  @scala.inline
  def apply(
    city: String,
    country: String,
    countryCode: String,
    county: String,
    district: String,
    house: String,
    postalCode: String,
    stateCode: String,
    street: String,
    text: String
  ): Anon_City = {
    val __obj = js.Dynamic.literal(city = city, country = country, countryCode = countryCode, county = county, district = district, house = house, postalCode = postalCode, stateCode = stateCode, street = street, text = text)
  
    __obj.asInstanceOf[Anon_City]
  }
}

