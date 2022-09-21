package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.cellContentParserMod.CellContentParser
import typings.hyperformula.cellContentParserMod.RawCellContent
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.clipboardOperationsMod.ClipboardOperations
import typings.hyperformula.configMod.Config
import typings.hyperformula.contentChangesMod.ContentChanges
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.hyperformulaStrings.column
import typings.hyperformula.hyperformulaStrings.row
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.namedExpressionsMod.InternalNamedExpression
import typings.hyperformula.namedExpressionsMod.NamedExpressionOptions
import typings.hyperformula.namedExpressionsMod.NamedExpressions
import typings.hyperformula.operationsMod.Operations
import typings.hyperformula.searchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.undoRedoMod.UndoRedo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crudOperationsMod {
  
  @JSImport("hyperformula/typings/CrudOperations", "CrudOperations")
  @js.native
  open class CrudOperations protected () extends StObject {
    def this(
      config: Config,
      operations: Operations,
      undoRedo: UndoRedo,
      clipboardOperations: ClipboardOperations,
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy,
      parser: ParserWithCaching,
      cellContentParser: CellContentParser,
      lazilyTransformingAstService: LazilyTransformingAstService,
      namedExpressions: NamedExpressions
    ) = this()
    
    def addColumns(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def addNamedExpression(expressionName: String, expression: RawCellContent): Unit = js.native
    def addNamedExpression(expressionName: String, expression: RawCellContent, sheetId: Double): Unit = js.native
    def addNamedExpression(
      expressionName: String,
      expression: RawCellContent,
      sheetId: Double,
      options: NamedExpressionOptions
    ): Unit = js.native
    def addNamedExpression(expressionName: String, expression: RawCellContent, sheetId: Unit, options: NamedExpressionOptions): Unit = js.native
    
    def addRows(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def addSheet(): String = js.native
    def addSheet(name: String): String = js.native
    
    def beginUndoRedoBatchMode(): Unit = js.native
    
    /* private */ val cellContentParser: Any = js.native
    
    def changeNamedExpressionExpression(expressionName: String, sheetId: Double, newExpression: RawCellContent): Unit = js.native
    def changeNamedExpressionExpression(
      expressionName: String,
      sheetId: Double,
      newExpression: RawCellContent,
      options: NamedExpressionOptions
    ): Unit = js.native
    def changeNamedExpressionExpression(expressionName: String, sheetId: Unit, newExpression: RawCellContent): Unit = js.native
    def changeNamedExpressionExpression(
      expressionName: String,
      sheetId: Unit,
      newExpression: RawCellContent,
      options: NamedExpressionOptions
    ): Unit = js.native
    
    def clearClipboard(): Unit = js.native
    
    def clearSheet(sheetId: Double): Unit = js.native
    
    /* private */ val clipboardOperations: Any = js.native
    
    /* private */ val columnSearch: Any = js.native
    
    def commitUndoRedoBatchMode(): Unit = js.native
    
    def copy(sourceLeftCorner: SimpleCellAddress_, width: Double, height: Double): Unit = js.native
    
    def cut(sourceLeftCorner: SimpleCellAddress_, width: Double, height: Double): Unit = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    def ensureItIsPossibleToAddColumns(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def ensureItIsPossibleToAddNamedExpression(expressionName: String, expression: RawCellContent): Unit = js.native
    def ensureItIsPossibleToAddNamedExpression(expressionName: String, expression: RawCellContent, sheetId: Double): Unit = js.native
    
    def ensureItIsPossibleToAddRows(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def ensureItIsPossibleToAddSheet(name: String): Unit = js.native
    
    def ensureItIsPossibleToChangeCellContents(inputAddress: SimpleCellAddress_, content: js.Array[js.Array[RawCellContent]]): Unit = js.native
    
    def ensureItIsPossibleToChangeContent(address: SimpleCellAddress_): Unit = js.native
    
    def ensureItIsPossibleToChangeNamedExpression(expressionName: String, expression: RawCellContent): Unit = js.native
    def ensureItIsPossibleToChangeNamedExpression(expressionName: String, expression: RawCellContent, sheetId: Double): Unit = js.native
    
    def ensureItIsPossibleToChangeSheetContents(sheetId: Double, content: js.Array[js.Array[RawCellContent]]): Unit = js.native
    
    def ensureItIsPossibleToCopy(sourceLeftCorner: SimpleCellAddress_, width: Double, height: Double): Unit = js.native
    
    def ensureItIsPossibleToMoveColumns(sheet: Double, startColumn: Double, numberOfColumns: Double, targetColumn: Double): Unit = js.native
    
    def ensureItIsPossibleToMoveRows(sheet: Double, startRow: Double, numberOfRows: Double, targetRow: Double): Unit = js.native
    
    def ensureItIsPossibleToRemoveColumns(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def ensureItIsPossibleToRemoveRows(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def ensureItIsPossibleToRenameSheet(sheetId: Double, name: String): Unit = js.native
    
    /* private */ var ensureNamedExpressionIsValid: Any = js.native
    
    /* private */ var ensureNamedExpressionNameIsValid: Any = js.native
    
    def ensureRangeInSizeLimits(range: AbsoluteCellRange): Unit = js.native
    
    def ensureScopeIdIsValid(): Unit = js.native
    def ensureScopeIdIsValid(scopeId: Double): Unit = js.native
    
    def getAndClearContentChanges(): ContentChanges = js.native
    
    def isClipboardEmpty(): Boolean = js.native
    
    def isItPossibleToRemoveNamedExpression(expressionName: String): Unit = js.native
    def isItPossibleToRemoveNamedExpression(expressionName: String, sheetId: Double): Unit = js.native
    
    def isThereSomethingToRedo(): Boolean = js.native
    
    def isThereSomethingToUndo(): Boolean = js.native
    
    /* private */ val lazilyTransformingAstService: Any = js.native
    
    def mappingFromOrder(sheetId: Double, newOrder: js.Array[Double], rowOrColumn: row | column): js.Array[js.Tuple2[Double, Double]] = js.native
    
    /* private */ val maxColumns: Any = js.native
    
    /* private */ val maxRows: Any = js.native
    
    def moveCells(
      sourceLeftCorner: SimpleCellAddress_,
      width: Double,
      height: Double,
      destinationLeftCorner: SimpleCellAddress_
    ): Unit = js.native
    
    def moveColumns(sheet: Double, startColumn: Double, numberOfColumns: Double, targetColumn: Double): Unit = js.native
    
    def moveRows(sheet: Double, startRow: Double, numberOfRows: Double, targetRow: Double): Unit = js.native
    
    /* private */ val namedExpressions: Any = js.native
    
    val operations: Operations = js.native
    
    /* private */ val parser: Any = js.native
    
    def paste(targetLeftCorner: SimpleCellAddress_): Unit = js.native
    
    def redo(): Unit = js.native
    
    def removeColumns(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def removeNamedExpression(expressionName: String): InternalNamedExpression = js.native
    def removeNamedExpression(expressionName: String, sheetId: Double): InternalNamedExpression = js.native
    
    def removeRows(sheet: Double, indexes: ColumnRowIndex*): Unit = js.native
    
    def removeSheet(sheetId: Double): Unit = js.native
    
    def renameSheet(sheetId: Double, newName: String): Maybe[String] = js.native
    
    def setCellContents(topLeftCornerAddress: SimpleCellAddress_, cellContents: js.Array[js.Array[RawCellContent]]): Unit = js.native
    def setCellContents(topLeftCornerAddress: SimpleCellAddress_, cellContents: RawCellContent): Unit = js.native
    
    def setColumnOrder(sheetId: Double, columnMapping: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    
    def setRowOrder(sheetId: Double, rowMapping: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    
    def setSheetContent(sheetId: Double, values: js.Array[js.Array[RawCellContent]]): Unit = js.native
    
    /* private */ def sheetMapping: Any = js.native
    
    def testColumnOrderForArrays(sheetId: Double, columnMapping: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    
    def testRowOrderForArrays(sheetId: Double, rowMapping: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    
    def undo(): Unit = js.native
    
    val undoRedo: UndoRedo = js.native
    
    /* private */ var validateRowOrColumnMapping: Any = js.native
    
    def validateSwapColumnIndexes(sheetId: Double, columnMapping: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
    
    def validateSwapRowIndexes(sheetId: Double, rowMapping: js.Array[js.Tuple2[Double, Double]]): Unit = js.native
  }
  
  type ColumnRowIndex = js.Tuple2[Double, Double]
}
