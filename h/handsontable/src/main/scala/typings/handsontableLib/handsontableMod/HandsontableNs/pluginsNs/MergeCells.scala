package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MergeCells extends Base {
  var autofillCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.AutofillCalculations
  var mergedCellsCollection: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.MergedCellsCollection
  var selectionCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.SelectionCalculations
  def clearCollections(): scala.Unit
  def merge(startRow: scala.Double, startColumn: scala.Double, endRow: scala.Double, endColumn: scala.Double): scala.Unit
  def mergeSelection(cellRange: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange): scala.Unit
  def unmerge(startRow: scala.Double, startColumn: scala.Double, endRow: scala.Double, endColumn: scala.Double): scala.Unit
}

