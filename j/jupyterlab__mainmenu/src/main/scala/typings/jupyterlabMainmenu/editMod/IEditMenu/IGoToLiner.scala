package typings.jupyterlabMainmenu.editMod.IEditMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that uses Go to Line.
  */
trait IGoToLiner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * Execute a go to line command for the activity.
    */
  var goToLine: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.undefined
}

object IGoToLiner {
  @scala.inline
  def apply[/* <: typings.luminoWidgets.mod.Widget */ T](
    tracker: IWidgetTracker[T],
    goToLine: /* widget */ T => Unit = null,
    isEnabled: T => Boolean = null
  ): IGoToLiner[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    if (goToLine != null) __obj.updateDynamic("goToLine")(js.Any.fromFunction1(goToLine))
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IGoToLiner[T]]
  }
}

