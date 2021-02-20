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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("libphonenumber-js/core", JSImport.Default)
  @js.native
  def default(text: String, defaultCountry: CountryCode, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  @JSImport("libphonenumber-js/core", JSImport.Default)
  @js.native
  def default(text: String, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
  @JSImport("libphonenumber-js/core", "AsYouType")
  @js.native
  class AsYouType protected () extends StObject {
    def this(defaultCountryCode: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
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
  
  @JSImport("libphonenumber-js/core", "findNumbers")
  @js.native
  def findNumbers(text: String, metadata: Metadata): js.Array[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/core", "findNumbers")
  @js.native
  def findNumbers(text: String, options: DefaultCountry, metadata: Metadata): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js/core", "findNumbers")
  @js.native
  def findNumbers(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  
  @JSImport("libphonenumber-js/core", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, metadata: Metadata): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js/core", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, options: `0`, metadata: Metadata): js.Array[NumberFound] = js.native
  @JSImport("libphonenumber-js/core", "findPhoneNumbersInText")
  @js.native
  def findPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): js.Array[NumberFound] = js.native
  
  @JSImport("libphonenumber-js/core", "formatIncompletePhoneNumber")
  @js.native
  def formatIncompletePhoneNumber(number: String, countryCode: CountryCode, metadata: Metadata): String = js.native
  @JSImport("libphonenumber-js/core", "formatIncompletePhoneNumber")
  @js.native
  def formatIncompletePhoneNumber(number: String, metadata: Metadata): String = js.native
  
  @JSImport("libphonenumber-js/core", "getCountries")
  @js.native
  def getCountries(metadata: Metadata): js.Array[CountryCode] = js.native
  
  @JSImport("libphonenumber-js/core", "getCountryCallingCode")
  @js.native
  def getCountryCallingCode(countryCode: CountryCode, metadata: Metadata): CountryCallingCode = js.native
  
  @JSImport("libphonenumber-js/core", "getExampleNumber")
  @js.native
  def getExampleNumber(country: CountryCode, examples: countryinCountryCodeNatio, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
  @JSImport("libphonenumber-js/core", "getExtPrefix")
  @js.native
  def getExtPrefix(countryCode: CountryCode, metadata: Metadata): String = js.native
  
  @JSImport("libphonenumber-js/core", "isSupportedCountry")
  @js.native
  def isSupportedCountry(countryCode: CountryCode, metadata: Metadata): Boolean = js.native
  
  @JSImport("libphonenumber-js/core", "parseDigits")
  @js.native
  def parseDigits(character: String): String = js.native
  
  @JSImport("libphonenumber-js/core", "parseIncompletePhoneNumber")
  @js.native
  def parseIncompletePhoneNumber(text: String): String = js.native
  
  @JSImport("libphonenumber-js/core", "parsePhoneNumber")
  @js.native
  def parsePhoneNumber(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/core", "parsePhoneNumber")
  @js.native
  def parsePhoneNumber(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js/core", "parsePhoneNumberCharacter")
  @js.native
  def parsePhoneNumberCharacter(character: String): String = js.native
  
  @JSImport("libphonenumber-js/core", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, defaultCountry: CountryCode, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  @JSImport("libphonenumber-js/core", "parsePhoneNumberFromString")
  @js.native
  def parsePhoneNumberFromString(text: String, metadata: Metadata): js.UndefOr[typings.libphonenumberJs.typesMod.PhoneNumber] = js.native
  
  @JSImport("libphonenumber-js/core", "parsePhoneNumberWithError")
  @js.native
  def parsePhoneNumberWithError(text: String, defaultCountry: CountryCode, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  @JSImport("libphonenumber-js/core", "parsePhoneNumberWithError")
  @js.native
  def parsePhoneNumberWithError(text: String, metadata: Metadata): typings.libphonenumberJs.typesMod.PhoneNumber = js.native
  
  @JSImport("libphonenumber-js/core", "searchNumbers")
  @js.native
  def searchNumbers(text: String, metadata: Metadata): IterableIterator[NumberFoundLegacy] = js.native
  @JSImport("libphonenumber-js/core", "searchNumbers")
  @js.native
  def searchNumbers(text: String, options: DefaultCountry, metadata: Metadata): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js/core", "searchNumbers")
  @js.native
  def searchNumbers(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
  
  @JSImport("libphonenumber-js/core", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, metadata: Metadata): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js/core", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, options: `0`, metadata: Metadata): IterableIterator[NumberFound] = js.native
  @JSImport("libphonenumber-js/core", "searchPhoneNumbersInText")
  @js.native
  def searchPhoneNumbersInText(text: String, options: CountryCode, metadata: Metadata): IterableIterator[NumberFound] = js.native
}
