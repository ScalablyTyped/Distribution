package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.NationalNumber
import typings.libphonenumberDashJs.typesMod.NumberType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "getNumberType")
@js.native
object getNumberType extends js.Object {
  def apply(parsedNumber: ParsedNumber): NumberType = js.native
  def apply(phone: NationalNumber): NumberType = js.native
  def apply(phone: NationalNumber, country: CountryCode): NumberType = js.native
}

