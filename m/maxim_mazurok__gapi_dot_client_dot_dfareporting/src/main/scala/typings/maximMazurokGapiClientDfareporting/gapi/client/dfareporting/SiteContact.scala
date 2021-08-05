package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteContact extends StObject {
  
  /** Address of this site contact. */
  var address: js.UndefOr[String] = js.undefined
  
  /** Site contact type. */
  var contactType: js.UndefOr[String] = js.undefined
  
  /** Email address of this site contact. This is a required field. */
  var email: js.UndefOr[String] = js.undefined
  
  /** First name of this site contact. */
  var firstName: js.UndefOr[String] = js.undefined
  
  /** ID of this site contact. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Last name of this site contact. */
  var lastName: js.UndefOr[String] = js.undefined
  
  /** Primary phone number of this site contact. */
  var phone: js.UndefOr[String] = js.undefined
  
  /** Title or designation of this site contact. */
  var title: js.UndefOr[String] = js.undefined
}
object SiteContact {
  
  inline def apply(): SiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteContact]
  }
  
  extension [Self <: SiteContact](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setContactType(value: String): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    inline def setContactTypeUndefined: Self = StObject.set(x, "contactType", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
