package typings
package atJupyterlabMainmenuLib.libFileMod.IFileMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an activity that has some cleanup action associated
  * with it in addition to merely closing its widget in the main area.
  */
trait ICloseAndCleaner[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A label to use for the cleanup action.
    */
  var action: java.lang.String
  /**
    * A label to use for the activity that is being cleaned up.
    */
  var name: java.lang.String
  /**
    * A function to perform the close and cleanup action.
    */
  def closeAndCleanup(widget: T): js.Promise[scala.Unit]
}

object ICloseAndCleaner {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    action: java.lang.String,
    closeAndCleanup: T => js.Promise[scala.Unit],
    name: java.lang.String,
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: T => scala.Boolean = null
  ): ICloseAndCleaner[T] = {
    val __obj = js.Dynamic.literal(action = action, closeAndCleanup = js.Any.fromFunction1(closeAndCleanup), name = name, tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[ICloseAndCleaner[T]]
  }
}

