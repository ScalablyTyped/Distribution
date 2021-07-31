package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Site Contact
  */
trait SchemaSiteContact extends StObject {
  
  /**
    * Address of this site contact.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Site contact type.
    */
  var contactType: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of this site contact. This is a required field.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * First name of this site contact.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this site contact. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Last name of this site contact.
    */
  var lastName: js.UndefOr[String] = js.undefined
  
  /**
    * Primary phone number of this site contact.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * Title or designation of this site contact.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaSiteContact {
  
  @scala.inline
  def apply(): SchemaSiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteContact]
  }
  
  @scala.inline
  implicit class SchemaSiteContactMutableBuilder[Self <: SchemaSiteContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactTypeUndefined: Self = StObject.set(x, "contactType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
