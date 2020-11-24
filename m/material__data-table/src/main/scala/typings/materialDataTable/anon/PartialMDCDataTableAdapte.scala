package typings.materialDataTable.anon

import typings.materialDataTable.constantsMod.SortValue
import typings.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typings.materialDataTable.typesMod.ProgressIndicatorStyles
import typings.materialDataTable.typesMod.SortActionEventDetail
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/data-table.@material/data-table/adapter.MDCDataTableAdapter> */
@js.native
trait PartialMDCDataTableAdapte extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var addClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.native
  
  var getAttributeByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* attribute */ String, String | Null]] = js.native
  
  var getHeaderCellCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var getHeaderCellElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.native
  
  var getRowCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var getRowElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.native
  
  var getRowIdAtIndex: js.UndefOr[js.Function1[/* rowIndex */ Double, String | Null]] = js.native
  
  var getRowIndexByChildElement: js.UndefOr[js.Function1[/* el */ Element, Double]] = js.native
  
  var getSelectedRowCount: js.UndefOr[js.Function0[Double]] = js.native
  
  var getTableContainerHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var getTableHeaderHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var isCheckboxAtRowIndexChecked: js.UndefOr[js.Function1[/* rowIndex */ Double, Boolean]] = js.native
  
  var isHeaderRowCheckboxChecked: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isRowsSelectable: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifyRowSelectionChanged: js.UndefOr[js.Function1[/* data */ MDCDataTableRowSelectionChangedEventDetail, Unit]] = js.native
  
  var notifySelectedAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  var notifySortAction: js.UndefOr[js.Function1[/* data */ SortActionEventDetail, Unit]] = js.native
  
  var notifyUnselectedAll: js.UndefOr[js.Function0[Unit]] = js.native
  
  var registerHeaderRowCheckbox: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  var registerRowCheckboxes: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var removeClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.native
  
  var removeClassNameByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* className */ String, Unit]] = js.native
  
  var setAttributeAtRowIndex: js.UndefOr[js.Function3[/* rowIndex */ Double, /* attr */ String, /* value */ String, Unit]] = js.native
  
  var setAttributeByHeaderCellIndex: js.UndefOr[
    js.Function3[/* columnIndex */ Double, /* attribute */ String, /* value */ String, Unit]
  ] = js.native
  
  var setClassNameByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* className */ String, Unit]] = js.native
  
  var setHeaderRowCheckboxChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  
  var setHeaderRowCheckboxIndeterminate: js.UndefOr[js.Function1[/* indeterminate */ Boolean, Unit]] = js.native
  
  var setProgressIndicatorStyles: js.UndefOr[js.Function1[/* styles */ ProgressIndicatorStyles, Unit]] = js.native
  
  var setRowCheckboxCheckedAtIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* checked */ Boolean, Unit]] = js.native
  
  var setSortStatusLabelByHeaderCellIndex: js.UndefOr[js.Function2[/* columnIndex */ Double, /* sortValue */ SortValue, Unit]] = js.native
}
object PartialMDCDataTableAdapte {
  
