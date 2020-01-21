package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Extension
import typings.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedNumber extends js.Object {
  var country: CountryCode
  var countryCallingCode: js.UndefOr[CountryCallingCode] = js.undefined
  var ext: js.UndefOr[Extension] = js.undefined
  var phone: NationalNumber
  var possible: js.UndefOr[Boolean] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object ParsedNumber {
  @scala.inline
  def apply(
    country: CountryCode,
    phone: NationalNumber,
    countryCallingCode: CountryCallingCode = null,
    ext: Extension = null,
    possible: js.UndefOr[Boolean] = js.undefined,
    valid: js.UndefOr[Boolean] = js.undefined
  ): ParsedNumber = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    if (countryCallingCode != null) __obj.updateDynamic("countryCallingCode")(countryCallingCode.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (!js.isUndefined(possible)) __obj.updateDynamic("possible")(possible.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedNumber]
  }
}

