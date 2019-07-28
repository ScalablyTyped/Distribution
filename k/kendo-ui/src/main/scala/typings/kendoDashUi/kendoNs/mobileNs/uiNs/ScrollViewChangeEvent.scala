package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewChangeEvent extends ScrollViewEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[JQuery] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
}

object ScrollViewChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ScrollView,
    data: js.Any = null,
    element: JQuery = null,
    page: Int | Double = null
  ): ScrollViewChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (element != null) __obj.updateDynamic("element")(element)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangeEvent]
  }
}

