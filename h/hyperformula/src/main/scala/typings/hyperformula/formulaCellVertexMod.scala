package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.arraySizeMod.ArraySize
import typings.hyperformula.arrayValueMod.IArray
import typings.hyperformula.astMod.Ast
import typings.hyperformula.cellContentParserMod.RawCellContent
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.interpreterValueMod.InternalScalarValue
import typings.hyperformula.interpreterValueMod.InterpreterValue
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.spanMod.ColumnsSpan
import typings.hyperformula.spanMod.RowsSpan
import typings.hyperformula.vertexMod.CellVertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formulaCellVertexMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/FormulaCellVertex", "ArrayVertex")
  @js.native
  open class ArrayVertex protected () extends FormulaVertex {
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize) = this()
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize, version: Double) = this()
    
    var array: IArray = js.native
    
    def columnsFromArray(): ColumnsSpan = js.native
    
    def getArrayCellRawValue(address: SimpleCellAddress_): Maybe[RawCellContent] = js.native
    
    def getArrayCellValue(address: SimpleCellAddress_): InternalScalarValue = js.native
    
    def getRange(): AbsoluteCellRange = js.native
    
    def getRangeOrUndef(): Maybe[AbsoluteCellRange] = js.native
    
    def isLeftCorner(address: SimpleCellAddress_): Boolean = js.native
    
    def leftCorner: SimpleCellAddress_ = js.native
    
    def rowsFromArray(): RowsSpan = js.native
    
    def setAddress(address: SimpleCellAddress_): Unit = js.native
    
    def setArrayCellValue(address: SimpleCellAddress_, value: Double): Unit = js.native
    
    /* private */ var setErrorValue: Any = js.native
    
    def setFormula(newFormula: Ast): Unit = js.native
    
    def setNoSpace(): InterpreterValue = js.native
    
    def sheet: Double = js.native
    
    def spansThroughSheetColumn(sheet: Double, col: Double): Boolean = js.native
    def spansThroughSheetColumn(sheet: Double, col: Double, columnEnd: Double): Boolean = js.native
    
    def spansThroughSheetRows(sheet: Double, startRow: Double): Boolean = js.native
    def spansThroughSheetRows(sheet: Double, startRow: Double, endRow: Double): Boolean = js.native
  }
  
  @JSImport("hyperformula/typings/DependencyGraph/FormulaCellVertex", "FormulaCellVertex")
  @js.native
  open class FormulaCellVertex protected () extends FormulaVertex {
    def this(
      /** Formula in AST format */
    formula: Ast,
      /** Address which this vertex represents */
    address: SimpleCellAddress_,
      version: Double
    ) = this()
    
    /** Most recently computed value of this formula. */
    /* private */ var cachedCellValue: Any = js.native
  }
  
  @JSImport("hyperformula/typings/DependencyGraph/FormulaCellVertex", "FormulaVertex")
  @js.native
  abstract class FormulaVertex protected ()
    extends StObject
       with CellVertex {
    /* protected */ def this(formula: Ast, cellAddress: SimpleCellAddress_, version: Double) = this()
    
    /* protected */ var cellAddress: SimpleCellAddress_ = js.native
    
    def ensureRecentData(updatingService: LazilyTransformingAstService): Unit = js.native
    
    /* protected */ var formula: Ast = js.native
    
    /**
      * Returns address of the cell associated with vertex
      */
    def getAddress(updatingService: LazilyTransformingAstService): SimpleCellAddress_ = js.native
    
    /**
      * Returns cell value stored in vertex
      */
    def getCellValue(): InterpreterValue = js.native
    
    /**
      * Returns formula stored in this vertex
      */
    def getFormula(updatingService: LazilyTransformingAstService): Ast = js.native
    
    def height: Double = js.native
    
    def isComputed(): Boolean = js.native
    
    /**
      * Sets computed cell value stored in this vertex
      */
    def setCellValue(cellValue: InterpreterValue): InterpreterValue = js.native
    
    def valueOrUndef(): Maybe[InterpreterValue] = js.native
    
    var version: Double = js.native
    
    def width: Double = js.native
  }
  /* static members */
  object FormulaVertex {
    
    @JSImport("hyperformula/typings/DependencyGraph/FormulaCellVertex", "FormulaVertex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAst(formula: Ast, address: SimpleCellAddress_, size: ArraySize, version: Double): ArrayVertex | FormulaCellVertex = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAst")(formula.asInstanceOf[js.Any], address.asInstanceOf[js.Any], size.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[ArrayVertex | FormulaCellVertex]
  }
}
