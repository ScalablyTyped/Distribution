package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerOpenEvent extends PDFViewerEvent {
  var file: js.UndefOr[js.Any] = js.undefined
}

object PDFViewerOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PDFViewer,
    file: js.Any = null
  ): PDFViewerOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[PDFViewerOpenEvent]
  }
}

