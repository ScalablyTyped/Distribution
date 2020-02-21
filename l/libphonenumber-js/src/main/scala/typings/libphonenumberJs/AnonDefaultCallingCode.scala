package typings.libphonenumberJs

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultCallingCode extends js.Object {
  var defaultCallingCode: js.UndefOr[String] = js.undefined
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
}

object AnonDefaultCallingCode {
  @scala.inline
  def apply(defaultCallingCode: String = null, defaultCountry: CountryCode = null): AnonDefaultCallingCode = {
    val __obj = js.Dynamic.literal()
    if (defaultCallingCode != null) __obj.updateDynamic("defaultCallingCode")(defaultCallingCode.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultCallingCode]
  }
}

