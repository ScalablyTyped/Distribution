package typings.jqueryCleditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryCLEditorOptions extends StObject {
  
  var bodyStyle: js.UndefOr[String] = js.undefined
  
  var colors: js.UndefOr[String] = js.undefined
  
  var controls: js.UndefOr[String] = js.undefined
  
  var docCSSFile: js.UndefOr[String] = js.undefined
  
  var docType: js.UndefOr[String] = js.undefined
  
  var fonts: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var useCSS: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object JQueryCLEditorOptions {
  
  @scala.inline
  def apply(): JQueryCLEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCLEditorOptions]
  }
  
  @scala.inline
  implicit class JQueryCLEditorOptionsMutableBuilder[Self <: JQueryCLEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyStyle(value: String): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    @scala.inline
    def setColors(value: String): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setDocCSSFile(value: String): Self = StObject.set(x, "docCSSFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocCSSFileUndefined: Self = StObject.set(x, "docCSSFile", js.undefined)
    
    @scala.inline
    def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
    
    @scala.inline
    def setFonts(value: String): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setStyles(value: js.Array[js.Array[String]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: js.Array[String]*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
