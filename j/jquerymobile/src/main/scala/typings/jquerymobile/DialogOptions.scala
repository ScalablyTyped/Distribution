package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogOptions extends StObject {
  
  var closeBtn: js.UndefOr[String] = js.undefined
  
  var closeBtnText: js.UndefOr[String] = js.undefined
  
  var corners: js.UndefOr[Boolean] = js.undefined
  
  var initSelector: js.UndefOr[String] = js.undefined
  
  var overlayTheme: js.UndefOr[String] = js.undefined
}
object DialogOptions {
  
  inline def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
    
    inline def setCloseBtn(value: String): Self = StObject.set(x, "closeBtn", value.asInstanceOf[js.Any])
    
    inline def setCloseBtnText(value: String): Self = StObject.set(x, "closeBtnText", value.asInstanceOf[js.Any])
    
    inline def setCloseBtnTextUndefined: Self = StObject.set(x, "closeBtnText", js.undefined)
    
    inline def setCloseBtnUndefined: Self = StObject.set(x, "closeBtn", js.undefined)
    
    inline def setCorners(value: Boolean): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
    
    inline def setInitSelector(value: String): Self = StObject.set(x, "initSelector", value.asInstanceOf[js.Any])
    
    inline def setInitSelectorUndefined: Self = StObject.set(x, "initSelector", js.undefined)
    
    inline def setOverlayTheme(value: String): Self = StObject.set(x, "overlayTheme", value.asInstanceOf[js.Any])
    
    inline def setOverlayThemeUndefined: Self = StObject.set(x, "overlayTheme", js.undefined)
  }
}
