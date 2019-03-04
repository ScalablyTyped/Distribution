package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeFilteringEvent extends DropDownTreeEvent {
  var filter: js.UndefOr[js.Any] = js.undefined
}

object DropDownTreeFilteringEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: DropDownTree,
    filter: js.Any = null
  ): DropDownTreeFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[DropDownTreeFilteringEvent]
  }
}

