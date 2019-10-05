package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu extends js.Object {
  var container: HTMLElement = js.native
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager = js.native
  var hot: Core = js.native
  var hotMenu: Core = js.native
  var hotSubMenus: js.Object = js.native
  var keyEvent: Boolean = js.native
  var menuItems: js.Array[_] | Null = js.native
  var offset: js.Object = js.native
  var options: js.Object = js.native
  var origOutsideClickDeselects: Boolean | js.Function0[Unit] = js.native
  var parentMenu: Menu | Null = js.native
  def close(): Unit = js.native
  def close(closeParent: Boolean): Unit = js.native
  def closeAllSubMenus(): Unit = js.native
  def closeSubMenu(row: Double): Unit = js.native
  def destroy(): Unit = js.native
  def executeCommand(event: Event): Unit = js.native
  def isOpened(): Boolean = js.native
  def isSubMenu(): Boolean = js.native
  def open(): Unit = js.native
  def openSubMenu(row: Double): Menu | Boolean = js.native
  def selectFirstCell(): Unit = js.native
  def selectLastCell(): Unit = js.native
  def selectNextCell(row: Double, col: Double): Unit = js.native
  def selectPrevCell(row: Double, col: Double): Unit = js.native
  def setMenuItems(menuItems: js.Array[_]): Unit = js.native
  def setOffset(area: String): Unit = js.native
  def setOffset(area: String, offset: Double): Unit = js.native
  def setPosition(coords: js.Object): Unit = js.native
  def setPosition(coords: Event): Unit = js.native
  def setPositionAboveCursor(cursor: Cursor): Unit = js.native
  def setPositionBelowCursor(cursor: Cursor): Unit = js.native
  def setPositionOnLeftOfCursor(cursor: Cursor): Unit = js.native
  def setPositionOnRightOfCursor(cursor: Cursor): Unit = js.native
}

