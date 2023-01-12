package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2HumanAgentAssistantEvent extends StObject {
  
  /** The conversation this notification refers to. Format: `projects//conversations/`. */
  var conversation: js.UndefOr[String] = js.undefined
  
  /** The participant that the suggestion is compiled for. Format: `projects//conversations//participants/`. It will not be set in legacy workflow. */
  var participant: js.UndefOr[String] = js.undefined
  
  /** The suggestion results payload that this notification refers to. */
  var suggestionResults: js.UndefOr[js.Array[GoogleCloudDialogflowV2SuggestionResult]] = js.undefined
}
object GoogleCloudDialogflowV2HumanAgentAssistantEvent {
  
  inline def apply(): GoogleCloudDialogflowV2HumanAgentAssistantEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2HumanAgentAssistantEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2HumanAgentAssistantEvent] (val x: Self) extends AnyVal {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setConversationUndefined: Self = StObject.set(x, "conversation", js.undefined)
    
    inline def setParticipant(value: String): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    inline def setSuggestionResults(value: js.Array[GoogleCloudDialogflowV2SuggestionResult]): Self = StObject.set(x, "suggestionResults", value.asInstanceOf[js.Any])
    
    inline def setSuggestionResultsUndefined: Self = StObject.set(x, "suggestionResults", js.undefined)
    
    inline def setSuggestionResultsVarargs(value: GoogleCloudDialogflowV2SuggestionResult*): Self = StObject.set(x, "suggestionResults", js.Array(value*))
  }
}
