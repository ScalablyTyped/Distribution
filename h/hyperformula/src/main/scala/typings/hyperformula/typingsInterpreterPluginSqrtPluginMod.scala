package typings.hyperformula

import typings.hyperformula.anon.SQRT
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginSqrtPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/SqrtPlugin.SqrtPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/SqrtPlugin.SqrtPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/SqrtPlugin.SqrtPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/SqrtPlugin", "SqrtPlugin")
  @js.native
  open class SqrtPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def sqrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object SqrtPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/SqrtPlugin", "SqrtPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/SqrtPlugin", "SqrtPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: SQRT = js.native
    inline def implementedFunctions_=(x: SQRT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
