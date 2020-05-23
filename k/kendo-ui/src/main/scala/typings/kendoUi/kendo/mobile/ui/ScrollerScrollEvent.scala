package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollerScrollEvent extends ScrollerEvent {
  var scrollLeft: js.UndefOr[Double] = js.undefined
  var scrollTop: js.UndefOr[Double] = js.undefined
}

object ScrollerScrollEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scroller,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollTop: js.UndefOr[Double] = js.undefined
  ): ScrollerScrollEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollerScrollEvent]
  }
}

