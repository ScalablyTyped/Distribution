package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.both
import typings.kendoUi.kendoUiStrings.default
import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconOptions extends StObject {
  
  var flip: js.UndefOr[default | both | vertical | horizontal] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var themeColor: js.UndefOr[String] = js.undefined
}
object IconOptions {
  
  inline def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
    
    inline def setFlip(value: default | both | vertical | horizontal): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
