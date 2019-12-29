package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.Anon_DefaultCountryCountryCode
import typings.libphonenumberDashJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "ParsedNumberSearch")
@js.native
class ParsedNumberSearch protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: Anon_DefaultCountryCountryCode) = this()
  def hasNext(): Boolean = js.native
  def next(): js.UndefOr[NumberFoundLegacy] = js.native
}

