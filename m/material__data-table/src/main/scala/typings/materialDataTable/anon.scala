package typings.materialDataTable

import typings.materialDataTable.constantsMod.SortValue
import typings.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typings.materialDataTable.typesMod.ProgressIndicatorStyles
import typings.materialDataTable.typesMod.RowClickEventData
import typings.materialDataTable.typesMod.SortActionEventDetail
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/data-table.@material/data-table/adapter.MDCDataTableAdapter> */
  trait PartialMDCDataTableAdapte extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.undefined
    
    var getAttributeByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* attribute */ String, String | Null]] = js.undefined
    
    var getHeaderCellCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getHeaderCellElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.undefined
    
    var getRowCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getRowElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.undefined
    
    var getRowIdAtIndex: js.UndefOr[js.Function1[/* rowIndex */ Double, String | Null]] = js.undefined
    
    var getRowIndexByChildElement: js.UndefOr[js.Function1[/* el */ Element, Double]] = js.undefined
    
    var getSelectedRowCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getTableContainerHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getTableHeaderHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var isCheckboxAtRowIndexChecked: js.UndefOr[js.Function1[/* rowIndex */ Double, Boolean]] = js.undefined
    
    var isHeaderRowCheckboxChecked: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isRowsSelectable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifyRowClick: js.UndefOr[js.Function1[/* detail */ RowClickEventData, Unit]] = js.undefined
    
    var notifyRowSelectionChanged: js.UndefOr[js.Function1[/* data */ MDCDataTableRowSelectionChangedEventDetail, Unit]] = js.undefined
    
    var notifySelectedAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifySortAction: js.UndefOr[js.Function1[/* data */ SortActionEventDetail, Unit]] = js.undefined
    
    var notifyUnselectedAll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var registerHeaderRowCheckbox: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    var registerRowCheckboxes: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.undefined
    
    var removeClassNameByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* className */ String, Unit]] = js.undefined
    
    var setAttributeAtRowIndex: js.UndefOr[js.Function3[/* rowIndex */ Double, /* attr */ String, /* value */ String, Unit]] = js.undefined
    
    var setAttributeByHeaderCellIndex: js.UndefOr[
        js.Function3[/* columnIndex */ Double, /* attribute */ String, /* value */ String, Unit]
      ] = js.undefined
    
    var setClassNameByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* className */ String, Unit]] = js.undefined
    
    var setHeaderRowCheckboxChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    var setHeaderRowCheckboxIndeterminate: js.UndefOr[js.Function1[/* indeterminate */ Boolean, Unit]] = js.undefined
    
    var setProgressIndicatorStyles: js.UndefOr[js.Function1[/* styles */ ProgressIndicatorStyles, Unit]] = js.undefined
    
    var setRowCheckboxCheckedAtIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* checked */ Boolean, Unit]] = js.undefined
    
    var setSortStatusLabelByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* sortValue */ SortValue, Unit]] = js.undefined
  }
  object PartialMDCDataTableAdapte {
    
    inline def apply(): PartialMDCDataTableAdapte = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCDataTableAdapte]
    }
    
    extension [Self <: PartialMDCDataTableAdapte](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAddClassAtRowIndex(value: (/* rowIndex */ Double, /* cssClasses */ String) => Unit): Self = StObject.set(x, "addClassAtRowIndex", js.Any.fromFunction2(value))
      
      inline def setAddClassAtRowIndexUndefined: Self = StObject.set(x, "addClassAtRowIndex", js.undefined)
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetAttributeByHeaderCellIndex(value: (/* columnIndex */ Double, /* attribute */ String) => String | Null): Self = StObject.set(x, "getAttributeByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setGetAttributeByHeaderCellIndexUndefined: Self = StObject.set(x, "getAttributeByHeaderCellIndex", js.undefined)
      
      inline def setGetHeaderCellCount(value: () => Double): Self = StObject.set(x, "getHeaderCellCount", js.Any.fromFunction0(value))
      
      inline def setGetHeaderCellCountUndefined: Self = StObject.set(x, "getHeaderCellCount", js.undefined)
      
      inline def setGetHeaderCellElements(value: () => js.Array[Element]): Self = StObject.set(x, "getHeaderCellElements", js.Any.fromFunction0(value))
      
      inline def setGetHeaderCellElementsUndefined: Self = StObject.set(x, "getHeaderCellElements", js.undefined)
      
      inline def setGetRowCount(value: () => Double): Self = StObject.set(x, "getRowCount", js.Any.fromFunction0(value))
      
      inline def setGetRowCountUndefined: Self = StObject.set(x, "getRowCount", js.undefined)
      
      inline def setGetRowElements(value: () => js.Array[Element]): Self = StObject.set(x, "getRowElements", js.Any.fromFunction0(value))
      
      inline def setGetRowElementsUndefined: Self = StObject.set(x, "getRowElements", js.undefined)
      
      inline def setGetRowIdAtIndex(value: /* rowIndex */ Double => String | Null): Self = StObject.set(x, "getRowIdAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetRowIdAtIndexUndefined: Self = StObject.set(x, "getRowIdAtIndex", js.undefined)
      
      inline def setGetRowIndexByChildElement(value: /* el */ Element => Double): Self = StObject.set(x, "getRowIndexByChildElement", js.Any.fromFunction1(value))
      
      inline def setGetRowIndexByChildElementUndefined: Self = StObject.set(x, "getRowIndexByChildElement", js.undefined)
      
      inline def setGetSelectedRowCount(value: () => Double): Self = StObject.set(x, "getSelectedRowCount", js.Any.fromFunction0(value))
      
      inline def setGetSelectedRowCountUndefined: Self = StObject.set(x, "getSelectedRowCount", js.undefined)
      
      inline def setGetTableContainerHeight(value: () => Double): Self = StObject.set(x, "getTableContainerHeight", js.Any.fromFunction0(value))
      
      inline def setGetTableContainerHeightUndefined: Self = StObject.set(x, "getTableContainerHeight", js.undefined)
      
      inline def setGetTableHeaderHeight(value: () => Double): Self = StObject.set(x, "getTableHeaderHeight", js.Any.fromFunction0(value))
      
      inline def setGetTableHeaderHeightUndefined: Self = StObject.set(x, "getTableHeaderHeight", js.undefined)
      
      inline def setIsCheckboxAtRowIndexChecked(value: /* rowIndex */ Double => Boolean): Self = StObject.set(x, "isCheckboxAtRowIndexChecked", js.Any.fromFunction1(value))
      
      inline def setIsCheckboxAtRowIndexCheckedUndefined: Self = StObject.set(x, "isCheckboxAtRowIndexChecked", js.undefined)
      
      inline def setIsHeaderRowCheckboxChecked(value: () => Boolean): Self = StObject.set(x, "isHeaderRowCheckboxChecked", js.Any.fromFunction0(value))
      
      inline def setIsHeaderRowCheckboxCheckedUndefined: Self = StObject.set(x, "isHeaderRowCheckboxChecked", js.undefined)
      
      inline def setIsRowsSelectable(value: () => Boolean): Self = StObject.set(x, "isRowsSelectable", js.Any.fromFunction0(value))
      
      inline def setIsRowsSelectableUndefined: Self = StObject.set(x, "isRowsSelectable", js.undefined)
      
      inline def setNotifyRowClick(value: /* detail */ RowClickEventData => Unit): Self = StObject.set(x, "notifyRowClick", js.Any.fromFunction1(value))
      
      inline def setNotifyRowClickUndefined: Self = StObject.set(x, "notifyRowClick", js.undefined)
      
      inline def setNotifyRowSelectionChanged(value: /* data */ MDCDataTableRowSelectionChangedEventDetail => Unit): Self = StObject.set(x, "notifyRowSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setNotifyRowSelectionChangedUndefined: Self = StObject.set(x, "notifyRowSelectionChanged", js.undefined)
      
      inline def setNotifySelectedAll(value: () => Unit): Self = StObject.set(x, "notifySelectedAll", js.Any.fromFunction0(value))
      
      inline def setNotifySelectedAllUndefined: Self = StObject.set(x, "notifySelectedAll", js.undefined)
      
      inline def setNotifySortAction(value: /* data */ SortActionEventDetail => Unit): Self = StObject.set(x, "notifySortAction", js.Any.fromFunction1(value))
      
      inline def setNotifySortActionUndefined: Self = StObject.set(x, "notifySortAction", js.undefined)
      
      inline def setNotifyUnselectedAll(value: () => Unit): Self = StObject.set(x, "notifyUnselectedAll", js.Any.fromFunction0(value))
      
      inline def setNotifyUnselectedAllUndefined: Self = StObject.set(x, "notifyUnselectedAll", js.undefined)
      
      inline def setRegisterHeaderRowCheckbox(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "registerHeaderRowCheckbox", js.Any.fromFunction0(value))
      
      inline def setRegisterHeaderRowCheckboxUndefined: Self = StObject.set(x, "registerHeaderRowCheckbox", js.undefined)
      
      inline def setRegisterRowCheckboxes(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "registerRowCheckboxes", js.Any.fromFunction0(value))
      
      inline def setRegisterRowCheckboxesUndefined: Self = StObject.set(x, "registerRowCheckboxes", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRemoveClassAtRowIndex(value: (/* rowIndex */ Double, /* cssClasses */ String) => Unit): Self = StObject.set(x, "removeClassAtRowIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveClassAtRowIndexUndefined: Self = StObject.set(x, "removeClassAtRowIndex", js.undefined)
      
      inline def setRemoveClassNameByHeaderCellIndex(value: (/* columnIndex */ Double, /* className */ String) => Unit): Self = StObject.set(x, "removeClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveClassNameByHeaderCellIndexUndefined: Self = StObject.set(x, "removeClassNameByHeaderCellIndex", js.undefined)
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setSetAttributeAtRowIndex(value: (/* rowIndex */ Double, /* attr */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttributeAtRowIndex", js.Any.fromFunction3(value))
      
      inline def setSetAttributeAtRowIndexUndefined: Self = StObject.set(x, "setAttributeAtRowIndex", js.undefined)
      
      inline def setSetAttributeByHeaderCellIndex(value: (/* columnIndex */ Double, /* attribute */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttributeByHeaderCellIndex", js.Any.fromFunction3(value))
      
      inline def setSetAttributeByHeaderCellIndexUndefined: Self = StObject.set(x, "setAttributeByHeaderCellIndex", js.undefined)
      
      inline def setSetClassNameByHeaderCellIndex(value: (/* columnIndex */ Double, /* className */ String) => Unit): Self = StObject.set(x, "setClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setSetClassNameByHeaderCellIndexUndefined: Self = StObject.set(x, "setClassNameByHeaderCellIndex", js.undefined)
      
      inline def setSetHeaderRowCheckboxChecked(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "setHeaderRowCheckboxChecked", js.Any.fromFunction1(value))
      
      inline def setSetHeaderRowCheckboxCheckedUndefined: Self = StObject.set(x, "setHeaderRowCheckboxChecked", js.undefined)
      
      inline def setSetHeaderRowCheckboxIndeterminate(value: /* indeterminate */ Boolean => Unit): Self = StObject.set(x, "setHeaderRowCheckboxIndeterminate", js.Any.fromFunction1(value))
      
      inline def setSetHeaderRowCheckboxIndeterminateUndefined: Self = StObject.set(x, "setHeaderRowCheckboxIndeterminate", js.undefined)
      
      inline def setSetProgressIndicatorStyles(value: /* styles */ ProgressIndicatorStyles => Unit): Self = StObject.set(x, "setProgressIndicatorStyles", js.Any.fromFunction1(value))
      
      inline def setSetProgressIndicatorStylesUndefined: Self = StObject.set(x, "setProgressIndicatorStyles", js.undefined)
      
      inline def setSetRowCheckboxCheckedAtIndex(value: (/* rowIndex */ Double, /* checked */ Boolean) => Unit): Self = StObject.set(x, "setRowCheckboxCheckedAtIndex", js.Any.fromFunction2(value))
      
      inline def setSetRowCheckboxCheckedAtIndexUndefined: Self = StObject.set(x, "setRowCheckboxCheckedAtIndex", js.undefined)
      
      inline def setSetSortStatusLabelByHeaderCellIndex(value: (/* columnIndex */ Double, /* sortValue */ SortValue) => Unit): Self = StObject.set(x, "setSortStatusLabelByHeaderCellIndex", js.Any.fromFunction2(value))
      
      inline def setSetSortStatusLabelByHeaderCellIndexUndefined: Self = StObject.set(x, "setSortStatusLabelByHeaderCellIndex", js.undefined)
    }
  }
}
