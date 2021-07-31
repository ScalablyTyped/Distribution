package typings.kendoUi.kendo.drawing

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
  
  @scala.inline
  def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  
  @scala.inline
  implicit class PDFOptionsMutableBuilder[Self <: PDFOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setImgDPI(value: Double): Self = StObject.set(x, "imgDPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgDPIUndefined: Self = StObject.set(x, "imgDPI", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPaperSize(value: js.Any): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
