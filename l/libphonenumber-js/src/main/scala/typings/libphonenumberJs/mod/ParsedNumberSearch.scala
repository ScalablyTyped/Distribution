package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCountryCountryCode
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "ParsedNumberSearch")
@js.native
class ParsedNumberSearch protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: DefaultCountryCountryCode) = this()
  def hasNext(): Boolean = js.native
  def next(): js.UndefOr[NumberFoundLegacy] = js.native
}

