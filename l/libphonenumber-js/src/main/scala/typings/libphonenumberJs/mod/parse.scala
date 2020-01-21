package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "parse")
@js.native
object parse extends js.Object {
  def apply(text: String): ParsedNumber = js.native
  def apply(text: String, options: ParseNumberOptions): ParsedNumber = js.native
  def apply(text: String, options: CountryCode): ParsedNumber = js.native
}

