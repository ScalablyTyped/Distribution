package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOptions extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var highlight: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var strikeOut: js.UndefOr[Boolean] = js.undefined
  
  var textBox: js.UndefOr[TextBox] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
}
object TextOptions {
  
  inline def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  extension [Self <: TextOptions](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationOrigin(value: js.Array[Double]): Self = StObject.set(x, "rotationOrigin", value.asInstanceOf[js.Any])
    
    inline def setRotationOriginUndefined: Self = StObject.set(x, "rotationOrigin", js.undefined)
    
    inline def setRotationOriginVarargs(value: Double*): Self = StObject.set(x, "rotationOrigin", js.Array(value*))
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrikeOut(value: Boolean): Self = StObject.set(x, "strikeOut", value.asInstanceOf[js.Any])
    
    inline def setStrikeOutUndefined: Self = StObject.set(x, "strikeOut", js.undefined)
    
    inline def setTextBox(value: TextBox): Self = StObject.set(x, "textBox", value.asInstanceOf[js.Any])
    
    inline def setTextBoxUndefined: Self = StObject.set(x, "textBox", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
