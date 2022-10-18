package typings.libphonenumberJs

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.anon.Extract
import typings.libphonenumberJs.anon.`0`
import typings.libphonenumberJs.mod.FormatNumberOptions
import typings.libphonenumberJs.mod.ParseNumberOptions
import typings.libphonenumberJs.mod.ParsedNumber
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.E164Number
import typings.libphonenumberJs.typesMod.Examples
import typings.libphonenumberJs.typesMod.MetadataJson
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFormat
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.libphonenumberJs.typesMod.NumberType
import typings.libphonenumberJs.typesMod.NumberingPlan
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMod {
  
  @JSImport("libphonenumber-js/custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, defaultCountry: Extract, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def default(text: String, defaultCountry: CountryCode, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def default(text: String, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  @JSImport("libphonenumber-js/custom", "AsYouType")
  @js.native
  open class AsYouType protected () extends StObject {
    def this(defaultCountryCode: Unit, metadata: MetadataJson) = this()
    def this(defaultCountryCode: DefaultCallingCode, metadata: MetadataJson) = this()
    def this(defaultCountryCode: CountryCode, metadata: MetadataJson) = this()
    
    var country: js.UndefOr[CountryCode] = js.native
    
    def getCallingCode(): js.UndefOr[String] = js.native
    
    def getChars(): String = js.native
    
    def getCountry(): js.UndefOr[CountryCode] = js.native
    
    def getNationalNumber(): String = js.native
    
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    
    def getNumberValue(): js.UndefOr[E164Number] = js.native
    
    def getTemplate(): String = js.native
    
    def input(text: String): String = js.native
    
    def isInternational(): Boolean = js.native
    
    def isPossible(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/custom", "Metadata")
  @js.native
  open class Metadata protected () extends StObject {
    def this(metadata: MetadataJson) = this()
    
    var numberingPlan: js.UndefOr[NumberingPlan] = js.native
    
    def selectNumberingPlan(country: CountryCode): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/custom", "ParseError")
  @js.native
  open class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
  @JSImport("libphonenumber-js/custom", "ParsedNumberSearch")
  @js.native
  open class ParsedNumberSearch protected () extends StObject {
    def this(text: String, metadata: MetadataJson) = this()
    def this(text: String, options: `0`, metadata: MetadataJson) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFoundLegacy] = js.native
  }
  
  @JSImport("libphonenumber-js/custom", "PhoneNumber")
  @js.native
  open class PhoneNumber protected ()
    extends typings.libphonenumberJs.typesMod.PhoneNumber {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: MetadataJson
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: MetadataJson) = this()
  }
  
  @JSImport("libphonenumber-js/custom", "PhoneNumberMatcher")
  @js.native
  open class PhoneNumberMatcher protected () extends StObject {
    def this(text: String, metadata: MetadataJson) = this()
    def this(text: String, options: DefaultCountry, metadata: MetadataJson) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  inline def findNumbers(text: String, metadata: MetadataJson): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findNumbers(text: String, options: DefaultCountry, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findNumbers(text: String, options: CountryCode, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def findParsedNumbers(text: String, metadata: MetadataJson): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParsedNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findParsedNumbers(text: String, options: `0`, metadata: MetadataJson): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findParsedNumbers(text: String, options: CountryCode, metadata: MetadataJson): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  
  inline def findPhoneNumbersInText(text: String, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: DefaultCallingCode, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: CountryCode, metadata: MetadataJson): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def format(parsedNumber: ParsedNumber, format: NumberFormat, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(parsedNumber.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(phone: NationalNumber, country: CountryCode, format: NumberFormat, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(phone: NationalNumber, format: NumberFormat, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(phone.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIncompletePhoneNumber(number: String, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(parsedNumber.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(
    parsedNumber: ParsedNumber,
    format: NumberFormat,
    options: FormatNumberOptions,
    metadata: MetadataJson
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(parsedNumber.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(
    phone: NationalNumber,
    country: CountryCode,
    format: NumberFormat,
    options: FormatNumberOptions,
    metadata: MetadataJson
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(phone: NationalNumber, format: NumberFormat, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], format.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatNumber(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(metadata: MetadataJson): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode, metadata: MetadataJson): CountryCallingCode = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CountryCallingCode]
  
  inline def getExampleNumber(country: CountryCode, examples: Examples, metadata: MetadataJson): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(country.asInstanceOf[js.Any], examples.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def getExtPrefix(countryCode: CountryCode, metadata: MetadataJson): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtPrefix")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNumberType(parsedNumber: ParsedNumber, metadata: MetadataJson): NumberType = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(parsedNumber.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[NumberType]
  inline def getNumberType(phone: NationalNumber, country: CountryCode, metadata: MetadataJson): NumberType = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[NumberType]
  inline def getNumberType(phone: NationalNumber, metadata: MetadataJson): NumberType = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(phone.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[NumberType]
  
  inline def getPhoneCode(countryCode: CountryCode, metadata: MetadataJson): CountryCallingCode = (^.asInstanceOf[js.Dynamic].applyDynamic("getPhoneCode")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CountryCallingCode]
  
  inline def isPossibleNumber(parsedNumber: ParsedNumber, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleNumber")(parsedNumber.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossibleNumber(phone: NationalNumber, country: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossibleNumber(phone: NationalNumber, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleNumber")(phone.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidNumber(parsedNumber: ParsedNumber, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(parsedNumber.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidNumber(phone: NationalNumber, country: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidNumber(phone: NationalNumber, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(phone.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidNumberForRegion(phone: NationalNumber, country: CountryCode, metadata: MetadataJson): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumberForRegion")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(text: String, metadata: MetadataJson): ParsedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber]
  inline def parse(text: String, options: ParseNumberOptions, metadata: MetadataJson): ParsedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber]
  inline def parse(text: String, options: CountryCode, metadata: MetadataJson): ParsedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber]
  
  inline def parseDigits(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigits")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseIncompletePhoneNumber(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIncompletePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseNumber(text: String, metadata: MetadataJson): ParsedNumber | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber | js.Object]
  inline def parseNumber(text: String, options: ParseNumberOptions, metadata: MetadataJson): ParsedNumber | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber | js.Object]
  inline def parseNumber(text: String, options: CountryCode, metadata: MetadataJson): ParsedNumber | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber | js.Object]
  
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumber(text: String, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def parsePhoneNumberCharacter(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumberFromString(text: String, defaultCountry: Extract, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberFromString(text: String, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberWithError(text: String, metadata: MetadataJson): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def searchNumbers(text: String, metadata: MetadataJson): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchNumbers(text: String, options: DefaultCountry, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchNumbers(text: String, options: CountryCode, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  inline def searchParsedNumbers(text: String, metadata: MetadataJson): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchParsedNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchParsedNumbers(text: String, options: `0`, metadata: MetadataJson): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchParsedNumbers(text: String, options: CountryCode, metadata: MetadataJson): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  
  inline def searchPhoneNumbersInText(text: String, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: DefaultCallingCode, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: CountryCode, metadata: MetadataJson): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
}
