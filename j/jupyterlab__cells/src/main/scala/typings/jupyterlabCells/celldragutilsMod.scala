package typings.jupyterlabCells

import typings.jupyterlabCells.widgetMod.Cell
import typings.jupyterlabNbformat.mod.ICell
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object celldragutilsMod {
  
  object CellDragUtils {
    
    @JSImport("@jupyterlab/cells/lib/celldragutils", "CellDragUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an image for the cell(s) to be dragged
      *
      * @param activeCell - The cell from where the drag event is triggered
      * @param selectedCells - The cells to be dragged
      */
    inline def createCellDragImage(activeCell: Cell, selectedCells: js.Array[ICell]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createCellDragImage")(activeCell.asInstanceOf[js.Any], selectedCells.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Detect which part of the cell triggered the MouseEvent
      *
      * @param cell - The cell which contains the MouseEvent's target
      * @param target - The DOM node which triggered the MouseEvent
      */
    inline def detectTargetArea(cell: Cell, target: HTMLElement): ICellTargetArea = (^.asInstanceOf[js.Dynamic].applyDynamic("detectTargetArea")(cell.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ICellTargetArea]
    
    /**
      * Find the cell index containing the target html element.
      * This function traces up the DOM hierarchy to find the root cell
      * node. Then find the corresponding child and select it.
      *
      * @param node - the cell node or a child of the cell node.
      * @param cells - an iterable of Cells
      * @param isCellNode - a function that takes in a node and checks if
      * it is a cell node.
      *
      * @returns index of the cell we're looking for. Returns -1 if
      * the cell is not founds
      */
    inline def findCell(
      node: HTMLElement,
      cells: IterableOrArrayLike[Cell],
      isCellNode: js.Function1[/* node */ HTMLElement, Boolean]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findCell")(node.asInstanceOf[js.Any], cells.asInstanceOf[js.Any], isCellNode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Detect if a drag event should be started. This is down if the
      * mouse is moved beyond a certain distance (DRAG_THRESHOLD).
      *
      * @param prevX - X Coordinate of the mouse pointer during the mousedown event
      * @param prevY - Y Coordinate of the mouse pointer during the mousedown event
      * @param nextX - Current X Coordinate of the mouse pointer
      * @param nextY - Current Y Coordinate of the mouse pointer
      */
    inline def shouldStartDrag(prevX: Double, prevY: Double, nextX: Double, nextY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldStartDrag")(prevX.asInstanceOf[js.Any], prevY.asInstanceOf[js.Any], nextX.asInstanceOf[js.Any], nextY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabCells.jupyterlabCellsStrings.input
      - typings.jupyterlabCells.jupyterlabCellsStrings.prompt
      - typings.jupyterlabCells.jupyterlabCellsStrings.cell
      - typings.jupyterlabCells.jupyterlabCellsStrings.unknown
    */
    trait ICellTargetArea extends StObject
    object ICellTargetArea {
      
      inline def cell: typings.jupyterlabCells.jupyterlabCellsStrings.cell = "cell".asInstanceOf[typings.jupyterlabCells.jupyterlabCellsStrings.cell]
      
      inline def input: typings.jupyterlabCells.jupyterlabCellsStrings.input = "input".asInstanceOf[typings.jupyterlabCells.jupyterlabCellsStrings.input]
      
      inline def prompt: typings.jupyterlabCells.jupyterlabCellsStrings.prompt = "prompt".asInstanceOf[typings.jupyterlabCells.jupyterlabCellsStrings.prompt]
      
      inline def unknown: typings.jupyterlabCells.jupyterlabCellsStrings.unknown = "unknown".asInstanceOf[typings.jupyterlabCells.jupyterlabCellsStrings.unknown]
    }
  }
}
