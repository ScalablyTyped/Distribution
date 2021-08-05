package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The intended behavior and status information of a domain.
  */
trait SchemaDomain extends StObject {
  
  /**
    * Required. The domain name of the association.
    */
  var domainName: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the domain should redirect with the provided parameters.
    */
  var domainRedirect: js.UndefOr[SchemaDomainRedirect] = js.undefined
  
  /**
    * Output only. Information about the provisioning of certificates and the
    * health of the DNS resolution for the domain.
    */
  var provisioning: js.UndefOr[SchemaDomainProvisioning] = js.undefined
  
  /**
    * Required. The site name of the association.
    */
  var site: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Additional status of the domain association.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time at which the domain was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaDomain {
  
  inline def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  
  extension [Self <: SchemaDomain](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainRedirect(value: SchemaDomainRedirect): Self = StObject.set(x, "domainRedirect", value.asInstanceOf[js.Any])
    
    inline def setDomainRedirectUndefined: Self = StObject.set(x, "domainRedirect", js.undefined)
    
    inline def setProvisioning(value: SchemaDomainProvisioning): Self = StObject.set(x, "provisioning", value.asInstanceOf[js.Any])
    
    inline def setProvisioningUndefined: Self = StObject.set(x, "provisioning", js.undefined)
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
