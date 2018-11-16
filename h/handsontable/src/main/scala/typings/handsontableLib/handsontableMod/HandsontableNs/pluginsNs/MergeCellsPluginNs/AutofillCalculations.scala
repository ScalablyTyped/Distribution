package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutofillCalculations extends js.Object {
  var currentFillData: js.Object
  var mergedCellsCollection: MergedCellsCollection
  var plugin: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCells
  def correctSelectionAreaSize(selectionArea: js.Array[scala.Double]): scala.Unit
  def dragAreaOverlapsCollections(baseArea: js.Array[scala.Double], fullArea: js.Array[scala.Double], direction: java.lang.String): scala.Boolean
  def getDirection(selectionArea: js.Array[scala.Double], finalArea: js.Array[scala.Double]): java.lang.String
  def recreateAfterDataPopulation(changes: js.Array[_]): scala.Unit
  def snapDragArea(
    baseArea: js.Array[scala.Double],
    dragArea: js.Array[scala.Double],
    dragDirection: java.lang.String,
    foundMergedCells: js.Array[MergedCellCoords]
  ): js.Array[scala.Double]
}

