package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridUpdatingMethods extends js.Object {
  /**
    * Adds a new child to a specific row. It also creates a transaction and updates the UI.
    *
    * @param values Pairs of values in the format { column1Key: value1, column2Key: value2, ... } .
    * @param parentId The ID of the targeted row.
    */
  def addChild(values: js.Object, parentId: js.Object): Unit = js.native
  /**
    * Adds a new row to the grid. It also creates a transaction and updates the UI.
    *
    * @param values Pairs of values in the format { column1Key: value1, column2Key: value2, ... } .
    */
  def addRow(values: js.Object): Unit = js.native
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridupdating#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtreegridupdating#options:language) or [locale](ui.igtreegridupdating#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridupdating#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.iggridupdating#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  /**
    * Deletes a row from the grid. It also creates a transaction and updates the UI.
    *
    * @param rowId The primary key of the row to delete.
    */
  def deleteRow(rowId: js.Object): Unit = js.native
  def destroy(): Unit = js.native
  /**
    * Gets the editor for a column by the cell it resides in. If allowed the function can create the editor if it has not been created yet.
    *
    * @param cell Reference to the jQuery-wrapped TD object of the grid that the editor belongs to.
    * @param create Requests to create the editor if it has not been created yet.
    */
  def editorForCell(cell: String): js.Object = js.native
  def editorForCell(cell: String, create: Boolean): js.Object = js.native
  /**
    * Gets the editor for a column by the column key. That method can be used only after the editor has been created.
    *
    * @param key The key of the column.
    */
  def editorForKey(key: String): js.Object = js.native
  /**
    * Ends the currently active edit mode.
    *
    * @param update Specifies if the edit process should accept the current changes. Default is 'false'.
    * @param raiseEvents Specifies whether or not updating events should be raised for this operation.
    */
  def endEdit(): Boolean = js.native
  def endEdit(update: Boolean): Boolean = js.native
  def endEdit(update: Boolean, raiseEvents: Boolean): Boolean = js.native
  /**
    * Finds and returns the key of the first column the editor for which has invalid value.
    */
  def findInvalid(): String = js.native
  /**
    * Hides the "Add Child" button.
    */
  def hideAddChildButton(): Unit = js.native
  /**
    * Hides the delete button.
    */
  def hideDeleteButton(): Unit = js.native
  /**
    * Checks if the grid is in edit mode.
    */
  def isEditing(): Boolean = js.native
  /**
    * Sets a cell value for the specified cell. It also creates a transaction and updates the UI.
    * If the specified cell is currently in edit mode, the function will set the desired value in the cell's editor instead.
    *
    * @param rowId The primary key of the row the cell is a child of.
    * @param colKey The column key of the cell.
    * @param value The new value for the cell.
    */
  def setCellValue(rowId: js.Object, colKey: String, value: js.Object): Unit = js.native
  /**
    * Shows the "Add Child" button for specific row.
    *
    * @param row A jQuery object of the targeted row.
    */
  def showAddChildButtonFor(row: js.Object): Unit = js.native
  /**
    * Shows the delete button for specific row.
    *
    * @param row A jQuery object of the targeted row.
    */
  def showDeleteButtonFor(row: js.Object): Unit = js.native
  /**
    * Starts editing for adding a new child for specific row.
    *
    * @param parentId The ID of the targeted row.
    * @param raiseEvents Specifies whether or not updating events should be raised for this operation.
    */
  def startAddChildFor(parentId: js.Object): Unit = js.native
  def startAddChildFor(parentId: js.Object, raiseEvents: js.Object): Unit = js.native
  /**
    * Starts editing for adding a new row.
    *
    * @param raiseEvents Specifies whether or not updating events should be raised for this operation.
    */
  def startAddRowEdit(): Boolean = js.native
  def startAddRowEdit(raiseEvents: Boolean): Boolean = js.native
  /**
    * Starts editing for the row or cell specified (depending on the [editMode](ui.iggridupdating#options:editMode)).
    *
    * @param rowId The row id.
    * @param column The column key or index.
    * @param raiseEvents Specifies whether or not updating events should be raised for this operation.
    */
  def startEdit(rowId: js.Object, column: js.Object): Boolean = js.native
  def startEdit(rowId: js.Object, column: js.Object, raiseEvents: Boolean): Boolean = js.native
  /**
    * Sets values for specified cells in a row. It also creates a transaction and updates the UI.
    * If the specified row is currently in edit mode, the function will set the desired values in the row's editors instead.
    *
    * @param rowId The primary key of the row to update.
    * @param values Pairs of values in the format { column1Key: value1, column2Key: value2, ... } .
    */
  def updateRow(rowId: js.Object, values: js.Object): Unit = js.native
}

