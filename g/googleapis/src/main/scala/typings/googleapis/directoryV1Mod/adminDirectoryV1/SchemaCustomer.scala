package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Customer Resource object in Directory API.
  */
@js.native
trait SchemaCustomer extends js.Object {
  
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
  implicit class SchemaCustomerOps[Self <: SchemaCustomer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlternateEmail(value: String): Self = this.set("alternateEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateEmail: Self = this.set("alternateEmail", js.undefined)
    
    @scala.inline
    def setCustomerCreationTime(value: String): Self = this.set("customerCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerCreationTime: Self = this.set("customerCreationTime", js.undefined)
    
    @scala.inline
    def setCustomerDomain(value: String): Self = this.set("customerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerDomain: Self = this.set("customerDomain", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: SchemaCustomerPostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
  }
}
