package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetAreaOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragenterEvent, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragleaveEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetAreaDropEvent, Unit]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
}

object DropTargetAreaOptions {
  @scala.inline
  def apply(
    dragenter: /* e */ DropTargetAreaDragenterEvent => Unit = null,
    dragleave: /* e */ DropTargetAreaDragleaveEvent => Unit = null,
    drop: /* e */ DropTargetAreaDropEvent => Unit = null,
    filter: String = null,
    group: String = null
  ): DropTargetAreaOptions = {
    val __obj = js.Dynamic.literal()
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1(dragenter))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1(dragleave))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaOptions]
  }
}

