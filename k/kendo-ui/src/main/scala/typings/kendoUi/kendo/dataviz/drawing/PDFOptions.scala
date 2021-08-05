package typings.kendoUi.kendo.dataviz.drawing

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFOptions extends StObject {
  
  var creator: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[Date] = js.undefined
  
  var imgDPI: js.UndefOr[Double] = js.undefined
  
  var keywords: js.UndefOr[String] = js.undefined
  
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[js.Any] = js.undefined
  
  var paperSize: js.UndefOr[js.Any] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PDFOptions {
  
  inline def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  
  extension [Self <: PDFOptions](x: Self) {
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setImgDPI(value: Double): Self = StObject.set(x, "imgDPI", value.asInstanceOf[js.Any])
    
    inline def setImgDPIUndefined: Self = StObject.set(x, "imgDPI", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPaperSize(value: js.Any): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