  @scala.inline
  def apply(): PartialMDCDataTableAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCDataTableAdapte]
  }
  
  @scala.inline
  implicit class PartialMDCDataTableAdapteOps[Self <: PartialMDCDataTableAdapte] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    
    @scala.inline
    def setAddClassAtRowIndex(value: (/* rowIndex */ Double, /* cssClasses */ String) => Unit): Self = this.set("addClassAtRowIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddClassAtRowIndex: Self = this.set("addClassAtRowIndex", js.undefined)
    
    @scala.inline
    def setGetAttributeByHeaderCellIndex(value: (/* columnIndex */ Double, /* attribute */ String) => String | Null): Self = this.set("getAttributeByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetAttributeByHeaderCellIndex: Self = this.set("getAttributeByHeaderCellIndex", js.undefined)
    
    @scala.inline
    def setGetHeaderCellCount(value: () => Double): Self = this.set("getHeaderCellCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeaderCellCount: Self = this.set("getHeaderCellCount", js.undefined)
    
    @scala.inline
    def setGetHeaderCellElements(value: () => js.Array[Element]): Self = this.set("getHeaderCellElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeaderCellElements: Self = this.set("getHeaderCellElements", js.undefined)
    
    @scala.inline
    def setGetRowCount(value: () => Double): Self = this.set("getRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRowCount: Self = this.set("getRowCount", js.undefined)
    
    @scala.inline
    def setGetRowElements(value: () => js.Array[Element]): Self = this.set("getRowElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRowElements: Self = this.set("getRowElements", js.undefined)
    
    @scala.inline
    def setGetRowIdAtIndex(value: /* rowIndex */ Double => String | Null): Self = this.set("getRowIdAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRowIdAtIndex: Self = this.set("getRowIdAtIndex", js.undefined)
    
    @scala.inline
    def setGetRowIndexByChildElement(value: /* el */ Element => Double): Self = this.set("getRowIndexByChildElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRowIndexByChildElement: Self = this.set("getRowIndexByChildElement", js.undefined)
    
    @scala.inline
    def setGetSelectedRowCount(value: () => Double): Self = this.set("getSelectedRowCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSelectedRowCount: Self = this.set("getSelectedRowCount", js.undefined)
    
    @scala.inline
    def setGetTableContainerHeight(value: () => Double): Self = this.set("getTableContainerHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTableContainerHeight: Self = this.set("getTableContainerHeight", js.undefined)
    
    @scala.inline
    def setGetTableHeaderHeight(value: () => Double): Self = this.set("getTableHeaderHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTableHeaderHeight: Self = this.set("getTableHeaderHeight", js.undefined)
    
    @scala.inline
    def setIsCheckboxAtRowIndexChecked(value: /* rowIndex */ Double => Boolean): Self = this.set("isCheckboxAtRowIndexChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsCheckboxAtRowIndexChecked: Self = this.set("isCheckboxAtRowIndexChecked", js.undefined)
    
    @scala.inline
    def setIsHeaderRowCheckboxChecked(value: () => Boolean): Self = this.set("isHeaderRowCheckboxChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsHeaderRowCheckboxChecked: Self = this.set("isHeaderRowCheckboxChecked", js.undefined)
    
    @scala.inline
    def setIsRowsSelectable(value: () => Boolean): Self = this.set("isRowsSelectable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsRowsSelectable: Self = this.set("isRowsSelectable", js.undefined)
    
    @scala.inline
    def setNotifyRowSelectionChanged(value: /* data */ MDCDataTableRowSelectionChangedEventDetail => Unit): Self = this.set("notifyRowSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyRowSelectionChanged: Self = this.set("notifyRowSelectionChanged", js.undefined)
    
    @scala.inline
    def setNotifySelectedAll(value: () => Unit): Self = this.set("notifySelectedAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifySelectedAll: Self = this.set("notifySelectedAll", js.undefined)
    
    @scala.inline
    def setNotifySortAction(value: /* data */ SortActionEventDetail => Unit): Self = this.set("notifySortAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifySortAction: Self = this.set("notifySortAction", js.undefined)
    
    @scala.inline
    def setNotifyUnselectedAll(value: () => Unit): Self = this.set("notifyUnselectedAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNotifyUnselectedAll: Self = this.set("notifyUnselectedAll", js.undefined)
    
    @scala.inline
    def setRegisterHeaderRowCheckbox(value: () => js.Promise[Unit] | Unit): Self = this.set("registerHeaderRowCheckbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRegisterHeaderRowCheckbox: Self = this.set("registerHeaderRowCheckbox", js.undefined)
    
    @scala.inline
    def setRegisterRowCheckboxes(value: () => js.Promise[Unit] | Unit): Self = this.set("registerRowCheckboxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRegisterRowCheckboxes: Self = this.set("registerRowCheckboxes", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setRemoveClassAtRowIndex(value: (/* rowIndex */ Double, /* cssClasses */ String) => Unit): Self = this.set("removeClassAtRowIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveClassAtRowIndex: Self = this.set("removeClassAtRowIndex", js.undefined)
    
    @scala.inline
    def setRemoveClassNameByHeaderCellIndex(value: (/* columnIndex */ Double, /* className */ String) => Unit): Self = this.set("removeClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveClassNameByHeaderCellIndex: Self = this.set("removeClassNameByHeaderCellIndex", js.undefined)
    
    @scala.inline
    def setSetAttributeAtRowIndex(value: (/* rowIndex */ Double, /* attr */ String, /* value */ String) => Unit): Self = this.set("setAttributeAtRowIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetAttributeAtRowIndex: Self = this.set("setAttributeAtRowIndex", js.undefined)
    
    @scala.inline
    def setSetAttributeByHeaderCellIndex(value: (/* columnIndex */ Double, /* attribute */ String, /* value */ String) => Unit): Self = this.set("setAttributeByHeaderCellIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSetAttributeByHeaderCellIndex: Self = this.set("setAttributeByHeaderCellIndex", js.undefined)
    
    @scala.inline
    def setSetClassNameByHeaderCellIndex(value: (/* columnIndex */ Double, /* className */ String) => Unit): Self = this.set("setClassNameByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetClassNameByHeaderCellIndex: Self = this.set("setClassNameByHeaderCellIndex", js.undefined)
    
    @scala.inline
    def setSetHeaderRowCheckboxChecked(value: /* checked */ Boolean => Unit): Self = this.set("setHeaderRowCheckboxChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeaderRowCheckboxChecked: Self = this.set("setHeaderRowCheckboxChecked", js.undefined)
    
    @scala.inline
    def setSetHeaderRowCheckboxIndeterminate(value: /* indeterminate */ Boolean => Unit): Self = this.set("setHeaderRowCheckboxIndeterminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeaderRowCheckboxIndeterminate: Self = this.set("setHeaderRowCheckboxIndeterminate", js.undefined)
    
    @scala.inline
    def setSetProgressIndicatorStyles(value: /* styles */ ProgressIndicatorStyles => Unit): Self = this.set("setProgressIndicatorStyles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetProgressIndicatorStyles: Self = this.set("setProgressIndicatorStyles", js.undefined)
    
    @scala.inline
    def setSetRowCheckboxCheckedAtIndex(value: (/* rowIndex */ Double, /* checked */ Boolean) => Unit): Self = this.set("setRowCheckboxCheckedAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetRowCheckboxCheckedAtIndex: Self = this.set("setRowCheckboxCheckedAtIndex", js.undefined)
    
    @scala.inline
    def setSetSortStatusLabelByHeaderCellIndex(value: (/* columnIndex */ Double, /* sortValue */ SortValue) => Unit): Self = this.set("setSortStatusLabelByHeaderCellIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSortStatusLabelByHeaderCellIndex: Self = this.set("setSortStatusLabelByHeaderCellIndex", js.undefined)
  }
}
