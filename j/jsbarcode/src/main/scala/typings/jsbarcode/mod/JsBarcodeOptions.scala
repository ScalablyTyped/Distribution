package typings.jsbarcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsBarcodeOptions extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var displayValue: js.UndefOr[Boolean] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var fontOptions: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var format: String = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var lineColor: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var marginBottom: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginRight: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textAlign: js.UndefOr[String] = js.native
  
  var textMargin: js.UndefOr[Double] = js.native
  
  var textPosition: js.UndefOr[String] = js.native
  
  var valid: js.UndefOr[js.Function1[/* valid */ Boolean, Unit]] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object JsBarcodeOptions {
  
  @scala.inline
  def apply(format: String): JsBarcodeOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsBarcodeOptions]
  }
  
  @scala.inline
  implicit class JsBarcodeOptionsOps[Self <: JsBarcodeOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDisplayValue(value: Boolean): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontOptions(value: String): Self = this.set("fontOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontOptions: Self = this.set("fontOptions", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextMargin(value: Double): Self = this.set("textMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextMargin: Self = this.set("textMargin", js.undefined)
    
    @scala.inline
    def setTextPosition(value: String): Self = this.set("textPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPosition: Self = this.set("textPosition", js.undefined)
    
    @scala.inline
    def setValid(value: /* valid */ Boolean => Unit): Self = this.set("valid", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
