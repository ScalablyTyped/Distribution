package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MergedCellCoords extends js.Object {
  var col: scala.Double
  var colspan: scala.Double
  var removed: scala.Boolean
  var row: scala.Double
  var rowspan: scala.Double
  def getLastColumn(): scala.Double
  def getLastRow(): scala.Double
  def getRange(): handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange
  def includes(row: scala.Double, column: scala.Double): scala.Boolean
  def includesHorizontally(column: scala.Double): scala.Boolean
  def includesVertically(row: scala.Double): scala.Boolean
  def isFarther(mergedCell: MergedCellCoords, direction: java.lang.String): scala.Boolean | scala.Unit
  def normalize(hotInstance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core): scala.Unit
  def shift(shiftVector: js.Array[scala.Double], indexOfChange: scala.Double): scala.Boolean
}

