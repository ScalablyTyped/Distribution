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
  
  @scala.inline
  def apply(input: js.Any): FilterableOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterableOptions]
  }
  
  @scala.inline
  implicit class FilterableOptionsMutableBuilder[Self <: FilterableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEnhanced(value: Boolean): Self = StObject.set(x, "enhanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedUndefined: Self = StObject.set(x, "enhanced", js.undefined)
    
    @scala.inline
    def setFilterCallback(value: (/* index */ Double, /* searchValue */ js.UndefOr[String]) => Boolean): Self = StObject.set(x, "filterCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterCallbackUndefined: Self = StObject.set(x, "filterCallback", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    @scala.inline
    def setFilterReveal(value: Boolean): Self = StObject.set(x, "filterReveal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRevealUndefined: Self = StObject.set(x, "filterReveal", js.undefined)
    
    @scala.inline
    def setFilterTheme(value: String): Self = StObject.set(x, "filterTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterThemeUndefined: Self = StObject.set(x, "filterTheme", js.undefined)
    
    @scala.inline
    def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
