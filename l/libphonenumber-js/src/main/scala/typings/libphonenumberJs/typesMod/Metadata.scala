package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var countries: Countries
  var country_calling_codes: CountryCallingCodes
}

object Metadata {
  @scala.inline
  def apply(countries: Countries, country_calling_codes: CountryCallingCodes): Metadata = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country_calling_codes = country_calling_codes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

