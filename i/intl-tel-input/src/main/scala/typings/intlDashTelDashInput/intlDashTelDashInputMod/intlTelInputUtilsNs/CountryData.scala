package typings.intlDashTelDashInput.intlDashTelDashInputMod.intlTelInputUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryData extends js.Object {
  var dialCode: String
  var iso2: String
  var name: String
}

object CountryData {
  @scala.inline
  def apply(dialCode: String, iso2: String, name: String): CountryData = {
    val __obj = js.Dynamic.literal(dialCode = dialCode, iso2 = iso2, name = name)
  
    __obj.asInstanceOf[CountryData]
  }
}

