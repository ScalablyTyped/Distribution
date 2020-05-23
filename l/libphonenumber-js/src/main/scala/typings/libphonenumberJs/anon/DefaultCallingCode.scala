package typings.libphonenumberJs.anon

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCallingCode extends js.Object {
  var defaultCallingCode: js.UndefOr[String] = js.undefined
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
}

object DefaultCallingCode {
  @scala.inline
  def apply(defaultCallingCode: String = null, defaultCountry: CountryCode = null): DefaultCallingCode = {
    val __obj = js.Dynamic.literal()
    if (defaultCallingCode != null) __obj.updateDynamic("defaultCallingCode")(defaultCallingCode.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCallingCode]
  }
}

