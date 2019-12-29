package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "isPossibleNumber")
@js.native
object isPossibleNumber extends js.Object {
  def apply(parsedNumber: ParsedNumber): Boolean = js.native
  def apply(phone: NationalNumber): Boolean = js.native
  def apply(phone: NationalNumber, country: CountryCode): Boolean = js.native
}

