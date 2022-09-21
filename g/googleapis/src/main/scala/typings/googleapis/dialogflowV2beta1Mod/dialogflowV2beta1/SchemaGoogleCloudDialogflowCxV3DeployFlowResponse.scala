package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3DeployFlowResponse extends StObject {
  
  /**
    * The name of the flow version Deployment. Format: `projects//locations//agents// environments//deployments/`.
    */
  var deployment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The updated environment where the flow is deployed.
    */
  var environment: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Environment] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3DeployFlowResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3DeployFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3DeployFlowResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3DeployFlowResponse](x: Self) {
    
    inline def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNull: Self = StObject.set(x, "deployment", null)
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setEnvironment(value: SchemaGoogleCloudDialogflowCxV3Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
