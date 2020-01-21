package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessagesDialogs extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var exportAsDialog: js.UndefOr[PDFViewerMessagesDialogsExportAsDialog] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
  var save: js.UndefOr[String] = js.undefined
}

object PDFViewerMessagesDialogs {
  @scala.inline
  def apply(
    cancel: String = null,
    exportAsDialog: PDFViewerMessagesDialogsExportAsDialog = null,
    okText: String = null,
    save: String = null
  ): PDFViewerMessagesDialogs = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (exportAsDialog != null) __obj.updateDynamic("exportAsDialog")(exportAsDialog.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerMessagesDialogs]
  }
}

