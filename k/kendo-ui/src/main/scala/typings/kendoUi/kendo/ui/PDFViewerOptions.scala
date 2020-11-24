package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerOptions extends js.Object {
  
  var defaultPageSize: js.UndefOr[PDFViewerDefaultPageSize] = js.native
  
  var dplProcessing: js.UndefOr[PDFViewerDplProcessing] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ PDFViewerErrorEvent, Unit]] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var messages: js.UndefOr[PDFViewerMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ PDFViewerOpenEvent, Unit]] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var pdfjsProcessing: js.UndefOr[PDFViewerPdfjsProcessing] = js.native
  
  var render: js.UndefOr[js.Function1[/* e */ PDFViewerRenderEvent, Unit]] = js.native
  
  var toolbar: js.UndefOr[Boolean | PDFViewerToolbar] = js.native
  
  var view: js.UndefOr[PDFViewerView] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object PDFViewerOptions {
  
  @scala.inline
  def apply(): PDFViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerOptions]
  }
  
  @scala.inline
  implicit class PDFViewerOptionsOps[Self <: PDFViewerOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultPageSize(value: PDFViewerDefaultPageSize): Self = this.set("defaultPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPageSize: Self = this.set("defaultPageSize", js.undefined)
    
    @scala.inline
    def setDplProcessing(value: PDFViewerDplProcessing): Self = this.set("dplProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDplProcessing: Self = this.set("dplProcessing", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ PDFViewerErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMessages(value: PDFViewerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ PDFViewerOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPdfjsProcessing(value: PDFViewerPdfjsProcessing): Self = this.set("pdfjsProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfjsProcessing: Self = this.set("pdfjsProcessing", js.undefined)
    
    @scala.inline
    def setRender(value: /* e */ PDFViewerRenderEvent => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | PDFViewerToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setView(value: PDFViewerView): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
