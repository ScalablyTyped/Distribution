package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCardClickSuggestion extends StObject {
  
  /** Identify the button/action that created the suggestion. A simple example would be a card button within the stream, or the id which can identify a specific suggestion. */
  var actionId: js.UndefOr[String] = js.undefined
  
  /** The message_id for the message that was posted by the app/bot. */
  var suggestionMessageId: js.UndefOr[AppsDynamiteMessageId] = js.undefined
}
object AppsDynamiteSharedCardClickSuggestion {
  
  inline def apply(): AppsDynamiteSharedCardClickSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCardClickSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedCardClickSuggestion] (val x: Self) extends AnyVal {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setSuggestionMessageId(value: AppsDynamiteMessageId): Self = StObject.set(x, "suggestionMessageId", value.asInstanceOf[js.Any])
    
    inline def setSuggestionMessageIdUndefined: Self = StObject.set(x, "suggestionMessageId", js.undefined)
  }
}
