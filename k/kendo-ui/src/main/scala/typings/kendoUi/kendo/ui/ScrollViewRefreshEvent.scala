package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewRefreshEvent extends ScrollViewEvent {
  var page: js.UndefOr[Double] = js.undefined
  var pageCount: js.UndefOr[Double] = js.undefined
}

object ScrollViewRefreshEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ScrollView,
    page: js.UndefOr[Double] = js.undefined,
    pageCount: js.UndefOr[Double] = js.undefined
  ): ScrollViewRefreshEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageCount)) __obj.updateDynamic("pageCount")(pageCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewRefreshEvent]
  }
}

