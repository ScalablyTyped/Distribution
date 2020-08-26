package typings.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.mod.Handsontable.wot.CellRange
import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedCellCoords extends js.Object {
  var col: Double = js.native
  var colspan: Double = js.native
  var removed: Boolean = js.native
  var row: Double = js.native
  var rowspan: Double = js.native
  def getLastColumn(): Double = js.native
  def getLastRow(): Double = js.native
  def getRange(): CellRange = js.native
  def includes(row: Double, column: Double): Boolean = js.native
  def includesHorizontally(column: Double): Boolean = js.native
  def includesVertically(row: Double): Boolean = js.native
  def isFarther(mergedCell: MergedCellCoords, direction: String): Boolean | Unit = js.native
  def normalize(hotInstance: Core): Unit = js.native
  def shift(shiftVector: js.Array[Double], indexOfChange: Double): Boolean = js.native
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
  @scala.inline
  implicit class MergedCellCoordsOps[Self <: MergedCellCoords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setColspan(value: Double): Self = this.set("colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLastColumn(value: () => Double): Self = this.set("getLastColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastRow(value: () => Double): Self = this.set("getLastRow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRange(value: () => CellRange): Self = this.set("getRange", js.Any.fromFunction0(value))
    @scala.inline
    def setIncludes(value: (Double, Double) => Boolean): Self = this.set("includes", js.Any.fromFunction2(value))
    @scala.inline
    def setIncludesHorizontally(value: Double => Boolean): Self = this.set("includesHorizontally", js.Any.fromFunction1(value))
    @scala.inline
    def setIncludesVertically(value: Double => Boolean): Self = this.set("includesVertically", js.Any.fromFunction1(value))
    @scala.inline
    def setIsFarther(value: (MergedCellCoords, String) => Boolean | Unit): Self = this.set("isFarther", js.Any.fromFunction2(value))
    @scala.inline
    def setNormalize(value: Core => Unit): Self = this.set("normalize", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowspan(value: Double): Self = this.set("rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: (js.Array[Double], Double) => Boolean): Self = this.set("shift", js.Any.fromFunction2(value))
  }
  
}

