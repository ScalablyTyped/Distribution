package typings.hyperformula

import typings.hyperformula.anon.HFADD
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleArithmerticMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/SimpleArithmertic.SimpleArithmerticPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/SimpleArithmertic.SimpleArithmerticPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/SimpleArithmertic.SimpleArithmerticPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/SimpleArithmertic", "SimpleArithmerticPlugin")
  @js.native
  open class SimpleArithmerticPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def add(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def concat(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def divide(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def eq(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gte(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def lt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def lte(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def minus(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def multiply(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ne(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def pow(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def uminus(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def upercent(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def uplus(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object SimpleArithmerticPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/SimpleArithmertic", "SimpleArithmerticPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/SimpleArithmertic", "SimpleArithmerticPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: HFADD = js.native
    inline def implementedFunctions_=(x: HFADD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
