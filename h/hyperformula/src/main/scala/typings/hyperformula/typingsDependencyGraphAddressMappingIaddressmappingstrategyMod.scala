package typings.hyperformula

import org.scalablytyped.runtime.Instantiable2
import typings.hyperformula.typingsCellMod.SheetCellAddress
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsDependencyGraphVertexMod.CellVertex
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsSpanMod.ColumnsSpan
import typings.hyperformula.typingsSpanMod.RowsSpan
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphAddressMappingIaddressmappingstrategyMod {
  
  type AddressMappingStrategyConstructor = Instantiable2[/* width */ Double, /* height */ Double, IAddressMappingStrategy]
  
  trait IAddressMappingStrategy extends StObject {
    
    def addColumns(column: Double, numberOfColumns: Double): Unit
    
    def addRows(row: Double, numberOfRows: Double): Unit
    
    def entriesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]]
    
    def entriesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]]
    
    /**
      * Returns cell content
      *
      * @param address - cell address
      */
    def getCell(address: SheetCellAddress): Maybe[CellVertex]
    
    def getEntries(sheet: Double): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]]
    
    /**
      * Returns height of stored sheet
      */
    def getHeight(): Double
    
    /**
      * Returns width of stored sheet
      */
    def getWidth(): Double
    
    /**
      * Returns whether the address is present or not
      *
      * @param address - address
      */
    def has(address: SheetCellAddress): Boolean
    
    def removeCell(address: SimpleCellAddress_): Unit
    
    def removeColumns(removedColumns: ColumnsSpan): Unit
    
    def removeRows(removedRows: RowsSpan): Unit
    
    /**
      * Set vertex for given address
      *
      * @param address - cell address
      * @param newVertex - vertex to associate with address
      */
    def setCell(address: SheetCellAddress, newVertex: CellVertex): Unit
    
    def vertices(): IterableIterator[CellVertex]
    
    def verticesFromColumn(column: Double): IterableIterator[CellVertex]
    
    def verticesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[CellVertex]
    
    def verticesFromRow(row: Double): IterableIterator[CellVertex]
    
    def verticesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[CellVertex]
  }
  object IAddressMappingStrategy {
    
    inline def apply(
      addColumns: (Double, Double) => Unit,
      addRows: (Double, Double) => Unit,
      entriesFromColumnsSpan: ColumnsSpan => IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]],
      entriesFromRowsSpan: RowsSpan => IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]],
      getCell: SheetCellAddress => Maybe[CellVertex],
      getEntries: Double => IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]],
      getHeight: () => Double,
      getWidth: () => Double,
      has: SheetCellAddress => Boolean,
      removeCell: SimpleCellAddress_ => Unit,
      removeColumns: ColumnsSpan => Unit,
      removeRows: RowsSpan => Unit,
      setCell: (SheetCellAddress, CellVertex) => Unit,
      vertices: () => IterableIterator[CellVertex],
      verticesFromColumn: Double => IterableIterator[CellVertex],
      verticesFromColumnsSpan: ColumnsSpan => IterableIterator[CellVertex],
      verticesFromRow: Double => IterableIterator[CellVertex],
      verticesFromRowsSpan: RowsSpan => IterableIterator[CellVertex]
    ): IAddressMappingStrategy = {
      val __obj = js.Dynamic.literal(addColumns = js.Any.fromFunction2(addColumns), addRows = js.Any.fromFunction2(addRows), entriesFromColumnsSpan = js.Any.fromFunction1(entriesFromColumnsSpan), entriesFromRowsSpan = js.Any.fromFunction1(entriesFromRowsSpan), getCell = js.Any.fromFunction1(getCell), getEntries = js.Any.fromFunction1(getEntries), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), has = js.Any.fromFunction1(has), removeCell = js.Any.fromFunction1(removeCell), removeColumns = js.Any.fromFunction1(removeColumns), removeRows = js.Any.fromFunction1(removeRows), setCell = js.Any.fromFunction2(setCell), vertices = js.Any.fromFunction0(vertices), verticesFromColumn = js.Any.fromFunction1(verticesFromColumn), verticesFromColumnsSpan = js.Any.fromFunction1(verticesFromColumnsSpan), verticesFromRow = js.Any.fromFunction1(verticesFromRow), verticesFromRowsSpan = js.Any.fromFunction1(verticesFromRowsSpan))
      __obj.asInstanceOf[IAddressMappingStrategy]
    }
    
    extension [Self <: IAddressMappingStrategy](x: Self) {
      
      inline def setAddColumns(value: (Double, Double) => Unit): Self = StObject.set(x, "addColumns", js.Any.fromFunction2(value))
      
      inline def setAddRows(value: (Double, Double) => Unit): Self = StObject.set(x, "addRows", js.Any.fromFunction2(value))
      
      inline def setEntriesFromColumnsSpan(value: ColumnsSpan => IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]]): Self = StObject.set(x, "entriesFromColumnsSpan", js.Any.fromFunction1(value))
      
      inline def setEntriesFromRowsSpan(value: RowsSpan => IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]]): Self = StObject.set(x, "entriesFromRowsSpan", js.Any.fromFunction1(value))
      
      inline def setGetCell(value: SheetCellAddress => Maybe[CellVertex]): Self = StObject.set(x, "getCell", js.Any.fromFunction1(value))
      
      inline def setGetEntries(value: Double => IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]]): Self = StObject.set(x, "getEntries", js.Any.fromFunction1(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHas(value: SheetCellAddress => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setRemoveCell(value: SimpleCellAddress_ => Unit): Self = StObject.set(x, "removeCell", js.Any.fromFunction1(value))
      
      inline def setRemoveColumns(value: ColumnsSpan => Unit): Self = StObject.set(x, "removeColumns", js.Any.fromFunction1(value))
      
      inline def setRemoveRows(value: RowsSpan => Unit): Self = StObject.set(x, "removeRows", js.Any.fromFunction1(value))
      
      inline def setSetCell(value: (SheetCellAddress, CellVertex) => Unit): Self = StObject.set(x, "setCell", js.Any.fromFunction2(value))
      
      inline def setVertices(value: () => IterableIterator[CellVertex]): Self = StObject.set(x, "vertices", js.Any.fromFunction0(value))
      
      inline def setVerticesFromColumn(value: Double => IterableIterator[CellVertex]): Self = StObject.set(x, "verticesFromColumn", js.Any.fromFunction1(value))
      
      inline def setVerticesFromColumnsSpan(value: ColumnsSpan => IterableIterator[CellVertex]): Self = StObject.set(x, "verticesFromColumnsSpan", js.Any.fromFunction1(value))
      
      inline def setVerticesFromRow(value: Double => IterableIterator[CellVertex]): Self = StObject.set(x, "verticesFromRow", js.Any.fromFunction1(value))
      
      inline def setVerticesFromRowsSpan(value: RowsSpan => IterableIterator[CellVertex]): Self = StObject.set(x, "verticesFromRowsSpan", js.Any.fromFunction1(value))
    }
  }
}
