package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhoneAccess extends StObject {
  
  /**
    * The phone number to dial for this meeting space in INTERNATIONAL format. Full phone number with a leading '+' character and whitespace separations.
    */
  var formattedPhoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The BCP 47/LDML language code for the language associated with this phone access. To be parsed by the i18n LanguageCode utility. Examples: "es-419" for Latin American Spanish, "fr-CA" for Canadian French.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phone number to dial for this meeting space in E.164 format. Full phone number with a leading '+' character.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The PIN that users must enter after dialing the given number. The PIN consists of only decimal digits and the length may vary.
    */
  var pin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CLDR/ISO 3166 region code for the country associated with this phone access. To be parsed by the i18n RegionCode utility. Example: "SE" for Sweden.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhoneAccess {
  
  inline def apply(): SchemaPhoneAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoneAccess]
  }
  
  extension [Self <: SchemaPhoneAccess](x: Self) {
    
    inline def setFormattedPhoneNumber(value: String): Self = StObject.set(x, "formattedPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setFormattedPhoneNumberNull: Self = StObject.set(x, "formattedPhoneNumber", null)
    
    inline def setFormattedPhoneNumberUndefined: Self = StObject.set(x, "formattedPhoneNumber", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinNull: Self = StObject.set(x, "pin", null)
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
