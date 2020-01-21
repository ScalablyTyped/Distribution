package typings.libphonenumberJs

import typings.libphonenumberJs.mod.FormatNumberOptions
import typings.libphonenumberJs.mod.ParseNumberOptions
import typings.libphonenumberJs.mod.ParsedNumber
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Metadata
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFormat
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.libphonenumberJs.typesMod.NumberType
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js/custom", JSImport.Namespace)
@js.native
object customMod extends js.Object {
  @js.native
  class AsYouType protected () extends js.Object {
    def this(defaultCountryCode: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
    def this(defaultCountryCode: CountryCode, metadata: Metadata) = this()
    var country: js.UndefOr[CountryCode] = js.native
    def getNationalNumber(): String = js.native
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    def getTemplate(): js.UndefOr[String] = js.native
    def input(text: String): String = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
  @js.native
  class ParsedNumberSearch protected () extends js.Object {
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: AnonDefaultCountryCountryCode, metadata: Metadata) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFoundLegacy] = js.native
  }
  
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
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: AnonDefaultCountry, metadata: Metadata) = this()
    def hasNext(): Boolean = js.native
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  def findNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  def findNumbers(text: String, options: AnonDefaultCountry, metadata: Metadata): js.Array[NumberFound] = js.native
  def findNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  def findParsedNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  def findParsedNumbers(text: String, options: AnonDefaultCountryCountryCode, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  def findParsedNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  def format(parsedNumber: ParsedNumber, format: NumberFormat, metadata: Metadata): String = js.native
  def format(phone: NationalNumber, country: CountryCode, format: NumberFormat, metadata: Metadata): String = js.native
  def format(phone: NationalNumber, format: NumberFormat, metadata: Metadata): String = js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: Metadata): String = js.native
  def formatIncompletePhoneNumber(number: String, metadata: Metadata): String = js.native
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, metadata: Metadata): String = js.native
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, options: FormatNumberOptions, metadata: Metadata): String = js.native
  def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat, metadata: Metadata): String = js.native
  def formatNumber(
    phone: NationalNumber,
    country: CountryCode,
    format: NumberFormat,
    options: FormatNumberOptions,
    metadata: Metadata
  ): String = js.native
  def formatNumber(phone: NationalNumber, format: NumberFormat, metadata: Metadata): String = js.native
  def formatNumber(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions, metadata: Metadata): String = js.native
  def getCountries(metadata: Metadata): js.Array[CountryCode] = js.native
  def getCountryCallingCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  def getExampleNumber(
    country: CountryCode,
    examples: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: libphonenumber-js.libphonenumber-js/types.NationalNumber}
    */ typings.libphonenumberJs.libphonenumberJsStrings.getExampleNumber with js.Any,
    metadata: Metadata
  ): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def getExtPrefix(countryCode: CountryCode, metadata: Metadata): String = js.native
  def getNumberType(parsedNumber: ParsedNumber, metadata: Metadata): NumberType = js.native
  def getNumberType(phone: NationalNumber, country: CountryCode, metadata: Metadata): NumberType = js.native
  def getNumberType(phone: NationalNumber, metadata: Metadata): NumberType = js.native
  def getPhoneCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  def isPossibleNumber(parsedNumber: ParsedNumber, metadata: Metadata): Boolean = js.native
  def isPossibleNumber(phone: NationalNumber, country: CountryCode, metadata: Metadata): Boolean = js.native
  def isPossibleNumber(phone: NationalNumber, metadata: Metadata): Boolean = js.native
  def isSupportedCountry(countryCode: CountryCode, metadata: Metadata): Boolean = js.native
  def isValidNumber(parsedNumber: ParsedNumber, metadata: Metadata): Boolean = js.native
  def isValidNumber(phone: NationalNumber, country: CountryCode, metadata: Metadata): Boolean = js.native
  def isValidNumber(phone: NationalNumber, metadata: Metadata): Boolean = js.native
  def isValidNumberForRegion(phone: NationalNumber, country: CountryCode, metadata: Metadata): Boolean = js.native
  def parse(text: String, metadata: Metadata): ParsedNumber = js.native
  def parse(text: String, options: ParseNumberOptions, metadata: Metadata): ParsedNumber = js.native
  def parse(text: String, options: CountryCode, metadata: Metadata): ParsedNumber = js.native
  def parseDigits(character: String): String = js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  def parseNumber(text: String, metadata: Metadata): ParsedNumber = js.native
  def parseNumber(text: String, options: ParseNumberOptions, metadata: Metadata): ParsedNumber = js.native
  def parseNumber(text: String, options: CountryCode, metadata: Metadata): ParsedNumber = js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumber(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def parsePhoneNumberFromString(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  def searchNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  def searchNumbers(text: String, options: AnonDefaultCountry, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
  def searchParsedNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  def searchParsedNumbers(text: String, options: AnonDefaultCountryCountryCode, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  def searchParsedNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
}

