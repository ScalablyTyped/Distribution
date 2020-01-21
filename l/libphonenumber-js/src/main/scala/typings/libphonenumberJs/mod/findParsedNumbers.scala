package typings.libphonenumberJs.mod

import typings.libphonenumberJs.AnonDefaultCountryCountryCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findParsedNumbers")
@js.native
object findParsedNumbers extends js.Object {
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: AnonDefaultCountryCountryCode): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}

