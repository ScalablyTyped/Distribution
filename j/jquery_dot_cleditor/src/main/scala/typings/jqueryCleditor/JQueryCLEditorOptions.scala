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
  
  inline def apply(): JQueryCLEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCLEditorOptions]
  }
  
  extension [Self <: JQueryCLEditorOptions](x: Self) {
    
    inline def setBodyStyle(value: String): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setColors(value: String): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDocCSSFile(value: String): Self = StObject.set(x, "docCSSFile", value.asInstanceOf[js.Any])
    
    inline def setDocCSSFileUndefined: Self = StObject.set(x, "docCSSFile", js.undefined)
    
    inline def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
    
    inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
    
    inline def setFonts(value: String): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setStyles(value: js.Array[js.Array[String]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: js.Array[String]*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
    
    inline def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
