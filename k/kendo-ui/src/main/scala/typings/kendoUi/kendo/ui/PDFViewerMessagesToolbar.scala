package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerMessagesToolbar extends js.Object {
  
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
  implicit class PDFViewerMessagesToolbarOps[Self <: PDFViewerMessagesToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setExportAs(value: String): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAs: Self = this.set("exportAs", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPager(value: PDFViewerMessagesToolbarPager): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
  }
}
