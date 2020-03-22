package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDisposable.mod.IDisposable
import typings.std.MouseEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which handles mouse events for the data grid.
  */
trait IMouseHandler extends IDisposable {
  /**
    * Handle the context menu event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The context menu event of interest.
    */
  def onContextMenu(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the mouse double click event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse double click event of interest.
    */
  def onMouseDoubleClick(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the mouse down event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse down event of interest.
    */
  def onMouseDown(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the mouse hover event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse hover event of interest.
    */
  def onMouseHover(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the mouse leave event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse hover event of interest.
    */
  def onMouseLeave(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the mouse move event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse move event of interest.
    */
  def onMouseMove(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the mouse up event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse up event of interest.
    */
  def onMouseUp(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit
  /**
    * Handle the wheel event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The wheel event of interest.
    */
  def onWheel(grid: typings.luminoDatagrid.datagridMod.DataGrid, event: WheelEvent): Unit
  /**
    * Release any resources acquired during a mouse press.
    *
    * #### Notes
    * This method is called when the mouse should be released
    * independent of a mouseup event, such as an early detach.
    */
  def release(): Unit
}

object IMouseHandler {
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    onContextMenu: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseDoubleClick: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseDown: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseHover: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseLeave: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseMove: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseUp: (typings.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onWheel: (typings.luminoDatagrid.datagridMod.DataGrid, WheelEvent) => Unit,
    release: () => Unit
  ): IMouseHandler = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction2(onContextMenu), onMouseDoubleClick = js.Any.fromFunction2(onMouseDoubleClick), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseHover = js.Any.fromFunction2(onMouseHover), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), onMouseUp = js.Any.fromFunction2(onMouseUp), onWheel = js.Any.fromFunction2(onWheel), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[IMouseHandler]
  }
}

