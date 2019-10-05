package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteFilteringEvent extends AutoCompleteEvent {
  var filter: js.UndefOr[js.Any] = js.undefined
}

object AutoCompleteFilteringEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: AutoComplete,
    filter: js.Any = null
  ): AutoCompleteFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[AutoCompleteFilteringEvent]
  }
}

