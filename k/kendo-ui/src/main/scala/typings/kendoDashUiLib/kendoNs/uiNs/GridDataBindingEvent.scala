package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridDataBindingEvent extends GridEvent {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
}

object GridDataBindingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    action: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    items: js.Any = null
  ): GridDataBindingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[GridDataBindingEvent]
  }
}

