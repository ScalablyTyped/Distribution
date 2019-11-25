package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessagesDialogsExportAsDialogLabels extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var saveAsType: js.UndefOr[String] = js.undefined
}

object PDFViewerMessagesDialogsExportAsDialogLabels {
  @scala.inline
  def apply(fileName: String = null, page: String = null, saveAsType: String = null): PDFViewerMessagesDialogsExportAsDialogLabels = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (saveAsType != null) __obj.updateDynamic("saveAsType")(saveAsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialogLabels]
  }
}

