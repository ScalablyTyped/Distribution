package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewChangeEvent extends ScrollViewEvent {
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var nextPage: js.UndefOr[scala.Double] = js.undefined
}

object ScrollViewChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ScrollView,
    currentPage: scala.Int | scala.Double = null,
    data: js.Any = null,
    element: kendoDashUiLib.JQuery = null,
    nextPage: scala.Int | scala.Double = null
  ): ScrollViewChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (element != null) __obj.updateDynamic("element")(element)
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangeEvent]
  }
}

