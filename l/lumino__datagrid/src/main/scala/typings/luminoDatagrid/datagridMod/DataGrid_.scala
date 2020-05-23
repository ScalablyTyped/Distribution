package typings.luminoDatagrid.datagridMod

import typings.luminoDatagrid.anon.Lx
import typings.luminoDatagrid.anon.Vx
import typings.luminoDatagrid.celleditorcontrollerMod.ICellEditorController
import typings.luminoDatagrid.datagridMod.DataGrid.CopyConfig
import typings.luminoDatagrid.datagridMod.DataGrid.DefaultSizes_
import typings.luminoDatagrid.datagridMod.DataGrid.HeaderVisibility
import typings.luminoDatagrid.datagridMod.DataGrid.HitTestResult
import typings.luminoDatagrid.datagridMod.DataGrid.IKeyHandler
import typings.luminoDatagrid.datagridMod.DataGrid.IMouseHandler
import typings.luminoDatagrid.datagridMod.DataGrid.IOptions
import typings.luminoDatagrid.datagridMod.DataGrid.Style
import typings.luminoDatagrid.datamodelMod.DataModel
import typings.luminoDatagrid.datamodelMod.DataModel.ColumnRegion
import typings.luminoDatagrid.datamodelMod.DataModel.RowRegion
import typings.luminoDatagrid.luminoDatagridStrings.all
import typings.luminoDatagrid.luminoDatagridStrings.down
import typings.luminoDatagrid.luminoDatagridStrings.left
import typings.luminoDatagrid.luminoDatagridStrings.right
import typings.luminoDatagrid.luminoDatagridStrings.up
import typings.luminoDatagrid.renderermapMod.RendererMap
import typings.luminoDatagrid.selectionmodelMod.SelectionModel
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoMessaging.mod.IMessageHandler
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/datagrid", "DataGrid")
@js.native
/**
  * Construct a new data grid.
  *
  * @param options - The options for initializing the data grid.
  */
