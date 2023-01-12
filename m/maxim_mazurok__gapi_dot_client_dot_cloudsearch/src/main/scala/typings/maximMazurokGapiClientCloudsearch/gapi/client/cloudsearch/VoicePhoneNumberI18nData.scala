package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoicePhoneNumberI18nData extends StObject {
  
  /**
    * The country calling code for this number, as defined by the ITU. For example, this would be 1 for NANPA countries, and 33 for France (for more info see
    * i18n.phonenumbers.PhoneNumber.country_code).
    */
  var countryCode: js.UndefOr[Double] = js.undefined
  
  /** Display number formatted using the INTERNATIONAL format. */
  var internationalNumber: js.UndefOr[String] = js.undefined
  
  /** When present, indicates the number is valid according to the libphonenumber's isValidNumber API (see https://code.google.com/p/libphonenumber/). */
  var isValid: js.UndefOr[Boolean] = js.undefined
  
  /** Display number formatted using the NATIONAL format. */
  var nationalNumber: js.UndefOr[String] = js.undefined
  
  /**
    * A region (country, territory, continent, etc), as defined by Unicode's "CLDR", itself based on ISO 3166 (UN country codes). For details, see
    * https://www.corp.google.com/~engdocs/java/com/google/i18n/identifiers/RegionCode.html
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /** When set to a non-default value, indicates the validation reason that is set when phone number is invalid (is_valid is false). */
  var validationResult: js.UndefOr[String] = js.undefined
}
object VoicePhoneNumberI18nData {
  
  inline def apply(): VoicePhoneNumberI18nData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoicePhoneNumberI18nData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoicePhoneNumberI18nData] (val x: Self) extends AnyVal {
    
    inline def setCountryCode(value: Double): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setInternationalNumber(value: String): Self = StObject.set(x, "internationalNumber", value.asInstanceOf[js.Any])
    
    inline def setInternationalNumberUndefined: Self = StObject.set(x, "internationalNumber", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setNationalNumber(value: String): Self = StObject.set(x, "nationalNumber", value.asInstanceOf[js.Any])
    
    inline def setNationalNumberUndefined: Self = StObject.set(x, "nationalNumber", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setValidationResult(value: String): Self = StObject.set(x, "validationResult", value.asInstanceOf[js.Any])
    
    inline def setValidationResultUndefined: Self = StObject.set(x, "validationResult", js.undefined)
  }
}
