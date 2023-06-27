package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSheetActionButton extends StObject {
  
  var click: js.UndefOr[js.Function] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
}
object ActionSheetActionButton {
  
  inline def apply(): ActionSheetActionButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSheetActionButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSheetActionButton] (val x: Self) extends AnyVal {
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
