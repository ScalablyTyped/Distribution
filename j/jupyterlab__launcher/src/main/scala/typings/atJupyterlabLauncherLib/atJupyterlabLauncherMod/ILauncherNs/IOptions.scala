package typings
package atJupyterlabLauncherLib.atJupyterlabLauncherMod.ILauncherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a Launcher.
  */
trait IOptions extends js.Object {
  /**
    * The command registry used by the launcher.
    */
  var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  /**
    * The cwd of the launcher.
    */
  var cwd: java.lang.String
  /**
    * The callback used when an item is launched.
    */
  def callback(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit
}

object IOptions {
  @scala.inline
  def apply(
    callback: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget => scala.Unit,
    commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry,
    cwd: java.lang.String
  ): IOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), commands = commands, cwd = cwd)
  
    __obj.asInstanceOf[IOptions]
  }
}

