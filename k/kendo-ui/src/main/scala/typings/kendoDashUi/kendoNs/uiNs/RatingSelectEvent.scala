package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingSelectEvent extends RatingEvent {
  var target: js.UndefOr[Element] = js.undefined
}

object RatingSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Rating,
    target: Element = null
  ): RatingSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[RatingSelectEvent]
  }
}

