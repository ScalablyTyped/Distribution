package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerPostalAddress extends StObject {
  
  /**
    * A customer's physical address. The address can be composed of one to three lines.
    */
  var addressLine1: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Address line 2 of the address.
    */
  var addressLine2: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Address line 3 of the address.
    */
  var addressLine3: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer contact's name.
    */
  var contactName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is a required property. For `countryCode` information see the [ISO 3166 country code elements](https://www.iso.org/iso/country_codes.htm).
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the locality. An example of a locality value is the city of `San Francisco`.
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The company or company division name.
    */
  var organizationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The postal code. A postalCode example is a postal zip code such as `10009`. This is in accordance with - http: //portablecontacts.net/draft-spec.html#address_element.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the region. An example of a region value is `NY` for the state of New York.
    */
  var region: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerPostalAddress {
  
  inline def apply(): SchemaCustomerPostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerPostalAddress]
  }
  
  extension [Self <: SchemaCustomerPostalAddress](x: Self) {
    
    inline def setAddressLine1(value: String): Self = StObject.set(x, "addressLine1", value.asInstanceOf[js.Any])
    
    inline def setAddressLine1Null: Self = StObject.set(x, "addressLine1", null)
    
    inline def setAddressLine1Undefined: Self = StObject.set(x, "addressLine1", js.undefined)
    
    inline def setAddressLine2(value: String): Self = StObject.set(x, "addressLine2", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2Null: Self = StObject.set(x, "addressLine2", null)
    
    inline def setAddressLine2Undefined: Self = StObject.set(x, "addressLine2", js.undefined)
    
    inline def setAddressLine3(value: String): Self = StObject.set(x, "addressLine3", value.asInstanceOf[js.Any])
    
    inline def setAddressLine3Null: Self = StObject.set(x, "addressLine3", null)
    
    inline def setAddressLine3Undefined: Self = StObject.set(x, "addressLine3", js.undefined)
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameNull: Self = StObject.set(x, "contactName", null)
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityNull: Self = StObject.set(x, "locality", null)
    
    inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNameNull: Self = StObject.set(x, "organizationName", null)
    
    inline def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
