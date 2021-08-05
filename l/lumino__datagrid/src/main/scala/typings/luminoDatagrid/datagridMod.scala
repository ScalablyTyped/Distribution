package typings.luminoDatagrid

import typings.luminoDatagrid.anon.Color1
import typings.luminoDatagrid.anon.Lx
import typings.luminoDatagrid.anon.Vx
import typings.luminoDatagrid.celleditorcontrollerMod.ICellEditorController
import typings.luminoDatagrid.cellrendererMod.CellRenderer
import typings.luminoDatagrid.datagridMod.DataGrid.CopyConfig
import typings.luminoDatagrid.datagridMod.DataGrid.DefaultSizes_
import typings.luminoDatagrid.datagridMod.DataGrid.HeaderVisibility
import typings.luminoDatagrid.datagridMod.DataGrid.HitTestResult
import typings.luminoDatagrid.datagridMod.DataGrid.IKeyHandler
import typings.luminoDatagrid.datagridMod.DataGrid.IMouseHandler
import typings.luminoDatagrid.datagridMod.DataGrid.IOptions
import typings.luminoDatagrid.datagridMod.DataGrid.Style
import typings.luminoDatagrid.datamodelMod.DataModel
import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.ColumnRegion
import typings.luminoDatagrid.datamodelMod.DataModel.Metadata
import typings.luminoDatagrid.datamodelMod.DataModel.RowRegion
import typings.luminoDatagrid.luminoDatagridStrings.all
import typings.luminoDatagrid.luminoDatagridStrings.column
import typings.luminoDatagrid.luminoDatagridStrings.down
import typings.luminoDatagrid.luminoDatagridStrings.left
import typings.luminoDatagrid.luminoDatagridStrings.none
import typings.luminoDatagrid.luminoDatagridStrings.right
import typings.luminoDatagrid.luminoDatagridStrings.row
import typings.luminoDatagrid.luminoDatagridStrings.up
import typings.luminoDatagrid.luminoDatagridStrings.void
import typings.luminoDatagrid.renderermapMod.RendererMap
import typings.luminoDatagrid.selectionmodelMod.SelectionModel
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.IMessageHandler
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datagridMod {
  
  @JSImport("@lumino/datagrid/lib/datagrid", "DataGrid")
  @js.native
  /**
    * Construct a new data grid.
    *
    * @param options - The options for initializing the data grid.
    */
  class DataGrid () extends Widget {
    def this(options: IOptions) = this()
    
    /**
      * Blit content into the on-screen grid canvas.
      *
      * The rect should be expressed in viewport coordinates.
      *
      * This automatically accounts for the dpi ratio.
      */
    /* private */ var _blitContent: js.Any = js.native
    
    /* private */ var _buffer: js.Any = js.native
    
    /* private */ var _bufferGC: js.Any = js.native
    
    /* private */ var _canvas: js.Any = js.native
    
    /* private */ var _canvasGC: js.Any = js.native
    
    /* private */ var _cellRenderers: js.Any = js.native
    
    /* private */ var _columnHeaderSections: js.Any = js.native
    
    /* private */ var _columnSections: js.Any = js.native
    
    /* private */ var _copyConfig: js.Any = js.native
    
    /* private */ var _dataModel: js.Any = js.native
    
    /* private */ var _dpiRatio: js.Any = js.native
    
    /**
      * Draw the background for the given paint region.
      */
    /* private */ var _drawBackground: js.Any = js.native
    
    /**
      * Draw the body region which intersects the dirty rect.
      */
    /* private */ var _drawBodyRegion: js.Any = js.native
    
    /**
      * Draw the body selections for the data grid.
      */
    /* private */ var _drawBodySelections: js.Any = js.native
    
    /**
      * Draw the cells for the given paint region.
      */
    /* private */ var _drawCells: js.Any = js.native
    
    /**
      * Draw the column background for the given paint region.
      */
    /* private */ var _drawColumnBackground: js.Any = js.native
    
    /**
      * Draw the column header region which intersects the dirty rect.
      */
    /* private */ var _drawColumnHeaderRegion: js.Any = js.native
    
    /**
      * Draw the column header selections for the data grid.
      */
    /* private */ var _drawColumnHeaderSelections: js.Any = js.native
    
    /**
      * Draw the corner header region which intersects the dirty rect.
      */
    /* private */ var _drawCornerHeaderRegion: js.Any = js.native
    
    /**
      * Draw the overlay cursor for the data grid.
      */
    /* private */ var _drawCursor: js.Any = js.native
    
    /**
      * Draw the horizontal grid lines for the given paint region.
      */
    /* private */ var _drawHorizontalGridLines: js.Any = js.native
    
    /**
      * Draw the row background for the given paint region.
      */
    /* private */ var _drawRowBackground: js.Any = js.native
    
    /**
      * Draw the row header region which intersects the dirty rect.
      */
    /* private */ var _drawRowHeaderRegion: js.Any = js.native
    
    /**
      * Draw the row header selections for the data grid.
      */
    /* private */ var _drawRowHeaderSelections: js.Any = js.native
    
    /**
      * Draw the overlay shadows for the data grid.
      */
    /* private */ var _drawShadows: js.Any = js.native
    
    /**
      * Draw the vertical grid lines for the given paint region.
      */
    /* private */ var _drawVerticalGridLines: js.Any = js.native
    
    /**
      * Draw the void region for the dirty rect.
      */
    /* private */ var _drawVoidRegion: js.Any = js.native
    
    /* private */ var _editingEnabled: js.Any = js.native
    
    /* private */ var _editorController: js.Any = js.native
    
    /**
      * Handle the `'contextmenu'` event for the data grid.
      */
    /* private */ var _evtContextMenu: js.Any = js.native
    
    /**
      * Handle the `'keydown'` event for the data grid.
      */
    /* private */ var _evtKeyDown: js.Any = js.native
    
    /**
      * Handle the `'dblclick'` event for the data grid.
      */
    /* private */ var _evtMouseDoubleClick: js.Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the data grid.
      */
    /* private */ var _evtMouseDown: js.Any = js.native
    
    /**
      * Handle the `'mouseleave'` event for the data grid.
      */
    /* private */ var _evtMouseLeave: js.Any = js.native
    
    /**
      * Handle the `'mousemove'` event for the data grid.
      */
    /* private */ var _evtMouseMove: js.Any = js.native
    
    /**
      * Handle the `'mouseup'` event for the data grid.
      */
    /* private */ var _evtMouseUp: js.Any = js.native
    
    /**
      * Handle the `'wheel'` event for the data grid.
      */
    /* private */ var _evtWheel: js.Any = js.native
    
    /* private */ var _hScrollBar: js.Any = js.native
    
    /* private */ var _hScrollBarMinHeight: js.Any = js.native
    
    /* private */ var _headerVisibility: js.Any = js.native
    
    /* private */ var _keyHandler: js.Any = js.native
    
    /* private */ var _mouseHandler: js.Any = js.native
    
    /* private */ var _mousedown: js.Any = js.native
    
    /**
      * Handle cells changing in the data model.
      */
    /* private */ var _onCellsChanged: js.Any = js.native
    
    /**
      * Handle columns being inserted into the data model.
      */
    /* private */ var _onColumnsInserted: js.Any = js.native
    
    /**
      * Handle columns moving in the data model.
      */
    /* private */ var _onColumnsMoved: js.Any = js.native
    
    /**
      * Handle columns being removed from the data model.
      */
    /* private */ var _onColumnsRemoved: js.Any = js.native
    
    /**
      * A signal handler for the data model `changed` signal.
      */
    /* private */ var _onDataModelChanged: js.Any = js.native
    
    /**
      * Handle a full data model reset.
      */
    /* private */ var _onModelReset: js.Any = js.native
    
    /**
      * Handle the `pageRequested` signal from a scroll bar.
      */
    /* private */ var _onPageRequested: js.Any = js.native
    
    /**
      * A signal handler for the renderer map `changed` signal.
      */
    /* private */ var _onRenderersChanged: js.Any = js.native
    
    /**
      * Handle rows being inserted in the data model.
      */
    /* private */ var _onRowsInserted: js.Any = js.native
    
    /**
      * Handle rows moving in the data model.
      */
    /* private */ var _onRowsMoved: js.Any = js.native
    
    /**
      * Handle rows being removed from the data model.
      */
    /* private */ var _onRowsRemoved: js.Any = js.native
    
    /**
      * A signal handler for the selection model `changed` signal.
      */
    /* private */ var _onSelectionsChanged: js.Any = js.native
    
    /**
      * Handle the `stepRequested` signal from a scroll bar.
      */
    /* private */ var _onStepRequested: js.Any = js.native
    
    /**
      * Handle the `thumbMoved` signal from a scroll bar.
      */
    /* private */ var _onThumbMoved: js.Any = js.native
    
    /**
      * A message hook invoked on a viewport `'column-resize-request'` message.
      */
    /* private */ var _onViewportColumnResizeRequest: js.Any = js.native
    
    /**
      * A message hook invoked on a viewport `'overlay-paint-request'` message.
      */
    /* private */ var _onViewportOverlayPaintRequest: js.Any = js.native
    
    /**
      * A message hook invoked on a viewport `'paint-request'` message.
      */
    /* private */ var _onViewportPaintRequest: js.Any = js.native
    
    /**
      * A message hook invoked on a viewport `'resize'` message.
      */
    /* private */ var _onViewportResize: js.Any = js.native
    
    /**
      * A message hook invoked on a viewport `'row-resize-request'` message.
      */
    /* private */ var _onViewportRowResizeRequest: js.Any = js.native
    
    /**
      * A message hook invoked on a viewport `'scroll-request'` message.
      */
    /* private */ var _onViewportScrollRequest: js.Any = js.native
    
    /* private */ var _overlay: js.Any = js.native
    
    /* private */ var _overlayGC: js.Any = js.native
    
    /**
      * Paint the grid content for the given dirty rect.
      *
      * The rect should be expressed in valid viewport coordinates.
      *
      * This is the primary paint entry point. The individual `_draw*`
      * methods should not be invoked directly. This method dispatches
      * to the drawing methods in the correct order.
      */
    /* private */ var _paintContent: js.Any = js.native
    
    /**
      * Paint the overlay content for the entire grid.
      *
      * This is the primary overlay paint entry point. The individual
      * `_draw*` methods should not be invoked directly. This method
      * dispatches to the drawing methods in the correct order.
      */
    /* private */ var _paintOverlay: js.Any = js.native
    
    /**
      * Process a message sent to the viewport
      */
    /* private */ var _processViewportMessage: js.Any = js.native
    
    /**
      * Refresh the dpi ratio.
      */
    /* private */ var _refreshDPI: js.Any = js.native
    
    /**
      * Release the mouse grab.
      */
    /* private */ var _releaseMouse: js.Any = js.native
    
    /**
      * Schedule a repaint of all of the grid content.
      */
    /* private */ var _repaintContent: js.Any = js.native
    
    /**
      * Schedule a repaint of the overlay.
      */
    /* private */ var _repaintOverlay: js.Any = js.native
    
    /**
      * Schedule a repaint of specific grid content.
      */
    /* private */ var _repaintRegion: js.Any = js.native
    
    /**
      * Ensure the canvas is at least the specified size.
      *
      * This method will retain the valid canvas content.
      */
    /* private */ var _resizeCanvasIfNeeded: js.Any = js.native
    
    /**
      * Resize a column section immediately.
      */
    /* private */ var _resizeColumn: js.Any = js.native
    
    /**
      * Resize a column header section immediately.
      */
    /* private */ var _resizeColumnHeader: js.Any = js.native
    
    /**
      * Resize a row section immediately.
      */
    /* private */ var _resizeRow: js.Any = js.native
    
    /**
      * Resize a row header section immediately.
      */
    /* private */ var _resizeRowHeader: js.Any = js.native
    
    /* private */ var _rowHeaderSections: js.Any = js.native
    
    /* private */ var _rowSections: js.Any = js.native
    
    /* private */ var _scrollCorner: js.Any = js.native
    
    /**
      * Scroll immediately to the specified offset position.
      */
    /* private */ var _scrollTo: js.Any = js.native
    
    /* private */ var _scrollX: js.Any = js.native
    
    /* private */ var _scrollY: js.Any = js.native
    
    /* private */ var _selectionModel: js.Any = js.native
    
    /* private */ var _stretchLastColumn: js.Any = js.native
    
    /* private */ var _stretchLastRow: js.Any = js.native
    
    /* private */ var _style: js.Any = js.native
    
    /**
      * Sync the scroll bars and scroll state with the viewport.
      *
      * #### Notes
      * If the visibility of either scroll bar changes, a synchronous
      * fit-request will be dispatched to the data grid to immediately
      * resize the viewport.
      */
    /* private */ var _syncScrollState: js.Any = js.native
    
    /**
      * Sync the viewport to the given scroll position.
      *
      * #### Notes
      * This schedules a full repaint and syncs the scroll state.
      */
    /* private */ var _syncViewport: js.Any = js.native
    
    /* private */ var _vScrollBar: js.Any = js.native
    
    /* private */ var _vScrollBarMinWidth: js.Any = js.native
    
    /* private */ var _viewport: js.Any = js.native
    
    /* private */ var _viewportHeight: js.Any = js.native
    
    /* private */ var _viewportWidth: js.Any = js.native
    
    /**
      * The virtual height of the grid body.
      *
      * #### Notes
      * This does *not* account for a stretched last row.
      */
    val bodyHeight: Double = js.native
    
    /**
      * The virtual width of the grid body.
      *
      * #### Notes
      * This does *not* account for a stretched last column.
      */
    val bodyWidth: Double = js.native
    
    /**
      * Get the cell renderer map for the data grid.
      */
    /**
      * Set the cell renderer map for the data grid.
      */
    var cellRenderers: RendererMap = js.native
    
    /**
      * Get the column at a virtual offset in the data grid.
      *
      * @param region - The region which holds the column of interest.
      *
      * @param offset - The virtual offset of the column of interest.
      *
      * @returns The index of the column, or `-1` if the offset is out of range.
      *
      * #### Notes
      * This method accounts for a stretched last column.
      */
    def columnAt(region: ColumnRegion, offset: Double): Double = js.native
    
    /**
      * Get the column count for a particular region in the data grid.
      *
      * @param region - The column region of interest.
      *
      * @returns The column count for the specified region.
      */
    def columnCount(region: RowRegion): Double = js.native
    
    /**
      * Get the offset of a column in the data grid.
      *
      * @param region - The region which holds the column of interest.
      *
      * @param index - The index of the column of interest.
      *
      * @returns The offset of the column, or `-1` if the index is out of range.
      *
      * #### Notes
      * A stretched last column has no effect on the return value.
      */
    def columnOffset(region: ColumnRegion, index: Double): Double = js.native
    
    /**
      * Get the size of a column in the data grid.
      *
      * @param region - The region which holds the column of interest.
      *
      * @param index - The index of the column of interest.
      *
      * @returns The size of the column, or `-1` if the index is out of range.
      *
      * #### Notes
      * This method accounts for a stretched last column.
      */
    def columnSize(region: ColumnRegion, index: Double): Double = js.native
    
    /**
      * Get the copy configuration for the data grid.
      */
    /**
      * Set the copy configuration for the data grid.
      */
    var copyConfig: CopyConfig = js.native
    
    /**
      * Copy the current selection to the system clipboard.
      *
      * #### Notes
      * The grid must have a data model and a selection model.
      *
      * The behavior can be configured via `DataGrid.copyConfig`.
      */
    def copyToClipboard(): Unit = js.native
    
    /**
      * Get the data model for the data grid.
      */
    /**
      * Set the data model for the data grid.
      *
      * #### Notes
      * This will automatically remove the current selection model.
      */
    var dataModel: DataModel | Null = js.native
    
    /**
      * Get the default sizes for the various sections of the data grid.
      */
    /**
      * Set the default sizes for the various sections of the data grid.
      */
    var defaultSizes: DefaultSizes_ = js.native
    
    /**
      * Whether the grid cells are editable.
      *
      * `editingEnabled` flag must be on and grid must have required
      * selection model, editor controller and data model properties.
      */
    val editable: Boolean = js.native
    
    /**
      * Whether the cell editing is enabled for the data grid.
      */
    var editingEnabled: Boolean = js.native
    
    /**
      * The cell editor controller object for the data grid.
      */
    var editorController: ICellEditorController | Null = js.native
    
    /**
      * Handle the DOM events for the data grid.
      *
      * @param event - The DOM event sent to the data grid.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the data grid's DOM node. It
      * should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The virtual height of the column headers.
      */
    val headerHeight: Double = js.native
    
    /**
      * Get the header visibility for the data grid.
      */
    /**
      * Set the header visibility for the data grid.
      */
    var headerVisibility: HeaderVisibility = js.native
    
    /**
      * The virtual width of the row headers.
      */
    val headerWidth: Double = js.native
    
    /**
      * Hit test the viewport for the given client position.
      *
      * @param clientX - The client X position of the mouse.
      *
      * @param clientY - The client Y position of the mouse.
      *
      * @returns The hit test result, or `null` if the client
      *   position is out of bounds.
      *
      * #### Notes
      * This method accounts for a stretched last row and/or column.
      */
    def hitTest(clientX: Double, clientY: Double): HitTestResult = js.native
    
    /**
      * Get the key handler for the data grid.
      */
    /**
      * Set the key handler for the data grid.
      */
    var keyHandler: IKeyHandler | Null = js.native
    
    /**
      * Map a client position to local viewport coordinates.
      *
      * @param clientX - The client X position of the mouse.
      *
      * @param clientY - The client Y position of the mouse.
      *
      * @returns The local viewport coordinates for the position.
      */
    def mapToLocal(clientX: Double, clientY: Double): Lx = js.native
    
    /**
      * Map a client position to virtual grid coordinates.
      *
      * @param clientX - The client X position of the mouse.
      *
      * @param clientY - The client Y position of the mouse.
      *
      * @returns The virtual grid coordinates for the position.
      */
    def mapToVirtual(clientX: Double, clientY: Double): Vx = js.native
    
    /**
      * The maximum scroll X position for the grid.
      */
    val maxScrollX: Double = js.native
    
    /**
      * The maximum scroll Y position for the grid.
      */
    val maxScrollY: Double = js.native
    
    /**
      * Intercept a message sent to a message handler.
      *
      * @param handler - The target handler of the message.
      *
      * @param msg - The message to be sent to the handler.
      *
      * @returns `true` if the message should continue to be processed
      *   as normal, or `false` if processing should cease immediately.
      */
    def messageHook(handler: IMessageHandler, msg: Message): Boolean = js.native
    
    /**
      * Get the mouse handler for the data grid.
      */
    /**
      * Set the mouse handler for the data grid.
      */
    var mouseHandler: IMouseHandler | Null = js.native
    
    /**
      * Move cursor down/up/left/right while making sure it remains
      * within the bounds of selected rectangles
      *
      * @param direction - The direction of the movement.
      */
    def moveCursor(direction: CursorMoveDirection): Unit = js.native
    
    /**
      * A message handler invoked on a `'resize'` message.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
    /**
      * The height of the visible portion of the grid body.
      */
    val pageHeight: Double = js.native
    
    /**
      * The width of the visible portion of the grid body.
      */
    val pageWidth: Double = js.native
    
    /**
      * Reset modified columns to their default size.
      *
      * @param region - The column region of interest.
      */
    def resetColumns(region: ColumnRegion): Unit = js.native
    @JSName("resetColumns")
    def resetColumns_all(region: all): Unit = js.native
    
    /**
      * Reset modified rows to their default size.
      *
      * @param region - The row region of interest.
      */
    def resetRows(region: RowRegion): Unit = js.native
    @JSName("resetRows")
    def resetRows_all(region: all): Unit = js.native
    
    /**
      * Resize a column in the data grid.
      *
      * @param region - The region which holds the column of interest.
      *
      * @param index - The index of the column of interest.
      *
      * @param size - The desired size of the column.
      */
    def resizeColumn(region: ColumnRegion, index: Double, size: Double): Unit = js.native
    
    /**
      * Resize a row in the data grid.
      *
      * @param region - The region which holds the row of interest.
      *
      * @param index - The index of the row of interest.
      *
      * @param size - The desired size of the row.
      */
    def resizeRow(region: RowRegion, index: Double, size: Double): Unit = js.native
    
    /**
      * Get the row at a virtual offset in the data grid.
      *
      * @param region - The region which holds the row of interest.
      *
      * @param offset - The virtual offset of the row of interest.
      *
      * @returns The index of the row, or `-1` if the offset is out of range.
      *
      * #### Notes
      * This method accounts for a stretched last row.
      */
    def rowAt(region: RowRegion, offset: Double): Double = js.native
    
    /**
      * Get the row count for a particular region in the data grid.
      *
      * @param region - The row region of interest.
      *
      * @returns The row count for the specified region.
      */
    def rowCount(region: RowRegion): Double = js.native
    
    /**
      * Get the offset of a row in the data grid.
      *
      * @param region - The region which holds the row of interest.
      *
      * @param index - The index of the row of interest.
      *
      * @returns The offset of the row, or `-1` if the index is out of range.
      *
      * #### Notes
      * A stretched last row has no effect on the return value.
      */
    def rowOffset(region: RowRegion, index: Double): Double = js.native
    
    /**
      * Get the size of a row in the data grid.
      *
      * @param region - The region which holds the row of interest.
      *
      * @param index - The index of the row of interest.
      *
      * @returns The size of the row, or `-1` if the index is out of range.
      *
      * #### Notes
      * This method accounts for a stretched last row.
      */
    def rowSize(region: RowRegion, index: Double): Double = js.native
    
    /**
      * Scroll the viewport by the specified amount.
      *
      * @param dx - The X scroll amount.
      *
      * @param dy - The Y scroll amount.
      */
    def scrollBy(dx: Double, dy: Double): Unit = js.native
    
    @JSName("scrollByPage")
    def scrollByPage_down(dir: down): Unit = js.native
    @JSName("scrollByPage")
    def scrollByPage_left(dir: left): Unit = js.native
    @JSName("scrollByPage")
    def scrollByPage_right(dir: right): Unit = js.native
    /**
      * Scroll the viewport by one page.
      *
      * @param dir - The desired direction of the scroll.
      */
    @JSName("scrollByPage")
    def scrollByPage_up(dir: up): Unit = js.native
    
    @JSName("scrollByStep")
    def scrollByStep_down(dir: down): Unit = js.native
    @JSName("scrollByStep")
    def scrollByStep_left(dir: left): Unit = js.native
    @JSName("scrollByStep")
    def scrollByStep_right(dir: right): Unit = js.native
    /**
      * Scroll the viewport by one cell-aligned step.
      *
      * @param dir - The desired direction of the scroll.
      */
    @JSName("scrollByStep")
    def scrollByStep_up(dir: up): Unit = js.native
    
    /**
      * Scroll to the specified offset position.
      *
      * @param x - The desired X position.
      *
      * @param y - The desired Y position.
      */
    def scrollTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Scroll the grid to the specified cell.
      *
      * @param row - The row index of the cell.
      *
      * @param column - The column index of the cell.
      *
      * #### Notes
      * This is a no-op if the cell is already visible.
      */
    def scrollToCell(row: Double, column: Double): Unit = js.native
    
    /**
      * Scroll the grid to the specified column.
      *
      * @param column - The column index of the cell.
      *
      * #### Notes
      * This is a no-op if the column is already visible.
      */
    def scrollToColumn(column: Double): Unit = js.native
    
    /**
      * Scroll the grid to the current cursor position.
      *
      * #### Notes
      * This is a no-op if the cursor is already visible or
      * if there is no selection model installed on the grid.
      */
    def scrollToCursor(): Unit = js.native
    
    /**
      * Scroll the grid to the specified row.
      *
      * @param row - The row index of the cell.
      *
      * #### Notes
      * This is a no-op if the row is already visible.
      */
    def scrollToRow(row: Double): Unit = js.native
    
    /**
      * The current scroll X position of the viewport.
      */
    val scrollX: Double = js.native
    
    /**
      * The current scroll Y position of the viewport.
      */
    val scrollY: Double = js.native
    
    /**
      * Get the selection model for the data grid.
      */
    /**
      * Set the selection model for the data grid.
      */
    var selectionModel: SelectionModel | Null = js.native
    
    /**
      * Get whether the last column is stretched.
      */
    /**
      * Set whether the last column is stretched.
      */
    var stretchLastColumn: Boolean = js.native
    
    /**
      * Get whether the last row is stretched.
      */
    /**
      * Set whether the last row is stretched.
      */
    var stretchLastRow: Boolean = js.native
    
    /**
      * Get the style for the data grid.
      */
    /**
      * Set the style for the data grid.
      */
    var style: Style = js.native
    
    /**
      * The virtual height of the entire grid.
      *
      * #### Notes
      * This does *not* account for a stretched last row.
      */
    val totalHeight: Double = js.native
    
    /**
      * The virtual width of the entire grid.
      *
      * #### Notes
      * This does *not* account for a stretched last column.
      */
    val totalWidth: Double = js.native
    
    /**
      * The viewport widget for the data grid.
      */
    val viewport: Widget = js.native
    
    /**
      * The actual height of the viewport.
      */
    val viewportHeight: Double = js.native
    
    /**
      * The actual width of the viewport.
      */
    val viewportWidth: Double = js.native
  }
  object DataGrid {
    
    @JSImport("@lumino/datagrid/lib/datagrid", "DataGrid")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A generic format function for the copy handler.
      *
      * @param args - The format args for the function.
      *
      * @returns The string representation of the value.
      *
      * #### Notes
      * This function uses `String()` to coerce a value to a string.
      */
    inline def copyFormatGeneric(args: CopyFormatArgs): String = ^.asInstanceOf[js.Dynamic].applyDynamic("copyFormatGeneric")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * The default copy config for a data grid.
      */
    @JSImport("@lumino/datagrid/lib/datagrid", "DataGrid.defaultCopyConfig")
    @js.native
    val defaultCopyConfig: CopyConfig = js.native
    
    /**
      * The default sizes for a data grid.
      */
    @JSImport("@lumino/datagrid/lib/datagrid", "DataGrid.defaultSizes")
    @js.native
    val defaultSizes: DefaultSizes_ = js.native
    
    /**
      * The default theme for a data grid.
      */
    @JSImport("@lumino/datagrid/lib/datagrid", "DataGrid.defaultStyle")
    @js.native
    val defaultStyle: Style = js.native
    
    /**
      * A type alias for the data grid copy config.
      */
    trait CopyConfig extends StObject {
      
      /**
        * The function for formatting the data values.
        */
      def format(args: CopyFormatArgs): String
      
      /**
        * The headers to included in the copied output.
        */
      val headers: none | row | column | all
      
      /**
        * The separator to use between values.
        */
      val separator: String
      
      /**
        * The cell count threshold for a copy to be considered "large".
        */
      val warningThreshold: Double
    }
    object CopyConfig {
      
      inline def apply(
        format: CopyFormatArgs => String,
        headers: none | row | column | all,
        separator: String,
        warningThreshold: Double
      ): CopyConfig = {
        val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), headers = headers.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], warningThreshold = warningThreshold.asInstanceOf[js.Any])
        __obj.asInstanceOf[CopyConfig]
      }
      
      extension [Self <: CopyConfig](x: Self) {
        
        inline def setFormat(value: CopyFormatArgs => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
        
        inline def setHeaders(value: none | row | column | all): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setWarningThreshold(value: Double): Self = StObject.set(x, "warningThreshold", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the arguments to a copy format function.
      */
    trait CopyFormatArgs extends StObject {
      
      /**
        * The column index of the value.
        */
      var column: Double
      
      /**
        * The metadata for the cell.
        */
      var metadata: Metadata
      
      /**
        * The cell region for the value.
        */
      var region: CellRegion
      
      /**
        * The row index of the value.
        */
      var row: Double
      
      /**
        * The value for the cell.
        */
      var value: js.Any
    }
    object CopyFormatArgs {
      
      inline def apply(column: Double, metadata: Metadata, region: CellRegion, row: Double, value: js.Any): CopyFormatArgs = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[CopyFormatArgs]
      }
      
      extension [Self <: CopyFormatArgs](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: CellRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a copy format function.
      */
    type CopyFormatFunc = js.Function1[/* args */ CopyFormatArgs, String]
    
    /**
      * An object which defines the default sizes for a data grid.
      */
    trait DefaultSizes_ extends StObject {
      
      /**
        * The default height of a column header.
        */
      val columnHeaderHeight: Double
      
      /**
        * The default width of a column.
        */
      val columnWidth: Double
      
      /**
        * The default width of a row header.
        */
      val rowHeaderWidth: Double
      
      /**
        * The default height of a row.
        */
      val rowHeight: Double
    }
    object DefaultSizes_ {
      
      inline def apply(columnHeaderHeight: Double, columnWidth: Double, rowHeaderWidth: Double, rowHeight: Double): DefaultSizes_ = {
        val __obj = js.Dynamic.literal(columnHeaderHeight = columnHeaderHeight.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], rowHeaderWidth = rowHeaderWidth.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultSizes_]
      }
      
      extension [Self <: DefaultSizes_](x: Self) {
        
        inline def setColumnHeaderHeight(value: Double): Self = StObject.set(x, "columnHeaderHeight", value.asInstanceOf[js.Any])
        
        inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
        
        inline def setRowHeaderWidth(value: Double): Self = StObject.set(x, "rowHeaderWidth", value.asInstanceOf[js.Any])
        
        inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the supported header visibility modes.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.all
      - typings.luminoDatagrid.luminoDatagridStrings.row
      - typings.luminoDatagrid.luminoDatagridStrings.column
      - typings.luminoDatagrid.luminoDatagridStrings.none
    */
    trait HeaderVisibility extends StObject
    object HeaderVisibility {
      
      inline def all: typings.luminoDatagrid.luminoDatagridStrings.all = "all".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.all]
      
      inline def column: typings.luminoDatagrid.luminoDatagridStrings.column = "column".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.column]
      
      inline def none: typings.luminoDatagrid.luminoDatagridStrings.none = "none".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.none]
      
      inline def row: typings.luminoDatagrid.luminoDatagridStrings.row = "row".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.row]
    }
    
    /**
      * An object which holds the result of a grid hit test.
      */
    trait HitTestResult extends StObject {
      
      /**
        * The column index of the cell that was hit.
        *
        * This is `-1` for the `void` region.
        */
      val column: Double
      
      /**
        * The height of the cell.
        *
        * This is `-1` for the `void` region.
        */
      val height: Double
      
      /**
        * The region of the data grid that was hit.
        */
      val region: CellRegion | void
      
      /**
        * The row index of the cell that was hit.
        *
        * This is `-1` for the `void` region.
        */
      val row: Double
      
      /**
        * The width of the cell.
        *
        * This is `-1` for the `void` region.
        */
      val width: Double
      
      /**
        * The X coordinate of the mouse in cell coordinates.
        *
        * This is `-1` for the `void` region.
        */
      val x: Double
      
      /**
        * The Y coordinate of the mouse in cell coordinates.
        *
        * This is `-1` for the `void` region.
        */
      val y: Double
    }
    object HitTestResult {
      
      inline def apply(
        column: Double,
        height: Double,
        region: CellRegion | void,
        row: Double,
        width: Double,
        x: Double,
        y: Double
      ): HitTestResult = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[HitTestResult]
      }
      
      extension [Self <: HitTestResult](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: CellRegion | void): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An object which handles keydown events for the data grid.
      */
    trait IKeyHandler
      extends StObject
         with IDisposable {
      
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
      def onKeyDown(grid: DataGrid, event: KeyboardEvent): Unit
    }
    object IKeyHandler {
      
      inline def apply(dispose: () => Unit, isDisposed: Boolean, onKeyDown: (DataGrid, KeyboardEvent) => Unit): IKeyHandler = {
        val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction2(onKeyDown))
        __obj.asInstanceOf[IKeyHandler]
      }
      
      extension [Self <: IKeyHandler](x: Self) {
        
        inline def setOnKeyDown(value: (DataGrid, KeyboardEvent) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      }
    }
    
    /**
      * An object which handles mouse events for the data grid.
      */
    trait IMouseHandler
      extends StObject
         with IDisposable {
      
      /**
        * Handle the context menu event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The context menu event of interest.
        */
      def onContextMenu(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the mouse double click event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The mouse double click event of interest.
        */
      def onMouseDoubleClick(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the mouse down event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The mouse down event of interest.
        */
      def onMouseDown(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the mouse hover event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The mouse hover event of interest.
        */
      def onMouseHover(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the mouse leave event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The mouse hover event of interest.
        */
      def onMouseLeave(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the mouse move event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The mouse move event of interest.
        */
      def onMouseMove(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the mouse up event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The mouse up event of interest.
        */
      def onMouseUp(grid: DataGrid, event: MouseEvent): Unit
      
      /**
        * Handle the wheel event for the data grid.
        *
        * @param grid - The data grid of interest.
        *
        * @param event - The wheel event of interest.
        */
      def onWheel(grid: DataGrid, event: WheelEvent): Unit
      
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
      
      inline def apply(
        dispose: () => Unit,
        isDisposed: Boolean,
        onContextMenu: (DataGrid, MouseEvent) => Unit,
        onMouseDoubleClick: (DataGrid, MouseEvent) => Unit,
        onMouseDown: (DataGrid, MouseEvent) => Unit,
        onMouseHover: (DataGrid, MouseEvent) => Unit,
        onMouseLeave: (DataGrid, MouseEvent) => Unit,
        onMouseMove: (DataGrid, MouseEvent) => Unit,
        onMouseUp: (DataGrid, MouseEvent) => Unit,
        onWheel: (DataGrid, WheelEvent) => Unit,
        release: () => Unit
      ): IMouseHandler = {
        val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction2(onContextMenu), onMouseDoubleClick = js.Any.fromFunction2(onMouseDoubleClick), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseHover = js.Any.fromFunction2(onMouseHover), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), onMouseUp = js.Any.fromFunction2(onMouseUp), onWheel = js.Any.fromFunction2(onWheel), release = js.Any.fromFunction0(release))
        __obj.asInstanceOf[IMouseHandler]
      }
      
      extension [Self <: IMouseHandler](x: Self) {
        
        inline def setOnContextMenu(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction2(value))
        
        inline def setOnMouseDoubleClick(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onMouseDoubleClick", js.Any.fromFunction2(value))
        
        inline def setOnMouseDown(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
        
        inline def setOnMouseHover(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onMouseHover", js.Any.fromFunction2(value))
        
        inline def setOnMouseLeave(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
        
        inline def setOnMouseMove(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
        
        inline def setOnMouseUp(value: (DataGrid, MouseEvent) => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction2(value))
        
        inline def setOnWheel(value: (DataGrid, WheelEvent) => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction2(value))
        
        inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * An options object for initializing a data grid.
      */
    trait IOptions extends StObject {
      
      /**
        * The cell renderer map for the data grid.
        *
        * The default is an empty renderer map.
        */
      var cellRenderers: js.UndefOr[RendererMap] = js.undefined
      
      /**
        * The copy configuration data for the grid.
        *
        * The default is `DataGrid.defaultCopyConfig`.
        */
      var copyConfig: js.UndefOr[CopyConfig] = js.undefined
      
      /**
        * The default cell renderer for the data grid.
        *
        * The default is a new `TextRenderer`.
        */
      var defaultRenderer: js.UndefOr[CellRenderer] = js.undefined
      
      /**
        * The default sizes for the data grid.
        *
        * The default is `DataGrid.defaultSizes`.
        */
      var defaultSizes: js.UndefOr[DefaultSizes_] = js.undefined
      
      /**
        * The header visibility for the data grid.
        *
        * The default is `'all'`.
        */
      var headerVisibility: js.UndefOr[HeaderVisibility] = js.undefined
      
      /**
        * Whether to stretch the last column of the grid.
        *
        * The default is `false`.
        */
      var stretchLastColumn: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether to stretch the last row of the grid.
        *
        * The default is `false`.
        */
      var stretchLastRow: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The style for the data grid.
        *
        * The default is `DataGrid.defaultStyle`.
        */
      var style: js.UndefOr[Style] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCellRenderers(value: RendererMap): Self = StObject.set(x, "cellRenderers", value.asInstanceOf[js.Any])
        
        inline def setCellRenderersUndefined: Self = StObject.set(x, "cellRenderers", js.undefined)
        
        inline def setCopyConfig(value: CopyConfig): Self = StObject.set(x, "copyConfig", value.asInstanceOf[js.Any])
        
        inline def setCopyConfigUndefined: Self = StObject.set(x, "copyConfig", js.undefined)
        
        inline def setDefaultRenderer(value: CellRenderer): Self = StObject.set(x, "defaultRenderer", value.asInstanceOf[js.Any])
        
        inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
        
        inline def setDefaultSizes(value: DefaultSizes_): Self = StObject.set(x, "defaultSizes", value.asInstanceOf[js.Any])
        
        inline def setDefaultSizesUndefined: Self = StObject.set(x, "defaultSizes", js.undefined)
        
        inline def setHeaderVisibility(value: HeaderVisibility): Self = StObject.set(x, "headerVisibility", value.asInstanceOf[js.Any])
        
        inline def setHeaderVisibilityUndefined: Self = StObject.set(x, "headerVisibility", js.undefined)
        
        inline def setStretchLastColumn(value: Boolean): Self = StObject.set(x, "stretchLastColumn", value.asInstanceOf[js.Any])
        
        inline def setStretchLastColumnUndefined: Self = StObject.set(x, "stretchLastColumn", js.undefined)
        
        inline def setStretchLastRow(value: Boolean): Self = StObject.set(x, "stretchLastRow", value.asInstanceOf[js.Any])
        
        inline def setStretchLastRowUndefined: Self = StObject.set(x, "stretchLastRow", js.undefined)
        
        inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
    
    /**
      * An object which defines the style for a data grid.
      *
      * #### Notes
      * All style colors support the full CSS color syntax.
      */
    trait Style extends StObject {
      
      /**
        * The background color for the body cells.
        *
        * This color is layered on top of the `voidColor`.
        */
      val backgroundColor: js.UndefOr[String] = js.undefined
      
      /**
        * A function which returns the background color for a column.
        *
        * This color is layered on top of the `backgroundColor` and can
        * be used to implement "zebra striping" of the grid columns.
        */
      val columnBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
      
      /**
        * The border color for the cursor.
        */
      val cursorBorderColor: js.UndefOr[String] = js.undefined
      
      /**
        * The fill color for the cursor.
        */
      val cursorFillColor: js.UndefOr[String] = js.undefined
      
      /**
        * The color for the grid lines of the body cells.
        *
        * The grid lines are draw on top of the cell contents.
        */
      val gridLineColor: js.UndefOr[String] = js.undefined
      
      /**
        * The background color for the header cells.
        *
        * This color is layered on top of the `voidColor`.
        */
      val headerBackgroundColor: js.UndefOr[String] = js.undefined
      
      /**
        * The color for the grid lines of the header cells.
        *
        * The grid lines are draw on top of the cell contents.
        */
      val headerGridLineColor: js.UndefOr[String] = js.undefined
      
      /**
        * The color for the horizontal grid lines of the header cells.
        *
        * This overrides the `headerGridLineColor` option.
        */
      val headerHorizontalGridLineColor: js.UndefOr[String] = js.undefined
      
      /**
        * The border color for a header selection.
        */
      val headerSelectionBorderColor: js.UndefOr[String] = js.undefined
      
      /**
        * The fill color for a header selection.
        */
      val headerSelectionFillColor: js.UndefOr[String] = js.undefined
      
      /**
        * The color for the vertical grid lines of the header cells.
        *
        * This overrides the `headerGridLineColor` option.
        */
      val headerVerticalGridLineColor: js.UndefOr[String] = js.undefined
      
      /**
        * The color for the horizontal grid lines of the body cells.
        *
        * This overrides the `gridLineColor` option.
        */
      val horizontalGridLineColor: js.UndefOr[String] = js.undefined
      
      /**
        * A function which returns the background color for a row.
        *
        * This color is layered on top of the `backgroundColor` and can
        * be used to implement "zebra striping" of the grid rows.
        */
      val rowBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
      
      /**
        * The drop shadow effect when the grid is scrolled.
        */
      val scrollShadow: js.UndefOr[Color1] = js.undefined
      
      /**
        * The border color for a selection.
        */
      val selectionBorderColor: js.UndefOr[String] = js.undefined
      
      /**
        * The fill color for a selection.
        */
      val selectionFillColor: js.UndefOr[String] = js.undefined
      
      /**
        * The color for the vertical grid lines of the body cells.
        *
        * This overrides the `gridLineColor` option.
        */
      val verticalGridLineColor: js.UndefOr[String] = js.undefined
      
      /**
        * The void color for the data grid.
        *
        * This is the base fill color for the entire data grid.
        */
      val voidColor: js.UndefOr[String] = js.undefined
    }
    object Style {
      
      inline def apply(): Style = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Style]
      }
      
      extension [Self <: Style](x: Self) {
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setColumnBackgroundColor(value: /* index */ Double => String): Self = StObject.set(x, "columnBackgroundColor", js.Any.fromFunction1(value))
        
        inline def setColumnBackgroundColorUndefined: Self = StObject.set(x, "columnBackgroundColor", js.undefined)
        
        inline def setCursorBorderColor(value: String): Self = StObject.set(x, "cursorBorderColor", value.asInstanceOf[js.Any])
        
        inline def setCursorBorderColorUndefined: Self = StObject.set(x, "cursorBorderColor", js.undefined)
        
        inline def setCursorFillColor(value: String): Self = StObject.set(x, "cursorFillColor", value.asInstanceOf[js.Any])
        
        inline def setCursorFillColorUndefined: Self = StObject.set(x, "cursorFillColor", js.undefined)
        
        inline def setGridLineColor(value: String): Self = StObject.set(x, "gridLineColor", value.asInstanceOf[js.Any])
        
        inline def setGridLineColorUndefined: Self = StObject.set(x, "gridLineColor", js.undefined)
        
        inline def setHeaderBackgroundColor(value: String): Self = StObject.set(x, "headerBackgroundColor", value.asInstanceOf[js.Any])
        
        inline def setHeaderBackgroundColorUndefined: Self = StObject.set(x, "headerBackgroundColor", js.undefined)
        
        inline def setHeaderGridLineColor(value: String): Self = StObject.set(x, "headerGridLineColor", value.asInstanceOf[js.Any])
        
        inline def setHeaderGridLineColorUndefined: Self = StObject.set(x, "headerGridLineColor", js.undefined)
        
        inline def setHeaderHorizontalGridLineColor(value: String): Self = StObject.set(x, "headerHorizontalGridLineColor", value.asInstanceOf[js.Any])
        
        inline def setHeaderHorizontalGridLineColorUndefined: Self = StObject.set(x, "headerHorizontalGridLineColor", js.undefined)
        
        inline def setHeaderSelectionBorderColor(value: String): Self = StObject.set(x, "headerSelectionBorderColor", value.asInstanceOf[js.Any])
        
        inline def setHeaderSelectionBorderColorUndefined: Self = StObject.set(x, "headerSelectionBorderColor", js.undefined)
        
        inline def setHeaderSelectionFillColor(value: String): Self = StObject.set(x, "headerSelectionFillColor", value.asInstanceOf[js.Any])
        
        inline def setHeaderSelectionFillColorUndefined: Self = StObject.set(x, "headerSelectionFillColor", js.undefined)
        
        inline def setHeaderVerticalGridLineColor(value: String): Self = StObject.set(x, "headerVerticalGridLineColor", value.asInstanceOf[js.Any])
        
        inline def setHeaderVerticalGridLineColorUndefined: Self = StObject.set(x, "headerVerticalGridLineColor", js.undefined)
        
        inline def setHorizontalGridLineColor(value: String): Self = StObject.set(x, "horizontalGridLineColor", value.asInstanceOf[js.Any])
        
        inline def setHorizontalGridLineColorUndefined: Self = StObject.set(x, "horizontalGridLineColor", js.undefined)
        
        inline def setRowBackgroundColor(value: /* index */ Double => String): Self = StObject.set(x, "rowBackgroundColor", js.Any.fromFunction1(value))
        
        inline def setRowBackgroundColorUndefined: Self = StObject.set(x, "rowBackgroundColor", js.undefined)
        
        inline def setScrollShadow(value: Color1): Self = StObject.set(x, "scrollShadow", value.asInstanceOf[js.Any])
        
        inline def setScrollShadowUndefined: Self = StObject.set(x, "scrollShadow", js.undefined)
        
        inline def setSelectionBorderColor(value: String): Self = StObject.set(x, "selectionBorderColor", value.asInstanceOf[js.Any])
        
        inline def setSelectionBorderColorUndefined: Self = StObject.set(x, "selectionBorderColor", js.undefined)
        
        inline def setSelectionFillColor(value: String): Self = StObject.set(x, "selectionFillColor", value.asInstanceOf[js.Any])
        
        inline def setSelectionFillColorUndefined: Self = StObject.set(x, "selectionFillColor", js.undefined)
        
        inline def setVerticalGridLineColor(value: String): Self = StObject.set(x, "verticalGridLineColor", value.asInstanceOf[js.Any])
        
        inline def setVerticalGridLineColorUndefined: Self = StObject.set(x, "verticalGridLineColor", js.undefined)
        
        inline def setVoidColor(value: String): Self = StObject.set(x, "voidColor", value.asInstanceOf[js.Any])
        
        inline def setVoidColorUndefined: Self = StObject.set(x, "voidColor", js.undefined)
      }
    }
  }
}
