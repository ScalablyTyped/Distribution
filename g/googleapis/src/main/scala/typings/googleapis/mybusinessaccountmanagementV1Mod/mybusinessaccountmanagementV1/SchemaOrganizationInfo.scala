package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrganizationInfo extends StObject {
  
  /**
    * Output only. The postal address for the account.
    */
  var address: js.UndefOr[SchemaPostalAddress] = js.undefined
  
  /**
    * Output only. The contact number for the organization.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The registered domain for the account.
    */
  var registeredDomain: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrganizationInfo {
  
  inline def apply(): SchemaOrganizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganizationInfo]
  }
  
  extension [Self <: SchemaOrganizationInfo](x: Self) {
    
    inline def setAddress(value: SchemaPostalAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setRegisteredDomain(value: String): Self = StObject.set(x, "registeredDomain", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDomainNull: Self = StObject.set(x, "registeredDomain", null)
    
    inline def setRegisteredDomainUndefined: Self = StObject.set(x, "registeredDomain", js.undefined)
  }
}
