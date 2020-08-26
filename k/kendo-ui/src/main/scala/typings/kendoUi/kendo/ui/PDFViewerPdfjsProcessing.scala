package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerPdfjsProcessing extends js.Object {
  var file: js.UndefOr[js.Any | String] = js.native
}

object PDFViewerPdfjsProcessing {
  @scala.inline
  def apply(): PDFViewerPdfjsProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerPdfjsProcessing]
  }
  @scala.inline
  implicit class PDFViewerPdfjsProcessingOps[Self <: PDFViewerPdfjsProcessing] (val x: Self) extends AnyVal {
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
    def setFile(value: js.Any | String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

