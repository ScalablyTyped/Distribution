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

object AutofillCalculations {
  @scala.inline
  def apply(
    correctSelectionAreaSize: js.Array[scala.Double] => scala.Unit,
    currentFillData: js.Object,
    dragAreaOverlapsCollections: (js.Array[scala.Double], js.Array[scala.Double], java.lang.String) => scala.Boolean,
    getDirection: (js.Array[scala.Double], js.Array[scala.Double]) => java.lang.String,
    mergedCellsCollection: MergedCellsCollection,
    plugin: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCells,
    recreateAfterDataPopulation: js.Array[_] => scala.Unit,
    snapDragArea: (js.Array[scala.Double], js.Array[scala.Double], java.lang.String, js.Array[MergedCellCoords]) => js.Array[scala.Double]
  ): AutofillCalculations = {
    val __obj = js.Dynamic.literal(correctSelectionAreaSize = js.Any.fromFunction1(correctSelectionAreaSize), currentFillData = currentFillData, dragAreaOverlapsCollections = js.Any.fromFunction3(dragAreaOverlapsCollections), getDirection = js.Any.fromFunction2(getDirection), mergedCellsCollection = mergedCellsCollection, plugin = plugin, recreateAfterDataPopulation = js.Any.fromFunction1(recreateAfterDataPopulation), snapDragArea = js.Any.fromFunction4(snapDragArea))
  
    __obj.asInstanceOf[AutofillCalculations]
  }
}

