package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputOptions extends StObject {
  
  var clearBtn: js.UndefOr[Boolean] = js.undefined
  
  var clearBtnText: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var mini: js.UndefOr[Boolean] = js.undefined
  
  var preventFocusZoom: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
}
object TextInputOptions {
  
  inline def apply(): TextInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputOptions]
  }
  
  extension [Self <: TextInputOptions](x: Self) {
    
    inline def setClearBtn(value: Boolean): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
    
    inline def setClearBtnText(value: String): Self = StObject.set(x, "clearBtnText", value.asInstanceOf[js.Any])
    
    inline def setClearBtnTextUndefined: Self = StObject.set(x, "clearBtnText", js.undefined)
    
    inline def setClearBtnUndefined: Self = StObject.set(x, "clearBtn", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    inline def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    
    inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
    
    inline def setPreventFocusZoom(value: Boolean): Self = StObject.set(x, "preventFocusZoom", value.asInstanceOf[js.Any])
    
    inline def setPreventFocusZoomUndefined: Self = StObject.set(x, "preventFocusZoom", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
