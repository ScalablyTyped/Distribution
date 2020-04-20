package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCity extends js.Object {
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

object AnonCity {
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
  ): AnonCity = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], county = county.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], house = house.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], stateCode = stateCode.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCity]
  }
}

