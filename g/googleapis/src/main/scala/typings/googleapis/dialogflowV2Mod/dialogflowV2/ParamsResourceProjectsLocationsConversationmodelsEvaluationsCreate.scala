package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationmodelsEvaluationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation model resource name. Format: `projects//locations//conversationModels/`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConversationmodelsEvaluationsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationmodelsEvaluationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationmodelsEvaluationsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationmodelsEvaluationsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2CreateConversationModelEvaluationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
