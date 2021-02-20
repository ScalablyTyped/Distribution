package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var align: js.UndefOr[String] = js.native
  
  var cornerRadius: js.UndefOr[Double] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[String] = js.native
  
  var text: String = js.native
  
  var textFill: js.UndefOr[js.Any] = js.native
  
  var textStroke: js.UndefOr[js.Any] = js.native
  
  var textStrokeWidth: js.UndefOr[Double] = js.native
}
object TextConfig {
  
  @scala.inline
  def apply(text: String): TextConfig = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConfig]
  }
  
  @scala.inline
  implicit class TextConfigMutableBuilder[Self <: TextConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFill(value: js.Any): Self = StObject.set(x, "textFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFillUndefined: Self = StObject.set(x, "textFill", js.undefined)
    
    @scala.inline
    def setTextStroke(value: js.Any): Self = StObject.set(x, "textStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStrokeUndefined: Self = StObject.set(x, "textStroke", js.undefined)
    
    @scala.inline
    def setTextStrokeWidth(value: Double): Self = StObject.set(x, "textStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStrokeWidthUndefined: Self = StObject.set(x, "textStrokeWidth", js.undefined)
  }
}
