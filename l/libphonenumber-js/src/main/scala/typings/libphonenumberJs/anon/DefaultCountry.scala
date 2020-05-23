package typings.libphonenumberJs.anon

import typings.libphonenumberJs.libphonenumberJsBooleans.`true`
import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCountry extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.undefined
  var v2: `true`
}

object DefaultCountry {
  @scala.inline
  def apply(v2: `true`, defaultCountry: CountryCode = null): DefaultCountry = {
    val __obj = js.Dynamic.literal(v2 = v2.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCountry]
  }
}

