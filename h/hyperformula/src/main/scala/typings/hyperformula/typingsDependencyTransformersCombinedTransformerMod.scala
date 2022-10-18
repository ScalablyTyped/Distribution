package typings.hyperformula

import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsDependencyTransformersTransformerMod.FormulaTransformer
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserMod.ParserWithCaching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyTransformersCombinedTransformerMod {
  
  @JSImport("hyperformula/typings/dependencyTransformers/CombinedTransformer", "CombinedTransformer")
  @js.native
  open class CombinedTransformer protected ()
    extends StObject
       with FormulaTransformer {
    def this(sheet: Double) = this()
    
    def add(transformation: FormulaTransformer): Unit = js.native
    
    /* CompleteClass */
    override def isIrreversible(): Boolean = js.native
    
    /* CompleteClass */
    override def performEagerTransformations(graph: DependencyGraph, parser: ParserWithCaching): Unit = js.native
    
    /* CompleteClass */
    var sheet: Double = js.native
    
    /* CompleteClass */
    override def transformSingleAst(ast: Ast, address: SimpleCellAddress_): js.Tuple2[Ast, SimpleCellAddress_] = js.native
    
    /* private */ val transformations: Any = js.native
  }
}
