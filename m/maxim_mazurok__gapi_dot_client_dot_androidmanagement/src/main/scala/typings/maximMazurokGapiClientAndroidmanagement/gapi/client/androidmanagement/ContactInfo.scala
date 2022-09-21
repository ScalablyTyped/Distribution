package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactInfo extends StObject {
  
  /** Email address for a point of contact, which will be used to send important announcements related to managed Google Play. */
  var contactEmail: js.UndefOr[String] = js.undefined
  
  /** The email of the data protection officer. The email is validated but not verified. */
  var dataProtectionOfficerEmail: js.UndefOr[String] = js.undefined
  
  /** The name of the data protection officer. */
  var dataProtectionOfficerName: js.UndefOr[String] = js.undefined
  
  /** The phone number of the data protection officer The phone number is validated but not verified. */
  var dataProtectionOfficerPhone: js.UndefOr[String] = js.undefined
  
  /** The email of the EU representative. The email is validated but not verified. */
  var euRepresentativeEmail: js.UndefOr[String] = js.undefined
  
  /** The name of the EU representative. */
  var euRepresentativeName: js.UndefOr[String] = js.undefined
  
  /** The phone number of the EU representative. The phone number is validated but not verified. */
  var euRepresentativePhone: js.UndefOr[String] = js.undefined
}
object ContactInfo {
  
  inline def apply(): ContactInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactInfo]
  }
  
  extension [Self <: ContactInfo](x: Self) {
    
    inline def setContactEmail(value: String): Self = StObject.set(x, "contactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "contactEmail", js.undefined)
    
    inline def setDataProtectionOfficerEmail(value: String): Self = StObject.set(x, "dataProtectionOfficerEmail", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionOfficerEmailUndefined: Self = StObject.set(x, "dataProtectionOfficerEmail", js.undefined)
    
    inline def setDataProtectionOfficerName(value: String): Self = StObject.set(x, "dataProtectionOfficerName", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionOfficerNameUndefined: Self = StObject.set(x, "dataProtectionOfficerName", js.undefined)
    
    inline def setDataProtectionOfficerPhone(value: String): Self = StObject.set(x, "dataProtectionOfficerPhone", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionOfficerPhoneUndefined: Self = StObject.set(x, "dataProtectionOfficerPhone", js.undefined)
    
    inline def setEuRepresentativeEmail(value: String): Self = StObject.set(x, "euRepresentativeEmail", value.asInstanceOf[js.Any])
    
    inline def setEuRepresentativeEmailUndefined: Self = StObject.set(x, "euRepresentativeEmail", js.undefined)
    
    inline def setEuRepresentativeName(value: String): Self = StObject.set(x, "euRepresentativeName", value.asInstanceOf[js.Any])
    
    inline def setEuRepresentativeNameUndefined: Self = StObject.set(x, "euRepresentativeName", js.undefined)
    
    inline def setEuRepresentativePhone(value: String): Self = StObject.set(x, "euRepresentativePhone", value.asInstanceOf[js.Any])
    
    inline def setEuRepresentativePhoneUndefined: Self = StObject.set(x, "euRepresentativePhone", js.undefined)
  }
}
