package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsDefaultsupportedidpconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The id of the Idp to create a config for. Call ListDefaultSupportedIdps for list of all default supported Idps.
    */
  var idpId: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name where the config to be created, for example: "projects/my-awesome-project"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig] = js.undefined
}
object ParamsResourceProjectsTenantsDefaultsupportedidpconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsTenantsDefaultsupportedidpconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsDefaultsupportedidpconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsDefaultsupportedidpconfigsCreate](x: Self) {
    
    inline def setIdpId(value: String): Self = StObject.set(x, "idpId", value.asInstanceOf[js.Any])
    
    inline def setIdpIdUndefined: Self = StObject.set(x, "idpId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdpConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
