package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js/types", "PhoneNumber")
@js.native
class PhoneNumber protected () extends js.Object {
  def this(
    countryCallingCodeOrCountry: CountryCallingCode,
    nationalNumber: NationalNumber,
    metadata: Metadata
  ) = this()
  def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
  
  var carrierCode: js.UndefOr[CarrierCode] = js.native
  
  var country: js.UndefOr[CountryCode] = js.native
  
  var countryCallingCode: CountryCallingCode = js.native
  
  var ext: js.UndefOr[Extension] = js.native
  
  def format(format: NumberFormat): String = js.native
  def format(format: NumberFormat, options: FormatNumberOptions): String = js.native
  
  def formatInternational(): String = js.native
  def formatInternational(options: FormatNumberOptionsWithoutIDD): String = js.native
  
  def formatNational(): String = js.native
  def formatNational(options: FormatNumberOptionsWithoutIDD): String = js.native
  
  def getType(): NumberType = js.native
  
  def getURI(): String = js.native
  def getURI(options: FormatNumberOptionsWithoutIDD): String = js.native
  
  def isEqual(phoneNumber: PhoneNumber): Boolean = js.native
  
  def isNonGeographic(): Boolean = js.native
  
  def isPossible(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  var nationalNumber: NationalNumber = js.native
  
  var number: E164Number = js.native
}
