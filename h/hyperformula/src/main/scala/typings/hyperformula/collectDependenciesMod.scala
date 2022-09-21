package typings.hyperformula

import typings.hyperformula.astMod.Ast
import typings.hyperformula.functionRegistryMod.FunctionRegistry
import typings.hyperformula.relativeDependencyMod.RelativeDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectDependenciesMod {
  
  @JSImport("hyperformula/typings/parser/collectDependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectDependencies(ast: Ast, functionRegistry: FunctionRegistry): js.Array[RelativeDependency] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectDependencies")(ast.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeDependency]]
}
