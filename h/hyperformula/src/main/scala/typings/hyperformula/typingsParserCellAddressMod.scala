package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsCellMod.SimpleRowAddress_
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsParserAddressMod.AddressWithColumn
import typings.hyperformula.typingsParserAddressMod.AddressWithRow
import typings.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typings.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserCellAddressMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.hyperformula.typingsParserAddressMod.AddressWithSheet because Already inherited
  - typings.hyperformula.typingsParserAddressMod.AddressWithRow because var conflicts: sheet. Inlined row, isRowAbsolute, isRowRelative, shiftedByRows, toSimpleRowAddress */ @JSImport("hyperformula/typings/parser/CellAddress", "CellAddress")
  @js.native
  open class CellAddress protected ()
    extends StObject
       with AddressWithColumn {
    def this(col: Double, row: Double, `type`: CellReferenceType) = this()
    def this(col: Double, row: Double, `type`: CellReferenceType, sheet: Double) = this()
    
    def exceedsSheetSizeLimits(maxColumns: Double, maxRows: Double): Boolean = js.native
    
    def hash(withSheet: Boolean): String = js.native
    
    def isAbsolute(): Boolean = js.native
    
    def isInvalid(baseAddress: SimpleCellAddress_): Boolean = js.native
    
    def isRowAbsolute(): Boolean = js.native
    
    def isRowRelative(): Boolean = js.native
    
    val row: Double = js.native
    
    def shiftedByRows(rows: Double): AddressWithRow = js.native
    @JSName("shiftedByRows")
    def shiftedByRows_CellAddress(numberOfRows: Double): CellAddress = js.native
    
    def toColumnAddress(): ColumnAddress = js.native
    
    def toRowAddress(): RowAddress = js.native
    
    /**
      * Converts R0C0 representation of cell address to simple object representation.
      *
      * @param baseAddress - base address for R0C0 shifts
      */
    def toSimpleCellAddress(baseAddress: SimpleCellAddress_): SimpleCellAddress_ = js.native
    
    def toSimpleRowAddress(baseAddress: SimpleCellAddress_): SimpleRowAddress_ = js.native
    
    val `type`: CellReferenceType = js.native
    
    def unparse(baseAddress: SimpleCellAddress_): Maybe[String] = js.native
  }
  /* static members */
  object CellAddress {
    
    @JSImport("hyperformula/typings/parser/CellAddress", "CellAddress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absolute(col: Double, row: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    inline def absolute(col: Double, row: Double, sheet: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    
    inline def absoluteCol(col: Double, row: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteCol")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    inline def absoluteCol(col: Double, row: Double, sheet: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteCol")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    
    inline def absoluteRow(col: Double, row: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    inline def absoluteRow(col: Double, row: Double, sheet: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    
    inline def fromColAndRow(col: ColumnAddress, row: RowAddress): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColAndRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    inline def fromColAndRow(col: ColumnAddress, row: RowAddress, sheet: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColAndRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    
    inline def relative(row: Double, col: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
    inline def relative(row: Double, col: Double, sheet: Double): CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[CellAddress]
  }
  
  @js.native
  sealed trait CellReferenceType extends StObject
  @JSImport("hyperformula/typings/parser/CellAddress", "CellReferenceType")
  @js.native
  object CellReferenceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CellReferenceType & String] = js.native
    
    /** Cell reference with both row and column absolute. */
    @js.native
    sealed trait CELL_REFERENCE_ABSOLUTE
      extends StObject
         with CellReferenceType
    /* "CELL_REFERENCE_ABSOLUTE" */ val CELL_REFERENCE_ABSOLUTE: typings.hyperformula.typingsParserCellAddressMod.CellReferenceType.CELL_REFERENCE_ABSOLUTE & String = js.native
    
    /** Cell reference with absolute column and relative row. */
    @js.native
    sealed trait CELL_REFERENCE_ABSOLUTE_COL
      extends StObject
         with CellReferenceType
    /* "CELL_REFERENCE_ABSOLUTE_COL" */ val CELL_REFERENCE_ABSOLUTE_COL: typings.hyperformula.typingsParserCellAddressMod.CellReferenceType.CELL_REFERENCE_ABSOLUTE_COL & String = js.native
    
    /** Cell reference with relative column and absolute row. */
    @js.native
    sealed trait CELL_REFERENCE_ABSOLUTE_ROW
      extends StObject
         with CellReferenceType
    /* "CELL_REFERENCE_ABSOLUTE_ROW" */ val CELL_REFERENCE_ABSOLUTE_ROW: typings.hyperformula.typingsParserCellAddressMod.CellReferenceType.CELL_REFERENCE_ABSOLUTE_ROW & String = js.native
    
    /** Cell reference with both row and column relative. */
    @js.native
    sealed trait CELL_REFERENCE_RELATIVE
      extends StObject
         with CellReferenceType
    /* "CELL_REFERENCE" */ val CELL_REFERENCE_RELATIVE: typings.hyperformula.typingsParserCellAddressMod.CellReferenceType.CELL_REFERENCE_RELATIVE & String = js.native
  }
}
