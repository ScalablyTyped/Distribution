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

object typingsInterpreterPluginMathPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/MathPlugin.MathPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/MathPlugin.MathPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/MathPlugin.MathPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/MathPlugin", "MathPlugin")
  @js.native
  open class MathPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def combin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def combina(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fact(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def factdouble(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gcd(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def lcm(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def mround(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def multinomial(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def quotient(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def seriessum(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sign(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sumx2my2(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sumx2py2(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sumxmy2(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object MathPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/MathPlugin", "MathPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/MathPlugin", "MathPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
