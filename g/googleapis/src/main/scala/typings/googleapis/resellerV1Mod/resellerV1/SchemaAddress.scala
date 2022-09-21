package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddress extends StObject {
  
  /**
    * A customer's physical address. An address can be composed of one to three lines. The `addressline2` and `addressLine3` are optional.
    */
  var addressLine1: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line 2 of the address.
    */
  var addressLine2: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line 3 of the address.
    */
  var addressLine3: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer contact's name. This is required.
    */
  var contactName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For `countryCode` information, see the ISO 3166 country code elements. Verify that country is approved for resale of Google products. This property is required when creating a new customer.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the resource as a customer address. Value: `customers#address`
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An example of a `locality` value is the city of `San Francisco`.
    */
  var locality: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The company or company division name. This is required.
    */
  var organizationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A `postalCode` example is a postal zip code such as `94043`. This property is required when creating a new customer.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An example of a `region` value is `CA` for the state of California.
    */
  var region: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddress {
  
  inline def apply(): SchemaAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddress]
  }
  
  extension [Self <: SchemaAddress](x: Self) {
    
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
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
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
