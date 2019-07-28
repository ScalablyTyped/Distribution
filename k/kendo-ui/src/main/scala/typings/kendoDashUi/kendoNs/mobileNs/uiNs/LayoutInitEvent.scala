package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutInitEvent extends LayoutEvent {
  var layout: js.UndefOr[JQuery] = js.undefined
}

object LayoutInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendoNs.mobileNs.uiNs.Layout,
    layout: JQuery = null
  ): LayoutInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[LayoutInitEvent]
  }
}

