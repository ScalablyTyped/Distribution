package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContact extends StObject {
  
  /**
    * Required. Email address of the contact.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
    */
  var faxNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Phone number of the contact in international format. For example, `"+1-800-555-0123"`.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Postal address of the contact.
    */
  var postalAddress: js.UndefOr[SchemaPostalAddress] = js.undefined
}
object SchemaContact {
  
  inline def apply(): SchemaContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContact]
  }
  
  extension [Self <: SchemaContact](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFaxNumber(value: String): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    inline def setFaxNumberNull: Self = StObject.set(x, "faxNumber", null)
    
    inline def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPostalAddress(value: SchemaPostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
  }
}
