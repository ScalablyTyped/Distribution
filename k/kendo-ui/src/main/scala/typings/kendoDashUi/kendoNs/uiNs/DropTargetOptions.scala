package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, Unit]] = js.undefined
  var group: js.UndefOr[String] = js.undefined
}

object DropTargetOptions {
  @scala.inline
  def apply(
    dragenter: /* e */ DropTargetDragenterEvent => Unit = null,
    dragleave: /* e */ DropTargetDragleaveEvent => Unit = null,
    drop: /* e */ DropTargetDropEvent => Unit = null,
    group: String = null
  ): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1(dragenter))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1(dragleave))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[DropTargetOptions]
  }
}

