package typings.hyperformula

import typings.hyperformula.anon.COMPLEX
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/ComplexPlugin.ComplexPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/ComplexPlugin.ComplexPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/ComplexPlugin.ComplexPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/ComplexPlugin", "ComplexPlugin")
  @js.native
  open class ComplexPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def complex(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imabs(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imaginary(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imargument(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imconjugate(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imcos(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imcosh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imcot(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imcsc(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imcsch(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imdiv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imexp(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imln(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imlog10(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imlog2(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def impower(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def improduct(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imreal(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsec(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsech(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsinh(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsqrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsub(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imsum(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def imtan(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object ComplexPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/ComplexPlugin", "ComplexPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/ComplexPlugin", "ComplexPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: COMPLEX = js.native
    inline def implementedFunctions_=(x: COMPLEX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
