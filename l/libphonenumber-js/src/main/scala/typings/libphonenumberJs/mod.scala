package typings.libphonenumberJs

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.anon.`0`
import typings.libphonenumberJs.anon.countryinCountryCodeNatio
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Extension
import typings.libphonenumberJs.typesMod.Metadata
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFormat
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.libphonenumberJs.typesMod.NumberType
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libphonenumber-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  @scala.inline
  def default(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  @scala.inline
  def default(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  @JSImport("libphonenumber-js", "AsYouType")
  @js.native
  class AsYouType () extends StObject {
    def this(defaultCountryCode: DefaultCallingCode) = this()
    def this(defaultCountryCode: CountryCode) = this()
    
    var country: js.UndefOr[CountryCode] = js.native
    
    def getChars(): String = js.native
    
    def getNationalNumber(): String = js.native
    
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    
    def getTemplate(): String = js.native
    
    def input(text: String): String = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("libphonenumber-js", "ParseError")
  @js.native
  class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
  @JSImport("libphonenumber-js", "ParsedNumberSearch")
  @js.native
  class ParsedNumberSearch protected () extends StObject {
    def this(text: String) = this()
    def this(text: String, options: `0`) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFoundLegacy] = js.native
  }
  
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
  
  @JSImport("libphonenumber-js", "PhoneNumberMatcher")
  @js.native
  class PhoneNumberMatcher protected () extends StObject {
    def this(text: String) = this()
    def this(text: String, options: DefaultCountry) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  @scala.inline
  def findNumbers(text: String): js.Array[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFoundLegacy]]
  @scala.inline
  def findNumbers(text: String, options: DefaultCountry): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  @scala.inline
  def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  
  @scala.inline
  def findParsedNumbers(text: String): js.Array[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("findParsedNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFoundLegacy]]
  @scala.inline
  def findParsedNumbers(text: String, options: `0`): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  @scala.inline
  def findParsedNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  
  @scala.inline
  def findPhoneNumbersInText(text: String): js.Array[NumberFound] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFound]]
  @scala.inline
  def findPhoneNumbersInText(text: String, options: DefaultCallingCode): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  @scala.inline
  def findPhoneNumbersInText(text: String, options: CountryCode): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  @scala.inline
  def format(parsedNumber: ParsedNumber, format: NumberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(parsedNumber.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(phone: NationalNumber, format: NumberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(phone.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatIncompletePhoneNumber(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(parsedNumber.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, options: FormatNumberOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(parsedNumber.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat, options: FormatNumberOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(phone: NationalNumber, format: NumberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatNumber(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(phone.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getCountries(): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")().asInstanceOf[js.Array[CountryCode]]
  
  @scala.inline
  def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any]).asInstanceOf[CountryCallingCode]
  
  @scala.inline
  def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(country.asInstanceOf[js.Any], examples.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  @scala.inline
  def getExtPrefix(countryCode: CountryCode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtPrefix")(countryCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getNumberType(parsedNumber: ParsedNumber): NumberType = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(parsedNumber.asInstanceOf[js.Any]).asInstanceOf[NumberType]
  @scala.inline
  def getNumberType(phone: NationalNumber): NumberType = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(phone.asInstanceOf[js.Any]).asInstanceOf[NumberType]
  @scala.inline
  def getNumberType(phone: NationalNumber, country: CountryCode): NumberType = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[NumberType]
  
  @scala.inline
  def getPhoneCode(countryCode: CountryCode): CountryCallingCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhoneCode")(countryCode.asInstanceOf[js.Any]).asInstanceOf[CountryCallingCode]
  
  @scala.inline
  def isPossibleNumber(parsedNumber: ParsedNumber): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleNumber")(parsedNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isPossibleNumber(phone: NationalNumber): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleNumber")(phone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isPossibleNumber(phone: NationalNumber, country: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossibleNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSupportedCountry(countryCode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidNumber(parsedNumber: ParsedNumber): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(parsedNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidNumber(phone: NationalNumber): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(phone.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isValidNumber(phone: NationalNumber, country: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidNumberForRegion(phone: NationalNumber, country: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumberForRegion")(phone.asInstanceOf[js.Any], country.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def parse(text: String): ParsedNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[ParsedNumber]
  @scala.inline
  def parse(text: String, options: ParseNumberOptions): ParsedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber]
  @scala.inline
  def parse(text: String, options: CountryCode): ParsedNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber]
  
  @scala.inline
  def parseDigits(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigits")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseIncompletePhoneNumber(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIncompletePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseNumber(text: String): ParsedNumber | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any]).asInstanceOf[ParsedNumber | js.Object]
  @scala.inline
  def parseNumber(text: String, options: ParseNumberOptions): ParsedNumber | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber | js.Object]
  @scala.inline
  def parseNumber(text: String, options: CountryCode): ParsedNumber | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedNumber | js.Object]
  
  @scala.inline
  def parsePhoneNumber(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  @scala.inline
  def parsePhoneNumber(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  @scala.inline
  def parsePhoneNumberCharacter(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parsePhoneNumberFromString(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  @scala.inline
  def parsePhoneNumberFromString(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  @scala.inline
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  @scala.inline
  def parsePhoneNumberWithError(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any]).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  @scala.inline
  def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  @scala.inline
  def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  @scala.inline
  def searchNumbers(text: String, options: DefaultCountry): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  @scala.inline
  def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  
  @scala.inline
  def searchParsedNumbers(text: String): IterableIterator[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchParsedNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  @scala.inline
  def searchParsedNumbers(text: String, options: `0`): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  @scala.inline
  def searchParsedNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchParsedNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  
  @scala.inline
  def searchPhoneNumbersInText(text: String): IterableIterator[NumberFound] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFound]]
  @scala.inline
  def searchPhoneNumbersInText(text: String, options: DefaultCallingCode): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  @scala.inline
  def searchPhoneNumbersInText(text: String, options: CountryCode): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  type FormatExtension = js.Function3[/* number */ String, /* extension */ String, /* metadata */ Metadata, String]
  
  trait FormatNumberOptions extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var fromCountry: js.UndefOr[CountryCode] = js.undefined
    
    var humanReadable: js.UndefOr[Boolean] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptions {
    
    @scala.inline
    def apply(): FormatNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptions]
    }
    
    @scala.inline
    implicit class FormatNumberOptionsMutableBuilder[Self <: FormatNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatExtension(value: (/* number */ String, /* extension */ String, /* metadata */ Metadata) => String): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      @scala.inline
      def setFromCountry(value: CountryCode): Self = StObject.set(x, "fromCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromCountryUndefined: Self = StObject.set(x, "fromCountry", js.undefined)
      
      @scala.inline
      def setHumanReadable(value: Boolean): Self = StObject.set(x, "humanReadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanReadableUndefined: Self = StObject.set(x, "humanReadable", js.undefined)
      
      @scala.inline
      def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait FormatNumberOptionsWithoutIDD extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptionsWithoutIDD {
    
    @scala.inline
    def apply(): FormatNumberOptionsWithoutIDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
    }
    
    @scala.inline
    implicit class FormatNumberOptionsWithoutIDDMutableBuilder[Self <: FormatNumberOptionsWithoutIDD] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatExtension(value: (/* number */ String, /* extension */ String, /* metadata */ Metadata) => String): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      @scala.inline
      def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait ParseNumberOptions extends StObject {
    
    var defaultCountry: js.UndefOr[CountryCode] = js.undefined
    
    var extended: js.UndefOr[Boolean] = js.undefined
  }
  object ParseNumberOptions {
    
    @scala.inline
    def apply(): ParseNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseNumberOptions]
    }
    
    @scala.inline
    implicit class ParseNumberOptionsMutableBuilder[Self <: ParseNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCountry(value: CountryCode): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      @scala.inline
      def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
    }
  }
  
  trait ParsedNumber extends StObject {
    
    var country: CountryCode
    
    var countryCallingCode: js.UndefOr[CountryCallingCode] = js.undefined
    
    var ext: js.UndefOr[Extension] = js.undefined
    
    var phone: NationalNumber
    
    var possible: js.UndefOr[Boolean] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object ParsedNumber {
    
    @scala.inline
    def apply(country: CountryCode, phone: NationalNumber): ParsedNumber = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedNumber]
    }
    
    @scala.inline
    implicit class ParsedNumberMutableBuilder[Self <: ParsedNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: CountryCode): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCallingCode(value: CountryCallingCode): Self = StObject.set(x, "countryCallingCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCallingCodeUndefined: Self = StObject.set(x, "countryCallingCode", js.undefined)
      
      @scala.inline
      def setExt(value: Extension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setPhone(value: NationalNumber): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPossible(value: Boolean): Self = StObject.set(x, "possible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPossibleUndefined: Self = StObject.set(x, "possible", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
}
