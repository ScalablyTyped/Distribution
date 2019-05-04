package typings
package atJupyterlabLauncherLib.atJupyterlabLauncherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILauncher extends js.Object {
  /**
    * Add a command item to the launcher, and trigger re-render event for parent
    * widget.
    *
    * @param options - The specification options for a launcher item.
    *
    * @returns A disposable that will remove the item from Launcher, and trigger
    * re-render event for parent widget.
    *
    */
  def add(options: atJupyterlabLauncherLib.atJupyterlabLauncherMod.ILauncherNs.IItemOptions): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
}

object ILauncher {
  @scala.inline
  def apply(
    add: atJupyterlabLauncherLib.atJupyterlabLauncherMod.ILauncherNs.IItemOptions => atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
  ): ILauncher = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
  
    __obj.asInstanceOf[ILauncher]
  }
}

