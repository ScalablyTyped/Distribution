package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapItemCreatedEvent extends TreeMapEvent {
  var element: js.UndefOr[JQuery | Element] = js.undefined
}

object TreeMapItemCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeMap,
    element: JQuery | Element = null
  ): TreeMapItemCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapItemCreatedEvent]
  }
}

