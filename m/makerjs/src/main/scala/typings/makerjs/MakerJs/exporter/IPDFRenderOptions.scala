package typings.makerjs.MakerJs.exporter

import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PDF rendering options.
  */
trait IPDFRenderOptions
  extends StObject
     with IExportOptions {
  
  /**
    * Font name, see list at https://github.com/foliojs/pdfkit/blob/master/docs/text.coffee.md#fonts
    */
  var fontName: js.UndefOr[String] = js.undefined
  
  /**
    * Font size.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Rendered reference origin.
    */
  var origin: js.UndefOr[IPoint] = js.undefined
  
  /**
    * SVG color of the rendered paths.
    */
  var stroke: js.UndefOr[String] = js.undefined
}
object IPDFRenderOptions {
  
  inline def apply(): IPDFRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPDFRenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPDFRenderOptions] (val x: Self) extends AnyVal {
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
