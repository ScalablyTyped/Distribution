package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridCollapseMemberEvent extends PivotGridEvent {
  var axis: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[js.Array[String]] = js.undefined
}

object PivotGridCollapseMemberEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PivotGrid,
    axis: String = null,
    path: js.Array[String] = null
  ): PivotGridCollapseMemberEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[PivotGridCollapseMemberEvent]
  }
}

