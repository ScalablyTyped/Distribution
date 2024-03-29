package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactInfo extends StObject {
  
  /**
    * Country code of the member. Must also be set with the following fields: * hashed_first_name * hashed_last_name * zip_codes
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of SHA256 hashed email of the member. Before hashing, remove all whitespace and make sure the string is all lowercase.
    */
  var hashedEmails: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * SHA256 hashed first name of the member. Before hashing, remove all whitespace and make sure the string is all lowercase. Must also be set with the following fields: * country_code * hashed_last_name * zip_codes
    */
  var hashedFirstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * SHA256 hashed last name of the member. Before hashing, remove all whitespace and make sure the string is all lowercase. Must also be set with the following fields: * country_code * hashed_first_name * zip_codes
    */
  var hashedLastName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of SHA256 hashed phone numbers of the member. Before hashing, all phone numbers must be formatted using the [E.164 format](//en.wikipedia.org/wiki/E.164) and include the country calling code.
    */
  var hashedPhoneNumbers: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of zip codes of the member. Must also be set with the following fields: * country_code * hashed_first_name * hashed_last_name
    */
  var zipCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaContactInfo {
  
  inline def apply(): SchemaContactInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactInfo]
  }
  
  extension [Self <: SchemaContactInfo](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setHashedEmails(value: js.Array[String]): Self = StObject.set(x, "hashedEmails", value.asInstanceOf[js.Any])
    
    inline def setHashedEmailsNull: Self = StObject.set(x, "hashedEmails", null)
    
    inline def setHashedEmailsUndefined: Self = StObject.set(x, "hashedEmails", js.undefined)
    
    inline def setHashedEmailsVarargs(value: String*): Self = StObject.set(x, "hashedEmails", js.Array(value*))
    
    inline def setHashedFirstName(value: String): Self = StObject.set(x, "hashedFirstName", value.asInstanceOf[js.Any])
    
    inline def setHashedFirstNameNull: Self = StObject.set(x, "hashedFirstName", null)
    
    inline def setHashedFirstNameUndefined: Self = StObject.set(x, "hashedFirstName", js.undefined)
    
    inline def setHashedLastName(value: String): Self = StObject.set(x, "hashedLastName", value.asInstanceOf[js.Any])
    
    inline def setHashedLastNameNull: Self = StObject.set(x, "hashedLastName", null)
    
    inline def setHashedLastNameUndefined: Self = StObject.set(x, "hashedLastName", js.undefined)
    
    inline def setHashedPhoneNumbers(value: js.Array[String]): Self = StObject.set(x, "hashedPhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setHashedPhoneNumbersNull: Self = StObject.set(x, "hashedPhoneNumbers", null)
    
    inline def setHashedPhoneNumbersUndefined: Self = StObject.set(x, "hashedPhoneNumbers", js.undefined)
    
    inline def setHashedPhoneNumbersVarargs(value: String*): Self = StObject.set(x, "hashedPhoneNumbers", js.Array(value*))
    
    inline def setZipCodes(value: js.Array[String]): Self = StObject.set(x, "zipCodes", value.asInstanceOf[js.Any])
    
    inline def setZipCodesNull: Self = StObject.set(x, "zipCodes", null)
    
    inline def setZipCodesUndefined: Self = StObject.set(x, "zipCodes", js.undefined)
    
    inline def setZipCodesVarargs(value: String*): Self = StObject.set(x, "zipCodes", js.Array(value*))
  }
}
