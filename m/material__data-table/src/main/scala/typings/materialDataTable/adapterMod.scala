package typings.materialDataTable

import typings.materialDataTable.constantsMod.SortValue
import typings.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typings.materialDataTable.typesMod.ProgressIndicatorStyles
import typings.materialDataTable.typesMod.SortActionEventDetail
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCDataTableAdapter extends StObject {
    
    /**
      * Adds CSS class name to root element.
      *
      * @param className CSS class name to add to root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Adds a class name to row element at given row index excluding header row.
      *
      * @param rowIndex Index of row element excluding header row.
      * @param cssClasses CSS Class string to add.
      */
    def addClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
    
    /**
      * @return Attribute value for given header cell index.
      */
    def getAttributeByHeaderCellIndex(columnIndex: Double, attribute: String): String | Null
    
    /**
      * @return Total count of header cells.
      */
    def getHeaderCellCount(): Double
    
    /**
      * @return Array of header cell elements.
      */
    def getHeaderCellElements(): js.Array[Element]
    
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
      * @return Returns computed styles height of table container element.
      */
    def getTableContainerHeight(): Double
    
    /**
      * @return Returns computed styles height of table's header element.
      */
    def getTableHeaderHeight(): Double
    
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
      * Notifies when column is sorted.
      */
    def notifySortAction(data: SortActionEventDetail): Unit
    
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
      * Removes CSS class name from root element.
      *
      * @param className CSS class name to add to root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Removes class name from row element at give row index.
      *
      * @param rowIndex Index of row element excluding header row element.
      * @param cssClasses Class name string.
      */
    def removeClassAtRowIndex(rowIndex: Double, cssClasses: String): Unit
    
    /**
      * Removes a class name of a header cell by index.
      */
    def removeClassNameByHeaderCellIndex(columnIndex: Double, className: String): Unit
    
    /**
      * Sets attribute to row element at given row index.
      *
      * @param rowIndex Index of row element excluding header row element.
      * @param attr Name of attribute.
      * @param value Value of attribute.
      */
    def setAttributeAtRowIndex(rowIndex: Double, attr: String, value: String): Unit
    
    /**
      * Sets attribute of a header cell by index.
      */
    def setAttributeByHeaderCellIndex(columnIndex: Double, attribute: String, value: String): Unit
    
    /**
      * Sets class name of a header cell by index.
      */
    def setClassNameByHeaderCellIndex(columnIndex: Double, className: String): Unit
    
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
      * Sets progress indicator CSS styles to position it on top of table body.
      */
    def setProgressIndicatorStyles(styles: ProgressIndicatorStyles): Unit
    
    /**
      * Sets row checkbox to checked or unchecked at given row index.
      *
      * @param rowIndex Index of row element excluding header row element.
      * @param checked True to set checked.
      */
    def setRowCheckboxCheckedAtIndex(rowIndex: Double, checked: Boolean): Unit
    
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
    def setSortStatusLabelByHeaderCellIndex(columnIndex: Double, sortValue: SortValue): Unit
  }
  object MDCDataTableAdapter {
    
    inline def apply(
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
    
    extension [Self <: MDCDataTableAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassAtRowIndex(value: (Double, String) => Unit): Self = StObject.set(x, "addClassAtRowIndex", js.Any.fromFunction2(value))
      
      inline def setGetAttributeByHeaderCellIndex(value: (Double, String) => String | Null): Self = StObject.set(x, "getAttributeByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setGetHeaderCellCount(value: () => Double): Self = StObject.set(x, "getHeaderCellCount", js.Any.fromFunction0(value))
      
      inline def setGetHeaderCellElements(value: () => js.Array[Element]): Self = StObject.set(x, "getHeaderCellElements", js.Any.fromFunction0(value))
      
      inline def setGetRowCount(value: () => Double): Self = StObject.set(x, "getRowCount", js.Any.fromFunction0(value))
      
      inline def setGetRowElements(value: () => js.Array[Element]): Self = StObject.set(x, "getRowElements", js.Any.fromFunction0(value))
      
      inline def setGetRowIdAtIndex(value: Double => String | Null): Self = StObject.set(x, "getRowIdAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetRowIndexByChildElement(value: Element => Double): Self = StObject.set(x, "getRowIndexByChildElement", js.Any.fromFunction1(value))
      
      inline def setGetSelectedRowCount(value: () => Double): Self = StObject.set(x, "getSelectedRowCount", js.Any.fromFunction0(value))
      
      inline def setGetTableContainerHeight(value: () => Double): Self = StObject.set(x, "getTableContainerHeight", js.Any.fromFunction0(value))
      
      inline def setGetTableHeaderHeight(value: () => Double): Self = StObject.set(x, "getTableHeaderHeight", js.Any.fromFunction0(value))
      
      inline def setIsCheckboxAtRowIndexChecked(value: Double => Boolean): Self = StObject.set(x, "isCheckboxAtRowIndexChecked", js.Any.fromFunction1(value))
      
      inline def setIsHeaderRowCheckboxChecked(value: () => Boolean): Self = StObject.set(x, "isHeaderRowCheckboxChecked", js.Any.fromFunction0(value))
      
      inline def setIsRowsSelectable(value: () => Boolean): Self = StObject.set(x, "isRowsSelectable", js.Any.fromFunction0(value))
      
      inline def setNotifyRowSelectionChanged(value: MDCDataTableRowSelectionChangedEventDetail => Unit): Self = StObject.set(x, "notifyRowSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setNotifySelectedAll(value: () => Unit): Self = StObject.set(x, "notifySelectedAll", js.Any.fromFunction0(value))
      
      inline def setNotifySortAction(value: SortActionEventDetail => Unit): Self = StObject.set(x, "notifySortAction", js.Any.fromFunction1(value))
      
      inline def setNotifyUnselectedAll(value: () => Unit): Self = StObject.set(x, "notifyUnselectedAll", js.Any.fromFunction0(value))
      
      inline def setRegisterHeaderRowCheckbox(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "registerHeaderRowCheckbox", js.Any.fromFunction0(value))
      
      inline def setRegisterRowCheckboxes(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "registerRowCheckboxes", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassAtRowIndex(value: (Double, String) => Unit): Self = StObject.set(x, "removeClassAtRowIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveClassNameByHeaderCellIndex(value: (Double, String) => Unit): Self = StObject.set(x, "removeClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setSetAttributeAtRowIndex(value: (Double, String, String) => Unit): Self = StObject.set(x, "setAttributeAtRowIndex", js.Any.fromFunction3(value))
      
      inline def setSetAttributeByHeaderCellIndex(value: (Double, String, String) => Unit): Self = StObject.set(x, "setAttributeByHeaderCellIndex", js.Any.fromFunction3(value))
      
      inline def setSetClassNameByHeaderCellIndex(value: (Double, String) => Unit): Self = StObject.set(x, "setClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setSetHeaderRowCheckboxChecked(value: Boolean => Unit): Self = StObject.set(x, "setHeaderRowCheckboxChecked", js.Any.fromFunction1(value))
      
      inline def setSetHeaderRowCheckboxIndeterminate(value: Boolean => Unit): Self = StObject.set(x, "setHeaderRowCheckboxIndeterminate", js.Any.fromFunction1(value))
      
      inline def setSetProgressIndicatorStyles(value: ProgressIndicatorStyles => Unit): Self = StObject.set(x, "setProgressIndicatorStyles", js.Any.fromFunction1(value))
      
      inline def setSetRowCheckboxCheckedAtIndex(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setRowCheckboxCheckedAtIndex", js.Any.fromFunction2(value))
      
      inline def setSetSortStatusLabelByHeaderCellIndex(value: (Double, SortValue) => Unit): Self = StObject.set(x, "setSortStatusLabelByHeaderCellIndex", js.Any.fromFunction2(value))
    }
  }
}
