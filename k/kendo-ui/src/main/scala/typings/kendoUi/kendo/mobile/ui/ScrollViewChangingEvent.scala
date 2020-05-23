package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewChangingEvent extends ScrollViewEvent {
  var currentPage: js.UndefOr[Double] = js.undefined
  var nextPage: js.UndefOr[Double] = js.undefined
}

object ScrollViewChangingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ScrollView,
    currentPage: js.UndefOr[Double] = js.undefined,
    nextPage: js.UndefOr[Double] = js.undefined
  ): ScrollViewChangingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPage)) __obj.updateDynamic("nextPage")(nextPage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangingEvent]
  }
}

