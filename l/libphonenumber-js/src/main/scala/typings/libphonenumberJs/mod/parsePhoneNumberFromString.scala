package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "parsePhoneNumberFromString")
@js.native
object parsePhoneNumberFromString extends js.Object {
  def apply(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def apply(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def apply(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
}

