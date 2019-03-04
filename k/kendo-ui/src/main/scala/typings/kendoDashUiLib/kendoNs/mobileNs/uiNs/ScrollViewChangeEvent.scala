package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewChangeEvent extends ScrollViewEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
}

object ScrollViewChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ScrollView,
    data: js.Any = null,
    element: kendoDashUiLib.JQuery = null,
    page: scala.Int | scala.Double = null
  ): ScrollViewChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (element != null) __obj.updateDynamic("element")(element)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangeEvent]
  }
}

