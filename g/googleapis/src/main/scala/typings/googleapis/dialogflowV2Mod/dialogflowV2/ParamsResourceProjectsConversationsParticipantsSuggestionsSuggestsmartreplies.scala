package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest] = js.undefined
}
object ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies {
  
  inline def apply(): ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies]
  }
  
  extension [Self <: ParamsResourceProjectsConversationsParticipantsSuggestionsSuggestsmartreplies](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2SuggestSmartRepliesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
