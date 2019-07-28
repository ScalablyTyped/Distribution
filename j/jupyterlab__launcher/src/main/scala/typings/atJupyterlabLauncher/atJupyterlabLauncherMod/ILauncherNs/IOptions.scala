package typings.atJupyterlabLauncher.atJupyterlabLauncherMod.ILauncherNs

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
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
  var commands: CommandRegistry
  /**
    * The cwd of the launcher.
    */
  var cwd: String
  /**
    * The callback used when an item is launched.
    */
  def callback(widget: Widget): Unit
}

object IOptions {
  @scala.inline
  def apply(callback: Widget => Unit, commands: CommandRegistry, cwd: String): IOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), commands = commands, cwd = cwd)
  
    __obj.asInstanceOf[IOptions]
  }
}

