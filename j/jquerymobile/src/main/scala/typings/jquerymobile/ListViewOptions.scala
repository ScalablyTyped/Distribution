package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewOptions extends StObject {
  
  var autodividers: js.UndefOr[Boolean] = js.undefined
  
  var autodividersSelector: js.UndefOr[js.Function1[/* jq */ js.UndefOr[JQuery], String]] = js.undefined
  
  var countTheme: js.UndefOr[String] = js.undefined
  
  var defaults: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var dividerTheme: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[Boolean] = js.undefined
  
  var filterCallback: js.UndefOr[js.Function] = js.undefined
  
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  
  var filterTheme: js.UndefOr[String] = js.undefined
  
  var headerTheme: js.UndefOr[String] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var inset: js.UndefOr[Boolean] = js.undefined
  
  var splitIcon: js.UndefOr[String] = js.undefined
  
  var splitTheme: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object ListViewOptions {
  
  @scala.inline
  def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  
  @scala.inline
  implicit class ListViewOptionsMutableBuilder[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutodividers(value: Boolean): Self = StObject.set(x, "autodividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutodividersSelector(value: /* jq */ js.UndefOr[JQuery] => String): Self = StObject.set(x, "autodividersSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutodividersSelectorUndefined: Self = StObject.set(x, "autodividersSelector", js.undefined)
    
    @scala.inline
    def setAutodividersUndefined: Self = StObject.set(x, "autodividers", js.undefined)
    
    @scala.inline
    def setCountTheme(value: String): Self = StObject.set(x, "countTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountThemeUndefined: Self = StObject.set(x, "countTheme", js.undefined)
    
    @scala.inline
    def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDividerTheme(value: String): Self = StObject.set(x, "dividerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerThemeUndefined: Self = StObject.set(x, "dividerTheme", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCallback(value: js.Function): Self = StObject.set(x, "filterCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCallbackUndefined: Self = StObject.set(x, "filterCallback", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
    
    @scala.inline
    def setFilterTheme(value: String): Self = StObject.set(x, "filterTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterThemeUndefined: Self = StObject.set(x, "filterTheme", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHeaderTheme(value: String): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setSplitIcon(value: String): Self = StObject.set(x, "splitIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitIconUndefined: Self = StObject.set(x, "splitIcon", js.undefined)
    
    @scala.inline
    def setSplitTheme(value: String): Self = StObject.set(x, "splitTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitThemeUndefined: Self = StObject.set(x, "splitTheme", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
