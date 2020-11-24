package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.GridSettings
import typings.handsontable.mod._Handsontable.Core
import typings.std.DocumentFragment
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostTable extends js.Object {
  
  def addColumn(column: Double, samples: js.Object): Unit = js.native
  
  def addColumnHeadersRow(samples: js.Object): Unit = js.native
  
  def addRow(row: Double, samples: js.Object): Unit = js.native
  
  def clean(): Unit = js.native
  
  var columns: js.Array[Double] = js.native
  
  var container: HTMLElement | Null = js.native
  
  def createCol(column: Double): DocumentFragment = js.native
  
  def createColElement(column: Double): HTMLElement = js.native
  
  def createColGroupsCol(): DocumentFragment = js.native
  
  def createColumnHeadersRow(): DocumentFragment = js.native
  
  def createContainer(): js.Object = js.native
  def createContainer(className: String): js.Object = js.native
  
  def createRow(row: Double): DocumentFragment = js.native
  
  def createTable(): js.Object = js.native
  def createTable(className: String): js.Object = js.native
  
  def getHeights(callback: js.Function2[/* row */ Double, /* height */ Double, Unit]): Unit = js.native
  
  def getSetting(name: String): Boolean | Unit = js.native
  
  def getSettings(): js.Object | Unit = js.native
  
  def getWidths(callback: js.Function2[/* row */ Double, /* height */ Double, Unit]): Unit = js.native
  
  var hot: Core = js.native
  
  def injectTable(): Unit = js.native
  def injectTable(parent: Unit): Unit = js.native
  def injectTable(parent: HTMLElement): Unit = js.native
  
  var injected: Boolean = js.native
  
  def isHorizontal(): Boolean = js.native
  
  def isVertical(): Boolean = js.native
  
  def removeTable(): Unit = js.native
  
  var rows: js.Array[js.Object] = js.native
  
  var samples: js.Object | Null = js.native
  
  def setSetting(name: String, value: js.Any): Unit = js.native
  
  def setSettings(settings: GridSettings): Unit = js.native
  
  var settings: js.Object = js.native
}
