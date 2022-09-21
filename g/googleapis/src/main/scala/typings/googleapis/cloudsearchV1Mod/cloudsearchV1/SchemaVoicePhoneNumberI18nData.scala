package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVoicePhoneNumberI18nData extends StObject {
  
  /**
    * The country calling code for this number, as defined by the ITU. For example, this would be 1 for NANPA countries, and 33 for France (for more info see i18n.phonenumbers.PhoneNumber.country_code).
    */
  var countryCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Display number formatted using the INTERNATIONAL format.
    */
  var internationalNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When present, indicates the number is valid according to the libphonenumber's isValidNumber API (see https://code.google.com/p/libphonenumber/).
    */
  var isValid: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Display number formatted using the NATIONAL format.
    */
  var nationalNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A region (country, territory, continent, etc), as defined by Unicode's "CLDR", itself based on ISO 3166 (UN country codes). For details, see https://www.corp.google.com/~engdocs/java/com/google/i18n/identifiers/RegionCode.html
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When set to a non-default value, indicates the validation reason that is set when phone number is invalid (is_valid is false).
    */
  var validationResult: js.UndefOr[String | Null] = js.undefined
}
object SchemaVoicePhoneNumberI18nData {
  
  inline def apply(): SchemaVoicePhoneNumberI18nData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoicePhoneNumberI18nData]
  }
  
  extension [Self <: SchemaVoicePhoneNumberI18nData](x: Self) {
    
    inline def setCountryCode(value: Double): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setInternationalNumber(value: String): Self = StObject.set(x, "internationalNumber", value.asInstanceOf[js.Any])
    
    inline def setInternationalNumberNull: Self = StObject.set(x, "internationalNumber", null)
    
    inline def setInternationalNumberUndefined: Self = StObject.set(x, "internationalNumber", js.undefined)
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidNull: Self = StObject.set(x, "isValid", null)
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    inline def setNationalNumber(value: String): Self = StObject.set(x, "nationalNumber", value.asInstanceOf[js.Any])
    
    inline def setNationalNumberNull: Self = StObject.set(x, "nationalNumber", null)
    
    inline def setNationalNumberUndefined: Self = StObject.set(x, "nationalNumber", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setValidationResult(value: String): Self = StObject.set(x, "validationResult", value.asInstanceOf[js.Any])
    
    inline def setValidationResultNull: Self = StObject.set(x, "validationResult", null)
    
    inline def setValidationResultUndefined: Self = StObject.set(x, "validationResult", js.undefined)
  }
}
