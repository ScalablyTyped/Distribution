package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxFilteringEvent extends ComboBoxEvent {
  var filter: js.UndefOr[js.Any] = js.undefined
}

object ComboBoxFilteringEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ComboBox,
    filter: js.Any = null
  ): ComboBoxFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[ComboBoxFilteringEvent]
  }
}

