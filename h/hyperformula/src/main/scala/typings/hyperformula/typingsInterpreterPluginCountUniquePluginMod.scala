package typings.hyperformula

import typings.hyperformula.anon.COUNTUNIQUE
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginCountUniquePluginMod {
  
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
