package typings.kendoDashUi.kendo.mobile.ui

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
    currentPage: Int | Double = null,
    nextPage: Int | Double = null
  ): ScrollViewChangingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangingEvent]
  }
}

