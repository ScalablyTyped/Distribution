package typings.libphonenumberJs

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.anon.Extract
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.E164Number
import typings.libphonenumberJs.typesMod.Examples
import typings.libphonenumberJs.typesMod.MetadataJson
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.libphonenumberJs.typesMod.NumberingPlan
import typings.libphonenumberJs.typesMod.ValidatePhoneNumberLengthResult
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMod {
  
  @JSImport("libphonenumber-js/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, defaultCountry: Extract): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  @JSImport("libphonenumber-js/min", "AsYouType")
  @js.native
  open class AsYouType () extends StObject {
    def this(defaultCountryCode: DefaultCallingCode) = this()
    def this(defaultCountryCode: CountryCode) = this()
    
    def getCallingCode(): js.UndefOr[String] = js.native
    
    def getChars(): String = js.native
    
    def getCountry(): js.UndefOr[CountryCode] = js.native
    
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    
    def getNumberValue(): js.UndefOr[E164Number] = js.native
    
    def getTemplate(): String = js.native
    
    def input(text: String): String = js.native
    
    def isInternational(): Boolean = js.native
    
    def isPossible(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/min", "Metadata")
  @js.native
  open class Metadata () extends StObject {
    
    var numberingPlan: js.UndefOr[NumberingPlan] = js.native
    
    def selectNumberingPlan(country: CountryCode): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/min", "ParseError")
  @js.native
  open class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
  @JSImport("libphonenumber-js/min", "PhoneNumber")
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
  
  @JSImport("libphonenumber-js/min", "PhoneNumberMatcher")
  @js.native
  open class PhoneNumberMatcher protected () extends StObject {
    def this(text: String) = this()
    def this(text: String, options: DefaultCountry) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  inline def findNumbers(text: String): js.Array[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findNumbers(text: String, options: DefaultCountry): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findNumbers(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  
  inline def findPhoneNumbersInText(text: String): js.Array[NumberFound] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: DefaultCallingCode): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: CountryCode): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def formatIncompletePhoneNumber(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatIncompletePhoneNumber(number: String, countryCode: CountryCode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")().asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode): CountryCallingCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any]).asInstanceOf[CountryCallingCode]
  
  inline def getExampleNumber(country: CountryCode, examples: Examples): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(country.asInstanceOf[js.Any], examples.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def getExtPrefix(countryCode: CountryCode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtPrefix")(countryCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isPossiblePhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: DefaultCallingCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPossiblePhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPossiblePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSupportedCountry(countryCode: CountryCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: DefaultCallingCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidPhoneNumber(text: String, defaultCountry: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseDigits(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigits")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseIncompletePhoneNumber(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIncompletePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumber(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def parsePhoneNumberCharacter(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumberFromString(text: String): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, defaultCountry: Extract): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def parsePhoneNumberWithError(text: String): typings.libphonenumberJs.typesMod.PhoneNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any]).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def searchNumbers(text: String): IterableIterator[NumberFoundLegacy] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchNumbers(text: String, options: DefaultCountry): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchNumbers(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  
  inline def searchPhoneNumbersInText(text: String): IterableIterator[NumberFound] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: DefaultCallingCode): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: CountryCode): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  inline def validatePhoneNumberLength(text: String): js.UndefOr[ValidatePhoneNumberLengthResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
  inline def validatePhoneNumberLength(text: String, defaultCountry: DefaultCallingCode): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
  inline def validatePhoneNumberLength(text: String, defaultCountry: CountryCode): js.UndefOr[ValidatePhoneNumberLengthResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePhoneNumberLength")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ValidatePhoneNumberLengthResult]]
}
