package typings.atJupyterlabMainmenu.libFileMod.IFileMenuNs

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabMainmenu.libLabmenuMod.IMenuExtender
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a command to create a console for an activity.
  */
trait IConsoleCreator[T /* <: Widget */] extends IMenuExtender[T] {
  /**
    * A label to use for the activity for which a console is being created.
    */
  var name: String
  /**
    * The function to create the console.
    */
  def createConsole(widget: T): js.Promise[Unit]
}

object IConsoleCreator {
  @scala.inline
  def apply[T /* <: Widget */](
    createConsole: T => js.Promise[Unit],
    name: String,
    tracker: IWidgetTracker[T],
    isEnabled: T => Boolean = null
  ): IConsoleCreator[T] = {
    val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), name = name, tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IConsoleCreator[T]]
  }
}

