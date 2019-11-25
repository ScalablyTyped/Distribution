package typings.handsontable.handsontableMod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.handsontableMod.Handsontable.plugins.MergeCells
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutofillCalculations extends js.Object {
  var currentFillData: js.Object
  var mergedCellsCollection: MergedCellsCollection
  var plugin: MergeCells
  def correctSelectionAreaSize(selectionArea: js.Array[Double]): Unit
  def dragAreaOverlapsCollections(baseArea: js.Array[Double], fullArea: js.Array[Double], direction: String): Boolean
  def getDirection(selectionArea: js.Array[Double], finalArea: js.Array[Double]): String
  def recreateAfterDataPopulation(changes: js.Array[_]): Unit
  def snapDragArea(
    baseArea: js.Array[Double],
    dragArea: js.Array[Double],
    dragDirection: String,
    foundMergedCells: js.Array[MergedCellCoords]
  ): js.Array[Double]
}

object AutofillCalculations {
  @scala.inline
  def apply(
    correctSelectionAreaSize: js.Array[Double] => Unit,
    currentFillData: js.Object,
    dragAreaOverlapsCollections: (js.Array[Double], js.Array[Double], String) => Boolean,
    getDirection: (js.Array[Double], js.Array[Double]) => String,
    mergedCellsCollection: MergedCellsCollection,
    plugin: MergeCells,
    recreateAfterDataPopulation: js.Array[_] => Unit,
    snapDragArea: (js.Array[Double], js.Array[Double], String, js.Array[MergedCellCoords]) => js.Array[Double]
  ): AutofillCalculations = {
    val __obj = js.Dynamic.literal(correctSelectionAreaSize = js.Any.fromFunction1(correctSelectionAreaSize), currentFillData = currentFillData.asInstanceOf[js.Any], dragAreaOverlapsCollections = js.Any.fromFunction3(dragAreaOverlapsCollections), getDirection = js.Any.fromFunction2(getDirection), mergedCellsCollection = mergedCellsCollection.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], recreateAfterDataPopulation = js.Any.fromFunction1(recreateAfterDataPopulation), snapDragArea = js.Any.fromFunction4(snapDragArea))
  
    __obj.asInstanceOf[AutofillCalculations]
  }
}

