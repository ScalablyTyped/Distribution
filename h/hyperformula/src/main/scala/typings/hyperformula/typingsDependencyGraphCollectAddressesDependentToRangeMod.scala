package typings.hyperformula

import typings.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.typingsCellMod.SimpleCellAddress_
import typings.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph
import typings.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphCollectAddressesDependentToRangeMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/collectAddressesDependentToRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectAddressesDependentToRange(
    functionRegistry: FunctionRegistry,
    vertex: Vertex,
    range: AbsoluteCellRange,
    lazilyTransformingAstService: LazilyTransformingAstService,
    dependencyGraph: DependencyGraph
  ): js.Array[SimpleCellAddress_] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAddressesDependentToRange")(functionRegistry.asInstanceOf[js.Any], vertex.asInstanceOf[js.Any], range.asInstanceOf[js.Any], lazilyTransformingAstService.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimpleCellAddress_]]
}
