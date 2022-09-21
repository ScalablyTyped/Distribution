package typings.hyperformula

import typings.hyperformula.astMod.Ast
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.statisticsStatisticsMod.Statistics
import typings.hyperformula.transformerMod.FormulaTransformer
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.undoRedoMod.UndoRedo
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazilyTransformingAstServiceMod {
  
  @JSImport("hyperformula/typings/LazilyTransformingAstService", "LazilyTransformingAstService")
  @js.native
  open class LazilyTransformingAstService protected () extends StObject {
    def this(stats: Statistics) = this()
    
    def addTransformation(transformation: FormulaTransformer): Double = js.native
    
    def applyTransformations(ast: Ast, address: SimpleCellAddress_, version: Double): js.Tuple3[Ast, SimpleCellAddress_, Double] = js.native
    
    def beginCombinedMode(sheet: Double): Unit = js.native
    
    /* private */ var combinedTransformer: Any = js.native
    
    def commitCombinedMode(): Double = js.native
    
    def getTransformationsFrom(version: Double): IterableIterator[FormulaTransformer] = js.native
    def getTransformationsFrom(version: Double, filter: js.Function1[/* transformation */ FormulaTransformer, Boolean]): IterableIterator[FormulaTransformer] = js.native
    
    var parser: js.UndefOr[ParserWithCaching] = js.native
    
    /* private */ val stats: Any = js.native
    
    /* private */ var transformations: Any = js.native
    
    var undoRedo: js.UndefOr[UndoRedo] = js.native
    
    def version(): Double = js.native
  }
}
