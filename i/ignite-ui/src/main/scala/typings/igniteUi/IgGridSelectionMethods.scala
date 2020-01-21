package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSelectionMethods extends js.Object {
  /**
  	 * Returns the currently active (focused) cell that has the format { element: , row: , index: , rowIndex: , columnKey: }, if any.
  	 */
  def activeCell(): js.Object = js.native
  /**
  	 * Returns the currently active (focused) row that has the format { element: , index: }, if any.
  	 */
  def activeRow(): js.Object = js.native
  /**
  	 * Clears all selected cells, selected rows, active cell and active row. Also updates the UI accordingly
  	 */
  def clearSelection(): Unit = js.native
  /**
  	 * Deselects a cell by row/col
  	 *
  	 * @param row Row index
  	 * @param col Column index
  	 * @param isFixed If the cell is part of the fixed or unfixed area of the grid.
  	 */
  def deselectCell(row: Double, col: Double): Unit = js.native
  def deselectCell(row: Double, col: Double, isFixed: Boolean): Unit = js.native
  /**
  	 * Deselects a cell by row id/column key
  	 *
  	 * @param id Row Id
  	 * @param colKey Column key
  	 */
  def deselectCellById(id: js.Object, colKey: String): Unit = js.native
  /**
  	 * Deselects a row by index
  	 *
  	 * @param index Row index
  	 */
  def deselectRow(index: Double): Unit = js.native
  /**
  	 * Deselects a row by row id
  	 *
  	 * @param id Row Id
  	 */
  def deselectRowById(id: js.Object): Unit = js.native
  /**
  	 * Destroys the selection widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Selects a cell by row/col
  	 *
  	 * @param row Row index
  	 * @param col Column index
  	 * @param isFixed If the cell is part of the fixed or unfixed area of the grid.
  	 */
  def selectCell(row: Double, col: Double): Unit = js.native
  def selectCell(row: Double, col: Double, isFixed: Boolean): Unit = js.native
  /**
  	 * Selects a cell by row id/column key
  	 *
  	 * @param id Row Id
  	 * @param colKey Column key
  	 */
  def selectCellById(id: js.Object, colKey: String): Unit = js.native
  /**
  	 * Selects a row by index
  	 *
  	 * @param index Row index
  	 */
  def selectRow(index: Double): Unit = js.native
  /**
  	 * Selects a row by row id
  	 *
  	 * @param id Row Id
  	 */
  def selectRowById(id: js.Object): Unit = js.native
  /**
  	 * Returns the currently selected cell that has the format { element: , row: , index: , rowIndex: , columnKey: }, if any.
  	 *
  	 * If multiple selection is enabled the function will return null.
  	 */
  def selectedCell(): js.Object = js.native
  /**
  	 * Returns an array of selected cells in arbitrary order where every objects has the format { element: , row: , index: , rowIndex: , columnKey: } .
  	 *
  	 * If multiple selection is disabled the function will return null.
  	 */
  def selectedCells(): js.Array[_] = js.native
  /**
  	 * Returns the currently selected row that has the format { element: , index: }, if any.
  	 *
  	 * If multiple selection is enabled the function will return null.
  	 */
  def selectedRow(): js.Object = js.native
  /**
  	 * Returns an array of selected rows in arbitrary order where every object has the format { element: , index: } .
  	 *
  	 * If multiple selection is disabled the function will return null.
  	 */
  def selectedRows(): js.Array[_] = js.native
}

