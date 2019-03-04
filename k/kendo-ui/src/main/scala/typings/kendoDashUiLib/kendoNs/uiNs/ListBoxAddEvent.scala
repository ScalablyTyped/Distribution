package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxAddEvent extends ListBoxEvent {
  var dataItems: js.UndefOr[js.Any] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
}

object ListBoxAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ListBox,
    dataItems: js.Any = null,
    items: js.Any = null
  ): ListBoxAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (dataItems != null) __obj.updateDynamic("dataItems")(dataItems)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ListBoxAddEvent]
  }
}

