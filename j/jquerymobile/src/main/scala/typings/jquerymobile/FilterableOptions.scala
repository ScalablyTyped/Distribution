package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterableOptions extends StObject {
  
  var children: js.UndefOr[js.Any] = js.undefined
  
  var defaults: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var enhanced: js.UndefOr[Boolean] = js.undefined
  
  var filterCallback: js.UndefOr[js.Function2[/* index */ Double, /* searchValue */ js.UndefOr[String], Boolean]] = js.undefined
  
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  
  var filterReveal: js.UndefOr[Boolean] = js.undefined
  
  var filterTheme: js.UndefOr[String] = js.undefined
  
  var input: js.Any
}
object FilterableOptions {
  
  inline def apply(input: js.Any): FilterableOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterableOptions]
  }
  
  extension [Self <: FilterableOptions](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnhanced(value: Boolean): Self = StObject.set(x, "enhanced", value.asInstanceOf[js.Any])
    
    inline def setEnhancedUndefined: Self = StObject.set(x, "enhanced", js.undefined)
    
    inline def setFilterCallback(value: (/* index */ Double, /* searchValue */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "filterCallback", js.Any.fromFunction2(value))
    
    inline def setFilterCallbackUndefined: Self = StObject.set(x, "filterCallback", js.undefined)
    
    inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    inline def setFilterReveal(value: Boolean): Self = StObject.set(x, "filterReveal", value.asInstanceOf[js.Any])
    
    inline def setFilterRevealUndefined: Self = StObject.set(x, "filterReveal", js.undefined)
    
    inline def setFilterTheme(value: String): Self = StObject.set(x, "filterTheme", value.asInstanceOf[js.Any])
    
    inline def setFilterThemeUndefined: Self = StObject.set(x, "filterTheme", js.undefined)
    
    inline def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
