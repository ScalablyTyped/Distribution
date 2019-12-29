package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.Anon_DefaultCountry
import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.NumberFound
import typings.libphonenumberDashJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findNumbers")
@js.native
object findNumbers extends js.Object {
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: Anon_DefaultCountry): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}

