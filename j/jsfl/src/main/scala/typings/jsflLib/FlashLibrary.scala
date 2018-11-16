package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashLibrary extends js.Object {
  /** Property; an array of item objects in the library. */
  var items: js.Array[FlashItem] = js.native
  def addItemToDocument(position: FlashPoint): scala.Boolean = js.native
  def addItemToDocument(position: FlashPoint, namePath: java.lang.String): scala.Boolean = js.native
  /** "video", "movie clip", "button", "graphic", "bitmap", "screen", and "folder" */
  def addNewItem(`type`: java.lang.String): scala.Boolean = js.native
  /** "video", "movie clip", "button", "graphic", "bitmap", "screen", and "folder" */
  def addNewItem(`type`: java.lang.String, namePath: java.lang.String): scala.Boolean = js.native
  def deleteItem(): scala.Boolean = js.native
  def deleteItem(namePath: java.lang.String): scala.Boolean = js.native
  /** Method; makes a copy of the currently selected or specified item. The new item has a default name (such as item copy) and is set as the currently selected item. If more than one item is selected, the command fails. */
  def duplicateItem(namePath: java.lang.String): scala.Boolean = js.native
  def editItem(): scala.Boolean = js.native
  def editItem(namePath: java.lang.String): scala.Boolean = js.native
  def expandFolder(bExpand: scala.Boolean): scala.Boolean = js.native
  def expandFolder(bExpand: scala.Boolean, bRecurseNestedParents: scala.Boolean): scala.Boolean = js.native
  def expandFolder(bExpand: scala.Boolean, bRecurseNestedParents: scala.Boolean, namePath: java.lang.String): scala.Boolean = js.native
  def findItemIndex(namePath: java.lang.String): scala.Double = js.native
  def getItemProperty(property: java.lang.String): java.lang.String = js.native
  def getItemType(): java.lang.String = js.native
  def getItemType(namePath: java.lang.String): java.lang.String = js.native
  /** An array of values for all currently selected items in the library. */
  def getSelectedItems(): js.Array[FlashItem] = js.native
  def importEmbeddedSWF(linkageName: java.lang.String, swfData: js.Array[_]): scala.Unit = js.native
  def importEmbeddedSWF(linkageName: java.lang.String, swfData: js.Array[_], libName: java.lang.String): scala.Unit = js.native
  def itemExists(namePath: java.lang.String): scala.Boolean = js.native
  def moveToFolder(folderPath: java.lang.String): scala.Boolean = js.native
  def moveToFolder(folderPath: java.lang.String, itemToMove: java.lang.String): scala.Boolean = js.native
  def moveToFolder(folderPath: java.lang.String, itemToMove: java.lang.String, bReplace: scala.Boolean): scala.Boolean = js.native
  /** Method; creates a new folder with the specified name, or a default name ("untitled folder #" ) if no folderName parameter is provided, in the currently selected folder. */
  def newFolder(): scala.Boolean = js.native
  /** Method; creates a new folder with the specified name, or a default name ("untitled folder #" ) if no folderName parameter is provided, in the currently selected folder. */
  def newFolder(folderPath: java.lang.String): scala.Boolean = js.native
  /** Method; renames the currently selected library item in the Library panel. */
  def renameItem(name: java.lang.String): scala.Boolean = js.native
  /** Method; selects or deselects all items in the library. */
  def selectAll(): scala.Unit = js.native
  /** Method; selects or deselects all items in the library. */
  def selectAll(bSelectAll: scala.Boolean): scala.Unit = js.native
  /** Method; selects a specified library item. */
  def selectItem(namePath: java.lang.String): scala.Boolean = js.native
  /** Method; selects a specified library item. */
  def selectItem(namePath: java.lang.String, bReplaceCurrentSelection: scala.Boolean): scala.Boolean = js.native
  /** Method; selects a specified library item. */
  def selectItem(namePath: java.lang.String, bReplaceCurrentSelection: scala.Boolean, bSelect: scala.Boolean): scala.Boolean = js.native
  /** Method; deselects all the library items. */
  def selectNone(): scala.Unit = js.native
  /** Method; sets the property for all selected library items (ignoring folders). */
  def setItemProperty(property: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Method; updates the specified item. */
  def updateItem(namePath: java.lang.String): scala.Boolean = js.native
}

