package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAppsDomainmappingsPatch extends StandardParameters {
  
  /**
    * Part of `name`. Name of the resource to update. Example:
    * apps/myapp/domainMappings/example.com.
    */
  var appsId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var domainMappingsId: js.UndefOr[String] = js.native
  
  /**
    * Whether a managed certificate should be provided by App Engine. If true,
    * a certificate ID must be manually set in the DomainMapping resource to
    * configure SSL for this domain. If false, a managed certificate will be
    * provisioned and a certificate ID will be automatically populated. Only
    * applicable if ssl_settings.certificate_id is specified in the update
    * mask.
    */
  var noManagedCertificate: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDomainMapping] = js.native
  
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceAppsDomainmappingsPatch {
  
  @scala.inline
  def apply(): ParamsResourceAppsDomainmappingsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsDomainmappingsPatchMutableBuilder[Self <: ParamsResourceAppsDomainmappingsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDomainMappingsId(value: String): Self = StObject.set(x, "domainMappingsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMappingsIdUndefined: Self = StObject.set(x, "domainMappingsId", js.undefined)
    
    @scala.inline
    def setNoManagedCertificate(value: Boolean): Self = StObject.set(x, "noManagedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoManagedCertificateUndefined: Self = StObject.set(x, "noManagedCertificate", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDomainMapping): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
