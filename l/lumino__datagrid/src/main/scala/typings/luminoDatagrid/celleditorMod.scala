package typings.luminoDatagrid

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.celleditorMod.Private.ICellInfo
import typings.luminoDatagrid.celleditorcontrollerMod._EditorOverrideIdentifier
import typings.luminoDatagrid.datagridMod.DataGrid
import typings.luminoDatagrid.notificationMod.Notification
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.Signal
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object celleditorMod {
  
  @JSImport("@lumino/datagrid/lib/celleditor", "BooleanCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class BooleanCellEditor () extends CellEditor {
    
    var _bindEvents: js.Any = js.native
    
    var _createWidget: js.Any = js.native
    
    var _deserialize: js.Any = js.native
    
    var _input: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "CellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  abstract class CellEditor ()
    extends ICellEditor
       with IDisposable {
    
    /**
      * Create container elements needed to prevent editor widget overflow
      * beyond viewport and to position cell editor widget.
      */
    var _addContainer: js.Any = js.native
    
    /**
      * Remove validity notification popup.
      */
    var _closeValidityNotification: js.Any = js.native
    
    /**
      * Whether the cell editor is disposed.
      */
    var _disposed: js.Any = js.native
    
    /**
      * Whether the value input is valid.
      */
    var _validInput: js.Any = js.native
    
    /**
      * Cell configuration data for the cell being edited.
      */
    var cell: CellConfig = js.native
    
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
      * The div element used to contain and position editor widget.
      */
    var editorContainer: HTMLDivElement = js.native
    
    /**
      * Compute cell rectangle and return with other cell properties.
      */
    /* protected */ def getCellInfo(cell: CellConfig): ICellInfo = js.native
    
    /**
      * Return the current input entered. This method throws exceptions
      * if input is invalid. Error message in exception is shown as notification.
      */
    /* protected */ def getInput(): js.Any = js.native
    
    /**
      * A signal emitted when input changes.
      */
    var inputChanged: Signal[this.type, Unit] = js.native
    
    /**
      * Callback method to call on cell edit cancel.
      */
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback method to call on cell edit commit.
      */
    var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.native
    
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
    val validInput: Boolean = js.native
    
    /**
      * Validate the cell input. Shows validation error notification when input is invalid.
      */
    /* protected */ def validate(): Unit = js.native
    
    /**
      * Cell input validator to use for the cell being edited.
      */
    var validator: js.UndefOr[ICellInputValidator] = js.native
    
    /**
      * Notification popup used to show validation error messages.
      */
    var validityNotification: Notification | Null = js.native
    
    /**
      * The div element used to prevent editor widget overflow beyond grid viewport.
      */
    var viewportOccluder: HTMLDivElement = js.native
  }
  object CellEditor {
    
    /**
      * An object which holds the configuration data for a cell.
      */
    @js.native
    trait CellConfig extends StObject {
      
      /**
        * The column index of the cell.
        */
      val column: Double = js.native
      
      /**
        * The grid containing the cell.
        */
      val grid: DataGrid = js.native
      
      /**
        * The row index of the cell.
        */
      val row: Double = js.native
    }
    object CellConfig {
      
      @scala.inline
      def apply(column: Double, grid: DataGrid, row: Double): CellConfig = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellConfig]
      }
      
      @scala.inline
      implicit class CellConfigMutableBuilder[Self <: CellConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrid(value: DataGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "DateCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class DateCellEditor () extends CellEditor {
    
    var _bindEvents: js.Any = js.native
    
    var _createWidget: js.Any = js.native
    
    var _deserialize: js.Any = js.native
    
    var _input: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "DynamicOptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class DynamicOptionCellEditor () extends CellEditor {
    
    var _bindEvents: js.Any = js.native
    
    var _createWidget: js.Any = js.native
    
    var _deserialize: js.Any = js.native
    
    var _input: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "InputCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  abstract class InputCellEditor () extends CellEditor {
    
    var _onBlur: js.Any = js.native
    
    var _onInput: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    /* protected */ def bindEvents(): Unit = js.native
    
    /* protected */ def createWidget(): Unit = js.native
    
    /* protected */ def deserialize(value: js.Any): js.Any = js.native
    
    /**
      * Handle the DOM events for the editor.
      *
      * @param event - The DOM event sent to the editor.
      */
    def handleEvent(event: Event): Unit = js.native
    
    var input: HTMLInputElement = js.native
    
    var inputType: String = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "IntegerCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class IntegerCellEditor () extends InputCellEditor
  
  @JSImport("@lumino/datagrid/lib/celleditor", "IntegerInputValidator")
  @js.native
  class IntegerInputValidator () extends ICellInputValidator {
    
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
    def validate(cell: CellConfig, value: Double): ICellInputValidatorResponse = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "NumberCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class NumberCellEditor () extends InputCellEditor
  
  @JSImport("@lumino/datagrid/lib/celleditor", "NumberInputValidator")
  @js.native
  class NumberInputValidator () extends ICellInputValidator {
    
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
    def validate(cell: CellConfig, value: Double): ICellInputValidatorResponse = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "OptionCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class OptionCellEditor () extends CellEditor {
    
    var _bindEvents: js.Any = js.native
    
    var _createWidget: js.Any = js.native
    
    var _deserialize: js.Any = js.native
    
    var _isMultiSelect: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _select: js.Any = js.native
  }
  
  @JSImport("@lumino/datagrid/lib/celleditor", "PassInputValidator")
  @js.native
  class PassInputValidator () extends ICellInputValidator
  
  @JSImport("@lumino/datagrid/lib/celleditor", "TextCellEditor")
  @js.native
  /**
    * Construct a new cell editor.
    */
  class TextCellEditor () extends InputCellEditor
  
  @JSImport("@lumino/datagrid/lib/celleditor", "TextInputValidator")
  @js.native
  class TextInputValidator () extends ICellInputValidator {
    
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
    var pattern: RegExp | Null = js.native
    
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
  trait CellDataType extends _EditorOverrideIdentifier
  object CellDataType {
    
    @scala.inline
    def boolean: typings.luminoDatagrid.luminoDatagridStrings.boolean = "boolean".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.boolean]
    
    @scala.inline
    def date: typings.luminoDatagrid.luminoDatagridStrings.date = "date".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.date]
    
    @scala.inline
    def `dateColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option` = "date:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option`]
    
    @scala.inline
    def dateColonoption: typings.luminoDatagrid.luminoDatagridStrings.dateColonoption = "date:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.dateColonoption]
    
    @scala.inline
    def integer: typings.luminoDatagrid.luminoDatagridStrings.integer = "integer".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.integer]
    
    @scala.inline
    def `integerColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option` = "integer:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option`]
    
    @scala.inline
    def integerColonoption: typings.luminoDatagrid.luminoDatagridStrings.integerColonoption = "integer:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.integerColonoption]
    
    @scala.inline
    def number: typings.luminoDatagrid.luminoDatagridStrings.number = "number".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.number]
    
    @scala.inline
    def `numberColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option` = "number:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option`]
    
    @scala.inline
    def numberColonoption: typings.luminoDatagrid.luminoDatagridStrings.numberColonoption = "number:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.numberColonoption]
    
    @scala.inline
    def string: typings.luminoDatagrid.luminoDatagridStrings.string = "string".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.string]
    
    @scala.inline
    def `stringColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option` = "string:dynamic-option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option`]
    
    @scala.inline
    def stringColonoption: typings.luminoDatagrid.luminoDatagridStrings.stringColonoption = "string:option".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.stringColonoption]
  }
  
  @js.native
  trait ICellEditOptions extends StObject {
    
    /**
      * Cell editor to use for editing.
      *
      * #### Notes
      * This object is only used by cell editor controller.
      * If not set, controller picks the most suitable editor
      * for the particular cell configuration.
      */
    var editor: js.UndefOr[ICellEditor] = js.native
    
    /**
      * Callback method to call on cell edit cancel.
      */
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback method to call on cell edit commit.
      */
    var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.native
    
    /**
      * Cell input validator to use for value validation.
      */
    var validator: js.UndefOr[ICellInputValidator] = js.native
  }
  object ICellEditOptions {
    
    @scala.inline
    def apply(): ICellEditOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellEditOptions]
    }
    
    @scala.inline
    implicit class ICellEditOptionsMutableBuilder[Self <: ICellEditOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditor(value: ICellEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnCommit(value: /* response */ ICellEditResponse => Unit): Self = StObject.set(x, "onCommit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCommitUndefined: Self = StObject.set(x, "onCommit", js.undefined)
      
      @scala.inline
      def setValidator(value: ICellInputValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  @js.native
  trait ICellEditResponse extends StObject {
    
    /**
      * An object which holds the configuration data for a cell.
      */
    var cell: CellConfig = js.native
    
    /**
      * Cursor move direction based on keys pressed to end the edit.
      */
    var cursorMovement: CursorMoveDirection = js.native
    
    /**
      * Value input.
      */
    var value: js.Any = js.native
  }
  object ICellEditResponse {
    
    @scala.inline
    def apply(cell: CellConfig, cursorMovement: CursorMoveDirection, value: js.Any): ICellEditResponse = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cursorMovement = cursorMovement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellEditResponse]
    }
    
    @scala.inline
    implicit class ICellEditResponseMutableBuilder[Self <: ICellEditResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCell(value: CellConfig): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorMovement(value: CursorMoveDirection): Self = StObject.set(x, "cursorMovement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
  
  @js.native
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
    def validate(cell: CellConfig, value: js.Any): ICellInputValidatorResponse = js.native
  }
  object ICellInputValidator {
    
    @scala.inline
    def apply(validate: (CellConfig, js.Any) => ICellInputValidatorResponse): ICellInputValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[ICellInputValidator]
    }
    
    @scala.inline
    implicit class ICellInputValidatorMutableBuilder[Self <: ICellInputValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidate(value: (CellConfig, js.Any) => ICellInputValidatorResponse): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ICellInputValidatorResponse extends StObject {
    
    /**
      * Validation error message. Set only when input is invalid
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * Flag indicating cell input is valid or not
      */
    var valid: Boolean = js.native
  }
  object ICellInputValidatorResponse {
    
    @scala.inline
    def apply(valid: Boolean): ICellInputValidatorResponse = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellInputValidatorResponse]
    }
    
    @scala.inline
    implicit class ICellInputValidatorResponseMutableBuilder[Self <: ICellInputValidatorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A namespace for module-private functionality.
    */
  object Private {
    
    /**
      * A type alias for cell properties.
      */
    @js.native
    trait ICellInfo extends StObject {
      
      var column: Double = js.native
      
      var data: js.Any = js.native
      
      var grid: DataGrid = js.native
      
      var height: Double = js.native
      
      var row: Double = js.native
      
      var width: Double = js.native
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    object ICellInfo {
      
      @scala.inline
      def apply(
        column: Double,
        data: js.Any,
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
      implicit class ICellInfoMutableBuilder[Self <: ICellInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrid(value: DataGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
  }
}
