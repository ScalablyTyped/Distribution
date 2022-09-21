package typings.hyperformula

import typings.hyperformula.anon.RAND
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/RandomPlugin.RandomPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/RandomPlugin.RandomPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/RandomPlugin.RandomPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/RandomPlugin", "RandomPlugin")
  @js.native
  open class RandomPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to RAND()
      *
      * Returns a pseudo-random floating-point random number
      * in the range [0,1).
      *
      * @param ast
      * @param state
      */
    def rand(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def randbetween(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object RandomPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/RandomPlugin", "RandomPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/RandomPlugin", "RandomPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: RAND = js.native
    inline def implementedFunctions_=(x: RAND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
