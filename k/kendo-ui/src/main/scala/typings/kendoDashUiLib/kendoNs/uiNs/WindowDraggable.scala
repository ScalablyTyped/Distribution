package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowDraggable extends js.Object {
  var axis: js.UndefOr[java.lang.String] = js.undefined
  var containment: js.UndefOr[js.Any | java.lang.String] = js.undefined
  var dragHandle: js.UndefOr[js.Any | java.lang.String] = js.undefined
}

object WindowDraggable {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    containment: js.Any | java.lang.String = null,
    dragHandle: js.Any | java.lang.String = null
  ): WindowDraggable = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (dragHandle != null) __obj.updateDynamic("dragHandle")(dragHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowDraggable]
  }
}

