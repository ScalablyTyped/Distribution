package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseNumberOptions extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
  var extended: js.UndefOr[Boolean] = js.undefined
}

object ParseNumberOptions {
  @scala.inline
  def apply(defaultCountry: CountryCode = null, extended: js.UndefOr[Boolean] = js.undefined): ParseNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(extended)) __obj.updateDynamic("extended")(extended.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseNumberOptions]
  }
}

