package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashPresetPanel extends js.Object {
  
  def addNewItem(): js.Any = js.native
  
  def applyPreset(): js.Any = js.native
  
  def deleteFolder(): js.Any = js.native
  
  def deleteItem(): js.Any = js.native
  
  def expandFolder(): js.Any = js.native
  
  def exportItem(): js.Any = js.native
  
  def findItemIndex(): js.Any = js.native
  
  def getSelectedItems(): js.Any = js.native
  
  def importItem(): js.Any = js.native
  
  def moveToFolder(): js.Any = js.native
  
  def newFolder(): js.Any = js.native
  
  def renameItem(): js.Any = js.native
  
  def selectItem(): js.Any = js.native
}
object FlashPresetPanel {
  
  @scala.inline
  def apply(
    addNewItem: () => js.Any,
    applyPreset: () => js.Any,
    deleteFolder: () => js.Any,
    deleteItem: () => js.Any,
    expandFolder: () => js.Any,
    exportItem: () => js.Any,
    findItemIndex: () => js.Any,
    getSelectedItems: () => js.Any,
    importItem: () => js.Any,
    moveToFolder: () => js.Any,
    newFolder: () => js.Any,
    renameItem: () => js.Any,
    selectItem: () => js.Any
  ): FlashPresetPanel = {
    val __obj = js.Dynamic.literal(addNewItem = js.Any.fromFunction0(addNewItem), applyPreset = js.Any.fromFunction0(applyPreset), deleteFolder = js.Any.fromFunction0(deleteFolder), deleteItem = js.Any.fromFunction0(deleteItem), expandFolder = js.Any.fromFunction0(expandFolder), exportItem = js.Any.fromFunction0(exportItem), findItemIndex = js.Any.fromFunction0(findItemIndex), getSelectedItems = js.Any.fromFunction0(getSelectedItems), importItem = js.Any.fromFunction0(importItem), moveToFolder = js.Any.fromFunction0(moveToFolder), newFolder = js.Any.fromFunction0(newFolder), renameItem = js.Any.fromFunction0(renameItem), selectItem = js.Any.fromFunction0(selectItem))
    __obj.asInstanceOf[FlashPresetPanel]
  }
  
  @scala.inline
  implicit class FlashPresetPanelOps[Self <: FlashPresetPanel] (val x: Self) extends AnyVal {
    
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
    def setAddNewItem(value: () => js.Any): Self = this.set("addNewItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyPreset(value: () => js.Any): Self = this.set("applyPreset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteFolder(value: () => js.Any): Self = this.set("deleteFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteItem(value: () => js.Any): Self = this.set("deleteItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandFolder(value: () => js.Any): Self = this.set("expandFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportItem(value: () => js.Any): Self = this.set("exportItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindItemIndex(value: () => js.Any): Self = this.set("findItemIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedItems(value: () => js.Any): Self = this.set("getSelectedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportItem(value: () => js.Any): Self = this.set("importItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveToFolder(value: () => js.Any): Self = this.set("moveToFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFolder(value: () => js.Any): Self = this.set("newFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenameItem(value: () => js.Any): Self = this.set("renameItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectItem(value: () => js.Any): Self = this.set("selectItem", js.Any.fromFunction0(value))
  }
}
