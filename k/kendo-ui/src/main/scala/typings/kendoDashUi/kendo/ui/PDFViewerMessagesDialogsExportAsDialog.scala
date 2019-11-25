package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessagesDialogsExportAsDialog extends js.Object {
  var defaultFileName: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[PDFViewerMessagesDialogsExportAsDialogLabels] = js.undefined
  var pdf: js.UndefOr[String] = js.undefined
  var png: js.UndefOr[String] = js.undefined
  var svg: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PDFViewerMessagesDialogsExportAsDialog {
  @scala.inline
  def apply(
    defaultFileName: String = null,
    labels: PDFViewerMessagesDialogsExportAsDialogLabels = null,
    pdf: String = null,
    png: String = null,
    svg: String = null,
    title: String = null
  ): PDFViewerMessagesDialogsExportAsDialog = {
    val __obj = js.Dynamic.literal()
    if (defaultFileName != null) __obj.updateDynamic("defaultFileName")(defaultFileName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (png != null) __obj.updateDynamic("png")(png.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerMessagesDialogsExportAsDialog]
  }
}

