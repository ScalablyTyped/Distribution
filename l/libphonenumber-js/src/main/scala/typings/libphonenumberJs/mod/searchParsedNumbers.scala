package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.`0`
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchParsedNumbers")
@js.native
object searchParsedNumbers extends js.Object {
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: `0`): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

