package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedAssistantAnnotationData extends StObject {
  
  /** The suggestion to render in the card. */
  var suggestion: js.UndefOr[AppsDynamiteSharedAssistantSuggestion] = js.undefined
  
  /**
    * Set when the initial query was unfulfillable. Only an on-demand unfulfillable query will result in a response (not a proactive query). 1. On-demand: user explicitly invokes the bot
    * 2. Proactive: bot makes proactive suggestion (when available) by listening to all user messages.
    */
  var unfulfillable: js.UndefOr[Any] = js.undefined
}
object AppsDynamiteSharedAssistantAnnotationData {
  
  inline def apply(): AppsDynamiteSharedAssistantAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedAssistantAnnotationData]
  }
  
  extension [Self <: AppsDynamiteSharedAssistantAnnotationData](x: Self) {
    
    inline def setSuggestion(value: AppsDynamiteSharedAssistantSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    
    inline def setUnfulfillable(value: Any): Self = StObject.set(x, "unfulfillable", value.asInstanceOf[js.Any])
    
    inline def setUnfulfillableUndefined: Self = StObject.set(x, "unfulfillable", js.undefined)
  }
}
