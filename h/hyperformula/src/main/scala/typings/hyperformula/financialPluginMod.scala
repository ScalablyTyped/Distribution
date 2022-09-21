package typings.hyperformula

import typings.hyperformula.anon.CUMIPMT
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object financialPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/FinancialPlugin.FinancialPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/FinancialPlugin.FinancialPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/FinancialPlugin.FinancialPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/FinancialPlugin", "FinancialPlugin")
  @js.native
  open class FinancialPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def cumipmt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def cumprinc(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def db(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ddb(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def dollarde(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def dollarfr(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def effect(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fvschedule(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ipmt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ispmt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def mirr(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def nominal(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def nper(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def npv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def pduration(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def pmt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ppmt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def pv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def rate(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def rri(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sln(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def syd(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tbilleq(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tbillprice(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tbillyield(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def xnpv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object FinancialPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/FinancialPlugin", "FinancialPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/FinancialPlugin", "FinancialPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: CUMIPMT = js.native
    inline def implementedFunctions_=(x: CUMIPMT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
