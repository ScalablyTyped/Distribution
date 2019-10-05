package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessages extends js.Object {
  var defaultFileName: js.UndefOr[String] = js.undefined
  var dialogs: js.UndefOr[PDFViewerMessagesDialogs] = js.undefined
  var errorMessages: js.UndefOr[PDFViewerMessagesErrorMessages] = js.undefined
  var toolbar: js.UndefOr[PDFViewerMessagesToolbar] = js.undefined
}

object PDFViewerMessages {
  @scala.inline
  def apply(
    defaultFileName: String = null,
    dialogs: PDFViewerMessagesDialogs = null,
    errorMessages: PDFViewerMessagesErrorMessages = null,
    toolbar: PDFViewerMessagesToolbar = null
  ): PDFViewerMessages = {
    val __obj = js.Dynamic.literal()
    if (defaultFileName != null) __obj.updateDynamic("defaultFileName")(defaultFileName)
    if (dialogs != null) __obj.updateDynamic("dialogs")(dialogs)
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[PDFViewerMessages]
  }
}

