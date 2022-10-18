package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsContentChangesMod.ContentChanges
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import typings.hyperformula.typingsStatisticsMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsEvaluatorMod {
  
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
