package typings.libphonenumberJs.anon

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCountryCountryCode extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
}

object DefaultCountryCountryCode {
  @scala.inline
  def apply(defaultCountry: CountryCode = null): DefaultCountryCountryCode = {
    val __obj = js.Dynamic.literal()
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCountryCountryCode]
  }
}

