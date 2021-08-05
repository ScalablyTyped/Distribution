package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatColorPickerOptions extends StObject {
  
  var autoupdate: js.UndefOr[Boolean] = js.undefined
  
  var buttons: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ FlatColorPickerChangeEvent, Unit]] = js.undefined
  
  var messages: js.UndefOr[FlatColorPickerMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Boolean] = js.undefined
  
  var preview: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object FlatColorPickerOptions {
  
  inline def apply(): FlatColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatColorPickerOptions]
  }
  
  extension [Self <: FlatColorPickerOptions](x: Self) {
    
    inline def setAutoupdate(value: Boolean): Self = StObject.set(x, "autoupdate", value.asInstanceOf[js.Any])
    
    inline def setAutoupdateUndefined: Self = StObject.set(x, "autoupdate", js.undefined)
    
    inline def setButtons(value: Boolean): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setChange(value: /* e */ FlatColorPickerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setMessages(value: FlatColorPickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
