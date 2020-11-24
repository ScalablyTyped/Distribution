package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionCollection extends js.Object {
  
  def activate(identifier: js.Object, element: js.Object, suppress: js.Object): Unit = js.native
  
  def addSubscriber(subscriber: js.Object, owner: js.Object): Unit = js.native
  
  def changeOwner(newOwner: js.Object): Unit = js.native
  
  def cleanAll(forOwner: js.Object): Unit = js.native
  
  def clearSelection(forOwner: js.Object): Unit = js.native
  
  def deactivate(suppress: js.Object): Unit = js.native
  
  def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  
  def deselectAll(suppress: js.Object): Unit = js.native
  
  def elementFromIdentifier(identifier: js.Object): Unit = js.native
  
  def isActive(identifier: js.Object, forOwner: js.Object): Unit = js.native
  
  def isSelected(identifier: js.Object, forOwner: js.Object): Unit = js.native
  
  def onlyOneSelected(): Unit = js.native
  
  def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  
  def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  
  def removeSubscriber(subscriberId: js.Object, owner: js.Object): Unit = js.native
  
  def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  
  def selectedCells(): Unit = js.native
  
  def selectedRows(): Unit = js.native
  
  def selectionLength(): Unit = js.native
  
  def toggle(element: js.Object): Unit = js.native
}
object SelectionCollection {
  
  @scala.inline
  def apply(
    activate: (js.Object, js.Object, js.Object) => Unit,
    addSubscriber: (js.Object, js.Object) => Unit,
    changeOwner: js.Object => Unit,
    cleanAll: js.Object => Unit,
    clearSelection: js.Object => Unit,
    deactivate: js.Object => Unit,
    deselect: (js.Object, js.Object, js.Object) => Unit,
    deselectAll: js.Object => Unit,
    elementFromIdentifier: js.Object => Unit,
    isActive: (js.Object, js.Object) => Unit,
    isSelected: (js.Object, js.Object) => Unit,
    onlyOneSelected: () => Unit,
    rangeDeselect: (js.Object, js.Object, js.Object) => Unit,
    rangeSelect: (js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    removeSubscriber: (js.Object, js.Object) => Unit,
    select: (js.Object, js.Object, js.Object, js.Object) => Unit,
    selectedCells: () => Unit,
    selectedRows: () => Unit,
    selectionLength: () => Unit,
    toggle: js.Object => Unit
  ): SelectionCollection = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction3(activate), addSubscriber = js.Any.fromFunction2(addSubscriber), changeOwner = js.Any.fromFunction1(changeOwner), cleanAll = js.Any.fromFunction1(cleanAll), clearSelection = js.Any.fromFunction1(clearSelection), deactivate = js.Any.fromFunction1(deactivate), deselect = js.Any.fromFunction3(deselect), deselectAll = js.Any.fromFunction1(deselectAll), elementFromIdentifier = js.Any.fromFunction1(elementFromIdentifier), isActive = js.Any.fromFunction2(isActive), isSelected = js.Any.fromFunction2(isSelected), onlyOneSelected = js.Any.fromFunction0(onlyOneSelected), rangeDeselect = js.Any.fromFunction3(rangeDeselect), rangeSelect = js.Any.fromFunction5(rangeSelect), removeSubscriber = js.Any.fromFunction2(removeSubscriber), select = js.Any.fromFunction4(select), selectedCells = js.Any.fromFunction0(selectedCells), selectedRows = js.Any.fromFunction0(selectedRows), selectionLength = js.Any.fromFunction0(selectionLength), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[SelectionCollection]
  }
  
  @scala.inline
  implicit class SelectionCollectionOps[Self <: SelectionCollection] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: (js.Object, js.Object, js.Object) => Unit): Self = this.set("activate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddSubscriber(value: (js.Object, js.Object) => Unit): Self = this.set("addSubscriber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeOwner(value: js.Object => Unit): Self = this.set("changeOwner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCleanAll(value: js.Object => Unit): Self = this.set("cleanAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearSelection(value: js.Object => Unit): Self = this.set("clearSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivate(value: js.Object => Unit): Self = this.set("deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeselect(value: (js.Object, js.Object, js.Object) => Unit): Self = this.set("deselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDeselectAll(value: js.Object => Unit): Self = this.set("deselectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementFromIdentifier(value: js.Object => Unit): Self = this.set("elementFromIdentifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsActive(value: (js.Object, js.Object) => Unit): Self = this.set("isActive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsSelected(value: (js.Object, js.Object) => Unit): Self = this.set("isSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnlyOneSelected(value: () => Unit): Self = this.set("onlyOneSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRangeDeselect(value: (js.Object, js.Object, js.Object) => Unit): Self = this.set("rangeDeselect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRangeSelect(value: (js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = this.set("rangeSelect", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRemoveSubscriber(value: (js.Object, js.Object) => Unit): Self = this.set("removeSubscriber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelect(value: (js.Object, js.Object, js.Object, js.Object) => Unit): Self = this.set("select", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSelectedCells(value: () => Unit): Self = this.set("selectedCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedRows(value: () => Unit): Self = this.set("selectedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectionLength(value: () => Unit): Self = this.set("selectionLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: js.Object => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
  }
}
