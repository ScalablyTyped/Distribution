package typings.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.mod.Handsontable.wot.CellRange
import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergedCellCoords extends js.Object {
  var col: Double
  var colspan: Double
  var removed: Boolean
  var row: Double
  var rowspan: Double
  def getLastColumn(): Double
  def getLastRow(): Double
  def getRange(): CellRange
  def includes(row: Double, column: Double): Boolean
  def includesHorizontally(column: Double): Boolean
  def includesVertically(row: Double): Boolean
  def isFarther(mergedCell: MergedCellCoords, direction: String): Boolean | Unit
  def normalize(hotInstance: Core): Unit
  def shift(shiftVector: js.Array[Double], indexOfChange: Double): Boolean
}

object MergedCellCoords {
  @scala.inline
  def apply(
    col: Double,
    colspan: Double,
    getLastColumn: () => Double,
    getLastRow: () => Double,
    getRange: () => CellRange,
    includes: (Double, Double) => Boolean,
    includesHorizontally: Double => Boolean,
    includesVertically: Double => Boolean,
    isFarther: (MergedCellCoords, String) => Boolean | Unit,
    normalize: Core => Unit,
    removed: Boolean,
    row: Double,
    rowspan: Double,
    shift: (js.Array[Double], Double) => Boolean
  ): MergedCellCoords = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], colspan = colspan.asInstanceOf[js.Any], getLastColumn = js.Any.fromFunction0(getLastColumn), getLastRow = js.Any.fromFunction0(getLastRow), getRange = js.Any.fromFunction0(getRange), includes = js.Any.fromFunction2(includes), includesHorizontally = js.Any.fromFunction1(includesHorizontally), includesVertically = js.Any.fromFunction1(includesVertically), isFarther = js.Any.fromFunction2(isFarther), normalize = js.Any.fromFunction1(normalize), removed = removed.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any], shift = js.Any.fromFunction2(shift))
  
    __obj.asInstanceOf[MergedCellCoords]
  }
}

