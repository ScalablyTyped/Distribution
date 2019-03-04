package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarCompleteEvent extends ProgressBarEvent {
  var value: js.UndefOr[scala.Double] = js.undefined
}

object ProgressBarCompleteEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ProgressBar,
    value: scala.Int | scala.Double = null
  ): ProgressBarCompleteEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarCompleteEvent]
  }
}

