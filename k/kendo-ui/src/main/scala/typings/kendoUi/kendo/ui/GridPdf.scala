package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridPdf extends StObject {
  
  var allPages: js.UndefOr[Boolean] = js.native
  
  var author: js.UndefOr[String] = js.native
  
  var avoidLinks: js.UndefOr[Boolean | String] = js.native
  
  var creator: js.UndefOr[String] = js.native
  
  var date: js.UndefOr[Date] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var forceProxy: js.UndefOr[Boolean] = js.native
  
  var keywords: js.UndefOr[String] = js.native
  
  var landscape: js.UndefOr[Boolean] = js.native
  
  var margin: js.UndefOr[GridPdfMargin] = js.native
  
  var paperSize: js.UndefOr[String | js.Any] = js.native
  
  var proxyTarget: js.UndefOr[String] = js.native
  
  var proxyURL: js.UndefOr[String] = js.native
  
  var repeatHeaders: js.UndefOr[Boolean] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object GridPdf {
  
  @scala.inline
  def apply(): GridPdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPdf]
  }
  
  @scala.inline
  implicit class GridPdfMutableBuilder[Self <: GridPdf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllPages(value: Boolean): Self = StObject.set(x, "allPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllPagesUndefined: Self = StObject.set(x, "allPages", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setAvoidLinks(value: Boolean | String): Self = StObject.set(x, "avoidLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidLinksUndefined: Self = StObject.set(x, "avoidLinks", js.undefined)
    
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
    def setMargin(value: GridPdfMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
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
    def setRepeatHeaders(value: Boolean): Self = StObject.set(x, "repeatHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatHeadersUndefined: Self = StObject.set(x, "repeatHeaders", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
