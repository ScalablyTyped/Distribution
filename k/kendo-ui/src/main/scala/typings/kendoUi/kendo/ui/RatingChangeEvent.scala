package typings.kendoUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingChangeEvent extends RatingEvent {
  var newValue: js.UndefOr[Double] = js.undefined
  var oldValue: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object RatingChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Rating,
    newValue: js.UndefOr[Double] = js.undefined,
    oldValue: js.UndefOr[Double] = js.undefined,
    target: Element = null
  ): RatingChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (!js.isUndefined(newValue)) __obj.updateDynamic("newValue")(newValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oldValue)) __obj.updateDynamic("oldValue")(oldValue.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingChangeEvent]
  }
}

