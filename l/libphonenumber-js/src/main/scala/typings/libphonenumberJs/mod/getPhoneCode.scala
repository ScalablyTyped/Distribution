package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "getPhoneCode")
@js.native
object getPhoneCode extends js.Object {
  def apply(countryCode: CountryCode): CountryCallingCode = js.native
}

