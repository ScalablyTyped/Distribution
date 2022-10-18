package typings.luminoDatagrid

import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoDatagrid.typesDatamodelMod.DataModel
import typings.luminoDatagrid.typesDatamodelMod.DataModel.ChangedArgs
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.IOptions
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.SelectArgs
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.Selection
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.SelectionMode
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectionmodelMod {
  
  /* note: abstract class */ @JSImport("@lumino/datagrid/types/selectionmodel", "SelectionModel")
  @js.native
  open class SelectionModel protected () extends StObject {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _selectionMode: Any = js.native
    
    /**
      * A signal emitted when the selection model has changed.
      */
    val changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Clear all selections in the selection model.
      */
    def clear(): Unit = js.native
    
    /**
      * Get the current selection in the selection model.
      *
      * @returns The current selection or `null`.
      *
      * #### Notes
      * This is the selection which holds the cursor.
      */
    def currentSelection(): Selection | Null = js.native
    
    /**
      * The column index of the cursor.
      *
      * This is `-1` if the selection model is empty.
      */
    val cursorColumn: Double = js.native
    
    /**
      * The row index of the cursor.
      *
      * This is `-1` if the selection model is empty.
      */
    val cursorRow: Double = js.native
    
    /**
      * The data model associated with the selection model.
      */
    val dataModel: DataModel = js.native
    
    /**
      * Emit the `changed` signal for the selection model.
      *
      * #### Notes
      * Subclasses should call this method whenever the selection model
      * has changed so that attached data grids can update themselves.
      */
    /* protected */ def emitChanged(): Unit = js.native
    
    /**
      * Test whether any selection intersects a cell.
      *
      * @param row - The row index of interest.
      *
      * @param column - The column index of interest.
      *
      * @returns Whether any selection intersects the cell.
      *
      * #### Notes
      * This method may be reimplemented in a subclass.
      */
    def isCellSelected(row: Double, column: Double): Boolean = js.native
    
    /**
      * Test whether any selection intersects a column.
      *
      * @param index - The column index of interest.
      *
      * @returns Whether any selection intersects the column.
      *
      * #### Notes
      * This method may be reimplemented in a subclass.
      */
    def isColumnSelected(index: Double): Boolean = js.native
    
    /**
      * Whether the selection model is empty.
      *
      * #### Notes
      * An empty selection model will yield an empty `selections` iterator.
      */
    val isEmpty: Boolean = js.native
    
    /**
      * Test whether any selection intersects a row.
      *
      * @param index - The row index of interest.
      *
      * @returns Whether any selection intersects the row.
      *
      * #### Notes
      * This method may be reimplemented in a subclass.
      */
    def isRowSelected(index: Double): Boolean = js.native
    
    /**
      * Move cursor down/up/left/right while making sure it remains
      * within the bounds of selected rectangles
      *
      * @param direction - The direction of the movement.
      */
    def moveCursorWithinSelections(direction: CursorMoveDirection): Unit = js.native
    
    /**
      * A signal handler for the data model `changed` signal.
      *
      * @param args - The arguments for the signal.
      *
      * #### Notes
      * Selection model implementations should update their selections
      * in a manner that is relevant for the changes to the data model.
      *
      * The default implementation of this method is a no-op.
      */
    /* protected */ def onDataModelChanged(sender: DataModel, args: ChangedArgs): Unit = js.native
    
    /**
      * Select the specified cells.
      *
      * @param args - The arguments for the selection.
      */
    def select(args: SelectArgs): Unit = js.native
    
    /**
      * Get the selection mode for the model.
      */
    /**
      * Set the selection mode for the model.
      *
      * #### Notes
      * This will clear the selection model.
      */
    var selectionMode: SelectionMode = js.native
    
    /**
      * Get an iterator of the selections in the model.
      *
      * @returns A new iterator of the selections in the model.
      *
      * #### Notes
      * The data grid will render the selections in order.
      */
    def selections(): IIterator[Selection] = js.native
  }
  object SelectionModel {
    
    /**
      * A type alias for the clear mode.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.all
      - typings.luminoDatagrid.luminoDatagridStrings.current
      - typings.luminoDatagrid.luminoDatagridStrings.none
    */
    trait ClearMode extends StObject
    object ClearMode {
      
      inline def all: typings.luminoDatagrid.luminoDatagridStrings.all = "all".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.all]
      
      inline def current: typings.luminoDatagrid.luminoDatagridStrings.current = "current".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.current]
      
      inline def none: typings.luminoDatagrid.luminoDatagridStrings.none = "none".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.none]
    }
    
    /**
      * A type alias for the cursor move direction.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.up
      - typings.luminoDatagrid.luminoDatagridStrings.down
      - typings.luminoDatagrid.luminoDatagridStrings.left
      - typings.luminoDatagrid.luminoDatagridStrings.right
      - typings.luminoDatagrid.luminoDatagridStrings.none
    */
    trait CursorMoveDirection extends StObject
    object CursorMoveDirection {
      
      inline def down: typings.luminoDatagrid.luminoDatagridStrings.down = "down".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.down]
      
      inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def none: typings.luminoDatagrid.luminoDatagridStrings.none = "none".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.none]
      
      inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
      
      inline def up: typings.luminoDatagrid.luminoDatagridStrings.up = "up".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.up]
    }
    
    /**
      * An options object for initializing a selection model.
      */
    trait IOptions extends StObject {
      
      /**
        * The data model for the selection model.
        */
      var dataModel: DataModel
      
      /**
        * The selection mode for the model.
        *
        * The default is `'cell'`.
        */
      var selectionMode: js.UndefOr[SelectionMode] = js.undefined
    }
    object IOptions {
      
      inline def apply(dataModel: DataModel): IOptions = {
        val __obj = js.Dynamic.literal(dataModel = dataModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setDataModel(value: DataModel): Self = StObject.set(x, "dataModel", value.asInstanceOf[js.Any])
        
        inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
        
        inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      }
    }
    
    /**
      * A type alias for the select args.
      */
    trait SelectArgs extends StObject {
      
      /**
        * The first column of the selection.
        *
        * This may be greater than `c2`.
        */
      var c1: Double
      
      /**
        * The last column of the selection.
        *
        * This may be less than `c1`.
        */
      var c2: Double
      
      /**
        * Which of the existing selections to clear.
        */
      var clear: ClearMode
      
      /**
        * The column index for the cursor.
        *
        * This should be contained within the selection.
        */
      var cursorColumn: Double
      
      /**
        * The row index for the cursor.
        *
        * This should be contained within the selection.
        */
      var cursorRow: Double
      
      /**
        * The first row of the selection.
        *
        * This may be greater than `r2`.
        */
      var r1: Double
      
      /**
        * The last row of the selection.
        *
        * This may be less than `r1`.
        */
      var r2: Double
    }
    object SelectArgs {
      
      inline def apply(
        c1: Double,
        c2: Double,
        clear: ClearMode,
        cursorColumn: Double,
        cursorRow: Double,
        r1: Double,
        r2: Double
      ): SelectArgs = {
        val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], cursorColumn = cursorColumn.asInstanceOf[js.Any], cursorRow = cursorRow.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectArgs]
      }
      
      extension [Self <: SelectArgs](x: Self) {
        
        inline def setC1(value: Double): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
        
        inline def setC2(value: Double): Self = StObject.set(x, "c2", value.asInstanceOf[js.Any])
        
        inline def setClear(value: ClearMode): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
        
        inline def setCursorColumn(value: Double): Self = StObject.set(x, "cursorColumn", value.asInstanceOf[js.Any])
        
        inline def setCursorRow(value: Double): Self = StObject.set(x, "cursorRow", value.asInstanceOf[js.Any])
        
        inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
        
        inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a selection in a selection model.
      */
    trait Selection extends StObject {
      
      /**
        * The first column of the selection.
        *
        * This may be greater than `c2`.
        */
      val c1: Double
      
      /**
        * The last column of the selection.
        *
        * This may be less than `c1`.
        */
      val c2: Double
      
      /**
        * The first row of the selection.
        *
        * This may be greater than `r2`.
        */
      val r1: Double
      
      /**
        * The last row of the selection.
        *
        * This may be less than `r1`.
        */
      val r2: Double
    }
    object Selection {
      
      inline def apply(c1: Double, c2: Double, r1: Double, r2: Double): Selection = {
        val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
        __obj.asInstanceOf[Selection]
      }
      
      extension [Self <: Selection](x: Self) {
        
        inline def setC1(value: Double): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
        
        inline def setC2(value: Double): Self = StObject.set(x, "c2", value.asInstanceOf[js.Any])
        
        inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
        
        inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the selection mode.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.row
      - typings.luminoDatagrid.luminoDatagridStrings.column
      - typings.luminoDatagrid.luminoDatagridStrings.cell
    */
    trait SelectionMode extends StObject
    object SelectionMode {
      
      inline def cell: typings.luminoDatagrid.luminoDatagridStrings.cell = "cell".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.cell]
      
      inline def column: typings.luminoDatagrid.luminoDatagridStrings.column = "column".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.column]
      
      inline def row: typings.luminoDatagrid.luminoDatagridStrings.row = "row".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.row]
    }
  }
}
