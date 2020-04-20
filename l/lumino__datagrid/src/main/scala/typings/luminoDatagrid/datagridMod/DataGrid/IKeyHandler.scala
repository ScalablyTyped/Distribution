package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDisposable.mod.IDisposable
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which handles keydown events for the data grid.
  */
trait IKeyHandler extends IDisposable {
  /**
    * Handle the key down event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The keydown event of interest.
    *
    * #### Notes
    * This will not be called if the mouse button is pressed.
    */
  def onKeyDown(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: KeyboardEvent): Unit
}

object IKeyHandler {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    onKeyDown: (typings.luminoDatagrid.datagridMod.DataGrid, KeyboardEvent) => Unit
  ): IKeyHandler = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown))
    __obj.asInstanceOf[IKeyHandler]
  }
}

