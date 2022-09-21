package typings.hyperformula

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanMod {
  
  @JSImport("hyperformula/typings/Span", "ColumnsSpan")
  @js.native
  open class ColumnsSpan protected ()
    extends StObject
       with Span {
    def this(sheet: Double, columnStart: Double, columnEnd: Double) = this()
    
    val columnEnd: Double = js.native
    
    val columnStart: Double = js.native
    
    def columns(): IterableIterator[Double] = js.native
    
    def end: Double = js.native
    
    def firstColumn(): ColumnsSpan = js.native
    
    def intersect(otherSpan: ColumnsSpan): ColumnsSpan | Null = js.native
    
    def numberOfColumns: Double = js.native
    
    val sheet: Double = js.native
    
    def start: Double = js.native
  }
  /* static members */
  object ColumnsSpan {
    
    @JSImport("hyperformula/typings/Span", "ColumnsSpan")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromColumnStartAndEnd(sheet: Double, columnStart: Double, columnEnd: Double): ColumnsSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnStartAndEnd")(sheet.asInstanceOf[js.Any], columnStart.asInstanceOf[js.Any], columnEnd.asInstanceOf[js.Any])).asInstanceOf[ColumnsSpan]
    
    inline def fromNumberOfColumns(sheet: Double, columnStart: Double, numberOfColumns: Double): ColumnsSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumberOfColumns")(sheet.asInstanceOf[js.Any], columnStart.asInstanceOf[js.Any], numberOfColumns.asInstanceOf[js.Any])).asInstanceOf[ColumnsSpan]
  }
  
  @JSImport("hyperformula/typings/Span", "RowsSpan")
  @js.native
  open class RowsSpan protected ()
    extends StObject
       with Span {
    def this(sheet: Double, rowStart: Double, rowEnd: Double) = this()
    
    def end: Double = js.native
    
    def firstRow(): RowsSpan = js.native
    
    def intersect(otherSpan: RowsSpan): RowsSpan | Null = js.native
    
    def numberOfRows: Double = js.native
    
    val rowEnd: Double = js.native
    
    val rowStart: Double = js.native
    
    def rows(): IterableIterator[Double] = js.native
    
    val sheet: Double = js.native
    
    def start: Double = js.native
  }
  /* static members */
  object RowsSpan {
    
    @JSImport("hyperformula/typings/Span", "RowsSpan")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromNumberOfRows(sheet: Double, rowStart: Double, numberOfRows: Double): RowsSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumberOfRows")(sheet.asInstanceOf[js.Any], rowStart.asInstanceOf[js.Any], numberOfRows.asInstanceOf[js.Any])).asInstanceOf[RowsSpan]
    
    inline def fromRowStartAndEnd(sheet: Double, rowStart: Double, rowEnd: Double): RowsSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowStartAndEnd")(sheet.asInstanceOf[js.Any], rowStart.asInstanceOf[js.Any], rowEnd.asInstanceOf[js.Any])).asInstanceOf[RowsSpan]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperformula.spanMod.RowsSpan
    - typings.hyperformula.spanMod.ColumnsSpan
  */
  trait Span extends StObject
}
