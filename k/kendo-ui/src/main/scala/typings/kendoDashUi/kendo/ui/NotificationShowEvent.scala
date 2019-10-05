package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationShowEvent extends NotificationEvent {
  var element: js.UndefOr[JQuery] = js.undefined
}

object NotificationShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Notification,
    element: JQuery = null
  ): NotificationShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[NotificationShowEvent]
  }
}

