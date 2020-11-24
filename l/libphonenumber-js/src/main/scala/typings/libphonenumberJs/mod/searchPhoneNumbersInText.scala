package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFound
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "searchPhoneNumbersInText")
@js.native
object searchPhoneNumbersInText extends js.Object {
  
  def apply(text: String): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: DefaultCallingCode): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFound] = js.native
}
