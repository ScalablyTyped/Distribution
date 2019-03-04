package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteFilteringEvent extends AutoCompleteEvent {
  var filter: js.UndefOr[js.Any] = js.undefined
}

object AutoCompleteFilteringEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: AutoComplete,
    filter: js.Any = null
  ): AutoCompleteFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[AutoCompleteFilteringEvent]
  }
}

