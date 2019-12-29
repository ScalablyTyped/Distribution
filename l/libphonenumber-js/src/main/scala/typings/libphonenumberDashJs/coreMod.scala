package typings.libphonenumberDashJs

import typings.libphonenumberDashJs.typesMod.CountryCallingCode
import typings.libphonenumberDashJs.typesMod.CountryCode
import typings.libphonenumberDashJs.typesMod.Metadata
import typings.libphonenumberDashJs.typesMod.NationalNumber
import typings.libphonenumberDashJs.typesMod.NumberFound
import typings.libphonenumberDashJs.typesMod.NumberFoundLegacy
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  class AsYouType protected () extends js.Object {
    def this(defaultCountryCode: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
    def this(defaultCountryCode: CountryCode, metadata: Metadata) = this()
    def getNumber(): js.UndefOr[typings.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
    def getTemplate(): js.UndefOr[String] = js.native
    def input(text: String): String = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  class ParseError ()
    extends typings.libphonenumberDashJs.typesMod.ParseError
  
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
  
  @js.native
  class PhoneNumberMatcher protected () extends js.Object {
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: Anon_DefaultCountry, metadata: Metadata) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  def findNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  def findNumbers(text: String, options: Anon_DefaultCountry, metadata: Metadata): js.Array[NumberFound] = js.native
  def findNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: Metadata): String = js.native
  def formatIncompletePhoneNumber(number: String, metadata: Metadata): String = js.native
  def getCountries(metadata: Metadata): js.Array[CountryCode] = js.native
  def getCountryCallingCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  def getExampleNumber(
    country: CountryCode,
    examples: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: libphonenumber-js.libphonenumber-js/types.NationalNumber}
    */ typings.libphonenumberDashJs.libphonenumberDashJsStrings.getExampleNumber with js.Any,
    metadata: Metadata
  ): js.UndefOr[typings.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
  def getExtPrefix(countryCode: CountryCode, metadata: Metadata): String = js.native
  def isSupportedCountry(countryCode: CountryCode, metadata: Metadata): Boolean = js.native
  def parseDigits(character: String): String = js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberDashJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumber(text: String, metadata: Metadata): typings.libphonenumberDashJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: Metadata): js.UndefOr[typings.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, metadata: Metadata): js.UndefOr[typings.libphonenumberDashJs.typesMod.PhoneNumber] = js.native
  def searchNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  def searchNumbers(text: String, options: Anon_DefaultCountry, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
}

