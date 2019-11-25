package typings.kendoDashUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDropEvent extends TreeViewEvent {
  var destinationNode: js.UndefOr[Element] = js.undefined
  var dropPosition: js.UndefOr[String] = js.undefined
  var dropTarget: js.UndefOr[Element] = js.undefined
  var setValid: js.UndefOr[js.Function] = js.undefined
  var sourceNode: js.UndefOr[Element] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object TreeViewDropEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeView,
    destinationNode: Element = null,
    dropPosition: String = null,
    dropTarget: Element = null,
    setValid: js.Function = null,
    sourceNode: Element = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): TreeViewDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (destinationNode != null) __obj.updateDynamic("destinationNode")(destinationNode.asInstanceOf[js.Any])
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (setValid != null) __obj.updateDynamic("setValid")(setValid.asInstanceOf[js.Any])
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDropEvent]
  }
}

