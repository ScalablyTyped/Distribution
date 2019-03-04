package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSliderChangeEvent extends RangeSliderEvent {
  var value: js.UndefOr[js.Any] = js.undefined
}

object RangeSliderChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: RangeSlider,
    value: js.Any = null
  ): RangeSliderChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RangeSliderChangeEvent]
  }
}

