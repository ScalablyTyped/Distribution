package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEnvironmentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique id of the new environment.
    */
  var environmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The agent to create an environment for. Supported formats: - `projects//agent` - `projects//locations//agent`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Environment] = js.undefined
}
object ParamsResourceProjectsAgentEnvironmentsCreate {
  
  inline def apply(): ParamsResourceProjectsAgentEnvironmentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEnvironmentsCreate](x: Self) {
    
    inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1Environment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
