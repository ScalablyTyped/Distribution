package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.typesCelleditorMod.CellEditor.Notification
import typings.luminoDatagrid.typesCelleditorMod.CellEditor.Notification.IOptions
import typings.luminoDatagrid.typesCelleditorMod.CellEditor.Notification.Placement
import typings.luminoDatagrid.typesCelleditorMod.Private.ICellInfo
import typings.luminoDatagrid.typesDatagridMod.DataGrid
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@lumino/datagrid/types/celleditor", "CellEditor")
@js.native
/**
  * Construct a new cell editor.
  */
open class CellEditor ()
  extends StObject
     with ICellEditor
     with IDisposable {
  
  /**
    * Create container elements needed to prevent editor widget overflow
    * beyond viewport and to position cell editor widget.
    */
  /* private */ var _addContainer: Any = js.native
  
  /**
    * Remove validity notification popup.
    */
  /* private */ var _closeValidityNotification: Any = js.native
  
  /**
    * Whether the cell editor is disposed.
    */
  /* private */ var _disposed: Any = js.native
  
  /**
    * Grid wheel event handler.
    */
  /* private */ var _gridWheelEventHandler: Any = js.native
  
  /**
    * Whether the value input is valid.
    */
  /* private */ var _validInput: Any = js.native
  
  /**
    * Cell configuration data for the cell being edited.
    */
  /* protected */ var cell: CellConfig = js.native
  
  /**
    * Commit the edited value.
    *
    * @param cursorMovement - Cursor move direction based on keys pressed to end the edit.
    *
    * @returns true on valid input, false otherwise.
    */
  /* protected */ def commit(): Boolean = js.native
  /* protected */ def commit(cursorMovement: CursorMoveDirection): Boolean = js.native
  
  /**
    * Create and return a cell input validator based on configuration of the
    * cell being edited. If no suitable validator can be found, it returns undefined.
    */
  /* protected */ def createValidatorBasedOnType(): js.UndefOr[ICellInputValidator] = js.native
  
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * The div element used to contain and position editor widget.
    */
  /* protected */ var editorContainer: HTMLDivElement = js.native
  
  /**
    * Compute cell rectangle and return with other cell properties.
    */
  /* protected */ def getCellInfo(cell: CellConfig): ICellInfo = js.native
  
  /**
    * Return the current input entered. This method throws exceptions
    * if input is invalid. Error message in exception is shown as notification.
    */
  /* protected */ def getInput(): Any = js.native
  
  /**
    * A signal emitted when input changes.
    */
  /* protected */ var inputChanged: Signal[this.type, Unit] = js.native
  
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Whether the cell editor is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MCellEditor: Boolean = js.native
  
  /**
    * Callback method to call on cell edit cancel.
    */
  /* protected */ var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback method to call on cell edit commit.
    */
  /* protected */ var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.native
  
  /**
    * Set validity flag.
    *
    * @param valid - Whether the input is valid.
    *
    * @param message - Notification message to show.
    *
    * If message is set to empty string (which is the default)
    * existing notification popup is removed if any.
    */
  /* protected */ def setValidity(valid: Boolean): Unit = js.native
  /* protected */ def setValidity(valid: Boolean, message: String): Unit = js.native
  
  /**
    * Start editing the cell. Usually an editor widget is created and
    *  added to `editorContainer`
    */
  /* protected */ def startEditing(): Unit = js.native
  
  /**
    * Reposition cell editor by moving viewport occluder and cell editor container.
    */
  /* protected */ def updatePosition(): Unit = js.native
  
  /**
    * Whether the value input is valid.
    */
  /* protected */ def validInput: Boolean = js.native
  
  /**
    * Validate the cell input. Shows validation error notification when input is invalid.
    */
  /* protected */ def validate(): Unit = js.native
  
  /**
    * Cell input validator to use for the cell being edited.
    */
  /* protected */ var validator: js.UndefOr[ICellInputValidator] = js.native
  
  /**
    * Notification popup used to show validation error messages.
    */
  /* protected */ var validityNotification: Notification | Null = js.native
  
  /**
    * The div element used to prevent editor widget overflow beyond grid viewport.
    */
  /* protected */ var viewportOccluder: HTMLDivElement = js.native
}
object CellEditor {
  
  /**
    * A widget which implements a notification popup.
    */
  @JSImport("@lumino/datagrid/types/celleditor", "CellEditor.Notification")
  @js.native
  open class Notification protected () extends Widget {
    /**
      * Construct a new notification.
      *
      * @param options - The options for initializing the notification.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'mousedown'` event for the notification.
      */
    /* private */ var _evtMouseDown: Any = js.native
    
    /* private */ var _message: Any = js.native
    
    /* private */ var _placement: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * Handle the DOM events for the notification.
      *
      * @param event - The DOM event sent to the notification.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notification's DOM node.
      *
      * This should not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Get the current value of the message.
      */
    def message: String = js.native
    
    /**
      * Get the node presenting the message.
      */
    def messageNode: HTMLSpanElement = js.native
    
    /**
      * Set the current value of the message.
      *
      */
    def message_=(value: String): Unit = js.native
    
    /**
      * Get the placement of the notification.
      */
    def placement: Placement = js.native
    /**
      * Set the placement of the notification.
      */
    def placement_=(value: Placement): Unit = js.native
  }
  /**
    * The namespace for the `Notification` class statics.
    */
  object Notification {
    
    @JSImport("@lumino/datagrid/types/celleditor", "CellEditor.Notification")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create the DOM node for notification.
      */
    inline def createNode(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")().asInstanceOf[HTMLElement]
    
    /**
      * An options object for creating a notification.
      */
    trait IOptions extends StObject {
      
      /**
        * The message to show on notification.
        */
      var message: js.UndefOr[String] = js.undefined
      
      /**
        * The placement of the notification.
        *
        * The default is `'bottom'`.
        */
      var placement: js.UndefOr[Placement] = js.undefined
      
      /**
        * Target element to attach notification to.
        *
        */
      var target: HTMLElement
      
      /**
        * Duration in ms after which to close notification popup.
        *
        * The default is undefined, and notification is kept visible
        * Timeout value needs to be greater than zero
        */
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(target: HTMLElement): IOptions = {
        val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    /**
      * A type alias for a notification placement.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.luminoDatagrid.luminoDatagridStrings.top
      - typings.luminoDatagrid.luminoDatagridStrings.bottom
      - typings.luminoDatagrid.luminoDatagridStrings.left
      - typings.luminoDatagrid.luminoDatagridStrings.right
    */
    trait Placement extends StObject
    object Placement {
      
      inline def bottom: typings.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.bottom]
      
      inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
      
      inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
      
      inline def top: typings.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.top]
    }
  }
  
  /**
    * An object which holds the configuration data for a cell.
    */
  trait CellConfig extends StObject {
    
    /**
      * The column index of the cell.
      */
    val column: Double
    
    /**
      * The grid containing the cell.
      */
    val grid: DataGrid
    
    /**
      * The row index of the cell.
      */
    val row: Double
  }
  object CellConfig {
    
    inline def apply(column: Double, grid: DataGrid, row: Double): CellConfig = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellConfig] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: DataGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
