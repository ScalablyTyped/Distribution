package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderOptions extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var highlight: js.UndefOr[Boolean] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var trackTheme: js.UndefOr[String] = js.undefined
}
object SliderOptions {
  
  inline def apply(): SliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderOptions]
  }
  
  extension [Self <: SliderOptions](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    inline def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTrackTheme(value: String): Self = StObject.set(x, "trackTheme", value.asInstanceOf[js.Any])
    
    inline def setTrackThemeUndefined: Self = StObject.set(x, "trackTheme", js.undefined)
  }
}
