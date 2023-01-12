package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedSuggestionsSuggestionItem extends StObject {
  
  var text: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedSuggestionsSuggestionItem {
  
  inline def apply(): AppsDynamiteSharedSuggestionsSuggestionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedSuggestionsSuggestionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedSuggestionsSuggestionItem] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
