package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedFindDocumentSuggestion extends StObject {
  
  /** List of documents to render as suggestions. */
  var documentSuggestions: js.UndefOr[js.Array[AppsDynamiteSharedDocument]] = js.undefined
  
  /** Whether to show the action buttons in the card for the suggestions. */
  var showActionButtons: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteSharedFindDocumentSuggestion {
  
  inline def apply(): AppsDynamiteSharedFindDocumentSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedFindDocumentSuggestion]
  }
  
  extension [Self <: AppsDynamiteSharedFindDocumentSuggestion](x: Self) {
    
    inline def setDocumentSuggestions(value: js.Array[AppsDynamiteSharedDocument]): Self = StObject.set(x, "documentSuggestions", value.asInstanceOf[js.Any])
    
    inline def setDocumentSuggestionsUndefined: Self = StObject.set(x, "documentSuggestions", js.undefined)
    
    inline def setDocumentSuggestionsVarargs(value: AppsDynamiteSharedDocument*): Self = StObject.set(x, "documentSuggestions", js.Array(value*))
    
    inline def setShowActionButtons(value: Boolean): Self = StObject.set(x, "showActionButtons", value.asInstanceOf[js.Any])
    
    inline def setShowActionButtonsUndefined: Self = StObject.set(x, "showActionButtons", js.undefined)
  }
}
