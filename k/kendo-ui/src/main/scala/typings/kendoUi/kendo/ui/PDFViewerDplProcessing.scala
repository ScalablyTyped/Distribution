package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerDplProcessing extends js.Object {
  var download: js.UndefOr[PDFViewerDplProcessingDownload] = js.native
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  var read: js.UndefOr[PDFViewerDplProcessingRead] = js.native
  var upload: js.UndefOr[PDFViewerDplProcessingUpload] = js.native
}

object PDFViewerDplProcessing {
  @scala.inline
  def apply(): PDFViewerDplProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessing]
  }
  @scala.inline
  implicit class PDFViewerDplProcessingOps[Self <: PDFViewerDplProcessing] (val x: Self) extends AnyVal {
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
    def setDownload(value: PDFViewerDplProcessingDownload): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    @scala.inline
    def setRead(value: PDFViewerDplProcessingRead): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setUpload(value: PDFViewerDplProcessingUpload): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
  
}

