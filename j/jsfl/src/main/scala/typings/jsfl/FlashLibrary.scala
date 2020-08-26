package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashLibrary extends js.Object {
  /** Property; an array of item objects in the library. */
  var items: js.Array[FlashItem] = js.native
  def addItemToDocument(position: FlashPoint): Boolean = js.native
  def addItemToDocument(position: FlashPoint, namePath: String): Boolean = js.native
  /** "video", "movie clip", "button", "graphic", "bitmap", "screen", and "folder" */
  def addNewItem(`type`: String): Boolean = js.native
  def addNewItem(`type`: String, namePath: String): Boolean = js.native
  def deleteItem(): Boolean = js.native
  def deleteItem(namePath: String): Boolean = js.native
  /** Method; makes a copy of the currently selected or specified item. The new item has a default name (such as item copy) and is set as the currently selected item. If more than one item is selected, the command fails. */
  def duplicateItem(namePath: String): Boolean = js.native
  def editItem(): Boolean = js.native
  def editItem(namePath: String): Boolean = js.native
  def expandFolder(bExpand: Boolean): Boolean = js.native
  def expandFolder(bExpand: Boolean, bRecurseNestedParents: js.UndefOr[scala.Nothing], namePath: String): Boolean = js.native
  def expandFolder(bExpand: Boolean, bRecurseNestedParents: Boolean): Boolean = js.native
  def expandFolder(bExpand: Boolean, bRecurseNestedParents: Boolean, namePath: String): Boolean = js.native
  def findItemIndex(namePath: String): Double = js.native
  def getItemProperty(property: String): String = js.native
  def getItemType(): String = js.native
  def getItemType(namePath: String): String = js.native
  /** An array of values for all currently selected items in the library. */
  def getSelectedItems(): js.Array[FlashItem] = js.native
  def importEmbeddedSWF(linkageName: String, swfData: js.Array[_]): Unit = js.native
  def importEmbeddedSWF(linkageName: String, swfData: js.Array[_], libName: String): Unit = js.native
  def itemExists(namePath: String): Boolean = js.native
  def moveToFolder(folderPath: String): Boolean = js.native
  def moveToFolder(folderPath: String, itemToMove: js.UndefOr[scala.Nothing], bReplace: Boolean): Boolean = js.native
  def moveToFolder(folderPath: String, itemToMove: String): Boolean = js.native
  def moveToFolder(folderPath: String, itemToMove: String, bReplace: Boolean): Boolean = js.native
  /** Method; creates a new folder with the specified name, or a default name ("untitled folder #" ) if no folderName parameter is provided, in the currently selected folder. */
  def newFolder(): Boolean = js.native
  def newFolder(folderPath: String): Boolean = js.native
  /** Method; renames the currently selected library item in the Library panel. */
  def renameItem(name: String): Boolean = js.native
  /** Method; selects or deselects all items in the library. */
  def selectAll(): Unit = js.native
  def selectAll(bSelectAll: Boolean): Unit = js.native
  /** Method; selects a specified library item. */
  def selectItem(namePath: String): Boolean = js.native
  def selectItem(namePath: String, bReplaceCurrentSelection: js.UndefOr[scala.Nothing], bSelect: Boolean): Boolean = js.native
  def selectItem(namePath: String, bReplaceCurrentSelection: Boolean): Boolean = js.native
  def selectItem(namePath: String, bReplaceCurrentSelection: Boolean, bSelect: Boolean): Boolean = js.native
  /** Method; deselects all the library items. */
  def selectNone(): Unit = js.native
  /** Method; sets the property for all selected library items (ignoring folders). */
  def setItemProperty(property: String, value: js.Any): Unit = js.native
  /** Method; updates the specified item. */
  def updateItem(namePath: String): Boolean = js.native
}

