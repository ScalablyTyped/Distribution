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

object MergedCellCoords {
  @scala.inline
  def apply(
    col: scala.Double,
    colspan: scala.Double,
    getLastColumn: () => scala.Double,
    getLastRow: () => scala.Double,
    getRange: () => handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    includes: (scala.Double, scala.Double) => scala.Boolean,
    includesHorizontally: scala.Double => scala.Boolean,
    includesVertically: scala.Double => scala.Boolean,
    isFarther: (MergedCellCoords, java.lang.String) => scala.Boolean | scala.Unit,
    normalize: handsontableLib.handsontableMod.underscoreHandsontableNs.Core => scala.Unit,
    removed: scala.Boolean,
    row: scala.Double,
    rowspan: scala.Double,
    shift: (js.Array[scala.Double], scala.Double) => scala.Boolean
  ): MergedCellCoords = {
    val __obj = js.Dynamic.literal(col = col, colspan = colspan, getLastColumn = js.Any.fromFunction0(getLastColumn), getLastRow = js.Any.fromFunction0(getLastRow), getRange = js.Any.fromFunction0(getRange), includes = js.Any.fromFunction2(includes), includesHorizontally = js.Any.fromFunction1(includesHorizontally), includesVertically = js.Any.fromFunction1(includesVertically), isFarther = js.Any.fromFunction2(isFarther), normalize = js.Any.fromFunction1(normalize), removed = removed, row = row, rowspan = rowspan, shift = js.Any.fromFunction2(shift))
  
    __obj.asInstanceOf[MergedCellCoords]
  }
}

