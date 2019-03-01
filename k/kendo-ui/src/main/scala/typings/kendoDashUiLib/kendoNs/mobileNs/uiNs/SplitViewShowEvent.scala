package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewShowEvent extends SplitViewEvent {
  var view: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object SplitViewShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: SplitView,
    view: kendoDashUiLib.JQuery = null
  ): SplitViewShowEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SplitViewShowEvent]
  }
}

