package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInputOptions extends StObject {
  
  var clearSearchButtonText: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var initSelector: js.UndefOr[String] = js.native
  
  var mini: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[String] = js.native
}
object SearchInputOptions {
  
  @scala.inline
  def apply(): SearchInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchInputOptions]
  }
  
  @scala.inline
  implicit class SearchInputOptionsMutableBuilder[Self <: SearchInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearSearchButtonText(value: String): Self = StObject.set(x, "clearSearchButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSearchButtonTextUndefined: Self = StObject.set(x, "clearSearchButtonText", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    @scala.inline
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
