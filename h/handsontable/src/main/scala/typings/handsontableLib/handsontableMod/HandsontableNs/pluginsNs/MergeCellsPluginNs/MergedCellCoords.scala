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
    getLastColumn: js.Function0[scala.Double],
    getLastRow: js.Function0[scala.Double],
    getRange: js.Function0[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange],
    includes: js.Function2[scala.Double, scala.Double, scala.Boolean],
    includesHorizontally: js.Function1[scala.Double, scala.Boolean],
    includesVertically: js.Function1[scala.Double, scala.Boolean],
    isFarther: js.Function2[MergedCellCoords, java.lang.String, scala.Boolean | scala.Unit],
    normalize: js.Function1[handsontableLib.handsontableMod.underscoreHandsontableNs.Core, scala.Unit],
    removed: scala.Boolean,
    row: scala.Double,
    rowspan: scala.Double,
    shift: js.Function2[js.Array[scala.Double], scala.Double, scala.Boolean]
  ): MergedCellCoords = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("colspan")(colspan)
    __obj.updateDynamic("getLastColumn")(getLastColumn)
    __obj.updateDynamic("getLastRow")(getLastRow)
    __obj.updateDynamic("getRange")(getRange)
    __obj.updateDynamic("includes")(includes)
    __obj.updateDynamic("includesHorizontally")(includesHorizontally)
    __obj.updateDynamic("includesVertically")(includesVertically)
    __obj.updateDynamic("isFarther")(isFarther)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("removed")(removed)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("rowspan")(rowspan)
    __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[MergedCellCoords]
  }
}

