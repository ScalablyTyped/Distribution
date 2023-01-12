package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1HumanAgentAssistantEvent extends StObject {
  
  /** The conversation this notification refers to. Format: `projects//conversations/`. */
  var conversation: js.UndefOr[String] = js.undefined
  
  /**
    * The participant that the suggestion is compiled for. And This field is used to call Participants.ListSuggestions API. Format: `projects//conversations//participants/`. It will not
    * be set in legacy workflow. HumanAgentAssistantConfig.name for more information.
    */
  var participant: js.UndefOr[String] = js.undefined
  
  /** The suggestion results payload that this notification refers to. It will only be set when HumanAgentAssistantConfig.SuggestionConfig.group_suggestion_responses sets to true. */
  var suggestionResults: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1SuggestionResult]] = js.undefined
}
object GoogleCloudDialogflowV2beta1HumanAgentAssistantEvent {
  
  inline def apply(): GoogleCloudDialogflowV2beta1HumanAgentAssistantEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1HumanAgentAssistantEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1HumanAgentAssistantEvent] (val x: Self) extends AnyVal {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setSuggestionResults(value: js.Array[GoogleCloudDialogflowV2beta1SuggestionResult]): Self = StObject.set(x, "suggestionResults", value.asInstanceOf[js.Any])
    
    inline def setSuggestionResultsUndefined: Self = StObject.set(x, "suggestionResults", js.undefined)
    
    inline def setSuggestionResultsVarargs(value: GoogleCloudDialogflowV2beta1SuggestionResult*): Self = StObject.set(x, "suggestionResults", js.Array(value*))
  }
}
