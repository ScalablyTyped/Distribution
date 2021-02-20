package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOptions extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String | js.Array[Double]] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var rotationOrigin: js.UndefOr[js.Array[Double]] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var strikeOut: js.UndefOr[Boolean] = js.native
  
  var textBox: js.UndefOr[TextBox] = js.native
  
  var underline: js.UndefOr[Boolean] = js.native
}
object TextOptions {
  
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOrigin(value: js.Array[Double]): Self = StObject.set(x, "rotationOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOriginUndefined: Self = StObject.set(x, "rotationOrigin", js.undefined)
    
    @scala.inline
    def setRotationOriginVarargs(value: Double*): Self = StObject.set(x, "rotationOrigin", js.Array(value :_*))
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStrikeOut(value: Boolean): Self = StObject.set(x, "strikeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeOutUndefined: Self = StObject.set(x, "strikeOut", js.undefined)
    
    @scala.inline
    def setTextBox(value: TextBox): Self = StObject.set(x, "textBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBoxUndefined: Self = StObject.set(x, "textBox", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
