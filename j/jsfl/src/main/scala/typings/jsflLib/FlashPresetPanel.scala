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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNewItem")(addNewItem)
    __obj.updateDynamic("applyPreset")(applyPreset)
    __obj.updateDynamic("deleteFolder")(deleteFolder)
    __obj.updateDynamic("deleteItem")(deleteItem)
    __obj.updateDynamic("expandFolder")(expandFolder)
    __obj.updateDynamic("exportItem")(exportItem)
    __obj.updateDynamic("findItemIndex")(findItemIndex)
    __obj.updateDynamic("getSelectedItems")(getSelectedItems)
    __obj.updateDynamic("importItem")(importItem)
    __obj.updateDynamic("moveToFolder")(moveToFolder)
    __obj.updateDynamic("newFolder")(newFolder)
    __obj.updateDynamic("renameItem")(renameItem)
    __obj.updateDynamic("selectItem")(selectItem)
    __obj.asInstanceOf[FlashPresetPanel]
  }
}

