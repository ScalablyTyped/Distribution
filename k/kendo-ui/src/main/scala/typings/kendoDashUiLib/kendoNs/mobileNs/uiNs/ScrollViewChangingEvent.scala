package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewChangingEvent extends ScrollViewEvent {
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  var nextPage: js.UndefOr[scala.Double] = js.undefined
}

object ScrollViewChangingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ScrollView,
    currentPage: scala.Int | scala.Double = null,
    nextPage: scala.Int | scala.Double = null
  ): ScrollViewChangingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewChangingEvent]
  }
}

