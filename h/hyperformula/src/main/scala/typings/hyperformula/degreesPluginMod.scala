package typings.hyperformula

import typings.hyperformula.anon.DEGREES
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object degreesPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/DegreesPlugin.DegreesPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/DegreesPlugin.DegreesPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/DegreesPlugin.DegreesPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/DegreesPlugin", "DegreesPlugin")
  @js.native
  open class DegreesPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def degrees(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object DegreesPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/DegreesPlugin", "DegreesPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/DegreesPlugin", "DegreesPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: DEGREES = js.native
    inline def implementedFunctions_=(x: DEGREES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
