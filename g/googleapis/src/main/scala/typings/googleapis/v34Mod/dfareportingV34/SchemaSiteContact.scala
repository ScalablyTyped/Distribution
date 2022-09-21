package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteContact extends StObject {
  
  /**
    * Address of this site contact.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Site contact type.
    */
  var contactType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address of this site contact. This is a required field.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * First name of this site contact.
    */
  var firstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this site contact. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last name of this site contact.
    */
  var lastName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Primary phone number of this site contact.
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title or designation of this site contact.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaSiteContact {
  
  inline def apply(): SchemaSiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteContact]
  }
  
  extension [Self <: SchemaSiteContact](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    inline def setContactTypeNull: Self = StObject.set(x, "contactType", null)
    
    inline def setContactTypeUndefined: Self = StObject.set(x, "contactType", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameNull: Self = StObject.set(x, "lastName", null)
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
