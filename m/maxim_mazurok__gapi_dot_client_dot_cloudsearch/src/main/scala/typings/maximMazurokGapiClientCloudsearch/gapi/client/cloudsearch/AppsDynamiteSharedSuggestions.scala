package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedSuggestions extends StObject {
  
  /** A list of suggestions items which will be used in are used in autocomplete. */
  var items: js.UndefOr[js.Array[AppsDynamiteSharedSuggestionsSuggestionItem]] = js.undefined
}
object AppsDynamiteSharedSuggestions {
  
  inline def apply(): AppsDynamiteSharedSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedSuggestions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedSuggestions] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[AppsDynamiteSharedSuggestionsSuggestionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AppsDynamiteSharedSuggestionsSuggestionItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
