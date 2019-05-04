package typings
package atJupyterlabMainmenuLib.libFileMod.IFileMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a command to create a console for an activity.
  */
trait IConsoleCreator[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */]
  extends atJupyterlabMainmenuLib.libLabmenuMod.IMenuExtender[T] {
  /**
    * A label to use for the activity for which a console is being created.
    */
  var name: java.lang.String
  /**
    * The function to create the console.
    */
  def createConsole(widget: T): js.Promise[scala.Unit]
}

object IConsoleCreator {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */](
    createConsole: T => js.Promise[scala.Unit],
    name: java.lang.String,
    tracker: atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[T],
    isEnabled: T => scala.Boolean = null
  ): IConsoleCreator[T] = {
    val __obj = js.Dynamic.literal(createConsole = js.Any.fromFunction1(createConsole), name = name, tracker = tracker)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[IConsoleCreator[T]]
  }
}

