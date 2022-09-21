package typings.hyperformula

import typings.hyperformula.anon.POWER
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powerPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/PowerPlugin.PowerPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/PowerPlugin.PowerPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/PowerPlugin.PowerPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/PowerPlugin", "PowerPlugin")
  @js.native
  open class PowerPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def power(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object PowerPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/PowerPlugin", "PowerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/PowerPlugin", "PowerPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: POWER = js.native
    inline def implementedFunctions_=(x: POWER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
