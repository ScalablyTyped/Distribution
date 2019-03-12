package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnReorderEvent extends GridEvent {
  var column: js.UndefOr[js.Any] = js.undefined
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  var oldIndex: js.UndefOr[scala.Double] = js.undefined
}

object GridColumnReorderEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Grid,
    column: js.Any = null,
    newIndex: scala.Int | scala.Double = null,
    oldIndex: scala.Int | scala.Double = null
  ): GridColumnReorderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (column != null) __obj.updateDynamic("column")(column)
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    if (oldIndex != null) __obj.updateDynamic("oldIndex")(oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnReorderEvent]
  }
}

