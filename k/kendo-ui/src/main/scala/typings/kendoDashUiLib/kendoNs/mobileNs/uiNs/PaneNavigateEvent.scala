package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneNavigateEvent extends PaneEvent {
  var url: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object PaneNavigateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Pane,
    url: kendoDashUiLib.JQuery = null
  ): PaneNavigateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PaneNavigateEvent]
  }
}

