package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleColumns extends Base {
  var buttonEnabledList: js.Object
  var collapsedSections: js.Object
  var columnHeaderLevelCount: scala.Double
  var eventManager: EventManager
  var hiddenColumnsPlugin: js.Object
  var nestedHeadersPlugin: js.Object
  var settings: scala.Boolean | js.Array[_]
  def checkDependencies(): scala.Unit
  def collapseAll(): scala.Unit
  def collapseSection(coords: js.Object): scala.Unit
  def expandAll(): scala.Unit
  def expandSection(coords: js.Object): scala.Unit
  def generateIndicator(col: scala.Double, TH: stdLib.HTMLElement): stdLib.HTMLElement
  def markSectionAs(state: java.lang.String, row: scala.Double, column: scala.Double, recursive: scala.Boolean): scala.Unit
  def meetsDependencies(): scala.Boolean
  def parseSettings(): scala.Unit
  def toggleAllCollapsibleSections(action: java.lang.String): scala.Unit
  def toggleCollapsibleSection(coords: js.Object, action: java.lang.String): scala.Unit
}

