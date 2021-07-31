package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPdf extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var creator: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[Date] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[String] = js.undefined
  
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[ChartPdfMargin] = js.undefined
  
  var paperSize: js.UndefOr[String | js.Any] = js.undefined
  
  var proxyTarget: js.UndefOr[String] = js.undefined
  
  var proxyURL: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ChartPdf {
  
  @scala.inline
  def apply(): ChartPdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPdf]
  }
  
  @scala.inline
  implicit class ChartPdfMutableBuilder[Self <: ChartPdf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setForceProxy(value: Boolean): Self = StObject.set(x, "forceProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceProxyUndefined: Self = StObject.set(x, "forceProxy", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    @scala.inline
    def setMargin(value: ChartPdfMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPaperSize(value: String | js.Any): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    @scala.inline
    def setProxyTarget(value: String): Self = StObject.set(x, "proxyTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyTargetUndefined: Self = StObject.set(x, "proxyTarget", js.undefined)
    
    @scala.inline
    def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
    
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
