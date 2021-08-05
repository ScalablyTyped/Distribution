package typings.libphonenumberJs

import typings.libphonenumberJs.anon.DefaultCallingCode
import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.anon.`0`
import typings.libphonenumberJs.anon.countryinCountryCodeNatio
import typings.libphonenumberJs.typesMod.CountryCallingCode
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.Metadata
import typings.libphonenumberJs.typesMod.NationalNumber
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("libphonenumber-js/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String, defaultCountry: CountryCode, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  inline def default(text: String, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  @JSImport("libphonenumber-js/core", "AsYouType")
  @js.native
  class AsYouType protected () extends StObject {
    def this(defaultCountryCode: Unit, metadata: Metadata) = this()
    def this(defaultCountryCode: DefaultCallingCode, metadata: Metadata) = this()
    def this(defaultCountryCode: CountryCode, metadata: Metadata) = this()
    
    def getChars(): String = js.native
    
    def getNumber(): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
    
    def getTemplate(): String = js.native
    
    def input(text: String): String = js.native
    
    def reset(): Unit = js.native
  }
  
  @JSImport("libphonenumber-js/core", "ParseError")
  @js.native
  class ParseError ()
    extends typings.libphonenumberJs.typesMod.ParseError
  
  @JSImport("libphonenumber-js/core", "PhoneNumber")
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
  
  @JSImport("libphonenumber-js/core", "PhoneNumberMatcher")
  @js.native
  class PhoneNumberMatcher protected () extends StObject {
    def this(text: String, metadata: Metadata) = this()
    def this(text: String, options: DefaultCountry, metadata: Metadata) = this()
    
    def hasNext(): Boolean = js.native
    
    def next(): js.UndefOr[NumberFound] = js.native
  }
  
  inline def findNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFoundLegacy]]
  inline def findNumbers(text: String, options: DefaultCountry, metadata: Metadata): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def findPhoneNumbersInText(text: String, metadata: Metadata): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: `0`, metadata: Metadata): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  inline def findPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFound]]
  
  inline def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatIncompletePhoneNumber(number: String, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIncompletePhoneNumber")(number.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCountries(metadata: Metadata): js.Array[CountryCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountries")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Array[CountryCode]]
  
  inline def getCountryCallingCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryCallingCode")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[CountryCallingCode]
  
  inline def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(country.asInstanceOf[js.Any], examples.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def getExtPrefix(countryCode: CountryCode, metadata: Metadata): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtPrefix")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isSupportedCountry(countryCode: CountryCode, metadata: Metadata): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedCountry")(countryCode.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseDigits(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigits")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseIncompletePhoneNumber(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIncompletePhoneNumber")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumber(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumber")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def parsePhoneNumberCharacter(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberCharacter")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  inline def parsePhoneNumberFromString(text: String, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberFromString")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber]]
  
  inline def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], defaultCountry.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  inline def parsePhoneNumberWithError(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePhoneNumberWithError")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typings.libphonenumberJs.typesMod.PhoneNumber]
  
  inline def searchNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFoundLegacy]]
  inline def searchNumbers(text: String, options: DefaultCountry, metadata: Metadata): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchNumbers")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  
  inline def searchPhoneNumbersInText(text: String, metadata: Metadata): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: `0`, metadata: Metadata): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
  inline def searchPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPhoneNumbersInText")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[NumberFound]]
}
