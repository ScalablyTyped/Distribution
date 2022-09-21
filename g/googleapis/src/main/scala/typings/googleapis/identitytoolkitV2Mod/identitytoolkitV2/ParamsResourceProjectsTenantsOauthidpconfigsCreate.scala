package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsOauthidpconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The id to use for this config.
    */
  var oauthIdpConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name where the config to be created, for example: "projects/my-awesome-project"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig] = js.undefined
}
object ParamsResourceProjectsTenantsOauthidpconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsTenantsOauthidpconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsOauthidpconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsOauthidpconfigsCreate](x: Self) {
    
    inline def setOauthIdpConfigId(value: String): Self = StObject.set(x, "oauthIdpConfigId", value.asInstanceOf[js.Any])
    
    inline def setOauthIdpConfigIdUndefined: Self = StObject.set(x, "oauthIdpConfigId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitAdminV2OAuthIdpConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
