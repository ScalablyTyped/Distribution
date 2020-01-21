package typings.libphonenumberJs.mod

import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Metadata
import typings.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "PhoneNumber")
@js.native
class PhoneNumber protected ()
  extends typings.libphonenumberJs.typesMod.PhoneNumber {
  def this(
    countryCallingCodeOrCountry: CountryCallingCode,
    nationalNumber: NationalNumber,
    metadata: Metadata
  ) = this()
  def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
}

