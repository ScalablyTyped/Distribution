package typings.hyperformula

import typings.hyperformula.typingsArraySizeMod.ArraySizePredictor
import typings.hyperformula.typingsCellContentParserMod.CellContentParser
import typings.hyperformula.typingsCellDependencyMod.CellDependency
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typings.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typings.hyperformula.typingsParserMod.ParserWithCaching
import typings.hyperformula.typingsSheetMod.Sheets
import typings.hyperformula.typingsStatisticsMod.Statistics
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsGraphBuilderMod {
  
  @JSImport("hyperformula/typings/GraphBuilder", "GraphBuilder")
  @js.native
  open class GraphBuilder protected () extends StObject {
    /**
      * Configures the building service.
      */
    def this(
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy,
      parser: ParserWithCaching,
      cellContentParser: CellContentParser,
      stats: Statistics,
      arraySizePredictor: ArraySizePredictor
    ) = this()
    
    /* private */ val arraySizePredictor: Any = js.native
    
    /**
      * Builds graph.
      */
    def buildGraph(sheets: Sheets, stats: Statistics): Unit = js.native
    
    /* private */ var buildStrategy: Any = js.native
    
    /* private */ val cellContentParser: Any = js.native
    
    /* private */ val columnSearch: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ val parser: Any = js.native
    
    /* private */ var processDependencies: Any = js.native
    
    /* private */ val stats: Any = js.native
  }
  
  @JSImport("hyperformula/typings/GraphBuilder", "SimpleStrategy")
  @js.native
  open class SimpleStrategy protected ()
    extends StObject
       with GraphBuilderStrategy {
    def this(
      dependencyGraph: DependencyGraph,
      columnIndex: ColumnSearchStrategy,
      parser: ParserWithCaching,
      stats: Statistics,
      cellContentParser: CellContentParser,
      arraySizePredictor: ArraySizePredictor
    ) = this()
    
    /* private */ val arraySizePredictor: Any = js.native
    
    /* private */ val cellContentParser: Any = js.native
    
    /* private */ val columnIndex: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ val parser: Any = js.native
    
    /* CompleteClass */
    override def run(sheets: Sheets): Dependencies = js.native
    
    /* private */ var shrinkArrayIfNeeded: Any = js.native
    
    /* private */ val stats: Any = js.native
  }
  
  type Dependencies = Map[Vertex, js.Array[CellDependency]]
  
  trait GraphBuilderStrategy extends StObject {
    
    def run(sheets: Sheets): Dependencies
  }
  object GraphBuilderStrategy {
    
    inline def apply(run: Sheets => Dependencies): GraphBuilderStrategy = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[GraphBuilderStrategy]
    }
    
    extension [Self <: GraphBuilderStrategy](x: Self) {
      
      inline def setRun(value: Sheets => Dependencies): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
}
