package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInboundsamlconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The id to use for this config.
    */
  var inboundSamlConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name where the config to be created, for example: "projects/my-awesome-project"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig] = js.undefined
}
object ParamsResourceProjectsInboundsamlconfigsCreate {
  
  inline def apply(): ParamsResourceProjectsInboundsamlconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInboundsamlconfigsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsInboundsamlconfigsCreate](x: Self) {
    
    inline def setInboundSamlConfigId(value: String): Self = StObject.set(x, "inboundSamlConfigId", value.asInstanceOf[js.Any])
    
    inline def setInboundSamlConfigIdUndefined: Self = StObject.set(x, "inboundSamlConfigId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudIdentitytoolkitAdminV2InboundSamlConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
