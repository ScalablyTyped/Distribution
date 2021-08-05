package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleTextMarkerTemplateSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderThickness: js.UndefOr[Double] = js.undefined
  
  var font: js.UndefOr[js.Any] = js.undefined
  
  var getText: js.UndefOr[js.Any] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object SimpleTextMarkerTemplateSettings {
  
  inline def apply(): SimpleTextMarkerTemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleTextMarkerTemplateSettings]
  }
  
  extension [Self <: SimpleTextMarkerTemplateSettings](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
    
    inline def setBorderThicknessUndefined: Self = StObject.set(x, "borderThickness", js.undefined)
    
    inline def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setGetText(value: js.Any): Self = StObject.set(x, "getText", value.asInstanceOf[js.Any])
    
    inline def setGetTextUndefined: Self = StObject.set(x, "getText", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
