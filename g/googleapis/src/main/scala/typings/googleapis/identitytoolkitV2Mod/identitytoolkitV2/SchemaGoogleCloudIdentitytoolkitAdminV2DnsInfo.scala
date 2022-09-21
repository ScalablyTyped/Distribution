package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo extends StObject {
  
  /**
    * Output only. The applied verified custom domain.
    */
  var customDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current verification state of the custom domain. The custom domain will only be used once the domain verification is successful.
    */
  var customDomainState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp of initial request for the current domain verification.
    */
  var domainVerificationRequestTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The custom domain that's to be verified.
    */
  var pendingCustomDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to use custom domain.
    */
  var useCustomDomain: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo](x: Self) {
    
    inline def setCustomDomain(value: String): Self = StObject.set(x, "customDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNull: Self = StObject.set(x, "customDomain", null)
    
    inline def setCustomDomainState(value: String): Self = StObject.set(x, "customDomainState", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainStateNull: Self = StObject.set(x, "customDomainState", null)
    
    inline def setCustomDomainStateUndefined: Self = StObject.set(x, "customDomainState", js.undefined)
    
    inline def setCustomDomainUndefined: Self = StObject.set(x, "customDomain", js.undefined)
    
    inline def setDomainVerificationRequestTime(value: String): Self = StObject.set(x, "domainVerificationRequestTime", value.asInstanceOf[js.Any])
    
    inline def setDomainVerificationRequestTimeNull: Self = StObject.set(x, "domainVerificationRequestTime", null)
    
    inline def setDomainVerificationRequestTimeUndefined: Self = StObject.set(x, "domainVerificationRequestTime", js.undefined)
    
    inline def setPendingCustomDomain(value: String): Self = StObject.set(x, "pendingCustomDomain", value.asInstanceOf[js.Any])
    
    inline def setPendingCustomDomainNull: Self = StObject.set(x, "pendingCustomDomain", null)
    
    inline def setPendingCustomDomainUndefined: Self = StObject.set(x, "pendingCustomDomain", js.undefined)
    
    inline def setUseCustomDomain(value: Boolean): Self = StObject.set(x, "useCustomDomain", value.asInstanceOf[js.Any])
    
    inline def setUseCustomDomainNull: Self = StObject.set(x, "useCustomDomain", null)
    
    inline def setUseCustomDomainUndefined: Self = StObject.set(x, "useCustomDomain", js.undefined)
  }
}
