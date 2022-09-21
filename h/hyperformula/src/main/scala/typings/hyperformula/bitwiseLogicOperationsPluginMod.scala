package typings.hyperformula

import typings.hyperformula.anon.BITAND
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitwiseLogicOperationsPluginMod {
  
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
    def implementedFunctions: BITAND = js.native
    inline def implementedFunctions_=(x: BITAND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
