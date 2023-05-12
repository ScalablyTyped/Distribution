package typings.hyperformula

import typings.hyperformula.anon.ScopedNamedExpressions
import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsArraySizeMod.ArraySize
import typings.hyperformula.typingsArraySizeMod.ArraySizePredictor
import typings.hyperformula.typingsCellContentParserMod.CellContentParser
import typings.hyperformula.typingsCellContentParserMod.RawCellContent
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsClipboardOperationsMod.ClipboardCell
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsContentChangesMod.ContentChanges
import typings.hyperformula.typingsCrudOperationsMod.ColumnRowIndex
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsDependencyGraphValueCellVertexMod.RawAndParsedValue
import typings.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsNamedExpressionsMod.InternalNamedExpression
import typings.hyperformula.typingsNamedExpressionsMod.NamedExpressionOptions
import typings.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typings.hyperformula.typingsParserAstMod.ParsingError_
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.typingsParserParserWithCachingMod.ParsingResult
import typings.hyperformula.typingsSpanMod.ColumnsSpan
import typings.hyperformula.typingsSpanMod.RowsSpan
import typings.hyperformula.typingsStatisticsMod.Statistics
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsOperationsMod {
  
  @JSImport("hyperformula/typings/Operations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/Operations", "AddColumnsCommand")
  @js.native
  open class AddColumnsCommand protected () extends StObject {
    def this(sheet: Double, indexes: js.Array[ColumnRowIndex]) = this()
    
    def columnsSpans(): js.Array[ColumnsSpan] = js.native
    
    val indexes: js.Array[ColumnRowIndex] = js.native
    
    def normalizedIndexes(): js.Array[ColumnRowIndex] = js.native
    
    val sheet: Double = js.native
  }
  
  @JSImport("hyperformula/typings/Operations", "AddRowsCommand")
  @js.native
  open class AddRowsCommand protected () extends StObject {
    def this(sheet: Double, indexes: js.Array[ColumnRowIndex]) = this()
    
    val indexes: js.Array[ColumnRowIndex] = js.native
    
    def normalizedIndexes(): js.Array[ColumnRowIndex] = js.native
    
    def rowsSpans(): js.Array[RowsSpan] = js.native
    
    val sheet: Double = js.native
  }
  
  @JSImport("hyperformula/typings/Operations", "Operations")
  @js.native
  open class Operations protected () extends StObject {
    def this(
      config: Config,
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy,
      cellContentParser: CellContentParser,
      parser: ParserWithCaching,
      stats: Statistics,
      lazilyTransformingAstService: LazilyTransformingAstService,
      namedExpressions: NamedExpressions,
      arraySizePredictor: ArraySizePredictor
    ) = this()
    
    def addColumns(cmd: AddColumnsCommand): Unit = js.native
    
    def addNamedExpression(expressionName: String, expression: RawCellContent): Unit = js.native
    def addNamedExpression(expressionName: String, expression: RawCellContent, sheetId: Double): Unit = js.native
    def addNamedExpression(
      expressionName: String,
      expression: RawCellContent,
      sheetId: Double,
      options: NamedExpressionOptions
    ): Unit = js.native
    def addNamedExpression(expressionName: String, expression: RawCellContent, sheetId: Unit, options: NamedExpressionOptions): Unit = js.native
    
    def addRows(cmd: AddRowsCommand): Unit = js.native
    
    def addSheet(): String = js.native
    def addSheet(name: String): String = js.native
    
    /* private */ def addressMapping: Any = js.native
    
    /* private */ var adjustNamedExpressionEdges: Any = js.native
    
    /* private */ var allocateNamedExpressionAddressSpace: Any = js.native
    
    /* private */ val arraySizePredictor: Any = js.native
    
    /* private */ val cellContentParser: Any = js.native
    
    def changeNamedExpressionExpression(expressionName: String, newExpression: RawCellContent): js.Tuple2[InternalNamedExpression, ClipboardCell] = js.native
    def changeNamedExpressionExpression(expressionName: String, newExpression: RawCellContent, sheetId: Double): js.Tuple2[InternalNamedExpression, ClipboardCell] = js.native
    def changeNamedExpressionExpression(
      expressionName: String,
      newExpression: RawCellContent,
      sheetId: Double,
      options: NamedExpressionOptions
    ): js.Tuple2[InternalNamedExpression, ClipboardCell] = js.native
    def changeNamedExpressionExpression(
      expressionName: String,
      newExpression: RawCellContent,
      sheetId: Unit,
      options: NamedExpressionOptions
    ): js.Tuple2[InternalNamedExpression, ClipboardCell] = js.native
    
    /* private */ var changes: Any = js.native
    
    def clearSheet(sheetId: Double): Unit = js.native
    
    /**
      * Returns true if row number is outside of given sheet.
      *
      * @param column - row number
      * @param sheet - sheet id number
      */
    /* private */ var columnEffectivelyNotInSheet: Any = js.native
    
    /* private */ val columnSearch: Any = js.native
    
    /* private */ var copyOrFetchGlobalNamedExpressionVertex: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /**
      * Add multiple columns to sheet </br>
      * Does nothing if columns are outside of effective sheet size
      *
      * @param sheet - sheet id in which columns will be added
      * @param column - column number above which the columns will be added
      * @param numberOfColumns - number of columns to add
      */
    /* private */ var doAddColumns: Any = js.native
    
    /**
      * Add multiple rows to sheet. </br>
      * Does nothing if rows are outside of effective sheet size.
      *
      * @param sheet - sheet id in which rows will be added
      * @param row - row number above which the rows will be added
      * @param numberOfRowsToAdd - number of rows to add
      */
    /* private */ var doAddRows: Any = js.native
    
    /**
      * Removes multiple columns from sheet. </br>
      * Does nothing if columns are outside of effective sheet size.
      *
      * @param sheet - sheet id from which columns will be removed
      * @param columnStart - number of the first column to be deleted
      * @param columnEnd - number of the last row to be deleted
      */
    /* private */ var doRemoveColumns: Any = js.native
    
    /**
      * Removes multiple rows from sheet. </br>
      * Does nothing if rows are outside of effective sheet size.
      *
      * @param sheet - sheet id from which rows will be removed
      * @param rowStart - number of the first row to be deleted
      * @param rowEnd - number of the last row to be deleted
      */
    /* private */ var doRemoveRows: Any = js.native
    
    def ensureItIsPossibleToMoveCells(
      sourceLeftCorner: SimpleCellAddress_,
      width: Double,
      height: Double,
      destinationLeftCorner: SimpleCellAddress_
    ): Unit = js.native
    
    def forceApplyPostponedTransformations(): Unit = js.native
    
    def getAndClearContentChanges(): ContentChanges = js.native
    
    def getClipboardCell(address: SimpleCellAddress_): ClipboardCell = js.native
    
    def getOldContent(address: SimpleCellAddress_): js.Tuple2[SimpleCellAddress_, ClipboardCell] = js.native
    
    def getRangeClipboardCells(range: AbsoluteCellRange): js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    def getSheetClipboardCells(sheet: Double): js.Array[js.Array[ClipboardCell]] = js.native
    
    /* private */ val lazilyTransformingAstService: Any = js.native
    
    /* private */ var maxColumns: Any = js.native
    
    /* private */ var maxRows: Any = js.native
    
    def moveCells(
      sourceLeftCorner: SimpleCellAddress_,
      width: Double,
      height: Double,
      destinationLeftCorner: SimpleCellAddress_
    ): MoveCellsResult = js.native
    
    def moveColumns(sheet: Double, startColumn: Double, numberOfColumns: Double, targetColumn: Double): Double = js.native
    
    def moveRows(sheet: Double, startRow: Double, numberOfRows: Double, targetRow: Double): Double = js.native
    
    /* private */ val namedExpressions: Any = js.native
    
    /* private */ val parser: Any = js.native
    
    def removeColumns(cmd: RemoveColumnsCommand): js.Array[ColumnsRemoval] = js.native
    
    def removeNamedExpression(expressionName: String): js.Tuple2[InternalNamedExpression, ClipboardCell] = js.native
    def removeNamedExpression(expressionName: String, sheetId: Double): js.Tuple2[InternalNamedExpression, ClipboardCell] = js.native
    
    def removeRows(cmd: RemoveRowsCommand): js.Array[RowsRemoval] = js.native
    
    def removeSheet(sheetId: Double): ScopedNamedExpressions = js.native
    
    def removeSheetByName(sheetName: String): ScopedNamedExpressions = js.native
    
    def renameSheet(sheetId: Double, newName: String): js.UndefOr[String] = js.native
    
    def restoreCell(address: SimpleCellAddress_, clipboardCell: ClipboardCell): Unit = js.native
    
    def restoreClipboardCells(sourceSheetId: Double, cells: IterableIterator[js.Tuple2[SimpleCellAddress_, ClipboardCell]]): js.Array[String] = js.native
    
    def restoreNamedExpression(namedExpression: InternalNamedExpression, content: ClipboardCell): Unit = js.native
    def restoreNamedExpression(namedExpression: InternalNamedExpression, content: ClipboardCell, sheetId: Double): Unit = js.native
    
    /* private */ var rewriteAffectedArrays: Any = js.native
    
    /**
      * Returns true if row number is outside of given sheet.
      *
      * @param row - row number
      * @param sheet - sheet id number
      */
    def rowEffectivelyNotInSheet(row: Double, sheet: Double): Boolean = js.native
    
    def setCellContent(address: SimpleCellAddress_, newCellContent: RawCellContent): js.Tuple2[SimpleCellAddress_, ClipboardCell] = js.native
    
    def setCellEmpty(address: SimpleCellAddress_): Unit = js.native
    
    def setColumnOrder(sheetId: Double, columnMapping: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    def setFormulaToCell(address: SimpleCellAddress_, size: ArraySize, param2: ParsingResult): Unit = js.native
    
    def setFormulaToCellFromCache(formulaHash: String, address: SimpleCellAddress_): Unit = js.native
    
    def setParsingErrorToCell(rawInput: String, errors: js.Array[ParsingError_], address: SimpleCellAddress_): Unit = js.native
    
    def setRowOrder(sheetId: Double, rowMapping: js.Array[js.Tuple2[Double, Double]]): js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]] = js.native
    
    def setSheetContent(sheetId: Double, newSheetContent: js.Array[js.Array[RawCellContent]]): Unit = js.native
    
    def setValueToCell(value: RawAndParsedValue, address: SimpleCellAddress_): Unit = js.native
    
    /* private */ def sheetMapping: Any = js.native
    
    /* private */ val stats: Any = js.native
    
    /* private */ var storeNamedExpressionInCell: Any = js.native
    
    /* private */ var updateNamedExpressionsForMovedCells: Any = js.native
    
    /* private */ var updateNamedExpressionsForTargetAddress: Any = js.native
  }
  
  @JSImport("hyperformula/typings/Operations", "RemoveColumnsCommand")
  @js.native
  open class RemoveColumnsCommand protected () extends StObject {
    def this(sheet: Double, indexes: js.Array[ColumnRowIndex]) = this()
    
    def columnsSpans(): js.Array[ColumnsSpan] = js.native
    
    val indexes: js.Array[ColumnRowIndex] = js.native
    
    def normalizedIndexes(): js.Array[ColumnRowIndex] = js.native
    
    val sheet: Double = js.native
  }
  
  @JSImport("hyperformula/typings/Operations", "RemoveRowsCommand")
  @js.native
  open class RemoveRowsCommand protected () extends StObject {
    def this(sheet: Double, indexes: js.Array[ColumnRowIndex]) = this()
    
    val indexes: js.Array[ColumnRowIndex] = js.native
    
    def normalizedIndexes(): js.Array[ColumnRowIndex] = js.native
    
    def rowsSpans(): js.Array[RowsSpan] = js.native
    
    val sheet: Double = js.native
  }
  
  inline def normalizeAddedIndexes(indexes: js.Array[ColumnRowIndex]): js.Array[ColumnRowIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAddedIndexes")(indexes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ColumnRowIndex]]
  
  inline def normalizeRemovedIndexes(indexes: js.Array[ColumnRowIndex]): js.Array[ColumnRowIndex] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRemovedIndexes")(indexes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ColumnRowIndex]]
  
  trait ChangedCell extends StObject {
    
    var address: SimpleCellAddress_
    
    var cellType: ClipboardCell
  }
  object ChangedCell {
    
    inline def apply(address: SimpleCellAddress_, cellType: ClipboardCell): ChangedCell = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], cellType = cellType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangedCell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangedCell] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: SimpleCellAddress_): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCellType(value: ClipboardCell): Self = StObject.set(x, "cellType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnsRemoval extends StObject {
    
    var columnCount: Double
    
    var columnFrom: Double
    
    var removedCells: js.Array[ChangedCell]
    
    var version: Double
  }
  object ColumnsRemoval {
    
    inline def apply(columnCount: Double, columnFrom: Double, removedCells: js.Array[ChangedCell], version: Double): ColumnsRemoval = {
      val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], columnFrom = columnFrom.asInstanceOf[js.Any], removedCells = removedCells.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnsRemoval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnsRemoval] (val x: Self) extends AnyVal {
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnFrom(value: Double): Self = StObject.set(x, "columnFrom", value.asInstanceOf[js.Any])
      
      inline def setRemovedCells(value: js.Array[ChangedCell]): Self = StObject.set(x, "removedCells", value.asInstanceOf[js.Any])
      
      inline def setRemovedCellsVarargs(value: ChangedCell*): Self = StObject.set(x, "removedCells", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait MoveCellsResult extends StObject {
    
    var addedGlobalNamedExpressions: js.Array[String]
    
    var overwrittenCellsData: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]]
    
    var version: Double
  }
  object MoveCellsResult {
    
    inline def apply(
      addedGlobalNamedExpressions: js.Array[String],
      overwrittenCellsData: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]],
      version: Double
    ): MoveCellsResult = {
      val __obj = js.Dynamic.literal(addedGlobalNamedExpressions = addedGlobalNamedExpressions.asInstanceOf[js.Any], overwrittenCellsData = overwrittenCellsData.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveCellsResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveCellsResult] (val x: Self) extends AnyVal {
      
      inline def setAddedGlobalNamedExpressions(value: js.Array[String]): Self = StObject.set(x, "addedGlobalNamedExpressions", value.asInstanceOf[js.Any])
      
      inline def setAddedGlobalNamedExpressionsVarargs(value: String*): Self = StObject.set(x, "addedGlobalNamedExpressions", js.Array(value*))
      
      inline def setOverwrittenCellsData(value: js.Array[js.Tuple2[SimpleCellAddress_, ClipboardCell]]): Self = StObject.set(x, "overwrittenCellsData", value.asInstanceOf[js.Any])
      
      inline def setOverwrittenCellsDataVarargs(value: (js.Tuple2[SimpleCellAddress_, ClipboardCell])*): Self = StObject.set(x, "overwrittenCellsData", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowsRemoval extends StObject {
    
    var removedCells: js.Array[ChangedCell]
    
    var rowCount: Double
    
    var rowFrom: Double
    
    var version: Double
  }
  object RowsRemoval {
    
    inline def apply(removedCells: js.Array[ChangedCell], rowCount: Double, rowFrom: Double, version: Double): RowsRemoval = {
      val __obj = js.Dynamic.literal(removedCells = removedCells.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowFrom = rowFrom.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowsRemoval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowsRemoval] (val x: Self) extends AnyVal {
      
      inline def setRemovedCells(value: js.Array[ChangedCell]): Self = StObject.set(x, "removedCells", value.asInstanceOf[js.Any])
      
      inline def setRemovedCellsVarargs(value: ChangedCell*): Self = StObject.set(x, "removedCells", js.Array(value*))
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowFrom(value: Double): Self = StObject.set(x, "rowFrom", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
