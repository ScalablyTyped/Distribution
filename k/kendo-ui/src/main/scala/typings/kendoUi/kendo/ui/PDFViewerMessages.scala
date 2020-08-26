package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessages extends js.Object {
  var defaultFileName: js.UndefOr[String] = js.native
  var dialogs: js.UndefOr[PDFViewerMessagesDialogs] = js.native
  var errorMessages: js.UndefOr[PDFViewerMessagesErrorMessages] = js.native
  var toolbar: js.UndefOr[PDFViewerMessagesToolbar] = js.native
}

object PDFViewerMessages {
  @scala.inline
  def apply(): PDFViewerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessages]
  }
  @scala.inline
  implicit class PDFViewerMessagesOps[Self <: PDFViewerMessages] (val x: Self) extends AnyVal {
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
    def setDefaultFileName(value: String): Self = this.set("defaultFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFileName: Self = this.set("defaultFileName", js.undefined)
    @scala.inline
    def setDialogs(value: PDFViewerMessagesDialogs): Self = this.set("dialogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogs: Self = this.set("dialogs", js.undefined)
    @scala.inline
    def setErrorMessages(value: PDFViewerMessagesErrorMessages): Self = this.set("errorMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessages: Self = this.set("errorMessages", js.undefined)
    @scala.inline
    def setToolbar(value: PDFViewerMessagesToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
  
}

