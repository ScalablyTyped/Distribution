package typings.libphonenumberDashJs

import typings.libphonenumberDashJs.libphonenumberDashJsBooleans.`true`
import typings.libphonenumberDashJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultCountry extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
  var v2: `true`
}

object Anon_DefaultCountry {
  @scala.inline
  def apply(v2: `true`, defaultCountry: CountryCode = null): Anon_DefaultCountry = {
    val __obj = js.Dynamic.literal(v2 = v2.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultCountry]
  }
}

