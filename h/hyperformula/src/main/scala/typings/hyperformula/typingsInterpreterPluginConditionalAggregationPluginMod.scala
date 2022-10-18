package typings.hyperformula

import typings.hyperformula.anon.AVERAGEIF
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginConditionalAggregationPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/ConditionalAggregationPlugin.ConditionalAggregationPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/ConditionalAggregationPlugin.ConditionalAggregationPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/ConditionalAggregationPlugin.ConditionalAggregationPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/ConditionalAggregationPlugin", "ConditionalAggregationPlugin")
  @js.native
  open class ConditionalAggregationPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def averageif(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var computeConditionalAggregationFunction: Any = js.native
    
    /**
      * Corresponds to COUNTIF(Range, Criterion)
      *
      * Range is the range to which criterion is to be applied.
      * Criterion is the criteria used to choose which cells will be included in sum.
      *
      * Returns number of cells on which criteria evaluate to true.
      *
      * @param ast
      * @param state
      */
    def countif(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def countifs(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def maxifs(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def minifs(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to SUMIF(Range, Criterion, SumRange)
      *
      * Range is the range to which criterion is to be applied.
      * Criterion is the criteria used to choose which cells will be included in sum.
      * SumRange is the range on which adding will be performed.
      *
      * @param ast
      * @param state
      */
    def sumif(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sumifs(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object ConditionalAggregationPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/ConditionalAggregationPlugin", "ConditionalAggregationPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/ConditionalAggregationPlugin", "ConditionalAggregationPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: AVERAGEIF = js.native
    inline def implementedFunctions_=(x: AVERAGEIF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
