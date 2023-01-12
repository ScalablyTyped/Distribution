package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashPresetPanel extends StObject {
  
  def addNewItem(): Any
  
  def applyPreset(): Any
  
  def deleteFolder(): Any
  
  def deleteItem(): Any
  
  def expandFolder(): Any
  
  def exportItem(): Any
  
  def findItemIndex(): Any
  
  def getSelectedItems(): Any
  
  def importItem(): Any
  
  def moveToFolder(): Any
  
  def newFolder(): Any
  
  def renameItem(): Any
  
  def selectItem(): Any
}
object FlashPresetPanel {
  
  inline def apply(
    addNewItem: () => Any,
    applyPreset: () => Any,
    deleteFolder: () => Any,
    deleteItem: () => Any,
    expandFolder: () => Any,
    exportItem: () => Any,
    findItemIndex: () => Any,
    getSelectedItems: () => Any,
    importItem: () => Any,
    moveToFolder: () => Any,
    newFolder: () => Any,
    renameItem: () => Any,
    selectItem: () => Any
  ): FlashPresetPanel = {
    val __obj = js.Dynamic.literal(addNewItem = js.Any.fromFunction0(addNewItem), applyPreset = js.Any.fromFunction0(applyPreset), deleteFolder = js.Any.fromFunction0(deleteFolder), deleteItem = js.Any.fromFunction0(deleteItem), expandFolder = js.Any.fromFunction0(expandFolder), exportItem = js.Any.fromFunction0(exportItem), findItemIndex = js.Any.fromFunction0(findItemIndex), getSelectedItems = js.Any.fromFunction0(getSelectedItems), importItem = js.Any.fromFunction0(importItem), moveToFolder = js.Any.fromFunction0(moveToFolder), newFolder = js.Any.fromFunction0(newFolder), renameItem = js.Any.fromFunction0(renameItem), selectItem = js.Any.fromFunction0(selectItem))
    __obj.asInstanceOf[FlashPresetPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashPresetPanel] (val x: Self) extends AnyVal {
    
    inline def setAddNewItem(value: () => Any): Self = StObject.set(x, "addNewItem", js.Any.fromFunction0(value))
    
    inline def setApplyPreset(value: () => Any): Self = StObject.set(x, "applyPreset", js.Any.fromFunction0(value))
    
    inline def setDeleteFolder(value: () => Any): Self = StObject.set(x, "deleteFolder", js.Any.fromFunction0(value))
    
    inline def setDeleteItem(value: () => Any): Self = StObject.set(x, "deleteItem", js.Any.fromFunction0(value))
    
    inline def setExpandFolder(value: () => Any): Self = StObject.set(x, "expandFolder", js.Any.fromFunction0(value))
    
    inline def setExportItem(value: () => Any): Self = StObject.set(x, "exportItem", js.Any.fromFunction0(value))
    
    inline def setFindItemIndex(value: () => Any): Self = StObject.set(x, "findItemIndex", js.Any.fromFunction0(value))
    
    inline def setGetSelectedItems(value: () => Any): Self = StObject.set(x, "getSelectedItems", js.Any.fromFunction0(value))
    
    inline def setImportItem(value: () => Any): Self = StObject.set(x, "importItem", js.Any.fromFunction0(value))
    
    inline def setMoveToFolder(value: () => Any): Self = StObject.set(x, "moveToFolder", js.Any.fromFunction0(value))
    
    inline def setNewFolder(value: () => Any): Self = StObject.set(x, "newFolder", js.Any.fromFunction0(value))
    
    inline def setRenameItem(value: () => Any): Self = StObject.set(x, "renameItem", js.Any.fromFunction0(value))
    
    inline def setSelectItem(value: () => Any): Self = StObject.set(x, "selectItem", js.Any.fromFunction0(value))
  }
}
