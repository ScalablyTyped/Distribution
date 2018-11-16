package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedCellsCollection extends js.Object {
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core = js.native
  var mergedCells: js.Array[MergedCellCoords] = js.native
  var plugin: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCells = js.native
  def add(mergedCellInfo: js.Object): MergedCellCoords | scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def get(row: scala.Double, column: scala.Double): MergedCellCoords | scala.Boolean = js.native
  def getByRange(range: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange): MergedCellCoords | scala.Boolean = js.native
  def getByRange(range: js.Object): MergedCellCoords | scala.Boolean = js.native
  def getWithinRange(
    range: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange,
    countPartials: scala.Boolean
  ): js.Array[MergedCellCoords] | scala.Boolean = js.native
  def getWithinRange(range: js.Object, countPartials: scala.Boolean): js.Array[MergedCellCoords] | scala.Boolean = js.native
  def isMergedParent(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  def isOverlapping(mergedCell: MergedCellCoords): scala.Boolean = js.native
  def remove(row: scala.Double, column: scala.Double): MergedCellCoords | scala.Boolean = js.native
  def shiftCollections(direction: java.lang.String, index: scala.Double, count: scala.Double): scala.Unit = js.native
}

