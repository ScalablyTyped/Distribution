package typings.atJupyterlabLauncher.atJupyterlabLauncherMod

import typings.atJupyterlabLauncher.atJupyterlabLauncherMod.ILauncher.IItemOptions
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ILauncher")
trait ILauncher_ extends js.Object {
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
  def add(options: IItemOptions): IDisposable
}

object ILauncher_ {
  @scala.inline
  def apply(add: IItemOptions => IDisposable): ILauncher_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
  
    __obj.asInstanceOf[ILauncher_]
  }
}

