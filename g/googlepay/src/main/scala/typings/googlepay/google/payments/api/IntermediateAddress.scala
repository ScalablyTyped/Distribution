package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Limited information about user address for developer callbacks.
  */
trait IntermediateAddress extends StObject {
  
  /**
    * The administrative area (e.g. state or province).
    */
  var administrativeArea: String
  
  /**
    * The two-letter ISO-3166 country code.
    */
  var countryCode: String
  
  /**
    * The locality (e.g. city or town).
    */
  var locality: String
  
  /**
    * The postal code (also known in some places as ZIP code).
    *
    * Note: some regions do not have postal codes. In those cases
    * this field will be set to an empty string.
    *
    * Also note: The returned postal code may vary based on the user's
    * geographic region. For Canada and United Kingdom, this contains only
    * the first three characters. For US, the this contain the first five
    * digits.
    */
  var postalCode: String
}
object IntermediateAddress {
  
  inline def apply(administrativeArea: String, countryCode: String, locality: String, postalCode: String): IntermediateAddress = {
    val __obj = js.Dynamic.literal(administrativeArea = administrativeArea.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediateAddress]
  }
  
  extension [Self <: IntermediateAddress](x: Self) {
    
    inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
  }
}
