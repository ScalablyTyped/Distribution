package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Customer Resource object in Directory API.
  */
@js.native
trait SchemaCustomer extends StObject {
  
  /**
    * The customer&#39;s secondary contact email address. This email address
    * cannot be on the same domain as the customerDomain
    */
  var alternateEmail: js.UndefOr[String] = js.native
  
  /**
    * The customer&#39;s creation time (Readonly)
    */
  var customerCreationTime: js.UndefOr[String] = js.native
  
  /**
    * The customer&#39;s primary domain name string. Do not include the www
    * prefix when creating a new customer.
    */
  var customerDomain: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The unique ID for the customer&#39;s G Suite account. (Readonly)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the resource as a customer. Value: admin#directory#customer
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The customer&#39;s ISO 639-2 language code. The default value is en-US
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * The customer&#39;s contact phone number in E.164 format.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The customer&#39;s postal address information.
    */
  var postalAddress: js.UndefOr[SchemaCustomerPostalAddress] = js.native
}
object SchemaCustomer {
  
  @scala.inline
  def apply(): SchemaCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomer]
  }
  
  @scala.inline
  implicit class SchemaCustomerMutableBuilder[Self <: SchemaCustomer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateEmail(value: String): Self = StObject.set(x, "alternateEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateEmailUndefined: Self = StObject.set(x, "alternateEmail", js.undefined)
    
    @scala.inline
    def setCustomerCreationTime(value: String): Self = StObject.set(x, "customerCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerCreationTimeUndefined: Self = StObject.set(x, "customerCreationTime", js.undefined)
    
    @scala.inline
    def setCustomerDomain(value: String): Self = StObject.set(x, "customerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerDomainUndefined: Self = StObject.set(x, "customerDomain", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: SchemaCustomerPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
  }
}
