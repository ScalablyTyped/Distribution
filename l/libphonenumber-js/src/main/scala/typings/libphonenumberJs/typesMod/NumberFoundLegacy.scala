package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFoundLegacy extends js.Object {
  var country: CountryCode = js.native
  var endsAt: Double = js.native
  var ext: js.UndefOr[Extension] = js.native
  var phone: NationalNumber = js.native
  var startsAt: Double = js.native
}

object NumberFoundLegacy {
  @scala.inline
  def apply(country: CountryCode, endsAt: Double, phone: NationalNumber, startsAt: Double): NumberFoundLegacy = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], endsAt = endsAt.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFoundLegacy]
  }
  @scala.inline
  implicit class NumberFoundLegacyOps[Self <: NumberFoundLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountry(value: CountryCode): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndsAt(value: Double): Self = this.set("endsAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: NationalNumber): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartsAt(value: Double): Self = this.set("startsAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt(value: Extension): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
  
}

