package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorGradientOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ ColorGradientChangeEvent, Unit]] = js.undefined
  
  var contrastTool: js.UndefOr[Boolean | ColorGradientContrastTool] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var formats: js.UndefOr[Any] = js.undefined
  
  var messages: js.UndefOr[ColorGradientMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String | Color] = js.undefined
}
object ColorGradientOptions {
  
  inline def apply(): ColorGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorGradientOptions]
  }
  
  extension [Self <: ColorGradientOptions](x: Self) {
    
    inline def setChange(value: /* e */ ColorGradientChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setContrastTool(value: Boolean | ColorGradientContrastTool): Self = StObject.set(x, "contrastTool", value.asInstanceOf[js.Any])
    
    inline def setContrastToolUndefined: Self = StObject.set(x, "contrastTool", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormats(value: Any): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setMessages(value: ColorGradientMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setValue(value: String | Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
