package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPresetPanel extends js.Object {
  def addNewItem(): js.Any
  def applyPreset(): js.Any
  def deleteFolder(): js.Any
  def deleteItem(): js.Any
  def expandFolder(): js.Any
  def exportItem(): js.Any
  def findItemIndex(): js.Any
  def getSelectedItems(): js.Any
  def importItem(): js.Any
  def moveToFolder(): js.Any
  def newFolder(): js.Any
  def renameItem(): js.Any
  def selectItem(): js.Any
}

object FlashPresetPanel {
  @scala.inline
  def apply(
    addNewItem: js.Function0[js.Any],
    applyPreset: js.Function0[js.Any],
    deleteFolder: js.Function0[js.Any],
    deleteItem: js.Function0[js.Any],
    expandFolder: js.Function0[js.Any],
    exportItem: js.Function0[js.Any],
    findItemIndex: js.Function0[js.Any],
    getSelectedItems: js.Function0[js.Any],
    importItem: js.Function0[js.Any],
    moveToFolder: js.Function0[js.Any],
    newFolder: js.Function0[js.Any],
    renameItem: js.Function0[js.Any],
    selectItem: js.Function0[js.Any]
  ): FlashPresetPanel = {
    val __obj = js.Dynamic.literal(addNewItem = addNewItem, applyPreset = applyPreset, deleteFolder = deleteFolder, deleteItem = deleteItem, expandFolder = expandFolder, exportItem = exportItem, findItemIndex = findItemIndex, getSelectedItems = getSelectedItems, importItem = importItem, moveToFolder = moveToFolder, newFolder = newFolder, renameItem = renameItem, selectItem = selectItem)
  
    __obj.asInstanceOf[FlashPresetPanel]
  }
}

