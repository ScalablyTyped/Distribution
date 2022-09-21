package typings.hyperformula

import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathConstantsPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/MathConstantsPlugin.MathConstantsPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/MathConstantsPlugin.MathConstantsPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/MathConstantsPlugin.MathConstantsPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "MathConstantsPlugin")
  @js.native
  open class MathConstantsPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def pi(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sqrtpi(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object MathConstantsPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "MathConstantsPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "MathConstantsPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: typings.hyperformula.anon.PI = js.native
    inline def implementedFunctions_=(x: typings.hyperformula.anon.PI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "PI")
  @js.native
  val PI: Double = js.native
}
