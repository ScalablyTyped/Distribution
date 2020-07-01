package typings.jupyterlabMainmenu.editMod.IEditMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Undo/Redo.
  */
trait IUndoer[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Execute a redo command for the activity.
    */
  var redo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
  /**
    * Execute an undo command for the activity.
    */
  var undo: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
}

object IUndoer {
  @scala.inline
  def apply[/* <: typings.luminoWidgets.mod.Widget */ T](
    tracker: IWidgetTracker[T],
    isEnabled: T => Boolean = null,
    redo: /* widget */ T => Unit = null,
    undo: /* widget */ T => Unit = null
  ): IUndoer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (redo != null) __obj.updateDynamic("redo")(js.Any.fromFunction1(redo))
    if (undo != null) __obj.updateDynamic("undo")(js.Any.fromFunction1(undo))
    __obj.asInstanceOf[IUndoer[T]]
  }
}

