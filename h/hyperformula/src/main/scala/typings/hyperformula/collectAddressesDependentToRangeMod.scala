package typings.hyperformula

import typings.hyperformula.absoluteCellRangeMod.AbsoluteCellRange
import typings.hyperformula.cellMod.SimpleCellAddress_
import typings.hyperformula.dependencyGraphDependencyGraphMod.DependencyGraph
import typings.hyperformula.functionRegistryMod.FunctionRegistry
import typings.hyperformula.lazilyTransformingAstServiceMod.LazilyTransformingAstService
import typings.hyperformula.vertexMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectAddressesDependentToRangeMod {
  
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
