package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegisterDomainRequest extends StObject {
  
  /**
    * The list of contact notices that the caller acknowledges. The notices needed here depend on the values specified in `registration.contact_settings`.
    */
  var contactNotices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The list of domain notices that you acknowledge. Call `RetrieveRegisterParameters` to see the notices that need acknowledgement.
    */
  var domainNotices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The complete `Registration` resource to be created.
    */
  var registration: js.UndefOr[SchemaRegistration] = js.undefined
  
  /**
    * When true, only validation is performed, without actually registering the domain. Follows: https://cloud.google.com/apis/design/design_patterns#request_validation
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Yearly price to register or renew the domain. The value that should be put here can be obtained from RetrieveRegisterParameters or SearchDomains calls.
    */
  var yearlyPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaRegisterDomainRequest {
  
  inline def apply(): SchemaRegisterDomainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegisterDomainRequest]
  }
  
  extension [Self <: SchemaRegisterDomainRequest](x: Self) {
    
    inline def setContactNotices(value: js.Array[String]): Self = StObject.set(x, "contactNotices", value.asInstanceOf[js.Any])
    
    inline def setContactNoticesNull: Self = StObject.set(x, "contactNotices", null)
    
    inline def setContactNoticesUndefined: Self = StObject.set(x, "contactNotices", js.undefined)
    
    inline def setContactNoticesVarargs(value: String*): Self = StObject.set(x, "contactNotices", js.Array(value*))
    
    inline def setDomainNotices(value: js.Array[String]): Self = StObject.set(x, "domainNotices", value.asInstanceOf[js.Any])
    
    inline def setDomainNoticesNull: Self = StObject.set(x, "domainNotices", null)
    
    inline def setDomainNoticesUndefined: Self = StObject.set(x, "domainNotices", js.undefined)
    
    inline def setDomainNoticesVarargs(value: String*): Self = StObject.set(x, "domainNotices", js.Array(value*))
    
    inline def setRegistration(value: SchemaRegistration): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    
    inline def setYearlyPrice(value: SchemaMoney): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
