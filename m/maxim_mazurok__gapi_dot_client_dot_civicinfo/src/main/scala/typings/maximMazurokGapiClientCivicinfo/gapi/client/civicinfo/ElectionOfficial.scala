package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElectionOfficial extends StObject {
  
  /** The email address of the election official. */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** The fax number of the election official. */
  var faxNumber: js.UndefOr[String] = js.undefined
  
  /** The full name of the election official. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The office phone number of the election official. */
  var officePhoneNumber: js.UndefOr[String] = js.undefined
  
  /** The title of the election official. */
  var title: js.UndefOr[String] = js.undefined
}
object ElectionOfficial {
  
  inline def apply(): ElectionOfficial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectionOfficial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElectionOfficial] (val x: Self) extends AnyVal {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFaxNumber(value: String): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    inline def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOfficePhoneNumber(value: String): Self = StObject.set(x, "officePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setOfficePhoneNumberUndefined: Self = StObject.set(x, "officePhoneNumber", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
