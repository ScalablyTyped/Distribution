package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerRenderEvent extends PDFViewerEvent {
  var page: js.UndefOr[js.Any] = js.undefined
}

object PDFViewerRenderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PDFViewer,
    page: js.Any = null
  ): PDFViewerRenderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[PDFViewerRenderEvent]
  }
}

