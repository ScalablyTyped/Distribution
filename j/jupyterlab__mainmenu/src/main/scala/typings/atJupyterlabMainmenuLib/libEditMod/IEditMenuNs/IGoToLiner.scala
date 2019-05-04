package typings
package atJupyterlabMainmenuLib.libEditMod.IEditMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Go to Line.
  */
trait IGoToLiner[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * Execute a go to line command for the activity.
    */
  var goToLine: js.UndefOr[js.Function1[/* widget */ T, scala.Unit]] = js.undefined
}

object IGoToLiner {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    goToLine: /* widget */ T => scala.Unit = null,
    isEnabled: T => scala.Boolean = null
  ): IGoToLiner[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker)
    if (goToLine != null) __obj.updateDynamic("goToLine")(js.Any.fromFunction1(goToLine))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IGoToLiner[T]]
  }
}

