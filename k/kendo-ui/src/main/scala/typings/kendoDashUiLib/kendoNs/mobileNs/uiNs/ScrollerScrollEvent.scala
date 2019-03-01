package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerScrollEvent extends ScrollerEvent {
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
}

object ScrollerScrollEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Scroller,
    scrollLeft: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null
  ): ScrollerScrollEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerScrollEvent]
  }
}

