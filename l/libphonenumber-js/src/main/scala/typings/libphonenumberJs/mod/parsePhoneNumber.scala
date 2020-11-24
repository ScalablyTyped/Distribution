package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "parsePhoneNumber")
@js.native
object parsePhoneNumber extends js.Object {
  
  def apply(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def apply(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
}
