package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutInitEvent extends LayoutEvent {
  var layout: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object LayoutInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Layout,
    layout: kendoDashUiLib.JQuery = null
  ): LayoutInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[LayoutInitEvent]
  }
}

