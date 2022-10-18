package typings.hyperformula

import typings.hyperformula.anon.LN
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginLogarithmPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/LogarithmPlugin.LogarithmPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/LogarithmPlugin.LogarithmPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/LogarithmPlugin.LogarithmPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/LogarithmPlugin", "LogarithmPlugin")
  @js.native
  open class LogarithmPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def ln(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def log(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def log10(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object LogarithmPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/LogarithmPlugin", "LogarithmPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/LogarithmPlugin", "LogarithmPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: LN = js.native
    inline def implementedFunctions_=(x: LN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
