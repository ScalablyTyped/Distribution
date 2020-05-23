package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedRowsCollection extends js.Object {
  def activate(identifier: js.Object, element: js.Object, suppress: js.Object): Unit
  def activeRow(): Unit
  def addSubscriber(subscriber: js.Object, owner: js.Object): Unit
  def changeOwner(newOwner: js.Object): Unit
  def cleanAll(forOwner: js.Object): Unit
  def clearSelection(forOwner: js.Object): Unit
  def deactivate(suppress: js.Object): Unit
  def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): Unit
  def deselectAll(suppress: js.Object): Unit
  def elementFromIdentifier(identifier: js.Object): Unit
  def elementPosition(identifier: js.Object, element: js.Object): Unit
  def isActive(identifier: js.Object, forOwner: js.Object): Unit
  def isSelected(identifier: js.Object, forOwner: js.Object): Unit
  def onlyOneSelected(): Unit
  def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): Unit
  def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): Unit
  def removeSubscriber(subscriberId: js.Object, owner: js.Object): Unit
  def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): Unit
  def selectedCells(): Unit
  def selectedDataRows(): Unit
  def selectedRows(): Unit
  def selectionLength(): Unit
  def toggle(element: js.Object): Unit
}

object SelectedRowsCollection {
  @scala.inline
  def apply(
    activate: (js.Object, js.Object, js.Object) => Unit,
    activeRow: () => Unit,
    addSubscriber: (js.Object, js.Object) => Unit,
    changeOwner: js.Object => Unit,
    cleanAll: js.Object => Unit,
    clearSelection: js.Object => Unit,
    deactivate: js.Object => Unit,
    deselect: (js.Object, js.Object, js.Object) => Unit,
    deselectAll: js.Object => Unit,
    elementFromIdentifier: js.Object => Unit,
    elementPosition: (js.Object, js.Object) => Unit,
    isActive: (js.Object, js.Object) => Unit,
    isSelected: (js.Object, js.Object) => Unit,
    onlyOneSelected: () => Unit,
    rangeDeselect: (js.Object, js.Object, js.Object) => Unit,
    rangeSelect: (js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    removeSubscriber: (js.Object, js.Object) => Unit,
    select: (js.Object, js.Object, js.Object, js.Object) => Unit,
    selectedCells: () => Unit,
    selectedDataRows: () => Unit,
    selectedRows: () => Unit,
    selectionLength: () => Unit,
    toggle: js.Object => Unit
  ): SelectedRowsCollection = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction3(activate), activeRow = js.Any.fromFunction0(activeRow), addSubscriber = js.Any.fromFunction2(addSubscriber), changeOwner = js.Any.fromFunction1(changeOwner), cleanAll = js.Any.fromFunction1(cleanAll), clearSelection = js.Any.fromFunction1(clearSelection), deactivate = js.Any.fromFunction1(deactivate), deselect = js.Any.fromFunction3(deselect), deselectAll = js.Any.fromFunction1(deselectAll), elementFromIdentifier = js.Any.fromFunction1(elementFromIdentifier), elementPosition = js.Any.fromFunction2(elementPosition), isActive = js.Any.fromFunction2(isActive), isSelected = js.Any.fromFunction2(isSelected), onlyOneSelected = js.Any.fromFunction0(onlyOneSelected), rangeDeselect = js.Any.fromFunction3(rangeDeselect), rangeSelect = js.Any.fromFunction5(rangeSelect), removeSubscriber = js.Any.fromFunction2(removeSubscriber), select = js.Any.fromFunction4(select), selectedCells = js.Any.fromFunction0(selectedCells), selectedDataRows = js.Any.fromFunction0(selectedDataRows), selectedRows = js.Any.fromFunction0(selectedRows), selectionLength = js.Any.fromFunction0(selectionLength), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[SelectedRowsCollection]
  }
}

