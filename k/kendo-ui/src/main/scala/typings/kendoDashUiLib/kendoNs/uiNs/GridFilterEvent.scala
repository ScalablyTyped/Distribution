package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterEvent extends GridEvent {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[js.Any] = js.undefined
}

object GridFilterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    field: java.lang.String = null,
    filter: js.Any = null
  ): GridFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[GridFilterEvent]
  }
}

