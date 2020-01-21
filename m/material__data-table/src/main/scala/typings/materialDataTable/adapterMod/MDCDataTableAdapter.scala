package typings.materialDataTable.adapterMod

import typings.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCDataTableAdapter extends js.Object {
  /**
    * Adds a class name to row element at given row index excluding header row.
    *
    * @param rowIndex Index of row element excluding header row.
    * @param cssClasses CSS Class string to add.
    */
  def addClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
  /**
    * @return Row count excluding header row.
    */
  def getRowCount(): Double
  /**
    * @return Array of row elements excluding header row.
    */
  def getRowElements(): js.Array[Element]
  /**
    * Returns row id of row element at given row index based on `data-row-id` attribute on row element `tr`.
    *
    * @param rowIndex Index of row element.
    * @return Row id of row element, returns `null` in absence of `data-row-id` attribute on row element.
    */
  def getRowIdAtIndex(rowIndex: Double): String | Null
  /**
    * Returns index of row element that contains give child element. Returns -1 if element is not child of any row
    * element.
    *
    * @param el Child element of row element.
    * @return Index of row element.
    */
  def getRowIndexByChildElement(el: Element): Double
  /**
    * @return Selected row count.
    */
  def getSelectedRowCount(): Double
  /**
    * @param rowIndex Index of row element.
    * @return True if row checkbox at given row index is checked.
    */
  def isCheckboxAtRowIndexChecked(rowIndex: Double): Boolean
  /**
    * @return True if header row checkbox is checked.
    */
  def isHeaderRowCheckboxChecked(): Boolean
  /**
    * @return True if table rows are selectable.
    */
  def isRowsSelectable(): Boolean
  /**
    * Notifies when row selection is changed.
    *
    * @param data Event detail data for row selection changed event.
    */
  def notifyRowSelectionChanged(data: MDCDataTableRowSelectionChangedEventDetail): Unit
  /**
    * Notifies when header row is checked.
    */
  def notifySelectedAll(): Unit
  /**
    * Notifies when header row is unchecked.
    */
  def notifyUnselectedAll(): Unit
  /**
    * Initializes header row checkbox. Destroys previous header row checkbox instance if any.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerHeaderRowCheckbox(): js.Promise[Unit] | Unit
  /**
    * Initializes all row checkboxes. Destroys previous row checkbox instances if any. This is usually called when row
    * checkboxes are added or removed from table.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerRowCheckboxes(): js.Promise[Unit] | Unit
  /**
    * Removes class name from row element at give row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param cssClasses Class name string.
    */
  def removeClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
  /**
    * Sets attribute to row element at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param attr Name of attribute.
    * @param value Value of attribute.
    */
  def setAttributeAtRowIndex(rowIndex: Double, attr: String, value: String): Unit
  /**
    * Sets header row checkbox checked or unchecked.
    *
    * @param checked True to set header row checkbox checked.
    */
  def setHeaderRowCheckboxChecked(checked: Boolean): Unit
  /**
    * Sets header row checkbox to indeterminate.
    *
    * @param indeterminate True to set header row checkbox indeterminate.
    */
  def setHeaderRowCheckboxIndeterminate(indeterminate: Boolean): Unit
  /**
    * Sets row checkbox to checked or unchecked at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param checked True to set checked.
    */
  def setRowCheckboxCheckedAtIndex(rowIndex: Double, checked: Boolean): Unit
}

object MDCDataTableAdapter {
  @scala.inline
  def apply(
    addClassAtRowIndex: (Double, String) => Unit,
    getRowCount: () => Double,
    getRowElements: () => js.Array[Element],
    getRowIdAtIndex: Double => String | Null,
    getRowIndexByChildElement: Element => Double,
    getSelectedRowCount: () => Double,
    isCheckboxAtRowIndexChecked: Double => Boolean,
    isHeaderRowCheckboxChecked: () => Boolean,
    isRowsSelectable: () => Boolean,
    notifyRowSelectionChanged: MDCDataTableRowSelectionChangedEventDetail => Unit,
    notifySelectedAll: () => Unit,
    notifyUnselectedAll: () => Unit,
    registerHeaderRowCheckbox: () => js.Promise[Unit] | Unit,
    registerRowCheckboxes: () => js.Promise[Unit] | Unit,
    removeClassAtRowIndex: (Double, String) => Unit,
    setAttributeAtRowIndex: (Double, String, String) => Unit,
    setHeaderRowCheckboxChecked: Boolean => Unit,
    setHeaderRowCheckboxIndeterminate: Boolean => Unit,
    setRowCheckboxCheckedAtIndex: (Double, Boolean) => Unit
  ): MDCDataTableAdapter = {
    val __obj = js.Dynamic.literal(addClassAtRowIndex = js.Any.fromFunction2(addClassAtRowIndex), getRowCount = js.Any.fromFunction0(getRowCount), getRowElements = js.Any.fromFunction0(getRowElements), getRowIdAtIndex = js.Any.fromFunction1(getRowIdAtIndex), getRowIndexByChildElement = js.Any.fromFunction1(getRowIndexByChildElement), getSelectedRowCount = js.Any.fromFunction0(getSelectedRowCount), isCheckboxAtRowIndexChecked = js.Any.fromFunction1(isCheckboxAtRowIndexChecked), isHeaderRowCheckboxChecked = js.Any.fromFunction0(isHeaderRowCheckboxChecked), isRowsSelectable = js.Any.fromFunction0(isRowsSelectable), notifyRowSelectionChanged = js.Any.fromFunction1(notifyRowSelectionChanged), notifySelectedAll = js.Any.fromFunction0(notifySelectedAll), notifyUnselectedAll = js.Any.fromFunction0(notifyUnselectedAll), registerHeaderRowCheckbox = js.Any.fromFunction0(registerHeaderRowCheckbox), registerRowCheckboxes = js.Any.fromFunction0(registerRowCheckboxes), removeClassAtRowIndex = js.Any.fromFunction2(removeClassAtRowIndex), setAttributeAtRowIndex = js.Any.fromFunction3(setAttributeAtRowIndex), setHeaderRowCheckboxChecked = js.Any.fromFunction1(setHeaderRowCheckboxChecked), setHeaderRowCheckboxIndeterminate = js.Any.fromFunction1(setHeaderRowCheckboxIndeterminate), setRowCheckboxCheckedAtIndex = js.Any.fromFunction2(setRowCheckboxCheckedAtIndex))
  
    __obj.asInstanceOf[MDCDataTableAdapter]
  }
}

