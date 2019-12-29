package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.typesMod.CountryCallingCode
import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.Metadata
import typings.libphonenumberDashJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "PhoneNumber")
@js.native
class PhoneNumber protected ()
  extends typings.libphonenumberDashJs.typesMod.PhoneNumber {
  def this(
    countryCallingCodeOrCountry: CountryCallingCode,
    nationalNumber: NationalNumber,
    metadata: Metadata
  ) = this()
  def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
}

