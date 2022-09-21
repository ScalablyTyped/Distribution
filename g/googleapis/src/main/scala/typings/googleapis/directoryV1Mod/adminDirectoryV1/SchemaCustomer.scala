package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomer extends StObject {
  
  /**
    * The customer's secondary contact email address. This email address cannot be on the same domain as the `customerDomain`
    */
  var alternateEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer's creation time (Readonly)
    */
  var customerCreationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer's primary domain name string. Do not include the `www` prefix when creating a new customer.
    */
  var customerDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID for the customer's Google Workspace account. (Readonly)
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the resource as a customer. Value: `admin#directory#customer`
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer's ISO 639-2 language code. See the [Language Codes](/admin-sdk/directory/v1/languages) page for the list of supported codes. Valid language codes outside the supported set will be accepted by the API but may lead to unexpected behavior. The default value is `en`.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer's contact phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer's postal address information.
    */
  var postalAddress: js.UndefOr[SchemaCustomerPostalAddress] = js.undefined
}
object SchemaCustomer {
  
  inline def apply(): SchemaCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomer]
  }
  
  extension [Self <: SchemaCustomer](x: Self) {
    
    inline def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
    
    inline def setAlternateEmailNull: Self = StObject.set(x, "alternateEmail", null)
    
    inline def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
    
    inline def setCustomerCreationTime(value: String): Self = StObject.set(x, "customerCreationTime", value.asInstanceOf[js.Any])
    
    inline def setCustomerCreationTimeNull: Self = StObject.set(x, "customerCreationTime", null)
    
    inline def setCustomerCreationTimeUndefined: Self = StObject.set(x, "customerCreationTime", js.undefined)
    
    inline def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomerDomainNull: Self = StObject.set(x, "customerDomain", null)
    
    inline def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPostalAddress(value: SchemaCustomerPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
  }
}
