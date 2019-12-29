package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.Anon_DefaultCountryCountryCode
import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.NumberFoundLegacy
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchParsedNumbers")
@js.native
object searchParsedNumbers extends js.Object {
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: Anon_DefaultCountryCountryCode): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

