package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridExpandMemberEvent extends PivotGridEvent {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PivotGridExpandMemberEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: PivotGrid,
    axis: java.lang.String = null,
    path: js.Array[java.lang.String] = null
  ): PivotGridExpandMemberEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[PivotGridExpandMemberEvent]
  }
}

