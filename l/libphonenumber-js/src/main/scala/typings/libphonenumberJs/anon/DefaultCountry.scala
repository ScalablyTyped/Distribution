package typings.libphonenumberJs.anon

import typings.libphonenumberJs.libphonenumberJsBooleans.`true`
import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultCountry extends js.Object {
  var defaultCountry: js.UndefOr[CountryCode] = js.native
  var v2: `true` = js.native
}

object DefaultCountry {
  @scala.inline
  def apply(v2: `true`): DefaultCountry = {
    val __obj = js.Dynamic.literal(v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCountry]
  }
  @scala.inline
  implicit class DefaultCountryOps[Self <: DefaultCountry] (val x: Self) extends AnyVal {
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
    def setV2(value: `true`): Self = this.set("v2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCountry(value: CountryCode): Self = this.set("defaultCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCountry: Self = this.set("defaultCountry", js.undefined)
  }
  
}

