package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.NationalNumber
import typings.libphonenumberDashJs.typesMod.NumberFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "format")
@js.native
object format extends js.Object {
  def apply(parsedNumber: ParsedNumber, format: NumberFormat): String = js.native
  def apply(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = js.native
  def apply(phone: NationalNumber, format: NumberFormat): String = js.native
}

