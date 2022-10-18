package typings.hyperformula

import typings.hyperformula.anon.CLEAN
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginTextPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/TextPlugin.TextPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/TextPlugin.TextPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/TextPlugin.TextPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/TextPlugin", "TextPlugin")
  @js.native
  open class TextPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def clean(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to CONCATENATE(value1, [value2, ...])
      *
      * Concatenates provided arguments to one string.
      *
      * @param ast
      * @param state
      */
    def concatenate(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def exact(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def find(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def left(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def len(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def lower(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def mid(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def proper(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def replace(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def rept(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def right(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def search(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to SPLIT(string, index)
      *
      * Splits provided string using space separator and returns chunk at zero-based position specified by second argument
      *
      * @param ast
      * @param state
      */
    def split(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def substitute(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def t(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def trim(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def upper(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object TextPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/TextPlugin", "TextPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/TextPlugin", "TextPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: CLEAN = js.native
    inline def implementedFunctions_=(x: CLEAN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
