package typings.hyperformula

import typings.hyperformula.anon.CODE
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codePluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/CodePlugin.CodePlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/CodePlugin.CodePlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/CodePlugin.CodePlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/CodePlugin", "CodePlugin")
  @js.native
  open class CodePlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def code(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def unicode(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object CodePlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/CodePlugin", "CodePlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/CodePlugin", "CodePlugin.implementedFunctions")
    @js.native
    def implementedFunctions: CODE = js.native
    inline def implementedFunctions_=(x: CODE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
