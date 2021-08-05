package typings.luminoDatagrid

import typings.luminoDatagrid.datagridMod.DataGrid
import typings.luminoDatagrid.datagridMod.DataGrid.IMouseHandler
import typings.std.MouseEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicmousehandlerMod {
  
  @JSImport("@lumino/datagrid/lib/basicmousehandler", "BasicMouseHandler")
  @js.native
  class BasicMouseHandler ()
    extends StObject
       with IMouseHandler {
    
    /* private */ var _disposed: js.Any = js.native
    
    /* private */ var _pressData: js.Any = js.native
    
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
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Handle the context menu event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The context menu event of interest.
      */
    /* CompleteClass */
    override def onContextMenu(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse double click event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse double click event of interest.
      */
    /* CompleteClass */
    override def onMouseDoubleClick(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse down event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse down event of interest.
      */
    /* CompleteClass */
    override def onMouseDown(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse hover event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse hover event of interest.
      */
    /* CompleteClass */
    override def onMouseHover(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse leave event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse hover event of interest.
      */
    /* CompleteClass */
    override def onMouseLeave(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse move event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse move event of interest.
      */
    /* CompleteClass */
    override def onMouseMove(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the mouse up event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The mouse up event of interest.
      */
    /* CompleteClass */
    override def onMouseUp(grid: DataGrid, event: MouseEvent): Unit = js.native
    
    /**
      * Handle the wheel event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The wheel event of interest.
      */
    /* CompleteClass */
    override def onWheel(grid: DataGrid, event: WheelEvent): Unit = js.native
    
    /**
      * Release any resources acquired during a mouse press.
      *
      * #### Notes
      * This method is called when the mouse should be released
      * independent of a mouseup event, such as an early detach.
      */
    /* CompleteClass */
    override def release(): Unit = js.native
  }
}
