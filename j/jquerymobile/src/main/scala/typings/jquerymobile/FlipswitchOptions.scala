package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlipswitchOptions extends StObject {
  
  var corners: js.UndefOr[Boolean] = js.undefined
  
  var defaults: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var enhanced: js.UndefOr[Boolean] = js.undefined
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var offText: js.UndefOr[String] = js.undefined
  
  var onText: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var wrapperClass: js.UndefOr[String] = js.undefined
}
object FlipswitchOptions {
  
  @scala.inline
  def apply(): FlipswitchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipswitchOptions]
  }
  
  @scala.inline
  implicit class FlipswitchOptionsMutableBuilder[Self <: FlipswitchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
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
    def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    @scala.inline
    def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
    
    @scala.inline
    def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
  }
}
