package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.wot.CellRange
import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MergeCellsPlugin {
  
  @js.native
  trait AutofillCalculations extends StObject {
    
    def correctSelectionAreaSize(selectionArea: js.Array[Double]): Unit = js.native
    
    var currentFillData: js.Object = js.native
    
    def dragAreaOverlapsCollections(baseArea: js.Array[Double], fullArea: js.Array[Double], direction: String): Boolean = js.native
    
    def getDirection(selectionArea: js.Array[Double], finalArea: js.Array[Double]): String = js.native
    
    var mergedCellsCollection: MergedCellsCollection = js.native
    
    var plugin: MergeCells = js.native
    
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
    implicit class AutofillCalculationsMutableBuilder[Self <: AutofillCalculations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorrectSelectionAreaSize(value: js.Array[Double] => Unit): Self = StObject.set(x, "correctSelectionAreaSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurrentFillData(value: js.Object): Self = StObject.set(x, "currentFillData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragAreaOverlapsCollections(value: (js.Array[Double], js.Array[Double], String) => Boolean): Self = StObject.set(x, "dragAreaOverlapsCollections", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetDirection(value: (js.Array[Double], js.Array[Double]) => String): Self = StObject.set(x, "getDirection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMergedCellsCollection(value: MergedCellsCollection): Self = StObject.set(x, "mergedCellsCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: MergeCells): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecreateAfterDataPopulation(value: js.Array[_] => Unit): Self = StObject.set(x, "recreateAfterDataPopulation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSnapDragArea(
        value: (js.Array[Double], js.Array[Double], String, js.Array[MergedCellCoords]) => js.Array[Double]
      ): Self = StObject.set(x, "snapDragArea", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait MergedCellCoords extends StObject {
    
    var col: Double = js.native
    
    var colspan: Double = js.native
    
    def getLastColumn(): Double = js.native
    
    def getLastRow(): Double = js.native
    
    def getRange(): CellRange = js.native
    
    def includes(row: Double, column: Double): Boolean = js.native
    
    def includesHorizontally(column: Double): Boolean = js.native
    
    def includesVertically(row: Double): Boolean = js.native
    
    def isFarther(mergedCell: MergedCellCoords, direction: String): Boolean | Unit = js.native
    
    def normalize(hotInstance: Core): Unit = js.native
    
    var removed: Boolean = js.native
    
    var row: Double = js.native
    
    var rowspan: Double = js.native
    
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
    implicit class MergedCellCoordsMutableBuilder[Self <: MergedCellCoords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetLastColumn(value: () => Double): Self = StObject.set(x, "getLastColumn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastRow(value: () => Double): Self = StObject.set(x, "getLastRow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRange(value: () => CellRange): Self = StObject.set(x, "getRange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncludes(value: (Double, Double) => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIncludesHorizontally(value: Double => Boolean): Self = StObject.set(x, "includesHorizontally", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludesVertically(value: Double => Boolean): Self = StObject.set(x, "includesVertically", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFarther(value: (MergedCellCoords, String) => Boolean | Unit): Self = StObject.set(x, "isFarther", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNormalize(value: Core => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: (js.Array[Double], Double) => Boolean): Self = StObject.set(x, "shift", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MergedCellsCollection extends StObject {
    
    def add(mergedCellInfo: js.Object): MergedCellCoords | Boolean = js.native
    
    def clear(): Unit = js.native
    
    def get(row: Double, column: Double): MergedCellCoords | Boolean = js.native
    
    def getByRange(range: js.Object): MergedCellCoords | Boolean = js.native
    def getByRange(range: CellRange): MergedCellCoords | Boolean = js.native
    
    def getWithinRange(range: js.Object, countPartials: Boolean): js.Array[MergedCellCoords] | Boolean = js.native
    def getWithinRange(range: CellRange, countPartials: Boolean): js.Array[MergedCellCoords] | Boolean = js.native
    
    var hot: Core = js.native
    
    def isFirstRenderableMergedCell(row: Double, column: Double): Boolean = js.native
    
    def isOverlapping(mergedCell: MergedCellCoords): Boolean = js.native
    
    var mergedCells: js.Array[MergedCellCoords] = js.native
    
    var plugin: MergeCells = js.native
    
    def remove(row: Double, column: Double): MergedCellCoords | Boolean = js.native
    
    def shiftCollections(direction: String, index: Double, count: Double): Unit = js.native
  }
  
  @js.native
  trait SelectionCalculations extends StObject {
    
    def getUpdatedSelectionRange(oldSelectionRange: CellRange, delta: js.Object): CellRange = js.native
    
    def snapDelta(delta: js.Object, selectionRange: CellRange, mergedCell: MergedCellCoords): Unit = js.native
  }
  object SelectionCalculations {
    
    @scala.inline
    def apply(
      getUpdatedSelectionRange: (CellRange, js.Object) => CellRange,
      snapDelta: (js.Object, CellRange, MergedCellCoords) => Unit
    ): SelectionCalculations = {
      val __obj = js.Dynamic.literal(getUpdatedSelectionRange = js.Any.fromFunction2(getUpdatedSelectionRange), snapDelta = js.Any.fromFunction3(snapDelta))
      __obj.asInstanceOf[SelectionCalculations]
    }
    
    @scala.inline
    implicit class SelectionCalculationsMutableBuilder[Self <: SelectionCalculations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUpdatedSelectionRange(value: (CellRange, js.Object) => CellRange): Self = StObject.set(x, "getUpdatedSelectionRange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSnapDelta(value: (js.Object, CellRange, MergedCellCoords) => Unit): Self = StObject.set(x, "snapDelta", js.Any.fromFunction3(value))
    }
  }
}
