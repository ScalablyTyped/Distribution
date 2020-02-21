package typings.libphonenumberJs

import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Metadata
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js/min", JSImport.Namespace)
@js.native
object minMod extends js.Object {
  @js.native
  class AsYouType () extends js.Object {
    def this(defaultCountryCode: AnonDefaultCallingCode) = this()
    def this(defaultCountryCode: CountryCode) = this()
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    def getTemplate(): js.UndefOr[String] = js.native
    def input(text: String): String = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
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
  
  @js.native
  class PhoneNumberMatcher protected () extends js.Object {
    def this(text: String) = this()
    def this(text: String, options: AnonDefaultCountry) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  def findNumbers(text: String): js.Array[NumberFoundLegacy] = js.native
  def findNumbers(text: String, options: AnonDefaultCountry): js.Array[NumberFound] = js.native
  def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
  def findPhoneNumbersInText(text: String): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, options: AnonDefaultCallingCode): js.Array[NumberFound] = js.native
  def findPhoneNumbersInText(text: String, options: CountryCode): js.Array[NumberFound] = js.native
  def formatIncompletePhoneNumber(number: String): String = js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = js.native
  def getCountries(): js.Array[CountryCode] = js.native
  def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = js.native
  def getExampleNumber(
    country: CountryCode,
    examples: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: libphonenumber-js.libphonenumber-js/types.NationalNumber}
    */ typings.libphonenumberJs.libphonenumberJsStrings.getExampleNumber with js.Any
  ): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def getExtPrefix(countryCode: CountryCode): String = js.native
  def isSupportedCountry(countryCode: CountryCode): Boolean = js.native
  def parseDigits(character: String): String = js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  def parsePhoneNumber(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  def parsePhoneNumberFromString(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: AnonDefaultCallingCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def searchNumbers(text: String, options: AnonDefaultCountry): IterableIterator[NumberFound] = js.native
  def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
  def searchPhoneNumbersInText(text: String): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, options: AnonDefaultCallingCode): IterableIterator[NumberFound] = js.native
  def searchPhoneNumbersInText(text: String, options: CountryCode): IterableIterator[NumberFound] = js.native
}

