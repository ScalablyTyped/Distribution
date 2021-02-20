package typings.luminoDatagrid

import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoDatagrid.datamodelMod.DataModel
import typings.luminoDatagrid.datamodelMod.DataModel.ChangedArgs
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.IOptions
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.SelectArgs
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.Selection
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.SelectionMode
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionmodelMod {
  
  @JSImport("@lumino/datagrid/lib/selectionmodel", "SelectionModel")
  @js.native
  abstract class SelectionModel protected () extends StObject {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
    
    var _changed: js.Any = js.native
    
    var _selectionMode: js.Any = js.native
    
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
      
      @scala.inline
      def all: typings.luminoDatagrid.luminoDatagridStrings.all = "all".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.all]
      
      @scala.inline
      def current: typings.luminoDatagrid.luminoDatagridStrings.current = "current".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.current]
      
      @scala.inline
      def none: typings.luminoDatagrid.luminoDatagridStrings.none = "none".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.none]
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
      
      @scala.inline
      def down: typings.luminoDatagrid.luminoDatagridStrings.down = "down".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.down]
      
      @scala.inline
      def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
      
      @scala.inline
      def none: typings.luminoDatagrid.luminoDatagridStrings.none = "none".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.none]
      
      @scala.inline
      def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
      
      @scala.inline
      def up: typings.luminoDatagrid.luminoDatagridStrings.up = "up".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.up]
    }
    
    /**
      * An options object for initializing a selection model.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The data model for the selection model.
        */
      var dataModel: DataModel = js.native
      
      /**
        * The selection mode for the model.
        *
        * The default is `'cell'`.
        */
      var selectionMode: js.UndefOr[SelectionMode] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(dataModel: DataModel): IOptions = {
        val __obj = js.Dynamic.literal(dataModel = dataModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataModel(value: DataModel): Self = StObject.set(x, "dataModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      }
    }
    
    /**
      * A type alias for the select args.
      */
    @js.native
    trait SelectArgs extends StObject {
      
      /**
        * The first column of the selection.
        *
        * This may be greater than `c2`.
        */
      var c1: Double = js.native
      
      /**
        * The last column of the selection.
        *
        * This may be less than `c1`.
        */
      var c2: Double = js.native
      
      /**
        * Which of the existing selections to clear.
        */
      var clear: ClearMode = js.native
      
      /**
        * The column index for the cursor.
        *
        * This should be contained within the selection.
        */
      var cursorColumn: Double = js.native
      
      /**
        * The row index for the cursor.
        *
        * This should be contained within the selection.
        */
      var cursorRow: Double = js.native
      
      /**
        * The first row of the selection.
        *
        * This may be greater than `r2`.
        */
      var r1: Double = js.native
      
      /**
        * The last row of the selection.
        *
        * This may be less than `r1`.
        */
      var r2: Double = js.native
    }
    object SelectArgs {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class SelectArgsMutableBuilder[Self <: SelectArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setC1(value: Double): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setC2(value: Double): Self = StObject.set(x, "c2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClear(value: ClearMode): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorColumn(value: Double): Self = StObject.set(x, "cursorColumn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorRow(value: Double): Self = StObject.set(x, "cursorRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a selection in a selection model.
      */
    @js.native
    trait Selection extends StObject {
      
      /**
        * The first column of the selection.
        *
        * This may be greater than `c2`.
        */
      val c1: Double = js.native
      
      /**
        * The last column of the selection.
        *
        * This may be less than `c1`.
        */
      val c2: Double = js.native
      
      /**
        * The first row of the selection.
        *
        * This may be greater than `r2`.
        */
      val r1: Double = js.native
      
      /**
        * The last row of the selection.
        *
        * This may be less than `r1`.
        */
      val r2: Double = js.native
    }
    object Selection {
      
      @scala.inline
      def apply(c1: Double, c2: Double, r1: Double, r2: Double): Selection = {
        val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
        __obj.asInstanceOf[Selection]
      }
      
      @scala.inline
      implicit class SelectionMutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setC1(value: Double): Self = StObject.set(x, "c1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setC2(value: Double): Self = StObject.set(x, "c2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
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
      
      @scala.inline
      def cell: typings.luminoDatagrid.luminoDatagridStrings.cell = "cell".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.cell]
      
      @scala.inline
      def column: typings.luminoDatagrid.luminoDatagridStrings.column = "column".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.column]
      
      @scala.inline
      def row: typings.luminoDatagrid.luminoDatagridStrings.row = "row".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.row]
    }
  }
}
