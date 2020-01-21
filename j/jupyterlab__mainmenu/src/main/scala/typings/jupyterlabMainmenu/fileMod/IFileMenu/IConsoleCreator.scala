package typings.jupyterlabMainmenu.fileMod.IFileMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.phosphorWidgets.mod.Widget
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
    val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), name = name.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any])
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IConsoleCreator[T]]
  }
}

