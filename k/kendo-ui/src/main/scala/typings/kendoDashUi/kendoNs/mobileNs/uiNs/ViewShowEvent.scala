package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewShowEvent
  extends typings.kendoDashUi.kendoNs.mobileNs.uiNs.ViewEvent {
  var view: js.UndefOr[typings.kendoDashUi.kendoNs.mobileNs.uiNs.View] = js.undefined
}

object ViewShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendoNs.mobileNs.uiNs.View,
    view: typings.kendoDashUi.kendoNs.mobileNs.uiNs.View = null
  ): ViewShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ViewShowEvent]
  }
}

