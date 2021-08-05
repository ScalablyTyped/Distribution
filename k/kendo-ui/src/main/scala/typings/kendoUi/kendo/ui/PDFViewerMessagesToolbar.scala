package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerMessagesToolbar extends StObject {
  
  var download: js.UndefOr[String] = js.undefined
  
  var exportAs: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[String] = js.undefined
  
  var pager: js.UndefOr[PDFViewerMessagesToolbarPager] = js.undefined
}
object PDFViewerMessagesToolbar {
  
  inline def apply(): PDFViewerMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesToolbar]
  }
  
  extension [Self <: PDFViewerMessagesToolbar](x: Self) {
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPager(value: PDFViewerMessagesToolbarPager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
  }
}
