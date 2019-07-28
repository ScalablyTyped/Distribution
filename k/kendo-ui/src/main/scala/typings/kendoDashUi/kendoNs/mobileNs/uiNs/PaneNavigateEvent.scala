package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneNavigateEvent extends PaneEvent {
  var url: js.UndefOr[JQuery] = js.undefined
}

object PaneNavigateEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Pane, url: JQuery = null): PaneNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PaneNavigateEvent]
  }
}

