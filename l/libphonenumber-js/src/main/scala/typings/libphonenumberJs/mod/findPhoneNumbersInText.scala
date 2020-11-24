package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "findPhoneNumbersInText")
@js.native
object findPhoneNumbersInText extends js.Object {
  
  def apply(text: String): js.Array[NumberFound] = js.native
  def apply(text: String, options: DefaultCallingCode): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFound] = js.native
}
