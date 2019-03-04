package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSliderSlideEvent extends RangeSliderEvent {
  var value: js.UndefOr[js.Any] = js.undefined
}

object RangeSliderSlideEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: RangeSlider,
    value: js.Any = null
  ): RangeSliderSlideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RangeSliderSlideEvent]
  }
}

