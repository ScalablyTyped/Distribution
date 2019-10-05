package typings.handsontable.handsontableMod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.handsontableMod.Handsontable.plugins.MergeCells
import typings.handsontable.handsontableMod.Handsontable.wot.CellRange
import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedCellsCollection extends js.Object {
  var hot: Core = js.native
  var mergedCells: js.Array[MergedCellCoords] = js.native
  var plugin: MergeCells = js.native
  def add(mergedCellInfo: js.Object): MergedCellCoords | Boolean = js.native
  def clear(): Unit = js.native
  def get(row: Double, column: Double): MergedCellCoords | Boolean = js.native
  def getByRange(range: js.Object): MergedCellCoords | Boolean = js.native
  def getByRange(range: CellRange): MergedCellCoords | Boolean = js.native
  def getWithinRange(range: js.Object, countPartials: Boolean): js.Array[MergedCellCoords] | Boolean = js.native
  def getWithinRange(range: CellRange, countPartials: Boolean): js.Array[MergedCellCoords] | Boolean = js.native
  def isMergedParent(row: Double, column: Double): Boolean = js.native
  def isOverlapping(mergedCell: MergedCellCoords): Boolean = js.native
  def remove(row: Double, column: Double): MergedCellCoords | Boolean = js.native
  def shiftCollections(direction: String, index: Double, count: Double): Unit = js.native
}

