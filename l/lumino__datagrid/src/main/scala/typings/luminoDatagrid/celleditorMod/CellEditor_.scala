package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.celleditorMod.Private.ICellInfo
import typings.luminoDatagrid.notificationMod.Notification
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.CursorMoveDirection
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.Signal
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/celleditor", "CellEditor")
@js.native
/**
  * Construct a new cell editor.
  */
abstract class CellEditor_ ()
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
    * The div element used to contain and position editor widget.
    */
  var editorContainer: HTMLDivElement = js.native
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
    * Whether the value input is valid.
    */
  val validInput: Boolean = js.native
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
    * Compute cell rectangle and return with other cell properties.
    */
  /* protected */ def getCellInfo(cell: CellConfig): ICellInfo = js.native
  /**
    * Return the current input entered. This method throws exceptions
    * if input is invalid. Error message in exception is shown as notification.
    */
  /* protected */ def getInput(): js.Any = js.native
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
    * Validate the cell input. Shows validation error notification when input is invalid.
    */
  /* protected */ def validate(): Unit = js.native
}

