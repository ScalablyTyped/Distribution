package typings.hyperformula

import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginBitwiseLogicOperationsPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/BitwiseLogicOperationsPlugin.BitwiseLogicOperationsPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/BitwiseLogicOperationsPlugin.BitwiseLogicOperationsPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/BitwiseLogicOperationsPlugin.BitwiseLogicOperationsPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/BitwiseLogicOperationsPlugin", "BitwiseLogicOperationsPlugin")
  @js.native
  open class BitwiseLogicOperationsPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def bitand(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def bitor(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def bitxor(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object BitwiseLogicOperationsPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/BitwiseLogicOperationsPlugin", "BitwiseLogicOperationsPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/BitwiseLogicOperationsPlugin", "BitwiseLogicOperationsPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
