package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantEvent extends StObject {
  
  /**
    * The conversation this notification refers to. Format: `projects//conversations/`.
    */
  var conversation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The participant that the suggestion is compiled for. And This field is used to call Participants.ListSuggestions API. Format: `projects//conversations//participants/`. It will not be set in legacy workflow. HumanAgentAssistantConfig.name for more information.
    */
  var participant: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The suggestion results payload that this notification refers to. It will only be set when HumanAgentAssistantConfig.SuggestionConfig.group_suggestion_responses sets to true.
    */
  var suggestionResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantEvent {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantEvent]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1HumanAgentAssistantEvent](x: Self) {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationNull: Self = StObject.set(x, "conversation", null)
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantNull: Self = StObject.set(x, "participant", null)
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setSuggestionResults(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]): Self = StObject.set(x, "suggestionResults", value.asInstanceOf[js.Any])
    
    inline def setSuggestionResultsUndefined: Self = StObject.set(x, "suggestionResults", js.undefined)
    
    inline def setSuggestionResultsVarargs(value: SchemaGoogleCloudDialogflowV2beta1SuggestionResult*): Self = StObject.set(x, "suggestionResults", js.Array(value*))
  }
}
