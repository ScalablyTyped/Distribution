package typings.luminoDatagrid

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.typesCelleditorMod.Private.ICellInfo
import typings.luminoDatagrid.typesCelleditorcontrollerMod._EditorOverrideIdentifier
import typings.luminoDatagrid.typesDatagridMod.DataGrid
import typings.luminoDatagrid.typesNotificationMod.Notification
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.Signal
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCelleditorMod {
  
  @JSImport("@lumino/datagrid/types/celleditor", "BooleanCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class BooleanCellEditor () extends CellEditor {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _createWidget: Any = js.native
    
    /* private */ var _deserialize: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  
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
    /* protected */ val validInput: Boolean = js.native
    
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
  
  @JSImport("@lumino/datagrid/types/celleditor", "DateCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class DateCellEditor () extends CellEditor {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _createWidget: Any = js.native
    
    /* private */ var _deserialize: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  
  @JSImport("@lumino/datagrid/types/celleditor", "DynamicOptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class DynamicOptionCellEditor () extends CellEditor {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _createWidget: Any = js.native
    
    /* private */ var _deserialize: Any = js.native
    
    /* private */ var _input: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid/types/celleditor", "InputCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class InputCellEditor () extends CellEditor {
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onInput: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* protected */ def bindEvents(): Unit = js.native
    
    /* protected */ def createWidget(): Unit = js.native
    
    /* protected */ def deserialize(value: Any): Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /* protected */ var input: HTMLInputElement = js.native
    
    /* protected */ var inputType: String = js.native
  }
  
  @JSImport("@lumino/datagrid/types/celleditor", "IntegerCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class IntegerCellEditor () extends InputCellEditor
  
  @JSImport("@lumino/datagrid/types/celleditor", "IntegerInputValidator")
  @js.native
  open class IntegerInputValidator ()
    extends StObject
       with ICellInputValidator {
    
    /**
      * Maximum value
      *
      * The default is Number.NaN, meaning no maximum constraint
      */
    var max: Double = js.native
    
    /**
      * Minimum value
      *
      * The default is Number.NaN, meaning no minimum constraint
      */
    var min: Double = js.native
    
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    /* CompleteClass */
    override def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse = js.native
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    def validate(cell: CellConfig, value: Double): ICellInputValidatorResponse = js.native
  }
  
  @JSImport("@lumino/datagrid/types/celleditor", "NumberCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class NumberCellEditor () extends InputCellEditor
  
  @JSImport("@lumino/datagrid/types/celleditor", "NumberInputValidator")
  @js.native
  open class NumberInputValidator ()
    extends StObject
       with ICellInputValidator {
    
    /**
      * Maximum value
      *
      * The default is Number.NaN, meaning no maximum constraint
      */
    var max: Double = js.native
    
    /**
      * Minimum value
      *
      * The default is Number.NaN, meaning no minimum constraint
      */
    var min: Double = js.native
    
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    /* CompleteClass */
    override def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse = js.native
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    def validate(cell: CellConfig, value: Double): ICellInputValidatorResponse = js.native
  }
  
  @JSImport("@lumino/datagrid/types/celleditor", "OptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class OptionCellEditor () extends CellEditor {
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _createWidget: Any = js.native
    
    /* private */ var _deserialize: Any = js.native
    
    /* private */ var _isMultiSelect: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _select: Any = js.native
  }
  
  @JSImport("@lumino/datagrid/types/celleditor", "PassInputValidator")
  @js.native
  open class PassInputValidator ()
    extends StObject
       with ICellInputValidator {
    
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    /* CompleteClass */
    override def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse = js.native
  }
  
  @JSImport("@lumino/datagrid/types/celleditor", "TextCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  open class TextCellEditor () extends InputCellEditor
  
  @JSImport("@lumino/datagrid/types/celleditor", "TextInputValidator")
  @js.native
  open class TextInputValidator ()
    extends StObject
       with ICellInputValidator {
    
    /**
      * Maximum text length
      *
      * The default is Number.NaN, meaning no maximum constraint
      */
    var maxLength: Double = js.native
    
    /**
      * Minimum text length
      *
      * The default is Number.NaN, meaning no minimum constraint
      */
    var minLength: Double = js.native
    
    /**
      * Required text pattern as regular expression
      *
      * The default is null, meaning no pattern constraint
      */
    var pattern: js.RegExp | Null = js.native
    
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    def validate(cell: CellConfig, value: String): ICellInputValidatorResponse = js.native
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    /* CompleteClass */
    override def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDatagrid.luminoDatagridStrings.string
    - typings.luminoDatagrid.luminoDatagridStrings.number
    - typings.luminoDatagrid.luminoDatagridStrings.integer
    - typings.luminoDatagrid.luminoDatagridStrings.boolean
    - typings.luminoDatagrid.luminoDatagridStrings.date
    - typings.luminoDatagrid.luminoDatagridStrings.stringColonoption
    - typings.luminoDatagrid.luminoDatagridStrings.numberColonoption
    - typings.luminoDatagrid.luminoDatagridStrings.integerColonoption
    - typings.luminoDatagrid.luminoDatagridStrings.dateColonoption
    - typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option`
    - typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option`
    - typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option`
    - typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option`
  */
  trait CellDataType
    extends StObject
       with _EditorOverrideIdentifier
  object CellDataType {
    
    inline def boolean: typings.luminoDatagrid.luminoDatagridStrings.boolean = "boolean".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.boolean]
    
    inline def date: typings.luminoDatagrid.luminoDatagridStrings.date = "date".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.date]
    
    inline def `dateColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option` = "date:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option`]
    
    inline def dateColonoption: typings.luminoDatagrid.luminoDatagridStrings.dateColonoption = "date:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.dateColonoption]
    
    inline def integer: typings.luminoDatagrid.luminoDatagridStrings.integer = "integer".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.integer]
    
    inline def `integerColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option` = "integer:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option`]
    
    inline def integerColonoption: typings.luminoDatagrid.luminoDatagridStrings.integerColonoption = "integer:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.integerColonoption]
    
    inline def number: typings.luminoDatagrid.luminoDatagridStrings.number = "number".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.number]
    
    inline def `numberColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option` = "number:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option`]
    
    inline def numberColonoption: typings.luminoDatagrid.luminoDatagridStrings.numberColonoption = "number:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.numberColonoption]
    
    inline def string: typings.luminoDatagrid.luminoDatagridStrings.string = "string".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.string]
    
    inline def `stringColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option` = "string:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option`]
    
    inline def stringColonoption: typings.luminoDatagrid.luminoDatagridStrings.stringColonoption = "string:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.stringColonoption]
  }
  
  trait ICellEditOptions extends StObject {
    
    /**
      * Cell editor to use for editing.
      *
      * #### Notes
      * This object is only used by cell editor controller.
      * If not set, controller picks the most suitable editor
      * for the particular cell configuration.
      */
    var editor: js.UndefOr[ICellEditor] = js.undefined
    
    /**
      * Callback method to call on cell edit cancel.
      */
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback method to call on cell edit commit.
      */
    var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.undefined
    
    /**
      * Cell input validator to use for value validation.
      */
    var validator: js.UndefOr[ICellInputValidator] = js.undefined
  }
  object ICellEditOptions {
    
    inline def apply(): ICellEditOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellEditOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellEditOptions] (val x: Self) extends AnyVal {
      
      inline def setEditor(value: ICellEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnCommit(value: /* response */ ICellEditResponse => Unit): Self = StObject.set(x, "onCommit", js.Any.fromFunction1(value))
      
      inline def setOnCommitUndefined: Self = StObject.set(x, "onCommit", js.undefined)
      
      inline def setValidator(value: ICellInputValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  trait ICellEditResponse extends StObject {
    
    /**
      * An object which holds the configuration data for a cell.
      */
    var cell: CellConfig
    
    /**
      * Cursor move direction based on keys pressed to end the edit.
      */
    var cursorMovement: CursorMoveDirection
    
    /**
      * Value input.
      */
    var value: Any
  }
  object ICellEditResponse {
    
    inline def apply(cell: CellConfig, cursorMovement: CursorMoveDirection, value: Any): ICellEditResponse = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cursorMovement = cursorMovement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellEditResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellEditResponse] (val x: Self) extends AnyVal {
      
      inline def setCell(value: CellConfig): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCursorMovement(value: CursorMoveDirection): Self = StObject.set(x, "cursorMovement", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICellEditor extends StObject {
    
    /**
      * Cancel editing the cell.
      */
    def cancel(): Unit = js.native
    
    /**
      * Start editing the cell.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param options - The cell editing options.
      */
    def edit(cell: CellConfig): Unit = js.native
    def edit(cell: CellConfig, options: ICellEditOptions): Unit = js.native
  }
  
  trait ICellInputValidator extends StObject {
    
    /**
      * Validate cell input.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param value - The cell value input.
      *
      * @returns An object with validation result.
      */
    def validate(cell: CellConfig, value: Any): ICellInputValidatorResponse
  }
  object ICellInputValidator {
    
    inline def apply(validate: (CellConfig, Any) => ICellInputValidatorResponse): ICellInputValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[ICellInputValidator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellInputValidator] (val x: Self) extends AnyVal {
      
      inline def setValidate(value: (CellConfig, Any) => ICellInputValidatorResponse): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  trait ICellInputValidatorResponse extends StObject {
    
    /**
      * Validation error message. Set only when input is invalid
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * Flag indicating cell input is valid or not
      */
    var valid: Boolean
  }
  object ICellInputValidatorResponse {
    
    inline def apply(valid: Boolean): ICellInputValidatorResponse = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellInputValidatorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellInputValidatorResponse] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A namespace for module-private functionality.
    */
  object Private {
    
    /**
      * A type alias for cell properties.
      */
    trait ICellInfo extends StObject {
      
      var column: Double
      
      var data: Any
      
      var grid: DataGrid
      
      var height: Double
      
      var row: Double
      
      var width: Double
      
      var x: Double
      
      var y: Double
    }
    object ICellInfo {
      
      inline def apply(
        column: Double,
        data: Any,
        grid: DataGrid,
        height: Double,
        row: Double,
        width: Double,
        x: Double,
        y: Double
      ): ICellInfo = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICellInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICellInfo] (val x: Self) extends AnyVal {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setGrid(value: DataGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
  }
}
