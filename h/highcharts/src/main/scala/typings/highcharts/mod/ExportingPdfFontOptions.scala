package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingPdfFontOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The TTF font file for bold text.
    */
  var bold: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The TTF font file for bold and
    * italic text.
    */
  var bolditalic: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The TTF font file for italic
    * text.
    */
  var italic: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The TTF font file for normal
    * `font-style`. If font variations like `bold` or `italic` are not defined,
    * the `normal` font will be used for those too.
    */
  var normal: js.UndefOr[String] = js.undefined
}
object ExportingPdfFontOptions {
  
  inline def apply(): ExportingPdfFontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingPdfFontOptions]
  }
  
  extension [Self <: ExportingPdfFontOptions](x: Self) {
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setBolditalic(value: String): Self = StObject.set(x, "bolditalic", value.asInstanceOf[js.Any])
    
    inline def setBolditalicUndefined: Self = StObject.set(x, "bolditalic", js.undefined)
    
    inline def setItalic(value: String): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
  }
}
