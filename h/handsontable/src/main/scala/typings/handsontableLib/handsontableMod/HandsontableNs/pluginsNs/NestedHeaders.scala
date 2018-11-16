package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NestedHeaders extends Base {
  var colspanArray: js.Array[_]
  var columnHeaderLevelCount: scala.Double
  var ghostTable: GhostTableNestedHeaders
  var settings: js.Array[_]
  def checkForFixedColumnsCollision(): scala.Unit
  def checkForOverlappingHeaders(): scala.Unit
  def fillColspanArrayWithDummies(colspan: scala.Double, level: scala.Double): scala.Unit
  def fillTheRemainingColspans(): scala.Unit
  def getChildHeaders(row: scala.Double, column: scala.Double): js.Array[_]
  def getColspan(row: scala.Double, column: scala.Double): scala.Double
  def getNestedParent(level: scala.Double, column: scala.Double): js.Any
  def headerRendererFactory(headerRow: scala.Double): js.Function0[scala.Unit]
  def levelToRowCoords(level: scala.Double): scala.Double
  def rowCoordsToLevel(row: scala.Double): scala.Double
  def setupColspanArray(): scala.Unit
}

