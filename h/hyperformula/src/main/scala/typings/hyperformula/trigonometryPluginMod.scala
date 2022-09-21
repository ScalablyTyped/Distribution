package typings.hyperformula

import typings.hyperformula.anon.ACOS
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trigonometryPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/TrigonometryPlugin.TrigonometryPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/TrigonometryPlugin.TrigonometryPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/TrigonometryPlugin.TrigonometryPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/TrigonometryPlugin", "TrigonometryPlugin")
  @js.native
  open class TrigonometryPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to ACOS(value)
      *
      * Returns the arc cosine (or inverse cosine) of a number.
      *
      * @param ast
      * @param state
      */
    def acos(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def acosh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def acot(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def acoth(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def asin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def asinh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def atan(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def atan2(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def atanh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def cos(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def cosh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def cot(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def coth(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def csc(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def csch(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sec(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sech(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sinh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tan(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tanh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object TrigonometryPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/TrigonometryPlugin", "TrigonometryPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/TrigonometryPlugin", "TrigonometryPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ACOS = js.native
    inline def implementedFunctions_=(x: ACOS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
