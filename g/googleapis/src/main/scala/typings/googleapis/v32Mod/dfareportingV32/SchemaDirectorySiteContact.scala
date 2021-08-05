package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Site Directory contact.
  */
trait SchemaDirectorySiteContact extends StObject {
  
  /**
    * Address of this directory site contact.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Email address of this directory site contact.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * First name of this directory site contact.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this directory site contact. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContact&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Last name of this directory site contact.
    */
  var lastName: js.UndefOr[String] = js.undefined
  
  /**
    * Phone number of this directory site contact.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * Directory site contact role.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Title or designation of this directory site contact.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Directory site contact type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaDirectorySiteContact {
  
  inline def apply(): SchemaDirectorySiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContact]
  }
  
  extension [Self <: SchemaDirectorySiteContact](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
