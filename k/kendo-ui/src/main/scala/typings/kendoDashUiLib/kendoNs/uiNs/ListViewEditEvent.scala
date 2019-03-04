package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViewEditEvent extends ListViewEvent {
  var item: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
}

object ListViewEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ListView,
    item: kendoDashUiLib.JQuery = null,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null
  ): ListViewEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[ListViewEditEvent]
  }
}

