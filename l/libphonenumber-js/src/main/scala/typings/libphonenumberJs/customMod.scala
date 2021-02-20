package typings.libphonenumberJs

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.anon.`0`
import typings.libphonenumberJs.anon.countryinCountryCodeNatio
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMod {
  
  @JSImport("libphonenumber-js/custom", JSImport.Default)
  @js.native
  def default(text: String, defaultCountry: DefaultCallingCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/custom", JSImport.Default)
  @js.native
  def default(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/custom", JSImport.Default)
  @js.native
  def default(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js/custom", "AsYouType")
  @js.native
  class AsYouType protected () extends StObject {
    def this(defaultCountryCode: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
    def this(defaultCountryCode: DefaultCallingCode, metadata: Metadata) = this()
    def this(defaultCountryCode: CountryCode, metadata: Metadata) = this()
    
    var country: js.UndefOr[CountryCode] = js.native
    
    def getChars(): String = js.native
    
    def getNationalNumber(): String = js.native
    
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    
    def getTemplate(): String = js.native
    
    def input(text: String): String = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/custom", "ParseError")
  @js.native
  class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
  @JSImport("libphonenumber-js/custom", "ParsedNumberSearch")
  @js.native
  class ParsedNumberSearch protected () extends StObject {
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: `0`, metadata: Metadata) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFoundLegacy] = js.native
  }
  
  @JSImport("libphonenumber-js/custom", "PhoneNumber")
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
  
  @JSImport("libphonenumber-js/custom", "PhoneNumberMatcher")
  @js.native
  class PhoneNumberMatcher protected () extends StObject {
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: DefaultCountry, metadata: Metadata) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  @JSImport("libphonenumber-js/custom", "findNumbers")
  @js.native
  def findNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/custom", "findNumbers")
  @js.native
  def findNumbers(text: String, options: DefaultCountry, metadata: Metadata): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js/custom", "findNumbers")
  @js.native
  def findNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  
  @JSImport("libphonenumber-js/custom", "findParsedNumbers")
  @js.native
  def findParsedNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/custom", "findParsedNumbers")
  @js.native
  def findParsedNumbers(text: String, options: `0`, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/custom", "findParsedNumbers")
  @js.native
  def findParsedNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  
  @JSImport("libphonenumber-js/custom", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, metadata: Metadata): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js/custom", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, options: DefaultCallingCode, metadata: Metadata): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js/custom", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  
  @JSImport("libphonenumber-js/custom", "format")
  @js.native
  def format(parsedNumber: ParsedNumber, format: NumberFormat, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "format")
  @js.native
  def format(phone: NationalNumber, country: CountryCode, format: NumberFormat, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "format")
  @js.native
  def format(phone: NationalNumber, format: NumberFormat, metadata: Metadata): String = js.native
  
  @JSImport("libphonenumber-js/custom", "formatIncompletePhoneNumber")
  @js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "formatIncompletePhoneNumber")
  @js.native
  def formatIncompletePhoneNumber(number: String, metadata: Metadata): String = js.native
  
  @JSImport("libphonenumber-js/custom", "formatNumber")
  @js.native
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "formatNumber")
  @js.native
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, options: FormatNumberOptions, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "formatNumber")
  @js.native
  def formatNumber(
    phone: NationalNumber,
    country: CountryCode,
    format: NumberFormat,
    options: FormatNumberOptions,
    metadata: Metadata
  ): String = js.native
  @JSImport("libphonenumber-js/custom", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, format: NumberFormat, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/custom", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions, metadata: Metadata): String = js.native
  
  @JSImport("libphonenumber-js/custom", "getCountries")
  @js.native
  def getCountries(metadata: Metadata): js.Array[CountryCode] = js.native
  
  @JSImport("libphonenumber-js/custom", "getCountryCallingCode")
  @js.native
  def getCountryCallingCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  
  @JSImport("libphonenumber-js/custom", "getExampleNumber")
  @js.native
  def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
  @JSImport("libphonenumber-js/custom", "getExtPrefix")
  @js.native
  def getExtPrefix(countryCode: CountryCode, metadata: Metadata): String = js.native
  
  @JSImport("libphonenumber-js/custom", "getNumberType")
  @js.native
  def getNumberType(parsedNumber: ParsedNumber, metadata: Metadata): NumberType = js.native
  @JSImport("libphonenumber-js/custom", "getNumberType")
  @js.native
  def getNumberType(phone: NationalNumber, country: CountryCode, metadata: Metadata): NumberType = js.native
  @JSImport("libphonenumber-js/custom", "getNumberType")
  @js.native
  def getNumberType(phone: NationalNumber, metadata: Metadata): NumberType = js.native
  
  @JSImport("libphonenumber-js/custom", "getPhoneCode")
  @js.native
  def getPhoneCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  
  @JSImport("libphonenumber-js/custom", "isPossibleNumber")
  @js.native
  def isPossibleNumber(parsedNumber: ParsedNumber, metadata: Metadata): Boolean = js.native
  @JSImport("libphonenumber-js/custom", "isPossibleNumber")
  @js.native
  def isPossibleNumber(phone: NationalNumber, country: CountryCode, metadata: Metadata): Boolean = js.native
  @JSImport("libphonenumber-js/custom", "isPossibleNumber")
  @js.native
  def isPossibleNumber(phone: NationalNumber, metadata: Metadata): Boolean = js.native
  
  @JSImport("libphonenumber-js/custom", "isSupportedCountry")
  @js.native
  def isSupportedCountry(countryCode: CountryCode, metadata: Metadata): Boolean = js.native
  
  @JSImport("libphonenumber-js/custom", "isValidNumber")
  @js.native
  def isValidNumber(parsedNumber: ParsedNumber, metadata: Metadata): Boolean = js.native
  @JSImport("libphonenumber-js/custom", "isValidNumber")
  @js.native
  def isValidNumber(phone: NationalNumber, country: CountryCode, metadata: Metadata): Boolean = js.native
  @JSImport("libphonenumber-js/custom", "isValidNumber")
  @js.native
  def isValidNumber(phone: NationalNumber, metadata: Metadata): Boolean = js.native
  
  @JSImport("libphonenumber-js/custom", "isValidNumberForRegion")
  @js.native
  def isValidNumberForRegion(phone: NationalNumber, country: CountryCode, metadata: Metadata): Boolean = js.native
  
  @JSImport("libphonenumber-js/custom", "parse")
  @js.native
  def parse(text: String, metadata: Metadata): ParsedNumber = js.native
  @JSImport("libphonenumber-js/custom", "parse")
  @js.native
  def parse(text: String, options: ParseNumberOptions, metadata: Metadata): ParsedNumber = js.native
  @JSImport("libphonenumber-js/custom", "parse")
  @js.native
  def parse(text: String, options: CountryCode, metadata: Metadata): ParsedNumber = js.native
  
  @JSImport("libphonenumber-js/custom", "parseDigits")
  @js.native
  def parseDigits(character: String): String = js.native
  
  @JSImport("libphonenumber-js/custom", "parseIncompletePhoneNumber")
  @js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  
  @JSImport("libphonenumber-js/custom", "parseNumber")
  @js.native
  def parseNumber(text: String, metadata: Metadata): ParsedNumber | js.Object = js.native
  @JSImport("libphonenumber-js/custom", "parseNumber")
  @js.native
  def parseNumber(text: String, options: ParseNumberOptions, metadata: Metadata): ParsedNumber | js.Object = js.native
  @JSImport("libphonenumber-js/custom", "parseNumber")
  @js.native
  def parseNumber(text: String, options: CountryCode, metadata: Metadata): ParsedNumber | js.Object = js.native
  
  @JSImport("libphonenumber-js/custom", "parsePhoneNumber")
  @js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/custom", "parsePhoneNumber")
  @js.native
  def parsePhoneNumber(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js/custom", "parsePhoneNumberCharacter")
  @js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  
  @JSImport("libphonenumber-js/custom", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: DefaultCallingCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/custom", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/custom", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js/custom", "parsePhoneNumberWithError")
  @js.native
  def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/custom", "parsePhoneNumberWithError")
  @js.native
  def parsePhoneNumberWithError(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js/custom", "searchNumbers")
  @js.native
  def searchNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/custom", "searchNumbers")
  @js.native
  def searchNumbers(text: String, options: DefaultCountry, metadata: Metadata): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js/custom", "searchNumbers")
  @js.native
  def searchNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
  
  @JSImport("libphonenumber-js/custom", "searchParsedNumbers")
  @js.native
  def searchParsedNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/custom", "searchParsedNumbers")
  @js.native
  def searchParsedNumbers(text: String, options: `0`, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/custom", "searchParsedNumbers")
  @js.native
  def searchParsedNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  
  @JSImport("libphonenumber-js/custom", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, metadata: Metadata): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js/custom", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, options: DefaultCallingCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js/custom", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
}
