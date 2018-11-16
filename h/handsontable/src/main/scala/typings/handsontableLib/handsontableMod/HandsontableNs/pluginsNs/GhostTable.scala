package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostTable extends js.Object {
  var columns: js.Array[scala.Double] = js.native
  var container: stdLib.HTMLElement | scala.Null = js.native
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var injected: scala.Boolean = js.native
  var rows: js.Array[js.Object] = js.native
  var samples: js.Object | scala.Null = js.native
  var settings: js.Object = js.native
  def addColumn(column: scala.Double, samples: js.Object): scala.Unit = js.native
  def addColumnHeadersRow(samples: js.Object): scala.Unit = js.native
  def addRow(row: scala.Double, samples: js.Object): scala.Unit = js.native
  def clean(): scala.Unit = js.native
  def createCol(column: scala.Double): stdLib.DocumentFragment = js.native
  def createColElement(column: scala.Double): stdLib.HTMLElement = js.native
  def createColGroupsCol(): stdLib.DocumentFragment = js.native
  def createColumnHeadersRow(): stdLib.DocumentFragment = js.native
  def createContainer(): js.Object = js.native
  def createContainer(className: java.lang.String): js.Object = js.native
  def createRow(row: scala.Double): stdLib.DocumentFragment = js.native
  def createTable(): js.Object = js.native
  def createTable(className: java.lang.String): js.Object = js.native
  def getHeights(callback: js.Function2[/* row */ scala.Double, /* height */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getSetting(name: java.lang.String): scala.Boolean | scala.Unit = js.native
  def getSettings(): js.Object | scala.Unit = js.native
  def getWidths(callback: js.Function2[/* row */ scala.Double, /* height */ scala.Double, scala.Unit]): scala.Unit = js.native
  def injectTable(): scala.Unit = js.native
  def injectTable(parent: scala.Unit): scala.Unit = js.native
  def injectTable(parent: stdLib.HTMLElement): scala.Unit = js.native
  def isHorizontal(): scala.Boolean = js.native
  def isVertical(): scala.Boolean = js.native
  def removeTable(): scala.Unit = js.native
  def setSetting(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setSettings(settings: handsontableLib.handsontableMod.HandsontableNs.DefaultSettings): scala.Unit = js.native
}

