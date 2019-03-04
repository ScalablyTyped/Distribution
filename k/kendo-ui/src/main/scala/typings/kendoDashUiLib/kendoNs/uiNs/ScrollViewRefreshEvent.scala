package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollViewRefreshEvent extends ScrollViewEvent {
  var page: js.UndefOr[scala.Double] = js.undefined
  var pageCount: js.UndefOr[scala.Double] = js.undefined
}

object ScrollViewRefreshEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ScrollView,
    page: scala.Int | scala.Double = null,
    pageCount: scala.Int | scala.Double = null
  ): ScrollViewRefreshEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollViewRefreshEvent]
  }
}

