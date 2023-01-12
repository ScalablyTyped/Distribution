package typings.jspdf.mod

import typings.jspdf.jspdfStrings.slice
import typings.jspdf.jspdfStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLOptions extends StObject {
  
  var autoPaging: js.UndefOr[Boolean | slice | text] = js.undefined
  
  var callback: js.UndefOr[js.Function1[/* doc */ jsPDF, Unit]] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var fontFaces: js.UndefOr[js.Array[HTMLFontFace]] = js.undefined
  
  var html2canvas: js.UndefOr[Html2CanvasOptions] = js.undefined
  
  var image: js.UndefOr[HTMLOptionImage] = js.undefined
  
  var jsPDF: js.UndefOr[typings.jspdf.mod.jsPDF] = js.undefined
  
  var margin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var windowWidth: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object HTMLOptions {
  
  inline def apply(): HTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoPaging(value: Boolean | slice | text): Self = StObject.set(x, "autoPaging", value.asInstanceOf[js.Any])
    
    inline def setAutoPagingUndefined: Self = StObject.set(x, "autoPaging", js.undefined)
    
    inline def setCallback(value: /* doc */ jsPDF => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFontFaces(value: js.Array[HTMLFontFace]): Self = StObject.set(x, "fontFaces", value.asInstanceOf[js.Any])
    
    inline def setFontFacesUndefined: Self = StObject.set(x, "fontFaces", js.undefined)
    
    inline def setFontFacesVarargs(value: HTMLFontFace*): Self = StObject.set(x, "fontFaces", js.Array(value*))
    
    inline def setHtml2canvas(value: Html2CanvasOptions): Self = StObject.set(x, "html2canvas", value.asInstanceOf[js.Any])
    
    inline def setHtml2canvasUndefined: Self = StObject.set(x, "html2canvas", js.undefined)
    
    inline def setImage(value: HTMLOptionImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setJsPDF(value: jsPDF): Self = StObject.set(x, "jsPDF", value.asInstanceOf[js.Any])
    
    inline def setJsPDFUndefined: Self = StObject.set(x, "jsPDF", js.undefined)
    
    inline def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    inline def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
