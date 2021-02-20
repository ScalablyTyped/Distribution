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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libphonenumber-js", JSImport.Default)
  @js.native
  def default(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  @JSImport("libphonenumber-js", JSImport.Default)
  @js.native
  def default(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  @JSImport("libphonenumber-js", JSImport.Default)
  @js.native
  def default(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
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
  
  @JSImport("libphonenumber-js", "findNumbers")
  @js.native
  def findNumbers(text: String): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js", "findNumbers")
  @js.native
  def findNumbers(text: String, options: DefaultCountry): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js", "findNumbers")
  @js.native
  def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
  
  @JSImport("libphonenumber-js", "findParsedNumbers")
  @js.native
  def findParsedNumbers(text: String): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js", "findParsedNumbers")
  @js.native
  def findParsedNumbers(text: String, options: `0`): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js", "findParsedNumbers")
  @js.native
  def findParsedNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
  
  @JSImport("libphonenumber-js", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, options: DefaultCallingCode): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, options: CountryCode): js.Array[NumberFound] = js.native
  
  @JSImport("libphonenumber-js", "format")
  @js.native
  def format(parsedNumber: ParsedNumber, format: NumberFormat): String = js.native
  @JSImport("libphonenumber-js", "format")
  @js.native
  def format(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = js.native
  @JSImport("libphonenumber-js", "format")
  @js.native
  def format(phone: NationalNumber, format: NumberFormat): String = js.native
  
  @JSImport("libphonenumber-js", "formatIncompletePhoneNumber")
  @js.native
  def formatIncompletePhoneNumber(number: String): String = js.native
  @JSImport("libphonenumber-js", "formatIncompletePhoneNumber")
  @js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = js.native
  
  @JSImport("libphonenumber-js", "formatNumber")
  @js.native
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat): String = js.native
  @JSImport("libphonenumber-js", "formatNumber")
  @js.native
  def formatNumber(parsedNumber: ParsedNumber, format: NumberFormat, options: FormatNumberOptions): String = js.native
  @JSImport("libphonenumber-js", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat): String = js.native
  @JSImport("libphonenumber-js", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, country: CountryCode, format: NumberFormat, options: FormatNumberOptions): String = js.native
  @JSImport("libphonenumber-js", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, format: NumberFormat): String = js.native
  @JSImport("libphonenumber-js", "formatNumber")
  @js.native
  def formatNumber(phone: NationalNumber, format: NumberFormat, options: FormatNumberOptions): String = js.native
  
  @JSImport("libphonenumber-js", "getCountries")
  @js.native
  def getCountries(): js.Array[CountryCode] = js.native
  
  @JSImport("libphonenumber-js", "getCountryCallingCode")
  @js.native
  def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = js.native
  
  @JSImport("libphonenumber-js", "getExampleNumber")
  @js.native
  def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
  @JSImport("libphonenumber-js", "getExtPrefix")
  @js.native
  def getExtPrefix(countryCode: CountryCode): String = js.native
  
  @JSImport("libphonenumber-js", "getNumberType")
  @js.native
  def getNumberType(parsedNumber: ParsedNumber): NumberType = js.native
  @JSImport("libphonenumber-js", "getNumberType")
  @js.native
  def getNumberType(phone: NationalNumber): NumberType = js.native
  @JSImport("libphonenumber-js", "getNumberType")
  @js.native
  def getNumberType(phone: NationalNumber, country: CountryCode): NumberType = js.native
  
  @JSImport("libphonenumber-js", "getPhoneCode")
  @js.native
  def getPhoneCode(countryCode: CountryCode): CountryCallingCode = js.native
  
  @JSImport("libphonenumber-js", "isPossibleNumber")
  @js.native
  def isPossibleNumber(parsedNumber: ParsedNumber): Boolean = js.native
  @JSImport("libphonenumber-js", "isPossibleNumber")
  @js.native
  def isPossibleNumber(phone: NationalNumber): Boolean = js.native
  @JSImport("libphonenumber-js", "isPossibleNumber")
  @js.native
  def isPossibleNumber(phone: NationalNumber, country: CountryCode): Boolean = js.native
  
  @JSImport("libphonenumber-js", "isSupportedCountry")
  @js.native
  def isSupportedCountry(countryCode: String): Boolean = js.native
  
  @JSImport("libphonenumber-js", "isValidNumber")
  @js.native
  def isValidNumber(parsedNumber: ParsedNumber): Boolean = js.native
  @JSImport("libphonenumber-js", "isValidNumber")
  @js.native
  def isValidNumber(phone: NationalNumber): Boolean = js.native
  @JSImport("libphonenumber-js", "isValidNumber")
  @js.native
  def isValidNumber(phone: NationalNumber, country: CountryCode): Boolean = js.native
  
  @JSImport("libphonenumber-js", "isValidNumberForRegion")
  @js.native
  def isValidNumberForRegion(phone: NationalNumber, country: CountryCode): Boolean = js.native
  
  @JSImport("libphonenumber-js", "parse")
  @js.native
  def parse(text: String): ParsedNumber = js.native
  @JSImport("libphonenumber-js", "parse")
  @js.native
  def parse(text: String, options: ParseNumberOptions): ParsedNumber = js.native
  @JSImport("libphonenumber-js", "parse")
  @js.native
  def parse(text: String, options: CountryCode): ParsedNumber = js.native
  
  @JSImport("libphonenumber-js", "parseDigits")
  @js.native
  def parseDigits(character: String): String = js.native
  
  @JSImport("libphonenumber-js", "parseIncompletePhoneNumber")
  @js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  
  @JSImport("libphonenumber-js", "parseNumber")
  @js.native
  def parseNumber(text: String): ParsedNumber | js.Object = js.native
  @JSImport("libphonenumber-js", "parseNumber")
  @js.native
  def parseNumber(text: String, options: ParseNumberOptions): ParsedNumber | js.Object = js.native
  @JSImport("libphonenumber-js", "parseNumber")
  @js.native
  def parseNumber(text: String, options: CountryCode): ParsedNumber | js.Object = js.native
  
  @JSImport("libphonenumber-js", "parsePhoneNumber")
  @js.native
  def parsePhoneNumber(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js", "parsePhoneNumber")
  @js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js", "parsePhoneNumberCharacter")
  @js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  
  @JSImport("libphonenumber-js", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  @JSImport("libphonenumber-js", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  @JSImport("libphonenumber-js", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
  @JSImport("libphonenumber-js", "parsePhoneNumberWithError")
  @js.native
  def parsePhoneNumberWithError(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js", "parsePhoneNumberWithError")
  @js.native
  def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js", "searchNumbers")
  @js.native
  def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js", "searchNumbers")
  @js.native
  def searchNumbers(text: String, options: DefaultCountry): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js", "searchNumbers")
  @js.native
  def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
  
  @JSImport("libphonenumber-js", "searchParsedNumbers")
  @js.native
  def searchParsedNumbers(text: String): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js", "searchParsedNumbers")
  @js.native
  def searchParsedNumbers(text: String, options: `0`): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js", "searchParsedNumbers")
  @js.native
  def searchParsedNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
  
  @JSImport("libphonenumber-js", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, options: DefaultCallingCode): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, options: CountryCode): IterableIterator[NumberFound] = js.native
  
  type FormatExtension = js.Function3[/* number */ String, /* extension */ String, /* metadata */ Metadata, String]
  
  @js.native
  trait FormatNumberOptions extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.native
    
    var fromCountry: js.UndefOr[CountryCode] = js.native
    
    var humanReadable: js.UndefOr[Boolean] = js.native
    
    var v2: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait FormatNumberOptionsWithoutIDD extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.native
    
    var v2: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait ParseNumberOptions extends StObject {
    
    var defaultCountry: js.UndefOr[CountryCode] = js.native
    
    var extended: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait ParsedNumber extends StObject {
    
    var country: CountryCode = js.native
    
    var countryCallingCode: js.UndefOr[CountryCallingCode] = js.native
    
    var ext: js.UndefOr[Extension] = js.native
    
    var phone: NationalNumber = js.native
    
    var possible: js.UndefOr[Boolean] = js.native
    
    var valid: js.UndefOr[Boolean] = js.native
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
