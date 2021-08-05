package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var align: js.UndefOr[String] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var textFill: js.UndefOr[js.Any] = js.undefined
  
  var textStroke: js.UndefOr[js.Any] = js.undefined
  
  var textStrokeWidth: js.UndefOr[Double] = js.undefined
}
object TextConfig {
  
  inline def apply(text: String): TextConfig = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConfig]
  }
  
  extension [Self <: TextConfig](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextFill(value: js.Any): Self = StObject.set(x, "textFill", value.asInstanceOf[js.Any])
    
    inline def setTextFillUndefined: Self = StObject.set(x, "textFill", js.undefined)
    
    inline def setTextStroke(value: js.Any): Self = StObject.set(x, "textStroke", value.asInstanceOf[js.Any])
    
    inline def setTextStrokeUndefined: Self = StObject.set(x, "textStroke", js.undefined)
    
    inline def setTextStrokeWidth(value: Double): Self = StObject.set(x, "textStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setTextStrokeWidthUndefined: Self = StObject.set(x, "textStrokeWidth", js.undefined)
  }
}
