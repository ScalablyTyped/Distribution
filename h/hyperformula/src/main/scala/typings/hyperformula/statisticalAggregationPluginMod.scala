package typings.hyperformula

import typings.hyperformula.anon.AVEDEV
import typings.hyperformula.anon.CHITEST
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticalAggregationPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin.StatisticalAggregationPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin.StatisticalAggregationPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin.StatisticalAggregationPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin", "StatisticalAggregationPlugin")
  @js.native
  open class StatisticalAggregationPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def avedev(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def chisqtest(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def correl(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def covariancep(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def covariances(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def devsq(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ftest(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def geomean(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def harmean(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def rsq(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def skew(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def skewp(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def slope(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def steyx(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ttest(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def ztest(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object StatisticalAggregationPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin", "StatisticalAggregationPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin", "StatisticalAggregationPlugin.aliases")
    @js.native
    def aliases: CHITEST = js.native
    inline def aliases_=(x: CHITEST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/plugin/StatisticalAggregationPlugin", "StatisticalAggregationPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: AVEDEV = js.native
    inline def implementedFunctions_=(x: AVEDEV): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
