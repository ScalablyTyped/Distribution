package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetAreaOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragenterEvent, scala.Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetAreaDragleaveEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetAreaDropEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
}

object DropTargetAreaOptions {
  @scala.inline
  def apply(
    dragenter: js.Function1[/* e */ DropTargetAreaDragenterEvent, scala.Unit] = null,
    dragleave: js.Function1[/* e */ DropTargetAreaDragleaveEvent, scala.Unit] = null,
    drop: js.Function1[/* e */ DropTargetAreaDropEvent, scala.Unit] = null,
    filter: java.lang.String = null,
    group: java.lang.String = null
  ): DropTargetAreaOptions = {
    val __obj = js.Dynamic.literal()
    if (dragenter != null) __obj.updateDynamic("dragenter")(dragenter)
    if (dragleave != null) __obj.updateDynamic("dragleave")(dragleave)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[DropTargetAreaOptions]
  }
}

