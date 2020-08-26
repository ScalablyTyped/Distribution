package typings.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import typings.handsontable.mod.Handsontable.plugins.MergeCells
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutofillCalculations extends js.Object {
  var currentFillData: js.Object = js.native
  var mergedCellsCollection: MergedCellsCollection = js.native
  var plugin: MergeCells = js.native
  def correctSelectionAreaSize(selectionArea: js.Array[Double]): Unit = js.native
  def dragAreaOverlapsCollections(baseArea: js.Array[Double], fullArea: js.Array[Double], direction: String): Boolean = js.native
  def getDirection(selectionArea: js.Array[Double], finalArea: js.Array[Double]): String = js.native
  def recreateAfterDataPopulation(changes: js.Array[_]): Unit = js.native
  def snapDragArea(
    baseArea: js.Array[Double],
    dragArea: js.Array[Double],
    dragDirection: String,
    foundMergedCells: js.Array[MergedCellCoords]
  ): js.Array[Double] = js.native
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
  @scala.inline
  implicit class AutofillCalculationsOps[Self <: AutofillCalculations] (val x: Self) extends AnyVal {
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
    def setCorrectSelectionAreaSize(value: js.Array[Double] => Unit): Self = this.set("correctSelectionAreaSize", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentFillData(value: js.Object): Self = this.set("currentFillData", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragAreaOverlapsCollections(value: (js.Array[Double], js.Array[Double], String) => Boolean): Self = this.set("dragAreaOverlapsCollections", js.Any.fromFunction3(value))
    @scala.inline
    def setGetDirection(value: (js.Array[Double], js.Array[Double]) => String): Self = this.set("getDirection", js.Any.fromFunction2(value))
    @scala.inline
    def setMergedCellsCollection(value: MergedCellsCollection): Self = this.set("mergedCellsCollection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: MergeCells): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecreateAfterDataPopulation(value: js.Array[_] => Unit): Self = this.set("recreateAfterDataPopulation", js.Any.fromFunction1(value))
    @scala.inline
    def setSnapDragArea(
      value: (js.Array[Double], js.Array[Double], String, js.Array[MergedCellCoords]) => js.Array[Double]
    ): Self = this.set("snapDragArea", js.Any.fromFunction4(value))
  }
  
}

