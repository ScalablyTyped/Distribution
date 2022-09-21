package typings.hyperformula

import typings.hyperformula.astMod.Ast
import typings.hyperformula.astMod.CellRangeAst
import typings.hyperformula.astMod.CellReferenceAst
import typings.hyperformula.astMod.ColumnRangeAst
import typings.hyperformula.astMod.RowRangeAst
import typings.hyperformula.cellMod.ErrorType.REF
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.columnAddressMod.ColumnAddress
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.hyperformulaBooleans.`false`
import typings.hyperformula.rowAddressMod.RowAddress
import typings.hyperformula.typingsParserMod.CellAddress
import typings.hyperformula.typingsParserMod.ParserWithCaching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformerMod {
  
  @JSImport("hyperformula/typings/dependencyTransformers/Transformer", "Transformer")
  @js.native
  abstract class Transformer ()
    extends StObject
       with FormulaTransformer {
    
    /* protected */ def fixNodeAddress(address: SimpleCellAddress_): SimpleCellAddress_ = js.native
    
    /* CompleteClass */
    override def isIrreversible(): Boolean = js.native
    
    /* CompleteClass */
    override def performEagerTransformations(graph: DependencyGraph, parser: ParserWithCaching): Unit = js.native
    
    /* CompleteClass */
    var sheet: Double = js.native
    @JSName("sheet")
    def sheet_MTransformer: Double = js.native
    
    /* protected */ def transformAst(ast: Ast, address: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformCellAddress[T /* <: CellAddress */](dependencyAddress: T, formulaAddress: SimpleCellAddress_): T | REF | `false` = js.native
    
    /* protected */ def transformCellRange(start: CellAddress, end: CellAddress, formulaAddress: SimpleCellAddress_): (js.Tuple2[CellAddress, CellAddress]) | REF | `false` = js.native
    
    /* protected */ def transformCellRangeAst(ast: CellRangeAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformCellReferenceAst(ast: CellReferenceAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformColumnRange(start: ColumnAddress, end: ColumnAddress, formulaAddress: SimpleCellAddress_): (js.Tuple2[ColumnAddress, ColumnAddress]) | REF | `false` = js.native
    
    /* protected */ def transformColumnRangeAst(ast: ColumnRangeAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformRowRange(start: RowAddress, end: RowAddress, formulaAddress: SimpleCellAddress_): (js.Tuple2[RowAddress, RowAddress]) | REF | `false` = js.native
    
    /* protected */ def transformRowRangeAst(ast: RowRangeAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* CompleteClass */
    override def transformSingleAst(ast: Ast, address: SimpleCellAddress_): js.Tuple2[Ast, SimpleCellAddress_] = js.native
  }
  
  trait FormulaTransformer extends StObject {
    
    def isIrreversible(): Boolean
    
    def performEagerTransformations(graph: DependencyGraph, parser: ParserWithCaching): Unit
    
    var sheet: Double
    
    def transformSingleAst(ast: Ast, address: SimpleCellAddress_): js.Tuple2[Ast, SimpleCellAddress_]
  }
  object FormulaTransformer {
    
    inline def apply(
      isIrreversible: () => Boolean,
      performEagerTransformations: (DependencyGraph, ParserWithCaching) => Unit,
      sheet: Double,
      transformSingleAst: (Ast, SimpleCellAddress_) => js.Tuple2[Ast, SimpleCellAddress_]
    ): FormulaTransformer = {
      val __obj = js.Dynamic.literal(isIrreversible = js.Any.fromFunction0(isIrreversible), performEagerTransformations = js.Any.fromFunction2(performEagerTransformations), sheet = sheet.asInstanceOf[js.Any], transformSingleAst = js.Any.fromFunction2(transformSingleAst))
      __obj.asInstanceOf[FormulaTransformer]
    }
    
    extension [Self <: FormulaTransformer](x: Self) {
      
      inline def setIsIrreversible(value: () => Boolean): Self = StObject.set(x, "isIrreversible", js.Any.fromFunction0(value))
      
      inline def setPerformEagerTransformations(value: (DependencyGraph, ParserWithCaching) => Unit): Self = StObject.set(x, "performEagerTransformations", js.Any.fromFunction2(value))
      
      inline def setSheet(value: Double): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setTransformSingleAst(value: (Ast, SimpleCellAddress_) => js.Tuple2[Ast, SimpleCellAddress_]): Self = StObject.set(x, "transformSingleAst", js.Any.fromFunction2(value))
    }
  }
}
