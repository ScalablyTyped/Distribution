package typings.materialDataTable.adapterMod

import typings.materialDataTable.constantsMod.SortValue
import typings.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typings.materialDataTable.typesMod.ProgressIndicatorStyles
import typings.materialDataTable.typesMod.SortActionEventDetail
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCDataTableAdapter extends js.Object {
  
  /**
    * Adds CSS class name to root element.
    *
    * @param className CSS class name to add to root element.
    */
  def addClass(className: String): Unit = js.native
  
  /**
    * Adds a class name to row element at given row index excluding header row.
    *
    * @param rowIndex Index of row element excluding header row.
    * @param cssClasses CSS Class string to add.
    */
  def addClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit = js.native
  
  /**
    * @return Attribute value for given header cell index.
    */
  def getAttributeByHeaderCellIndex(columnIndex: Double, attribute: String): String | Null = js.native
  
  /**
    * @return Total count of header cells.
    */
  def getHeaderCellCount(): Double = js.native
  
  /**
    * @return Array of header cell elements.
    */
  def getHeaderCellElements(): js.Array[Element] = js.native
  
  /**
    * @return Row count excluding header row.
    */
  def getRowCount(): Double = js.native
  
  /**
    * @return Array of row elements excluding header row.
    */
  def getRowElements(): js.Array[Element] = js.native
  
  /**
    * Returns row id of row element at given row index based on `data-row-id` attribute on row element `tr`.
    *
    * @param rowIndex Index of row element.
    * @return Row id of row element, returns `null` in absence of `data-row-id` attribute on row element.
    */
  def getRowIdAtIndex(rowIndex: Double): String | Null = js.native
  
  /**
    * Returns index of row element that contains give child element. Returns -1 if element is not child of any row
    * element.
    *
    * @param el Child element of row element.
    * @return Index of row element.
    */
  def getRowIndexByChildElement(el: Element): Double = js.native
  
  /**
    * @return Selected row count.
    */
  def getSelectedRowCount(): Double = js.native
  
  /**
    * @return Returns computed styles height of table container element.
    */
  def getTableContainerHeight(): Double = js.native
  
  /**
    * @return Returns computed styles height of table's header element.
    */
  def getTableHeaderHeight(): Double = js.native
  
  /**
    * @param rowIndex Index of row element.
    * @return True if row checkbox at given row index is checked.
    */
  def isCheckboxAtRowIndexChecked(rowIndex: Double): Boolean = js.native
  
  /**
    * @return True if header row checkbox is checked.
    */
  def isHeaderRowCheckboxChecked(): Boolean = js.native
  
  /**
    * @return True if table rows are selectable.
    */
  def isRowsSelectable(): Boolean = js.native
  
  /**
    * Notifies when row selection is changed.
    *
    * @param data Event detail data for row selection changed event.
    */
  def notifyRowSelectionChanged(data: MDCDataTableRowSelectionChangedEventDetail): Unit = js.native
  
  /**
    * Notifies when header row is checked.
    */
  def notifySelectedAll(): Unit = js.native
  
  /**
    * Notifies when column is sorted.
    */
  def notifySortAction(data: SortActionEventDetail): Unit = js.native
  
  /**
    * Notifies when header row is unchecked.
    */
  def notifyUnselectedAll(): Unit = js.native
  
  /**
    * Initializes header row checkbox. Destroys previous header row checkbox instance if any.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerHeaderRowCheckbox(): js.Promise[Unit] | Unit = js.native
  
  /**
    * Initializes all row checkboxes. Destroys previous row checkbox instances if any. This is usually called when row
    * checkboxes are added or removed from table.
    * @return Can return Promise only if registering checkbox is asynchronous.
    */
  def registerRowCheckboxes(): js.Promise[Unit] | Unit = js.native
  
  /**
    * Removes CSS class name from root element.
    *
    * @param className CSS class name to add to root element.
    */
  def removeClass(className: String): Unit = js.native
  
  /**
    * Removes class name from row element at give row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param cssClasses Class name string.
    */
  def removeClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit = js.native
  
  /**
    * Removes a class name of a header cell by index.
    */
  def removeClassNameByHeaderCellIndex(columnIndex: Double, className: String): Unit = js.native
  
  /**
    * Sets attribute to row element at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param attr Name of attribute.
    * @param value Value of attribute.
    */
  def setAttributeAtRowIndex(rowIndex: Double, attr: String, value: String): Unit = js.native
  
  /**
    * Sets attribute of a header cell by index.
    */
  def setAttributeByHeaderCellIndex(columnIndex: Double, attribute: String, value: String): Unit = js.native
  
  /**
    * Sets class name of a header cell by index.
    */
  def setClassNameByHeaderCellIndex(columnIndex: Double, className: String): Unit = js.native
  
  /**
    * Sets header row checkbox checked or unchecked.
    *
    * @param checked True to set header row checkbox checked.
    */
  def setHeaderRowCheckboxChecked(checked: Boolean): Unit = js.native
  
  /**
    * Sets header row checkbox to indeterminate.
    *
    * @param indeterminate True to set header row checkbox indeterminate.
    */
  def setHeaderRowCheckboxIndeterminate(indeterminate: Boolean): Unit = js.native
  
  /**
    * Sets progress indicator CSS styles to position it on top of table body.
    */
  def setProgressIndicatorStyles(styles: ProgressIndicatorStyles): Unit = js.native
  
  /**
    * Sets row checkbox to checked or unchecked at given row index.
    *
    * @param rowIndex Index of row element excluding header row element.
    * @param checked True to set checked.
    */
  def setRowCheckboxCheckedAtIndex(rowIndex: Double, checked: Boolean): Unit = js.native
  
  /**
    * Sets appropriate sort status label by header cell index. Skips setting sort
    * status label if header cell is not sortable.
    *
    * Example status label to set for sortValue:
    *
    *   - `SortValue.ASCENDING`: 'Sorted in ascending order'
    *   - `SortValue.DESCENDING`: 'Sorted in descending order'
    *   - `SortValue.NONE`: '' (Empty string)
    */
  def setSortStatusLabelByHeaderCellIndex(columnIndex: Double, sortValue: SortValue): Unit = js.native
}
object MDCDataTableAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    addClassAtRowIndex: (Double, String) => Unit,
    getAttributeByHeaderCellIndex: (Double, String) => String | Null,
    getHeaderCellCount: () => Double,
    getHeaderCellElements: () => js.Array[Element],
    getRowCount: () => Double,
    getRowElements: () => js.Array[Element],
    getRowIdAtIndex: Double => String | Null,
    getRowIndexByChildElement: Element => Double,
    getSelectedRowCount: () => Double,
    getTableContainerHeight: () => Double,
    getTableHeaderHeight: () => Double,
    isCheckboxAtRowIndexChecked: Double => Boolean,
    isHeaderRowCheckboxChecked: () => Boolean,
    isRowsSelectable: () => Boolean,
    notifyRowSelectionChanged: MDCDataTableRowSelectionChangedEventDetail => Unit,
    notifySelectedAll: () => Unit,
    notifySortAction: SortActionEventDetail => Unit,
    notifyUnselectedAll: () => Unit,
    registerHeaderRowCheckbox: () => js.Promise[Unit] | Unit,
    registerRowCheckboxes: () => js.Promise[Unit] | Unit,
    removeClass: String => Unit,
    removeClassAtRowIndex: (Double, String) => Unit,
    removeClassNameByHeaderCellIndex: (Double, String) => Unit,
    setAttributeAtRowIndex: (Double, String, String) => Unit,
    setAttributeByHeaderCellIndex: (Double, String, String) => Unit,
    setClassNameByHeaderCellIndex: (Double, String) => Unit,
    setHeaderRowCheckboxChecked: Boolean => Unit,
    setHeaderRowCheckboxIndeterminate: Boolean => Unit,
    setProgressIndicatorStyles: ProgressIndicatorStyles => Unit,
    setRowCheckboxCheckedAtIndex: (Double, Boolean) => Unit,
    setSortStatusLabelByHeaderCellIndex: (Double, SortValue) => Unit
  ): MDCDataTableAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), addClassAtRowIndex = js.Any.fromFunction2(addClassAtRowIndex), getAttributeByHeaderCellIndex = js.Any.fromFunction2(getAttributeByHeaderCellIndex), getHeaderCellCount = js.Any.fromFunction0(getHeaderCellCount), getHeaderCellElements = js.Any.fromFunction0(getHeaderCellElements), getRowCount = js.Any.fromFunction0(getRowCount), getRowElements = js.Any.fromFunction0(getRowElements), getRowIdAtIndex = js.Any.fromFunction1(getRowIdAtIndex), getRowIndexByChildElement = js.Any.fromFunction1(getRowIndexByChildElement), getSelectedRowCount = js.Any.fromFunction0(getSelectedRowCount), getTableContainerHeight = js.Any.fromFunction0(getTableContainerHeight), getTableHeaderHeight = js.Any.fromFunction0(getTableHeaderHeight), isCheckboxAtRowIndexChecked = js.Any.fromFunction1(isCheckboxAtRowIndexChecked), isHeaderRowCheckboxChecked = js.Any.fromFunction0(isHeaderRowCheckboxChecked), isRowsSelectable = js.Any.fromFunction0(isRowsSelectable), notifyRowSelectionChanged = js.Any.fromFunction1(notifyRowSelectionChanged), notifySelectedAll = js.Any.fromFunction0(notifySelectedAll), notifySortAction = js.Any.fromFunction1(notifySortAction), notifyUnselectedAll = js.Any.fromFunction0(notifyUnselectedAll), registerHeaderRowCheckbox = js.Any.fromFunction0(registerHeaderRowCheckbox), registerRowCheckboxes = js.Any.fromFunction0(registerRowCheckboxes), removeClass = js.Any.fromFunction1(removeClass), removeClassAtRowIndex = js.Any.fromFunction2(removeClassAtRowIndex), removeClassNameByHeaderCellIndex = js.Any.fromFunction2(removeClassNameByHeaderCellIndex), setAttributeAtRowIndex = js.Any.fromFunction3(setAttributeAtRowIndex), setAttributeByHeaderCellIndex = js.Any.fromFunction3(setAttributeByHeaderCellIndex), setClassNameByHeaderCellIndex = js.Any.fromFunction2(setClassNameByHeaderCellIndex), setHeaderRowCheckboxChecked = js.Any.fromFunction1(setHeaderRowCheckboxChecked), setHeaderRowCheckboxIndeterminate = js.Any.fromFunction1(setHeaderRowCheckboxIndeterminate), setProgressIndicatorStyles = js.Any.fromFunction1(setProgressIndicatorStyles), setRowCheckboxCheckedAtIndex = js.Any.fromFunction2(setRowCheckboxCheckedAtIndex), setSortStatusLabelByHeaderCellIndex = js.Any.fromFunction2(setSortStatusLabelByHeaderCellIndex))
    __obj.asInstanceOf[MDCDataTableAdapter]
  }
  
  @scala.inline
  implicit class MDCDataTableAdapterOps[Self <: MDCDataTableAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddClassAtRowIndex(value: (Double, String) => Unit): Self = this.set("addClassAtRowIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeByHeaderCellIndex(value: (Double, String) => String | Null): Self = this.set("getAttributeByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetHeaderCellCount(value: () => Double): Self = this.set("getHeaderCellCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaderCellElements(value: () => js.Array[Element]): Self = this.set("getHeaderCellElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowCount(value: () => Double): Self = this.set("getRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowElements(value: () => js.Array[Element]): Self = this.set("getRowElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowIdAtIndex(value: Double => String | Null): Self = this.set("getRowIdAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRowIndexByChildElement(value: Element => Double): Self = this.set("getRowIndexByChildElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSelectedRowCount(value: () => Double): Self = this.set("getSelectedRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTableContainerHeight(value: () => Double): Self = this.set("getTableContainerHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTableHeaderHeight(value: () => Double): Self = this.set("getTableHeaderHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCheckboxAtRowIndexChecked(value: Double => Boolean): Self = this.set("isCheckboxAtRowIndexChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsHeaderRowCheckboxChecked(value: () => Boolean): Self = this.set("isHeaderRowCheckboxChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRowsSelectable(value: () => Boolean): Self = this.set("isRowsSelectable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifyRowSelectionChanged(value: MDCDataTableRowSelectionChangedEventDetail => Unit): Self = this.set("notifyRowSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifySelectedAll(value: () => Unit): Self = this.set("notifySelectedAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotifySortAction(value: SortActionEventDetail => Unit): Self = this.set("notifySortAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyUnselectedAll(value: () => Unit): Self = this.set("notifyUnselectedAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterHeaderRowCheckbox(value: () => js.Promise[Unit] | Unit): Self = this.set("registerHeaderRowCheckbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterRowCheckboxes(value: () => js.Promise[Unit] | Unit): Self = this.set("registerRowCheckboxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClassAtRowIndex(value: (Double, String) => Unit): Self = this.set("removeClassAtRowIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveClassNameByHeaderCellIndex(value: (Double, String) => Unit): Self = this.set("removeClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeAtRowIndex(value: (Double, String, String) => Unit): Self = this.set("setAttributeAtRowIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributeByHeaderCellIndex(value: (Double, String, String) => Unit): Self = this.set("setAttributeByHeaderCellIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetClassNameByHeaderCellIndex(value: (Double, String) => Unit): Self = this.set("setClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetHeaderRowCheckboxChecked(value: Boolean => Unit): Self = this.set("setHeaderRowCheckboxChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeaderRowCheckboxIndeterminate(value: Boolean => Unit): Self = this.set("setHeaderRowCheckboxIndeterminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProgressIndicatorStyles(value: ProgressIndicatorStyles => Unit): Self = this.set("setProgressIndicatorStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRowCheckboxCheckedAtIndex(value: (Double, Boolean) => Unit): Self = this.set("setRowCheckboxCheckedAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSortStatusLabelByHeaderCellIndex(value: (Double, SortValue) => Unit): Self = this.set("setSortStatusLabelByHeaderCellIndex", js.Any.fromFunction2(value))
  }
}
