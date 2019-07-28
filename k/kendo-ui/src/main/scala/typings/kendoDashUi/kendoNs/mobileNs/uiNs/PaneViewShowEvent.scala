package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneViewShowEvent extends PaneEvent {
  var view: js.UndefOr[typings.kendoDashUi.kendoNs.mobileNs.uiNs.View] = js.undefined
}

object PaneViewShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Pane,
    view: typings.kendoDashUi.kendoNs.mobileNs.uiNs.View = null
  ): PaneViewShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PaneViewShowEvent]
  }
}

