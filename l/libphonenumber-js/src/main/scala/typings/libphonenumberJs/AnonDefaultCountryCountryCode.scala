package typings.libphonenumberJs

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultCountryCountryCode extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
}

object AnonDefaultCountryCountryCode {
  @scala.inline
  def apply(defaultCountry: CountryCode = null): AnonDefaultCountryCountryCode = {
    val __obj = js.Dynamic.literal()
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultCountryCountryCode]
  }
}

