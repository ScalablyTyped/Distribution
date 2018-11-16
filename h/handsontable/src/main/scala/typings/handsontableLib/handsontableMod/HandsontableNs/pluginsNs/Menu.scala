package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu extends js.Object {
  var container: stdLib.HTMLElement = js.native
  var eventManager: EventManager = js.native
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var hotMenu: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var hotSubMenus: js.Object = js.native
  var keyEvent: scala.Boolean = js.native
  var menuItems: js.Array[_] | scala.Null = js.native
  var offset: js.Object = js.native
  var options: js.Object = js.native
  var origOutsideClickDeselects: scala.Boolean | js.Function0[scala.Unit] = js.native
  var parentMenu: Menu | scala.Null = js.native
  def close(): scala.Unit = js.native
  def close(closeParent: scala.Boolean): scala.Unit = js.native
  def closeAllSubMenus(): scala.Unit = js.native
  def closeSubMenu(row: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def executeCommand(event: stdLib.Event): scala.Unit = js.native
  def isOpened(): scala.Boolean = js.native
  def isSubMenu(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def openSubMenu(row: scala.Double): Menu | scala.Boolean = js.native
  def selectFirstCell(): scala.Unit = js.native
  def selectLastCell(): scala.Unit = js.native
  def selectNextCell(row: scala.Double, col: scala.Double): scala.Unit = js.native
  def selectPrevCell(row: scala.Double, col: scala.Double): scala.Unit = js.native
  def setMenuItems(menuItems: js.Array[_]): scala.Unit = js.native
  def setOffset(area: java.lang.String): scala.Unit = js.native
  def setOffset(area: java.lang.String, offset: scala.Double): scala.Unit = js.native
  def setPosition(coords: js.Object): scala.Unit = js.native
  def setPosition(coords: stdLib.Event): scala.Unit = js.native
  def setPositionAboveCursor(cursor: Cursor): scala.Unit = js.native
  def setPositionBelowCursor(cursor: Cursor): scala.Unit = js.native
  def setPositionOnLeftOfCursor(cursor: Cursor): scala.Unit = js.native
  def setPositionOnRightOfCursor(cursor: Cursor): scala.Unit = js.native
}

