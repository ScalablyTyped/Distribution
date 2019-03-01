package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetOptions extends js.Object {
  var dragenter: js.UndefOr[js.Function1[/* e */ DropTargetDragenterEvent, scala.Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DropTargetDragleaveEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DropTargetDropEvent, scala.Unit]] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
}

object DropTargetOptions {
  @scala.inline
  def apply(
    dragenter: js.Function1[/* e */ DropTargetDragenterEvent, scala.Unit] = null,
    dragleave: js.Function1[/* e */ DropTargetDragleaveEvent, scala.Unit] = null,
    drop: js.Function1[/* e */ DropTargetDropEvent, scala.Unit] = null,
    group: java.lang.String = null
  ): DropTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (dragenter != null) __obj.updateDynamic("dragenter")(dragenter)
    if (dragleave != null) __obj.updateDynamic("dragleave")(dragleave)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[DropTargetOptions]
  }
}

