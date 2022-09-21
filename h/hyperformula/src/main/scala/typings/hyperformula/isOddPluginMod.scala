package typings.hyperformula

import typings.hyperformula.anon.ISODD
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isOddPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/IsOddPlugin.IsOddPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/IsOddPlugin.IsOddPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/IsOddPlugin.IsOddPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/IsOddPlugin", "IsOddPlugin")
  @js.native
  open class IsOddPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def isodd(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object IsOddPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/IsOddPlugin", "IsOddPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/IsOddPlugin", "IsOddPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ISODD = js.native
    inline def implementedFunctions_=(x: ISODD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
