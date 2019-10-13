package typings.atJupyterlabLauncher.atJupyterlabLauncherMod

import typings.atJupyterlabApputils.libVdomMod.VDomModel
import typings.atJupyterlabLauncher.atJupyterlabLauncherMod.ILauncher.IItemOptions
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/launcher", "LauncherModel")
@js.native
class LauncherModel ()
  extends VDomModel
     with ILauncher {
  var _items: js.Any = js.native
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
  /* InferMemberOverrides */
  override def add(options: IItemOptions): IDisposable = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Return an iterator of launcher items.
    */
  def items(): IIterator[IItemOptions] = js.native
}

