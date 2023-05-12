package typings.hyperformula

import typings.hyperformula.anon.End
import typings.hyperformula.typingsCellDependencyMod.CellDependency
import typings.hyperformula.typingsCellMod.CellRange
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsCellMod.SimpleColumnAddress_
import typings.hyperformula.typingsCellMod.SimpleRowAddress_
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsParserAstMod.CellRangeAst
import typings.hyperformula.typingsParserAstMod.ColumnRangeAst
import typings.hyperformula.typingsParserAstMod.RowRangeAst
import typings.hyperformula.typingsSpanMod.Span
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsAbsoluteCellRangeMod {
  
  @JSImport("hyperformula/typings/AbsoluteCellRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/AbsoluteCellRange", "AbsoluteCellRange")
  @js.native
  open class AbsoluteCellRange protected ()
    extends StObject
       with SimpleCellRange_
       with CellDependency {
    def this(start: SimpleCellAddress_, end: SimpleCellAddress_) = this()
    
    def addressInRange(address: SimpleCellAddress_): Boolean = js.native
    
    def addresses(dependencyGraph: DependencyGraph): js.Array[SimpleCellAddress_] = js.native
    
    def addressesArrayMap[T](dependencyGraph: DependencyGraph, op: js.Function1[/* arg */ SimpleCellAddress_, T]): js.Array[js.Array[T]] = js.native
    
    def addressesWithDirection(right: Double, bottom: Double, dependencyGraph: DependencyGraph): IterableIterator[SimpleCellAddress_] = js.native
    
    def arrayOfAddressesInRange(): js.Array[js.Array[SimpleCellAddress_]] = js.native
    
    def columnInRange(address: SimpleColumnAddress_): Boolean = js.native
    
    def containsRange(range: AbsoluteCellRange): Boolean = js.native
    
    def doesOverlap(other: AbsoluteCellRange): Boolean = js.native
    
    def effectiveEndColumn(_dependencyGraph: DependencyGraph): Double = js.native
    
    def effectiveEndRow(_dependencyGraph: DependencyGraph): Double = js.native
    
    def effectiveHeight(_dependencyGraph: DependencyGraph): Double = js.native
    
    def effectiveWidth(_dependencyGraph: DependencyGraph): Double = js.native
    
    /* CompleteClass */
    var end: SimpleCellAddress_ = js.native
    
    def exceedsSheetSizeLimits(maxColumns: Double, maxRows: Double): Boolean = js.native
    
    def expandByColumns(numberOfColumns: Double): Unit = js.native
    
    def expandByRows(numberOfRows: Double): Unit = js.native
    
    def getAddress(col: Double, row: Double): SimpleCellAddress_ = js.native
    
    def height(): Double = js.native
    
    def includesColumn(column: Double): Boolean = js.native
    
    def includesRow(row: Double): Boolean = js.native
    
    def intersectionWith(other: AbsoluteCellRange): Maybe[AbsoluteCellRange] = js.native
    
    def isFinite(): Boolean = js.native
    
    def moveToSheet(toSheet: Double): Unit = js.native
    
    def rangeWithSameHeight(startColumn: Double, numberOfColumns: Double): AbsoluteCellRange = js.native
    
    def rangeWithSameWidth(startRow: Double, numberOfRows: Double): AbsoluteCellRange = js.native
    
    /* protected */ def removeColumns(columnStart: Double, columnEnd: Double): Unit = js.native
    
    /* protected */ def removeRows(rowStart: Double, rowEnd: Double): Unit = js.native
    
    def removeSpan(span: Span): Unit = js.native
    
    def rowInRange(address: SimpleRowAddress_): Boolean = js.native
    
    def sameAs(other: AbsoluteCellRange): Boolean = js.native
    
    def sameDimensionsAs(other: AbsoluteCellRange): Boolean = js.native
    
    def sheet: Double = js.native
    
    def shiftByColumns(numberOfColumns: Double): Unit = js.native
    
    def shiftByRows(numberOfRows: Double): Unit = js.native
    
    def shifted(byCols: Double, byRows: Double): AbsoluteCellRange = js.native
    
    def shouldBeRemoved(): Boolean = js.native
    
    def size(): Double = js.native
    
    /* CompleteClass */
    var start: SimpleCellAddress_ = js.native
    
    def width(): Double = js.native
    
    def withStart(newStart: SimpleCellAddress_): AbsoluteCellRange = js.native
  }
  /* static members */
  object AbsoluteCellRange {
    
    @JSImport("hyperformula/typings/AbsoluteCellRange", "AbsoluteCellRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAst(ast: CellRangeAst, baseAddress: SimpleCellAddress_): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAst")(ast.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    inline def fromAst(ast: ColumnRangeAst, baseAddress: SimpleCellAddress_): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAst")(ast.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    inline def fromAst(ast: RowRangeAst, baseAddress: SimpleCellAddress_): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAst")(ast.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    
    inline def fromAstOrUndef(ast: CellRangeAst, baseAddress: SimpleCellAddress_): Maybe[AbsoluteCellRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAstOrUndef")(ast.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[AbsoluteCellRange]]
    inline def fromAstOrUndef(ast: ColumnRangeAst, baseAddress: SimpleCellAddress_): Maybe[AbsoluteCellRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAstOrUndef")(ast.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[AbsoluteCellRange]]
    inline def fromAstOrUndef(ast: RowRangeAst, baseAddress: SimpleCellAddress_): Maybe[AbsoluteCellRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAstOrUndef")(ast.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[AbsoluteCellRange]]
    
    inline def fromCellRange(x: CellRange, baseAddress: SimpleCellAddress_): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCellRange")(x.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    
    inline def fromCoordinates(sheet: Double, x1: Double, y1: Double, x2: Double, y2: Double): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCoordinates")(sheet.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    
    inline def fromSimpleCellAddresses(start: SimpleCellAddress_, end: SimpleCellAddress_): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSimpleCellAddresses")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    
    inline def spanFrom(topLeftCorner: SimpleCellAddress_, width: Double, height: Double): AbsoluteCellRange = (^.asInstanceOf[js.Dynamic].applyDynamic("spanFrom")(topLeftCorner.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[AbsoluteCellRange]
    
    inline def spanFromOrUndef(topLeftCorner: SimpleCellAddress_, width: Double, height: Double): Maybe[AbsoluteCellRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("spanFromOrUndef")(topLeftCorner.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Maybe[AbsoluteCellRange]]
  }
  
  @JSImport("hyperformula/typings/AbsoluteCellRange", "AbsoluteColumnRange")
  @js.native
  open class AbsoluteColumnRange protected () extends AbsoluteCellRange {
    def this(sheet: Double, columnStart: Double, columnEnd: Double) = this()
  }
  /* static members */
  object AbsoluteColumnRange {
    
    @JSImport("hyperformula/typings/AbsoluteCellRange", "AbsoluteColumnRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromColumnRange(x: ColumnRangeAst, baseAddress: SimpleCellAddress_): AbsoluteColumnRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColumnRange")(x.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[AbsoluteColumnRange]
  }
  
  @JSImport("hyperformula/typings/AbsoluteCellRange", "AbsoluteRowRange")
  @js.native
  open class AbsoluteRowRange protected () extends AbsoluteCellRange {
    def this(sheet: Double, rowStart: Double, rowEnd: Double) = this()
  }
  /* static members */
  object AbsoluteRowRange {
    
    @JSImport("hyperformula/typings/AbsoluteCellRange", "AbsoluteRowRange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromRowRangeAst(x: RowRangeAst, baseAddress: SimpleCellAddress_): AbsoluteRowRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRowRangeAst")(x.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[AbsoluteRowRange]
  }
  
  @JSImport("hyperformula/typings/AbsoluteCellRange", "WRONG_RANGE_SIZE")
  @js.native
  val WRONG_RANGE_SIZE: /* "AbsoluteCellRange: Wrong range size" */ String = js.native
  
  inline def isSimpleCellRange(obj: Any): /* is hyperformula.hyperformula/typings/AbsoluteCellRange.SimpleCellRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleCellRange")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is hyperformula.hyperformula/typings/AbsoluteCellRange.SimpleCellRange */ Boolean]
  
  inline def simpleCellRange(start: SimpleCellAddress_, end: SimpleCellAddress_): End = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRange")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[End]
  
  trait SimpleCellRange_ extends StObject {
    
    var end: SimpleCellAddress_
    
    var start: SimpleCellAddress_
  }
  object SimpleCellRange_ {
    
    inline def apply(end: SimpleCellAddress_, start: SimpleCellAddress_): SimpleCellRange_ = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleCellRange_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleCellRange_] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: SimpleCellAddress_): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SimpleCellAddress_): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
