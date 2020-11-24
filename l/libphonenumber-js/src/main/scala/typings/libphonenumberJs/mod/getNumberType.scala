package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "getNumberType")
@js.native
object getNumberType extends js.Object {
  
  def apply(parsedNumber: ParsedNumber): NumberType = js.native
  def apply(phone: NationalNumber): NumberType = js.native
  def apply(phone: NationalNumber, country: CountryCode): NumberType = js.native
}
