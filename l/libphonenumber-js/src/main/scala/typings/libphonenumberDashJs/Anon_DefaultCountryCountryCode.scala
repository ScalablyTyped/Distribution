package typings.libphonenumberDashJs

import typings.libphonenumberDashJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultCountryCountryCode extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
}

object Anon_DefaultCountryCountryCode {
  @scala.inline
  def apply(defaultCountry: CountryCode = null): Anon_DefaultCountryCountryCode = {
    val __obj = js.Dynamic.literal()
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultCountryCountryCode]
  }
}

