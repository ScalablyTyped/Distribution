package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "formatNumber")
@js.native
object formatNumber extends js.Object {
  def apply(parsedNumber: ParsedNumber, format: NumberFormat): String = js.native
  def apply(parsedNumber: ParsedNumber, format: NumberFormat, options: FormatNumberOptions): String = js.native
  def apply(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = js.native
  def apply(phone: NationalNumber, country: CountryCode, format: NumberFormat, options: FormatNumberOptions): String = js.native
  def apply(phone: NationalNumber, format: NumberFormat): String = js.native
  def apply(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions): String = js.native
}

