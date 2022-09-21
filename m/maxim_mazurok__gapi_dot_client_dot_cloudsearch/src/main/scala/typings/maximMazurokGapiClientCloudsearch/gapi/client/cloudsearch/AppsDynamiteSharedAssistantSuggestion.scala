package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAssistantSuggestion extends StObject {
  
  /** Info regarding suggestion debug information. */
  var debugContext: js.UndefOr[AppsDynamiteSharedAssistantDebugContext] = js.undefined
  
  /** Data for rendering feedback. */
  var feedbackContext: js.UndefOr[AppsDynamiteSharedAssistantFeedbackContext] = js.undefined
  
  /** Suggestion type that suggests documents (docs, slides, sheets). */
  var findDocumentSuggestion: js.UndefOr[AppsDynamiteSharedFindDocumentSuggestion] = js.undefined
  
  /** String representation of the suggestions provided. */
  var serializedSuggestions: js.UndefOr[String] = js.undefined
  
  /** Session context specific to the Assistant suggestion. */
  var sessionContext: js.UndefOr[AppsDynamiteSharedAssistantSessionContext] = js.undefined
}
object AppsDynamiteSharedAssistantSuggestion {
  
  inline def apply(): AppsDynamiteSharedAssistantSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAssistantSuggestion]
  }
  
  extension [Self <: AppsDynamiteSharedAssistantSuggestion](x: Self) {
    
    inline def setDebugContext(value: AppsDynamiteSharedAssistantDebugContext): Self = StObject.set(x, "debugContext", value.asInstanceOf[js.Any])
    
    inline def setDebugContextUndefined: Self = StObject.set(x, "debugContext", js.undefined)
    
    inline def setFeedbackContext(value: AppsDynamiteSharedAssistantFeedbackContext): Self = StObject.set(x, "feedbackContext", value.asInstanceOf[js.Any])
    
    inline def setFeedbackContextUndefined: Self = StObject.set(x, "feedbackContext", js.undefined)
    
    inline def setFindDocumentSuggestion(value: AppsDynamiteSharedFindDocumentSuggestion): Self = StObject.set(x, "findDocumentSuggestion", value.asInstanceOf[js.Any])
    
    inline def setFindDocumentSuggestionUndefined: Self = StObject.set(x, "findDocumentSuggestion", js.undefined)
    
    inline def setSerializedSuggestions(value: String): Self = StObject.set(x, "serializedSuggestions", value.asInstanceOf[js.Any])
    
    inline def setSerializedSuggestionsUndefined: Self = StObject.set(x, "serializedSuggestions", js.undefined)
    
    inline def setSessionContext(value: AppsDynamiteSharedAssistantSessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
    
    inline def setSessionContextUndefined: Self = StObject.set(x, "sessionContext", js.undefined)
  }
}
