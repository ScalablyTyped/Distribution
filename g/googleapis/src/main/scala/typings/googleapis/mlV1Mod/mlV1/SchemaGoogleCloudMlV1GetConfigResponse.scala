package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1GetConfigResponse extends StObject {
  
  var config: js.UndefOr[SchemaGoogleCloudMlV1Config] = js.undefined
  
  /**
    * The service account Cloud ML uses to access resources in the project.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project number for `service_account`.
    */
  var serviceAccountProject: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1GetConfigResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1GetConfigResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1GetConfigResponse](x: Self) {
    
    inline def setConfig(value: SchemaGoogleCloudMlV1Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountProject(value: String): Self = StObject.set(x, "serviceAccountProject", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountProjectNull: Self = StObject.set(x, "serviceAccountProject", null)
    
    inline def setServiceAccountProjectUndefined: Self = StObject.set(x, "serviceAccountProject", js.undefined)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
