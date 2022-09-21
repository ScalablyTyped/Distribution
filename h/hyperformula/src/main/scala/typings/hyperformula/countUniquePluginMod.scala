package typings.hyperformula

import typings.hyperformula.anon.COUNTUNIQUE
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countUniquePluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/CountUniquePlugin.CountUniquePlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/CountUniquePlugin.CountUniquePlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/CountUniquePlugin.CountUniquePlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/CountUniquePlugin", "CountUniquePlugin")
  @js.native
  open class CountUniquePlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to COUNTUNIQUE(Number1, Number2, ...).
      *
      * Returns number of unique numbers from arguments
      *
      * @param ast
      * @param state
      */
    def countunique(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object CountUniquePlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/CountUniquePlugin", "CountUniquePlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/CountUniquePlugin", "CountUniquePlugin.implementedFunctions")
    @js.native
    def implementedFunctions: COUNTUNIQUE = js.native
    inline def implementedFunctions_=(x: COUNTUNIQUE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
