package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutShowEvent extends LayoutEvent {
  var layout: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var view: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object LayoutShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Layout,
    layout: kendoDashUiLib.JQuery = null,
    view: kendoDashUiLib.JQuery = null
  ): LayoutShowEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[LayoutShowEvent]
  }
}

