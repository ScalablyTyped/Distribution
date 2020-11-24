package typings.kineticjs.Kinetic

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
  implicit class TextConfigOps[Self <: TextConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setTextFill(value: js.Any): Self = this.set("textFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFill: Self = this.set("textFill", js.undefined)
    
    @scala.inline
    def setTextStroke(value: js.Any): Self = this.set("textStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStroke: Self = this.set("textStroke", js.undefined)
    
    @scala.inline
    def setTextStrokeWidth(value: Double): Self = this.set("textStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStrokeWidth: Self = this.set("textStrokeWidth", js.undefined)
  }
}
