package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripSelectEvent extends TabStripEvent {
  var item: js.UndefOr[JQuery] = js.undefined
}

object TabStripSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TabStrip,
    item: JQuery = null
  ): TabStripSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[TabStripSelectEvent]
  }
}

