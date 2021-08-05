package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterSelect extends StObject {
  
  var enterSelect: js.UndefOr[String] = js.undefined
  
  var suggestionIsOpen: js.UndefOr[String] = js.undefined
  
  var suggestionsCount: js.UndefOr[String] = js.undefined
  
  var suggestionsExist: js.UndefOr[String] = js.undefined
}
object EnterSelect {
  
  inline def apply(): EnterSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterSelect]
  }
  
  extension [Self <: EnterSelect](x: Self) {
    
    inline def setEnterSelect(value: String): Self = StObject.set(x, "enterSelect", value.asInstanceOf[js.Any])
    
    inline def setEnterSelectUndefined: Self = StObject.set(x, "enterSelect", js.undefined)
    
    inline def setSuggestionIsOpen(value: String): Self = StObject.set(x, "suggestionIsOpen", value.asInstanceOf[js.Any])
    
    inline def setSuggestionIsOpenUndefined: Self = StObject.set(x, "suggestionIsOpen", js.undefined)
    
    inline def setSuggestionsCount(value: String): Self = StObject.set(x, "suggestionsCount", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsCountUndefined: Self = StObject.set(x, "suggestionsCount", js.undefined)
    
    inline def setSuggestionsExist(value: String): Self = StObject.set(x, "suggestionsExist", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsExistUndefined: Self = StObject.set(x, "suggestionsExist", js.undefined)
  }
}
