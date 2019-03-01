package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDropEvent extends TreeViewEvent {
  var destinationNode: js.UndefOr[stdLib.Element] = js.undefined
  var dropPosition: js.UndefOr[java.lang.String] = js.undefined
  var dropTarget: js.UndefOr[stdLib.Element] = js.undefined
  var setValid: js.UndefOr[js.Function] = js.undefined
  var sourceNode: js.UndefOr[stdLib.Element] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeViewDropEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    destinationNode: stdLib.Element = null,
    dropPosition: java.lang.String = null,
    dropTarget: stdLib.Element = null,
    setValid: js.Function = null,
    sourceNode: stdLib.Element = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeViewDropEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (destinationNode != null) __obj.updateDynamic("destinationNode")(destinationNode)
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (setValid != null) __obj.updateDynamic("setValid")(setValid)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[TreeViewDropEvent]
  }
}

