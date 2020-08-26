package typings.intlTelInput.mod.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountryData extends js.Object {
  var dialCode: String = js.native
  var iso2: String = js.native
  var name: String = js.native
}

object CountryData {
  @scala.inline
  def apply(dialCode: String, iso2: String, name: String): CountryData = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryData]
  }
  @scala.inline
  implicit class CountryDataOps[Self <: CountryData] (val x: Self) extends AnyVal {
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
    def setDialCode(value: String): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

