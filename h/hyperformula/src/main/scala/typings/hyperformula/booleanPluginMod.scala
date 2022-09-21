package typings.hyperformula

import typings.hyperformula.anon.AND
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/BooleanPlugin.BooleanPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/BooleanPlugin.BooleanPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/BooleanPlugin.BooleanPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/BooleanPlugin", "BooleanPlugin")
  @js.native
  open class BooleanPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to AND(expression1, [expression2, ...])
      *
      * Returns true if all of the provided arguments are logically true, and false if any of it is logically false
      *
      * @param ast
      * @param state
      */
    def and(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def choose(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to IF(expression, value_if_true, value_if_false)
      *
      * Returns value specified as second argument if expression is true and third argument if expression is false
      *
      * @param ast
      * @param state
      */
    def conditionalIf(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def iferror(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ifna(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to FALSE()
      *
      * Returns the logical false
      *
      * @param ast
      * @param state
      */
    def literalFalse(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to TRUE()
      *
      * Returns the logical true
      *
      * @param ast
      * @param state
      */
    def literalTrue(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def not(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to OR(expression1, [expression2, ...])
      *
      * Returns true if any of the provided arguments are logically true, and false otherwise
      *
      * @param ast
      * @param state
      */
    def or(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def switch(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def xor(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object BooleanPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/BooleanPlugin", "BooleanPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/BooleanPlugin", "BooleanPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: AND = js.native
    inline def implementedFunctions_=(x: AND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
