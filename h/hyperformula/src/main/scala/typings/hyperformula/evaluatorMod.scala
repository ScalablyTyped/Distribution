package typings.hyperformula

import typings.hyperformula.astMod.Ast
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.configMod.Config
import typings.hyperformula.contentChangesMod.ContentChanges
import typings.hyperformula.dependencyGraphMod.DependencyGraph
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterValueMod.InterpreterValue
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.relativeDependencyMod.RelativeDependency
import typings.hyperformula.searchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.statisticsMod.Statistics
import typings.hyperformula.vertexMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evaluatorMod {
  
  @JSImport("hyperformula/typings/Evaluator", "Evaluator")
  @js.native
  open class Evaluator protected () extends StObject {
    def this(
      config: Config,
      stats: Statistics,
      interpreter: Interpreter,
      lazilyTransformingAstService: LazilyTransformingAstService,
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy
    ) = this()
    
    /* private */ val columnSearch: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ var evaluateAstToCellValue: Any = js.native
    
    val interpreter: Interpreter = js.native
    
    /* private */ val lazilyTransformingAstService: Any = js.native
    
    def partialRun(vertices: js.Array[Vertex]): ContentChanges = js.native
    
    /* private */ var recomputeFormulaVertexValue: Any = js.native
    
    /**
      * Recalculates formulas in the topological sort order
      */
    /* private */ var recomputeFormulas: Any = js.native
    
    def run(): Unit = js.native
    
    def runAndForget(ast: Ast, address: SimpleCellAddress_, dependencies: js.Array[RelativeDependency]): InterpreterValue = js.native
    
    /* private */ val stats: Any = js.native
  }
}
