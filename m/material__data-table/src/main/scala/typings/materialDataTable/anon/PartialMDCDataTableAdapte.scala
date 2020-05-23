package typings.materialDataTable.anon

import typings.materialDataTable.typesMod.MDCDataTableRowSelectionChangedEventDetail
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/data-table.@material/data-table/adapter.MDCDataTableAdapter> */
trait PartialMDCDataTableAdapte extends js.Object {
  var addClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.undefined
  var getRowCount: js.UndefOr[js.Function0[Double]] = js.undefined
  var getRowElements: js.UndefOr[js.Function0[js.Array[Element]]] = js.undefined
  var getRowIdAtIndex: js.UndefOr[js.Function1[/* rowIndex */ Double, String | Null]] = js.undefined
  var getRowIndexByChildElement: js.UndefOr[js.Function1[/* el */ Element, Double]] = js.undefined
  var getSelectedRowCount: js.UndefOr[js.Function0[Double]] = js.undefined
  var isCheckboxAtRowIndexChecked: js.UndefOr[js.Function1[/* rowIndex */ Double, Boolean]] = js.undefined
  var isHeaderRowCheckboxChecked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isRowsSelectable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var notifyRowSelectionChanged: js.UndefOr[js.Function1[/* data */ MDCDataTableRowSelectionChangedEventDetail, Unit]] = js.undefined
  var notifySelectedAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var notifyUnselectedAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var registerHeaderRowCheckbox: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var registerRowCheckboxes: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var removeClassAtRowIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* cssClasses */ String, Unit]] = js.undefined
  var setAttributeAtRowIndex: js.UndefOr[js.Function3[/* rowIndex */ Double, /* attr */ String, /* value */ String, Unit]] = js.undefined
  var setHeaderRowCheckboxChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var setHeaderRowCheckboxIndeterminate: js.UndefOr[js.Function1[/* indeterminate */ Boolean, Unit]] = js.undefined
  var setRowCheckboxCheckedAtIndex: js.UndefOr[js.Function2[/* rowIndex */ Double, /* checked */ Boolean, Unit]] = js.undefined
}

object PartialMDCDataTableAdapte {
  @scala.inline
  def apply(
    addClassAtRowIndex: (/* rowIndex */ Double, /* cssClasses */ String) => Unit = null,
    getRowCount: () => Double = null,
    getRowElements: () => js.Array[Element] = null,
    getRowIdAtIndex: /* rowIndex */ Double => String | Null = null,
    getRowIndexByChildElement: /* el */ Element => Double = null,
    getSelectedRowCount: () => Double = null,
    isCheckboxAtRowIndexChecked: /* rowIndex */ Double => Boolean = null,
    isHeaderRowCheckboxChecked: () => Boolean = null,
    isRowsSelectable: () => Boolean = null,
    notifyRowSelectionChanged: /* data */ MDCDataTableRowSelectionChangedEventDetail => Unit = null,
    notifySelectedAll: () => Unit = null,
    notifyUnselectedAll: () => Unit = null,
    registerHeaderRowCheckbox: () => js.Promise[Unit] | Unit = null,
    registerRowCheckboxes: () => js.Promise[Unit] | Unit = null,
    removeClassAtRowIndex: (/* rowIndex */ Double, /* cssClasses */ String) => Unit = null,
    setAttributeAtRowIndex: (/* rowIndex */ Double, /* attr */ String, /* value */ String) => Unit = null,
    setHeaderRowCheckboxChecked: /* checked */ Boolean => Unit = null,
    setHeaderRowCheckboxIndeterminate: /* indeterminate */ Boolean => Unit = null,
    setRowCheckboxCheckedAtIndex: (/* rowIndex */ Double, /* checked */ Boolean) => Unit = null
  ): PartialMDCDataTableAdapte = {
    val __obj = js.Dynamic.literal()
    if (addClassAtRowIndex != null) __obj.updateDynamic("addClassAtRowIndex")(js.Any.fromFunction2(addClassAtRowIndex))
    if (getRowCount != null) __obj.updateDynamic("getRowCount")(js.Any.fromFunction0(getRowCount))
    if (getRowElements != null) __obj.updateDynamic("getRowElements")(js.Any.fromFunction0(getRowElements))
    if (getRowIdAtIndex != null) __obj.updateDynamic("getRowIdAtIndex")(js.Any.fromFunction1(getRowIdAtIndex))
    if (getRowIndexByChildElement != null) __obj.updateDynamic("getRowIndexByChildElement")(js.Any.fromFunction1(getRowIndexByChildElement))
    if (getSelectedRowCount != null) __obj.updateDynamic("getSelectedRowCount")(js.Any.fromFunction0(getSelectedRowCount))
    if (isCheckboxAtRowIndexChecked != null) __obj.updateDynamic("isCheckboxAtRowIndexChecked")(js.Any.fromFunction1(isCheckboxAtRowIndexChecked))
    if (isHeaderRowCheckboxChecked != null) __obj.updateDynamic("isHeaderRowCheckboxChecked")(js.Any.fromFunction0(isHeaderRowCheckboxChecked))
    if (isRowsSelectable != null) __obj.updateDynamic("isRowsSelectable")(js.Any.fromFunction0(isRowsSelectable))
    if (notifyRowSelectionChanged != null) __obj.updateDynamic("notifyRowSelectionChanged")(js.Any.fromFunction1(notifyRowSelectionChanged))
    if (notifySelectedAll != null) __obj.updateDynamic("notifySelectedAll")(js.Any.fromFunction0(notifySelectedAll))
    if (notifyUnselectedAll != null) __obj.updateDynamic("notifyUnselectedAll")(js.Any.fromFunction0(notifyUnselectedAll))
    if (registerHeaderRowCheckbox != null) __obj.updateDynamic("registerHeaderRowCheckbox")(js.Any.fromFunction0(registerHeaderRowCheckbox))
    if (registerRowCheckboxes != null) __obj.updateDynamic("registerRowCheckboxes")(js.Any.fromFunction0(registerRowCheckboxes))
    if (removeClassAtRowIndex != null) __obj.updateDynamic("removeClassAtRowIndex")(js.Any.fromFunction2(removeClassAtRowIndex))
    if (setAttributeAtRowIndex != null) __obj.updateDynamic("setAttributeAtRowIndex")(js.Any.fromFunction3(setAttributeAtRowIndex))
    if (setHeaderRowCheckboxChecked != null) __obj.updateDynamic("setHeaderRowCheckboxChecked")(js.Any.fromFunction1(setHeaderRowCheckboxChecked))
    if (setHeaderRowCheckboxIndeterminate != null) __obj.updateDynamic("setHeaderRowCheckboxIndeterminate")(js.Any.fromFunction1(setHeaderRowCheckboxIndeterminate))
    if (setRowCheckboxCheckedAtIndex != null) __obj.updateDynamic("setRowCheckboxCheckedAtIndex")(js.Any.fromFunction2(setRowCheckboxCheckedAtIndex))
    __obj.asInstanceOf[PartialMDCDataTableAdapte]
  }
}

