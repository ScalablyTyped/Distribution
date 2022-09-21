package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1Suggestions extends StObject {
  
  /** A list of suggestions used for autocomplete recommendations. */
  var items: js.UndefOr[js.Array[GoogleAppsCardV1SuggestionItem]] = js.undefined
}
object GoogleAppsCardV1Suggestions {
  
  inline def apply(): GoogleAppsCardV1Suggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1Suggestions]
  }
  
  extension [Self <: GoogleAppsCardV1Suggestions](x: Self) {
    
    inline def setItems(value: js.Array[GoogleAppsCardV1SuggestionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleAppsCardV1SuggestionItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
