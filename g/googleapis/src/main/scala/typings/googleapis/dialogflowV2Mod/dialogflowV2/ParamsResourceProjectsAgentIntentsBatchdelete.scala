package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentIntentsBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the agent to delete all entities types for. Format: `projects//agent`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest] = js.undefined
}
object ParamsResourceProjectsAgentIntentsBatchdelete {
  
  inline def apply(): ParamsResourceProjectsAgentIntentsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentIntentsBatchdelete]
  }
  
  extension [Self <: ParamsResourceProjectsAgentIntentsBatchdelete](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
