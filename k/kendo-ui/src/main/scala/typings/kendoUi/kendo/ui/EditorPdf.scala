package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPdf extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var avoidLinks: js.UndefOr[Boolean | String] = js.undefined
  
  var creator: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[String] = js.undefined
  
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[EditorPdfMargin] = js.undefined
  
  var paperSize: js.UndefOr[String | Any] = js.undefined
  
  var proxyTarget: js.UndefOr[String] = js.undefined
  
  var proxyURL: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object EditorPdf {
  
  inline def apply(): EditorPdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPdf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorPdf] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAvoidLinks(value: Boolean | String): Self = StObject.set(x, "avoidLinks", value.asInstanceOf[js.Any])
    
    inline def setAvoidLinksUndefined: Self = StObject.set(x, "avoidLinks", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setForceProxy(value: Boolean): Self = StObject.set(x, "forceProxy", value.asInstanceOf[js.Any])
    
    inline def setForceProxyUndefined: Self = StObject.set(x, "forceProxy", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setMargin(value: EditorPdfMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPaperSize(value: String | Any): Self = StObject.set(x, "paperSize", value.asInstanceOf[js.Any])
    
    inline def setPaperSizeUndefined: Self = StObject.set(x, "paperSize", js.undefined)
    
    inline def setProxyTarget(value: String): Self = StObject.set(x, "proxyTarget", value.asInstanceOf[js.Any])
    
    inline def setProxyTargetUndefined: Self = StObject.set(x, "proxyTarget", js.undefined)
    
    inline def setProxyURL(value: String): Self = StObject.set(x, "proxyURL", value.asInstanceOf[js.Any])
    
    inline def setProxyURLUndefined: Self = StObject.set(x, "proxyURL", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
