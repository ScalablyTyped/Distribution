package typings.hyperformula

import typings.hyperformula.cellMod.SheetCellAddress
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.iaddressmappingstrategyMod.IAddressMappingStrategy
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.spanMod.ColumnsSpan
import typings.hyperformula.spanMod.RowsSpan
import typings.hyperformula.vertexMod.CellVertex
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sparseStrategyMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/AddressMapping/SparseStrategy", "SparseStrategy")
  @js.native
  open class SparseStrategy protected ()
    extends StObject
       with IAddressMappingStrategy {
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    override def addColumns(column: Double, numberOfColumns: Double): Unit = js.native
    
    /* CompleteClass */
    override def addRows(row: Double, numberOfRows: Double): Unit = js.native
    
    /* CompleteClass */
    override def entriesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    /* CompleteClass */
    override def entriesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    /**
      * Returns cell content
      *
      * @param address - cell address
      */
    /* CompleteClass */
    override def getCell(address: SheetCellAddress): Maybe[CellVertex] = js.native
    
    /* CompleteClass */
    override def getEntries(sheet: Double): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    /**
      * Returns height of stored sheet
      */
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /**
      * Returns width of stored sheet
      */
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /**
      * Returns whether the address is present or not
      *
      * @param address - address
      */
    /* CompleteClass */
    override def has(address: SheetCellAddress): Boolean = js.native
    
    /* private */ var height: Any = js.native
    
    /**
      * Map of Maps in which actual data is stored.
      *
      * Key of map in first level is column number.
      * Key of map in second level is row number.
      */
    /* private */ var mapping: Any = js.native
    
    /* CompleteClass */
    override def removeCell(address: SimpleCellAddress_): Unit = js.native
    
    /* CompleteClass */
    override def removeColumns(removedColumns: ColumnsSpan): Unit = js.native
    
    /* CompleteClass */
    override def removeRows(removedRows: RowsSpan): Unit = js.native
    
    /**
      * Set vertex for given address
      *
      * @param address - cell address
      * @param newVertex - vertex to associate with address
      */
    /* CompleteClass */
    override def setCell(address: SheetCellAddress, newVertex: CellVertex): Unit = js.native
    
    /* CompleteClass */
    override def vertices(): IterableIterator[CellVertex] = js.native
    
    /* CompleteClass */
    override def verticesFromColumn(column: Double): IterableIterator[CellVertex] = js.native
    
    /* CompleteClass */
    override def verticesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[CellVertex] = js.native
    
    /* CompleteClass */
    override def verticesFromRow(row: Double): IterableIterator[CellVertex] = js.native
    
    /* CompleteClass */
    override def verticesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[CellVertex] = js.native
    
    /* private */ var width: Any = js.native
  }
}
