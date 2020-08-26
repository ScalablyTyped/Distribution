package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDisposable.mod.IDisposable
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which handles keydown events for the data grid.
  */
@js.native
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
  def onKeyDown(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: KeyboardEvent): Unit = js.native
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
  @scala.inline
  implicit class IKeyHandlerOps[Self <: IKeyHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnKeyDown(value: (typings.luminoDatagrid.datagridMod.DataGrid, KeyboardEvent) => Unit): Self = this.set("onKeyDown", js.Any.fromFunction2(value))
  }
  
}

