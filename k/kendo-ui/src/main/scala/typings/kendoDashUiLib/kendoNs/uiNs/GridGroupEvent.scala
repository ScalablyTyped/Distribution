package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGroupEvent extends GridEvent {
  var groups: js.UndefOr[js.Any] = js.undefined
}

object GridGroupEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    groups: js.Any = null
  ): GridGroupEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    __obj.asInstanceOf[GridGroupEvent]
  }
}

