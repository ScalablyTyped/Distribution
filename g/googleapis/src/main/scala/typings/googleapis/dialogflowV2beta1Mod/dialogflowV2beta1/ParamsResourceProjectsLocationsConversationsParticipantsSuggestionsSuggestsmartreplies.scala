package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the participant to fetch suggestion for. Format: `projects//locations//conversations//participants/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationsParticipantsSuggestionsSuggestsmartreplies](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
