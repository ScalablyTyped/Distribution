package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteUIParams extends StObject {
  
  var content: js.UndefOr[Any] = js.undefined
  
  /**
    * The item selected from the menu, if any. Otherwise the property is null
    */
  var item: js.UndefOr[Any] = js.undefined
}
object AutocompleteUIParams {
  
  inline def apply(): AutocompleteUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteUIParams]
  }
  
  extension [Self <: AutocompleteUIParams](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
