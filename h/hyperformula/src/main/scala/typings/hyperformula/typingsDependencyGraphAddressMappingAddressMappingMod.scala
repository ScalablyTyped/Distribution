package typings.hyperformula

import typings.hyperformula.typingsCellContentParserMod.RawCellContent
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsDependencyGraphAddressMappingChooseAddressMappingPolicyMod.ChooseAddressMapping
import typings.hyperformula.typingsDependencyGraphAddressMappingIaddressmappingstrategyMod.IAddressMappingStrategy
import typings.hyperformula.typingsDependencyGraphVertexMod.CellVertex
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsSheetMod.Sheet
import typings.hyperformula.typingsSheetMod.SheetBoundaries
import typings.hyperformula.typingsSpanMod.ColumnsSpan
import typings.hyperformula.typingsSpanMod.RowsSpan
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphAddressMappingAddressMappingMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/AddressMapping/AddressMapping", "AddressMapping")
  @js.native
  open class AddressMapping protected () extends StObject {
    def this(policy: ChooseAddressMapping) = this()
    
    def addColumns(sheet: Double, column: Double, numberOfColumns: Double): Unit = js.native
    
    def addRows(sheet: Double, row: Double, numberOfRows: Double): Unit = js.native
    
    def addSheet(sheetId: Double, strategy: IAddressMappingStrategy): Unit = js.native
    
    def autoAddSheet(sheetId: Double, sheet: Sheet, sheetBoundaries: SheetBoundaries): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[SimpleCellAddress_, Maybe[CellVertex]]] = js.native
    
    def entriesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    def entriesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    def fetchCell(address: SimpleCellAddress_): CellVertex = js.native
    
    /** @inheritDoc */
    def getCell(address: SimpleCellAddress_): Maybe[CellVertex] = js.native
    
    def getCellValue(address: SimpleCellAddress_): InterpreterValue = js.native
    
    /** @inheritDoc */
    def getHeight(sheetId: Double): Double = js.native
    
    def getRawValue(address: SimpleCellAddress_): RawCellContent = js.native
    
    /** @inheritDoc */
    def getWidth(sheetId: Double): Double = js.native
    
    /** @inheritDoc */
    def has(address: SimpleCellAddress_): Boolean = js.native
    
    /* private */ var mapping: Any = js.native
    
    def moveCell(source: SimpleCellAddress_, destination: SimpleCellAddress_): Unit = js.native
    
    /* private */ val policy: Any = js.native
    
    def removeCell(address: SimpleCellAddress_): Unit = js.native
    
    def removeColumns(removedColumns: ColumnsSpan): Unit = js.native
    
    def removeRows(removedRows: RowsSpan): Unit = js.native
    
    def removeSheet(sheetId: Double): Unit = js.native
    
    /** @inheritDoc */
    def setCell(address: SimpleCellAddress_, newVertex: CellVertex): Unit = js.native
    
    def sheetEntries(sheet: Double): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    def strategyFor(sheetId: Double): IAddressMappingStrategy = js.native
    
    def verticesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[CellVertex] = js.native
    
    def verticesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[CellVertex] = js.native
  }
}
