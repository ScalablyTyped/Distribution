package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var countries: Countries = js.native
  var country_calling_codes: CountryCallingCodes = js.native
}

object Metadata {
  @scala.inline
  def apply(countries: Countries, country_calling_codes: CountryCallingCodes): Metadata = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country_calling_codes = country_calling_codes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountries(value: Countries): Self = this.set("countries", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry_calling_codes(value: CountryCallingCodes): Self = this.set("country_calling_codes", value.asInstanceOf[js.Any])
  }
  
}

