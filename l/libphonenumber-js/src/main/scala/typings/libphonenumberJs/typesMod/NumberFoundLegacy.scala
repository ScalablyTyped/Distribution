package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFoundLegacy extends js.Object {
  var country: CountryCode
  var endsAt: Double
  var ext: js.UndefOr[Extension] = js.undefined
  var phone: NationalNumber
  var startsAt: Double
}

object NumberFoundLegacy {
  @scala.inline
  def apply(
    country: CountryCode,
    endsAt: Double,
    phone: NationalNumber,
    startsAt: Double,
    ext: Extension = null
  ): NumberFoundLegacy = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], endsAt = endsAt.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFoundLegacy]
  }
}

