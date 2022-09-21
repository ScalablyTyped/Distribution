package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DeployFlowResponse extends StObject {
  
  /** The name of the flow version Deployment. Format: `projects//locations//agents// environments//deployments/`. */
  var deployment: js.UndefOr[String] = js.undefined
  
  /** The updated environment where the flow is deployed. */
  var environment: js.UndefOr[GoogleCloudDialogflowCxV3Environment] = js.undefined
}
object GoogleCloudDialogflowCxV3DeployFlowResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3DeployFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DeployFlowResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3DeployFlowResponse](x: Self) {
    
    inline def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setEnvironment(value: GoogleCloudDialogflowCxV3Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