class DataGrid_ () extends Widget {
  def this(options: IOptions) = this()
  /**
    * Blit content into the on-screen grid canvas.
    *
    * The rect should be expressed in viewport coordinates.
    *
    * This automatically accounts for the dpi ratio.
    */
  var _blitContent: js.Any = js.native
  var _buffer: js.Any = js.native
  var _bufferGC: js.Any = js.native
  var _canvas: js.Any = js.native
  var _canvasGC: js.Any = js.native
  var _cellRenderers: js.Any = js.native
  var _columnHeaderSections: js.Any = js.native
  var _columnSections: js.Any = js.native
  var _copyConfig: js.Any = js.native
  var _dataModel: js.Any = js.native
  var _dpiRatio: js.Any = js.native
  /**
    * Draw the background for the given paint region.
    */
  var _drawBackground: js.Any = js.native
  /**
    * Draw the body region which intersects the dirty rect.
    */
  var _drawBodyRegion: js.Any = js.native
  /**
    * Draw the body selections for the data grid.
    */
  var _drawBodySelections: js.Any = js.native
  /**
    * Draw the cells for the given paint region.
    */
  var _drawCells: js.Any = js.native
  /**
    * Draw the column background for the given paint region.
    */
  var _drawColumnBackground: js.Any = js.native
  /**
    * Draw the column header region which intersects the dirty rect.
    */
  var _drawColumnHeaderRegion: js.Any = js.native
  /**
    * Draw the column header selections for the data grid.
    */
  var _drawColumnHeaderSelections: js.Any = js.native
  /**
    * Draw the corner header region which intersects the dirty rect.
    */
  var _drawCornerHeaderRegion: js.Any = js.native
  /**
    * Draw the overlay cursor for the data grid.
    */
  var _drawCursor: js.Any = js.native
  /**
    * Draw the horizontal grid lines for the given paint region.
    */
  var _drawHorizontalGridLines: js.Any = js.native
  /**
    * Draw the row background for the given paint region.
    */
  var _drawRowBackground: js.Any = js.native
  /**
    * Draw the row header region which intersects the dirty rect.
    */
  var _drawRowHeaderRegion: js.Any = js.native
  /**
    * Draw the row header selections for the data grid.
    */
  var _drawRowHeaderSelections: js.Any = js.native
  /**
    * Draw the overlay shadows for the data grid.
    */
  var _drawShadows: js.Any = js.native
  /**
    * Draw the vertical grid lines for the given paint region.
    */
  var _drawVerticalGridLines: js.Any = js.native
  /**
    * Draw the void region for the dirty rect.
    */
  var _drawVoidRegion: js.Any = js.native
  var _editingEnabled: js.Any = js.native
  var _editorController: js.Any = js.native
  /**
    * Handle the `'contextmenu'` event for the data grid.
    */
  var _evtContextMenu: js.Any = js.native
  /**
    * Handle the `'keydown'` event for the data grid.
    */
  var _evtKeyDown: js.Any = js.native
  /**
    * Handle the `'dblclick'` event for the data grid.
    */
  var _evtMouseDoubleClick: js.Any = js.native
  /**
    * Handle the `'mousedown'` event for the data grid.
    */
  var _evtMouseDown: js.Any = js.native
  /**
    * Handle the `'mouseleave'` event for the data grid.
    */
  var _evtMouseLeave: js.Any = js.native
  /**
    * Handle the `'mousemove'` event for the data grid.
    */
  var _evtMouseMove: js.Any = js.native
  /**
    * Handle the `'mouseup'` event for the data grid.
    */
  var _evtMouseUp: js.Any = js.native
  /**
    * Handle the `'wheel'` event for the data grid.
    */
  var _evtWheel: js.Any = js.native
  var _hScrollBar: js.Any = js.native
  var _hScrollBarMinHeight: js.Any = js.native
  var _headerVisibility: js.Any = js.native
  var _keyHandler: js.Any = js.native
  var _mouseHandler: js.Any = js.native
  var _mousedown: js.Any = js.native
  /**
    * Handle cells changing in the data model.
    */
  var _onCellsChanged: js.Any = js.native
  /**
    * Handle columns being inserted into the data model.
    */
  var _onColumnsInserted: js.Any = js.native
  /**
    * Handle columns moving in the data model.
    */
  var _onColumnsMoved: js.Any = js.native
  /**
    * Handle columns being removed from the data model.
    */
  var _onColumnsRemoved: js.Any = js.native
  /**
    * A signal handler for the data model `changed` signal.
    */
  var _onDataModelChanged: js.Any = js.native
  /**
    * Handle a full data model reset.
    */
  var _onModelReset: js.Any = js.native
  /**
    * Handle the `pageRequested` signal from a scroll bar.
    */
  var _onPageRequested: js.Any = js.native
  /**
    * A signal handler for the renderer map `changed` signal.
    */
  var _onRenderersChanged: js.Any = js.native
  /**
    * Handle rows being inserted in the data model.
    */
  var _onRowsInserted: js.Any = js.native
  /**
    * Handle rows moving in the data model.
    */
  var _onRowsMoved: js.Any = js.native
  /**
    * Handle rows being removed from the data model.
    */
  var _onRowsRemoved: js.Any = js.native
  /**
    * A signal handler for the selection model `changed` signal.
    */
  var _onSelectionsChanged: js.Any = js.native
  /**
    * Handle the `stepRequested` signal from a scroll bar.
    */
  var _onStepRequested: js.Any = js.native
  /**
    * Handle the `thumbMoved` signal from a scroll bar.
    */
  var _onThumbMoved: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'column-resize-request'` message.
    */
  var _onViewportColumnResizeRequest: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'overlay-paint-request'` message.
    */
  var _onViewportOverlayPaintRequest: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'paint-request'` message.
    */
  var _onViewportPaintRequest: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'resize'` message.
    */
  var _onViewportResize: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'row-resize-request'` message.
    */
  var _onViewportRowResizeRequest: js.Any = js.native
  /**
    * A message hook invoked on a viewport `'scroll-request'` message.
    */
  var _onViewportScrollRequest: js.Any = js.native
  var _overlay: js.Any = js.native
  var _overlayGC: js.Any = js.native
  /**
    * Paint the grid content for the given dirty rect.
    *
    * The rect should be expressed in valid viewport coordinates.
    *
    * This is the primary paint entry point. The individual `_draw*`
    * methods should not be invoked directly. This method dispatches
    * to the drawing methods in the correct order.
    */
  var _paintContent: js.Any = js.native
  /**
    * Paint the overlay content for the entire grid.
    *
    * This is the primary overlay paint entry point. The individual
    * `_draw*` methods should not be invoked directly. This method
    * dispatches to the drawing methods in the correct order.
    */
  var _paintOverlay: js.Any = js.native
  /**
    * Process a message sent to the viewport
    */
  var _processViewportMessage: js.Any = js.native
  /**
    * Refresh the dpi ratio.
    */
  var _refreshDPI: js.Any = js.native
  /**
    * Release the mouse grab.
    */
  var _releaseMouse: js.Any = js.native
  /**
    * Schedule a repaint of all of the grid content.
    */
  var _repaintContent: js.Any = js.native
  /**
    * Schedule a repaint of the overlay.
    */
  var _repaintOverlay: js.Any = js.native
  /**
    * Schedule a repaint of specific grid content.
    */
  var _repaintRegion: js.Any = js.native
  /**
    * Ensure the canvas is at least the specified size.
    *
    * This method will retain the valid canvas content.
    */
  var _resizeCanvasIfNeeded: js.Any = js.native
  /**
    * Resize a column section immediately.
    */
  var _resizeColumn: js.Any = js.native
  /**
    * Resize a column header section immediately.
    */
  var _resizeColumnHeader: js.Any = js.native
  /**
    * Resize a row section immediately.
    */
  var _resizeRow: js.Any = js.native
  /**
    * Resize a row header section immediately.
    */
  var _resizeRowHeader: js.Any = js.native
  var _rowHeaderSections: js.Any = js.native
  var _rowSections: js.Any = js.native
  var _scrollCorner: js.Any = js.native
  /**
    * Scroll immediately to the specified offset position.
    */
  var _scrollTo: js.Any = js.native
  var _scrollX: js.Any = js.native
  var _scrollY: js.Any = js.native
  var _selectionModel: js.Any = js.native
  var _stretchLastColumn: js.Any = js.native
  var _stretchLastRow: js.Any = js.native
  var _style: js.Any = js.native
  /**
    * Sync the scroll bars and scroll state with the viewport.
    *
    * #### Notes
    * If the visibility of either scroll bar changes, a synchronous
    * fit-request will be dispatched to the data grid to immediately
    * resize the viewport.
    */
  var _syncScrollState: js.Any = js.native
  /**
    * Sync the viewport to the given scroll position.
    *
    * #### Notes
    * This schedules a full repaint and syncs the scroll state.
    */
  var _syncViewport: js.Any = js.native
  var _vScrollBar: js.Any = js.native
  var _vScrollBarMinWidth: js.Any = js.native
  var _viewport: js.Any = js.native
  var _viewportHeight: js.Any = js.native
  var _viewportWidth: js.Any = js.native
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
    * Get the copy configuration for the data grid.
    */
  /**
    * Set the copy configuration for the data grid.
    */
  var copyConfig: CopyConfig = js.native
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
    * Get the key handler for the data grid.
    */
  /**
    * Set the key handler for the data grid.
    */
  var keyHandler: IKeyHandler | Null = js.native
  /**
    * The maximum scroll X position for the grid.
    */
  val maxScrollX: Double = js.native
  /**
    * The maximum scroll Y position for the grid.
    */
  val maxScrollY: Double = js.native
  /**
    * Get the mouse handler for the data grid.
    */
  /**
    * Set the mouse handler for the data grid.
    */
  var mouseHandler: IMouseHandler | Null = js.native
  /**
    * The height of the visible portion of the grid body.
    */
  val pageHeight: Double = js.native
  /**
    * The width of the visible portion of the grid body.
    */
  val pageWidth: Double = js.native
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
    * Copy the current selection to the system clipboard.
    *
    * #### Notes
    * The grid must have a data model and a selection model.
    *
    * The behavior can be configured via `DataGrid.copyConfig`.
    */
  def copyToClipboard(): Unit = js.native
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
}

