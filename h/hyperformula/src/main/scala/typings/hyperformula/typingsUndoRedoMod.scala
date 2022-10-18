package typings.hyperformula

import typings.hyperformula.anon.Address
import typings.hyperformula.typingsCellContentParserMod.RawCellContent
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsClipboardOperationsMod.ClipboardCell
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsNamedExpressionsMod.InternalNamedExpression
import typings.hyperformula.typingsOperationsMod.AddColumnsCommand
import typings.hyperformula.typingsOperationsMod.AddRowsCommand
import typings.hyperformula.typingsOperationsMod.ColumnsRemoval
import typings.hyperformula.typingsOperationsMod.Operations
import typings.hyperformula.typingsOperationsMod.RemoveColumnsCommand
import typings.hyperformula.typingsOperationsMod.RemoveRowsCommand
import typings.hyperformula.typingsOperationsMod.RowsRemoval
import typings.std.Generator
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsUndoRedoMod {
  
  @JSImport("hyperformula/typings/UndoRedo", "AddColumnsUndoEntry")
  @js.native
  open class AddColumnsUndoEntry protected () extends BaseUndoEntry {
    def this(command: AddColumnsCommand) = this()
    
    val command: AddColumnsCommand = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "AddNamedExpressionUndoEntry")
  @js.native
  open class AddNamedExpressionUndoEntry protected () extends BaseUndoEntry {
    def this(name: String, newContent: RawCellContent) = this()
    def this(name: String, newContent: RawCellContent, scope: Double) = this()
    def this(
      name: String,
      newContent: RawCellContent,
      scope: Double,
      options: Record[String, String | Double | Boolean]
    ) = this()
    def this(
      name: String,
      newContent: RawCellContent,
      scope: Unit,
      options: Record[String, String | Double | Boolean]
    ) = this()
    
    val name: String = js.native
    
    val newContent: RawCellContent = js.native
    
    val options: js.UndefOr[Record[String, String | Double | Boolean]] = js.native
    
    val scope: js.UndefOr[Double] = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "AddRowsUndoEntry")
  @js.native
  open class AddRowsUndoEntry protected () extends BaseUndoEntry {
    def this(command: AddRowsCommand) = this()
    
    val command: AddRowsCommand = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "AddSheetUndoEntry")
  @js.native
  open class AddSheetUndoEntry protected () extends BaseUndoEntry {
    def this(sheetName: String) = this()
    
    val sheetName: String = js.native
  }
  
  /* note: abstract class */ @JSImport("hyperformula/typings/UndoRedo", "BaseUndoEntry")
  @js.native
  open class BaseUndoEntry ()
    extends StObject
       with UndoEntry {
    
    /* CompleteClass */
    override def doRedo(undoRedo: UndoRedo): Unit = js.native
    
    /* CompleteClass */
    override def doUndo(undoRedo: UndoRedo): Unit = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "BatchUndoEntry")
  @js.native
  open class BatchUndoEntry () extends BaseUndoEntry {
    
    def add(operation: UndoEntry): Unit = js.native
    
    val operations: js.Array[UndoEntry] = js.native
    
    def reversedOperations(): Generator[UndoEntry, Unit, Any] = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "ChangeNamedExpressionUndoEntry")
  @js.native
  open class ChangeNamedExpressionUndoEntry protected () extends BaseUndoEntry {
    def this(namedExpression: InternalNamedExpression, newContent: RawCellContent, oldContent: ClipboardCell) = this()
    def this(
      namedExpression: InternalNamedExpression,
      newContent: RawCellContent,
      oldContent: ClipboardCell,
      scope: Double
    ) = this()
    def this(
      namedExpression: InternalNamedExpression,
      newContent: RawCellContent,
      oldContent: ClipboardCell,
      scope: Double,
      options: Record[String, String | Double | Boolean]
    ) = this()
    def this(
      namedExpression: InternalNamedExpression,
      newContent: RawCellContent,
      oldContent: ClipboardCell,
      scope: Unit,
      options: Record[String, String | Double | Boolean]
    ) = this()
    
    val namedExpression: InternalNamedExpression = js.native
    
    val newContent: RawCellContent = js.native
    
    val oldContent: ClipboardCell = js.native
    
    val options: js.UndefOr[Record[String, String | Double | Boolean]] = js.native
    
    val scope: js.UndefOr[Double] = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "ClearSheetUndoEntry")
  @js.native
  open class ClearSheetUndoEntry protected () extends BaseUndoEntry {
    def this(sheetId: Double, oldSheetContent: js.Array[js.Array[ClipboardCell]]) = this()
    
    val oldSheetContent: js.Array[js.Array[ClipboardCell]] = js.native
    
    val sheetId: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "MoveCellsUndoEntry")
  @js.native
  open class MoveCellsUndoEntry protected () extends BaseUndoEntry {
    def this(
      sourceLeftCorner: SimpleCellAddress_,
      width: Double,
      height: Double,
      destinationLeftCorner: SimpleCellAddress_,
      overwrittenCellsData: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]],
      addedGlobalNamedExpressions: js.Array[String],
      version: Double
    ) = this()
    
    val addedGlobalNamedExpressions: js.Array[String] = js.native
    
    val destinationLeftCorner: SimpleCellAddress_ = js.native
    
    val height: Double = js.native
    
    val overwrittenCellsData: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    val sourceLeftCorner: SimpleCellAddress_ = js.native
    
    val version: Double = js.native
    
    val width: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "MoveColumnsUndoEntry")
  @js.native
  open class MoveColumnsUndoEntry protected () extends BaseUndoEntry {
    def this(sheet: Double, startColumn: Double, numberOfColumns: Double, targetColumn: Double, version: Double) = this()
    
    val numberOfColumns: Double = js.native
    
    val sheet: Double = js.native
    
    val startColumn: Double = js.native
    
    val targetColumn: Double = js.native
    
    val undoEnd: Double = js.native
    
    val undoStart: Double = js.native
    
    val version: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "MoveRowsUndoEntry")
  @js.native
  open class MoveRowsUndoEntry protected () extends BaseUndoEntry {
    def this(sheet: Double, startRow: Double, numberOfRows: Double, targetRow: Double, version: Double) = this()
    
    val numberOfRows: Double = js.native
    
    val sheet: Double = js.native
    
    val startRow: Double = js.native
    
    val targetRow: Double = js.native
    
    val undoEnd: Double = js.native
    
    val undoStart: Double = js.native
    
    val version: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "PasteUndoEntry")
  @js.native
  open class PasteUndoEntry protected () extends BaseUndoEntry {
    def this(
      targetLeftCorner: SimpleCellAddress_,
      oldContent: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]],
      newContent: js.Array[js.Array[ClipboardCell]],
      addedGlobalNamedExpressions: js.Array[String]
    ) = this()
    
    val addedGlobalNamedExpressions: js.Array[String] = js.native
    
    val newContent: js.Array[js.Array[ClipboardCell]] = js.native
    
    val oldContent: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    val targetLeftCorner: SimpleCellAddress_ = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "RemoveColumnsUndoEntry")
  @js.native
  open class RemoveColumnsUndoEntry protected () extends BaseUndoEntry {
    def this(command: RemoveColumnsCommand, columnsRemovals: js.Array[ColumnsRemoval]) = this()
    
    val columnsRemovals: js.Array[ColumnsRemoval] = js.native
    
    val command: RemoveColumnsCommand = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "RemoveNamedExpressionUndoEntry")
  @js.native
  open class RemoveNamedExpressionUndoEntry protected () extends BaseUndoEntry {
    def this(namedExpression: InternalNamedExpression, content: ClipboardCell) = this()
    def this(namedExpression: InternalNamedExpression, content: ClipboardCell, scope: Double) = this()
    
    val content: ClipboardCell = js.native
    
    val namedExpression: InternalNamedExpression = js.native
    
    val scope: js.UndefOr[Double] = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "RemoveRowsUndoEntry")
  @js.native
  open class RemoveRowsUndoEntry protected () extends BaseUndoEntry {
    def this(command: RemoveRowsCommand, rowsRemovals: js.Array[RowsRemoval]) = this()
    
    val command: RemoveRowsCommand = js.native
    
    val rowsRemovals: js.Array[RowsRemoval] = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "RemoveSheetUndoEntry")
  @js.native
  open class RemoveSheetUndoEntry protected () extends BaseUndoEntry {
    def this(
      sheetName: String,
      sheetId: Double,
      oldSheetContent: js.Array[js.Array[ClipboardCell]],
      scopedNamedExpressions: js.Array[js.Tuple2[InternalNamedExpression, ClipboardCell]],
      version: Double
    ) = this()
    
    val oldSheetContent: js.Array[js.Array[ClipboardCell]] = js.native
    
    val scopedNamedExpressions: js.Array[js.Tuple2[InternalNamedExpression, ClipboardCell]] = js.native
    
    val sheetId: Double = js.native
    
    val sheetName: String = js.native
    
    val version: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "RenameSheetUndoEntry")
  @js.native
  open class RenameSheetUndoEntry protected () extends BaseUndoEntry {
    def this(sheetId: Double, oldName: String, newName: String) = this()
    
    val newName: String = js.native
    
    val oldName: String = js.native
    
    val sheetId: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "SetCellContentsUndoEntry")
  @js.native
  open class SetCellContentsUndoEntry protected () extends BaseUndoEntry {
    def this(cellContents: js.Array[Address]) = this()
    
    val cellContents: js.Array[Address] = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "SetColumnOrderUndoEntry")
  @js.native
  open class SetColumnOrderUndoEntry protected () extends BaseUndoEntry {
    def this(
      sheetId: Double,
      columnMapping: js.Array[js.Tuple2[Double, Double]],
      oldContent: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]]
    ) = this()
    
    val columnMapping: js.Array[js.Tuple2[Double, Double]] = js.native
    
    val oldContent: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    val sheetId: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "SetRowOrderUndoEntry")
  @js.native
  open class SetRowOrderUndoEntry protected () extends BaseUndoEntry {
    def this(
      sheetId: Double,
      rowMapping: js.Array[js.Tuple2[Double, Double]],
      oldContent: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]]
    ) = this()
    
    val oldContent: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    val rowMapping: js.Array[js.Tuple2[Double, Double]] = js.native
    
    val sheetId: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "SetSheetContentUndoEntry")
  @js.native
  open class SetSheetContentUndoEntry protected () extends BaseUndoEntry {
    def this(
      sheetId: Double,
      oldSheetContent: js.Array[js.Array[ClipboardCell]],
      newSheetContent: js.Array[js.Array[RawCellContent]]
    ) = this()
    
    val newSheetContent: js.Array[js.Array[RawCellContent]] = js.native
    
    val oldSheetContent: js.Array[js.Array[ClipboardCell]] = js.native
    
    val sheetId: Double = js.native
  }
  
  @JSImport("hyperformula/typings/UndoRedo", "UndoRedo")
  @js.native
  open class UndoRedo protected () extends StObject {
    def this(config: Config, operations: Operations) = this()
    
    /* private */ var addUndoEntry: Any = js.native
    
    /* private */ var batchUndoEntry: Any = js.native
    
    def beginBatchMode(): Unit = js.native
    
    def clearRedoStack(): Unit = js.native
    
    def clearUndoStack(): Unit = js.native
    
    def commitBatchMode(): Unit = js.native
    
    def isRedoStackEmpty(): Boolean = js.native
    
    def isUndoStackEmpty(): Boolean = js.native
    
    var oldData: Map[Double, js.Array[js.Tuple2[SimpleCellAddress_, String]]] = js.native
    
    /* private */ val operations: Any = js.native
    
    def redo(): Unit = js.native
    
    def redoAddColumns(operation: AddColumnsUndoEntry): Unit = js.native
    
    def redoAddNamedExpression(operation: AddNamedExpressionUndoEntry): Unit = js.native
    
    def redoAddRows(operation: AddRowsUndoEntry): Unit = js.native
    
    def redoAddSheet(operation: AddSheetUndoEntry): Unit = js.native
    
    def redoBatch(batchOperation: BatchUndoEntry): Unit = js.native
    
    def redoChangeNamedExpression(operation: ChangeNamedExpressionUndoEntry): Unit = js.native
    
    def redoClearSheet(operation: ClearSheetUndoEntry): Unit = js.native
    
    /* private */ var redoEntry: Any = js.native
    
    def redoMoveCells(operation: MoveCellsUndoEntry): Unit = js.native
    
    def redoMoveColumns(operation: MoveColumnsUndoEntry): Unit = js.native
    
    def redoMoveRows(operation: MoveRowsUndoEntry): Unit = js.native
    
    def redoPaste(operation: PasteUndoEntry): Unit = js.native
    
    def redoRemoveColumns(operation: RemoveColumnsUndoEntry): Unit = js.native
    
    def redoRemoveNamedExpression(operation: RemoveNamedExpressionUndoEntry): Unit = js.native
    
    def redoRemoveRows(operation: RemoveRowsUndoEntry): Unit = js.native
    
    def redoRemoveSheet(operation: RemoveSheetUndoEntry): Unit = js.native
    
    def redoRenameSheet(operation: RenameSheetUndoEntry): Unit = js.native
    
    def redoSetCellContents(operation: SetCellContentsUndoEntry): Unit = js.native
    
    def redoSetColumnOrder(operation: SetColumnOrderUndoEntry): Unit = js.native
    
    def redoSetRowOrder(operation: SetRowOrderUndoEntry): Unit = js.native
    
    def redoSetSheetContent(operation: SetSheetContentUndoEntry): Unit = js.native
    
    /* private */ var redoStack: Any = js.native
    
    /* private */ var restoreOldDataFromVersion: Any = js.native
    
    /* private */ var restoreOperationOldContent: Any = js.native
    
    def saveOperation(operation: UndoEntry): Unit = js.native
    
    def storeDataForVersion(version: Double, address: SimpleCellAddress_, astHash: String): Unit = js.native
    
    def undo(): Unit = js.native
    
    def undoAddColumns(operation: AddColumnsUndoEntry): Unit = js.native
    
    def undoAddNamedExpression(operation: AddNamedExpressionUndoEntry): Unit = js.native
    
    def undoAddRows(operation: AddRowsUndoEntry): Unit = js.native
    
    def undoAddSheet(operation: AddSheetUndoEntry): Unit = js.native
    
    def undoBatch(batchOperation: BatchUndoEntry): Unit = js.native
    
    def undoChangeNamedExpression(operation: ChangeNamedExpressionUndoEntry): Unit = js.native
    
    def undoClearSheet(operation: ClearSheetUndoEntry): Unit = js.native
    
    /* private */ var undoEntry: Any = js.native
    
    /* private */ val undoLimit: Any = js.native
    
    def undoMoveCells(operation: MoveCellsUndoEntry): Unit = js.native
    
    def undoMoveColumns(operation: MoveColumnsUndoEntry): Unit = js.native
    
    def undoMoveRows(operation: MoveRowsUndoEntry): Unit = js.native
    
    def undoPaste(operation: PasteUndoEntry): Unit = js.native
    
    def undoRemoveColumns(operation: RemoveColumnsUndoEntry): Unit = js.native
    
    def undoRemoveNamedExpression(operation: RemoveNamedExpressionUndoEntry): Unit = js.native
    
    def undoRemoveRows(operation: RemoveRowsUndoEntry): Unit = js.native
    
    def undoRemoveSheet(operation: RemoveSheetUndoEntry): Unit = js.native
    
    def undoRenameSheet(operation: RenameSheetUndoEntry): Unit = js.native
    
    def undoSetCellContents(operation: SetCellContentsUndoEntry): Unit = js.native
    
    def undoSetColumnOrder(operation: SetColumnOrderUndoEntry): Unit = js.native
    
    def undoSetRowOrder(operation: SetRowOrderUndoEntry): Unit = js.native
    
    def undoSetSheetContent(operation: SetSheetContentUndoEntry): Unit = js.native
    
    /* private */ var undoStack: Any = js.native
  }
  
  trait UndoEntry extends StObject {
    
    def doRedo(undoRedo: UndoRedo): Unit
    
    def doUndo(undoRedo: UndoRedo): Unit
  }
  object UndoEntry {
    
    inline def apply(doRedo: UndoRedo => Unit, doUndo: UndoRedo => Unit): UndoEntry = {
      val __obj = js.Dynamic.literal(doRedo = js.Any.fromFunction1(doRedo), doUndo = js.Any.fromFunction1(doUndo))
      __obj.asInstanceOf[UndoEntry]
    }
    
    extension [Self <: UndoEntry](x: Self) {
      
      inline def setDoRedo(value: UndoRedo => Unit): Self = StObject.set(x, "doRedo", js.Any.fromFunction1(value))
      
      inline def setDoUndo(value: UndoRedo => Unit): Self = StObject.set(x, "doUndo", js.Any.fromFunction1(value))
    }
  }
}
