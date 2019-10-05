package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineNavigateEvent extends TimelineEvent {
  var action: js.UndefOr[String] = js.undefined
}

object TimelineNavigateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Timeline,
    action: String = null
  ): TimelineNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[TimelineNavigateEvent]
  }
}

