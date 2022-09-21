package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1SuggestionItem extends StObject {
  
  /** The suggested autocomplete result. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1SuggestionItem {
  
  inline def apply(): GoogleAppsCardV1SuggestionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1SuggestionItem]
  }
  
  extension [Self <: GoogleAppsCardV1SuggestionItem](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
