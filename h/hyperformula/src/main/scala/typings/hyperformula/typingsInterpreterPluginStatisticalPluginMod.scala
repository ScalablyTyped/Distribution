package typings.hyperformula

import typings.hyperformula.anon.BETADIST
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginStatisticalPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/StatisticalPlugin.StatisticalPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/StatisticalPlugin.StatisticalPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/StatisticalPlugin.StatisticalPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/StatisticalPlugin", "StatisticalPlugin")
  @js.native
  open class StatisticalPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def besselifn(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def besseljfn(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def besselkfn(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def besselyfn(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def betadist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def betainv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def binomialdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def binomialinv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def chisqdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def chisqdistrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def chisqinv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def chisqinvrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def confidencenorm(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def confidencet(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def erf(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def erfc(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def expondist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fdistrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def finv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def finvrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fisher(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def fisherinv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gamma(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gammadist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gammainv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gammaln(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def gauss(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def hypgeomdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def lognormdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def lognorminv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def negbinomdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def normdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def norminv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def normsdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def normsinv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def phi(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def poissondist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def standardize(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tdist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tdist2t(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tdistold(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tdistrt(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tinv(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def tinv2t(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def weibulldist(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object StatisticalPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/StatisticalPlugin", "StatisticalPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/StatisticalPlugin", "StatisticalPlugin.aliases")
    @js.native
    def aliases: BETADIST = js.native
    inline def aliases_=(x: BETADIST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/plugin/StatisticalPlugin", "StatisticalPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
