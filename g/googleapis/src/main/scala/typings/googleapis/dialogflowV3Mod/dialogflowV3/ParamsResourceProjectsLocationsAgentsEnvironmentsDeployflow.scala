package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsDeployflow
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The environment to deploy the flow to. Format: `projects//locations//agents// environments/`.
    */
  var environment: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3DeployFlowRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsDeployflow {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsDeployflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsDeployflow]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsDeployflow](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3DeployFlowRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
