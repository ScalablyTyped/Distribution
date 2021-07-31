package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsDomainmappingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `parent`. Name of the parent Application resource. Example:
    * apps/myapp.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Whether a managed certificate should be provided by App Engine. If true,
    * a certificate ID must be manaually set in the DomainMapping resource to
    * configure SSL for this domain. If false, a managed certificate will be
    * provisioned and a certificate ID will be automatically populated.
    */
  var noManagedCertificate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the domain creation should override any existing mappings for
    * this domain. By default, overrides are rejected.
    */
  var overrideStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDomainMapping] = js.undefined
}
object ParamsResourceAppsDomainmappingsCreate {
  
  @scala.inline
  def apply(): ParamsResourceAppsDomainmappingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsDomainmappingsCreateMutableBuilder[Self <: ParamsResourceAppsDomainmappingsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setNoManagedCertificate(value: Boolean): Self = StObject.set(x, "noManagedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoManagedCertificateUndefined: Self = StObject.set(x, "noManagedCertificate", js.undefined)
    
    @scala.inline
    def setOverrideStrategy(value: String): Self = StObject.set(x, "overrideStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideStrategyUndefined: Self = StObject.set(x, "overrideStrategy", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDomainMapping): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
