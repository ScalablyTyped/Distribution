package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerErrorEvent extends PDFViewerEvent {
  var dialog: js.UndefOr[Dialog] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object PDFViewerErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PDFViewer,
    dialog: Dialog = null,
    error: js.Any = null,
    message: String = null
  ): PDFViewerErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (error != null) __obj.updateDynamic("error")(error)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[PDFViewerErrorEvent]
  }
}

