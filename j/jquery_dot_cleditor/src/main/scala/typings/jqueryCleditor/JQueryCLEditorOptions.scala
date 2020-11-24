package typings.jqueryCleditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCLEditorOptions extends js.Object {
  
  var bodyStyle: js.UndefOr[String] = js.native
  
  var colors: js.UndefOr[String] = js.native
  
  var controls: js.UndefOr[String] = js.native
  
  var docCSSFile: js.UndefOr[String] = js.native
  
  var docType: js.UndefOr[String] = js.native
  
  var fonts: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var useCSS: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object JQueryCLEditorOptions {
  
  @scala.inline
  def apply(): JQueryCLEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCLEditorOptions]
  }
  
  @scala.inline
  implicit class JQueryCLEditorOptionsOps[Self <: JQueryCLEditorOptions] (val x: Self) extends AnyVal {
    
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
    def setBodyStyle(value: String): Self = this.set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyStyle: Self = this.set("bodyStyle", js.undefined)
    
    @scala.inline
    def setColors(value: String): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setControls(value: String): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setDocCSSFile(value: String): Self = this.set("docCSSFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocCSSFile: Self = this.set("docCSSFile", js.undefined)
    
    @scala.inline
    def setDocType(value: String): Self = this.set("docType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocType: Self = this.set("docType", js.undefined)
    
    @scala.inline
    def setFonts(value: String): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: js.Array[String]*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[js.Array[String]]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCSS: Self = this.set("useCSS", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
