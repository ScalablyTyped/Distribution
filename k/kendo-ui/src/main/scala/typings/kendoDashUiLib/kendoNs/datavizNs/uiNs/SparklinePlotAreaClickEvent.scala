package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinePlotAreaClickEvent extends SparklineEvent {
  var category: js.UndefOr[js.Any] = js.undefined
  var element: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var x: js.UndefOr[js.Any] = js.undefined
  var y: js.UndefOr[js.Any] = js.undefined
}

object SparklinePlotAreaClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Sparkline,
    category: js.Any = null,
    element: js.Any = null,
    value: js.Any = null,
    x: js.Any = null,
    y: js.Any = null
  ): SparklinePlotAreaClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (category != null) __obj.updateDynamic("category")(category)
    if (element != null) __obj.updateDynamic("element")(element)
    if (value != null) __obj.updateDynamic("value")(value)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SparklinePlotAreaClickEvent]
  }
}

