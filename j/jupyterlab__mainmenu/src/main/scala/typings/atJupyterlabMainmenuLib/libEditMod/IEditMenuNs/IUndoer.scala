package typings
package atJupyterlabMainmenuLib.libEditMod.IEditMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Undo/Redo.
  */
trait IUndoer[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * Execute a redo command for the activity.
    */
  var redo: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
  /**
    * Execute an undo command for the activity.
    */
  var undo: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
}

object IUndoer {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: T => scala.Boolean = null,
    redo: /* widget */ T => scala.Unit = null,
    undo: /* widget */ T => scala.Unit = null
  ): IUndoer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    if (redo != null) __obj.updateDynamic("redo")(js.Any.fromFunction1(redo))
    if (undo != null) __obj.updateDynamic("undo")(js.Any.fromFunction1(undo))
    __obj.asInstanceOf[IUndoer[T]]
  }
}

