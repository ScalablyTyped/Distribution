package typings.hyperformula

import typings.hyperformula.anon.COUNTBLANK
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginCountBlankPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/CountBlankPlugin.CountBlankPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/CountBlankPlugin.CountBlankPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/CountBlankPlugin.CountBlankPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/CountBlankPlugin", "CountBlankPlugin")
  @js.native
  open class CountBlankPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def countblank(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object CountBlankPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/CountBlankPlugin", "CountBlankPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/CountBlankPlugin", "CountBlankPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: COUNTBLANK = js.native
    inline def implementedFunctions_=(x: COUNTBLANK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
