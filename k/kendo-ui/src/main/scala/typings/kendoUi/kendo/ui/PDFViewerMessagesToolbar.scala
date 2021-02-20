package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesToolbar extends StObject {
  
  var download: js.UndefOr[String] = js.native
  
  var exportAs: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[String] = js.native
  
  var pager: js.UndefOr[PDFViewerMessagesToolbarPager] = js.native
}
object PDFViewerMessagesToolbar {
  
  @scala.inline
  def apply(): PDFViewerMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesToolbar]
  }
  
  @scala.inline
  implicit class PDFViewerMessagesToolbarMutableBuilder[Self <: PDFViewerMessagesToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPager(value: PDFViewerMessagesToolbarPager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
  }
}
