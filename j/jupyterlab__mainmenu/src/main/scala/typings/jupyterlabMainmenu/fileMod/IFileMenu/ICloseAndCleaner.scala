package typings.jupyterlabMainmenu.fileMod.IFileMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that has some cleanup action associated
  * with it in addition to merely closing its widget in the main area.
  */
trait ICloseAndCleaner[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A label to use for the cleanup action.
    */
  var action: String
  /**
    * A label to use for the activity that is being cleaned up.
    */
  var name: String
  /**
    * A function to perform the close and cleanup action.
    */
  def closeAndCleanup(widget: T): js.Promise[Unit]
}

object ICloseAndCleaner {
  @scala.inline
  def apply[/* <: typings.luminoWidgets.mod.Widget */ T](
    action: String,
    closeAndCleanup: T => js.Promise[Unit],
    name: String,
    tracker: IWidgetTracker[T],
    isEnabled: T => Boolean = null
  ): ICloseAndCleaner[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], closeAndCleanup = js.Any.fromFunction1(closeAndCleanup), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[ICloseAndCleaner[T]]
  }
}

