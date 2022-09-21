package typings.hyperformula

import typings.hyperformula.anon.AVERAGE
import typings.hyperformula.anon.STDEV
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.ExtendedNumber
import typings.hyperformula.interpreterValueMod.InternalScalarValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericAggregationPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/NumericAggregationPlugin.NumericAggregationPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/NumericAggregationPlugin.NumericAggregationPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/NumericAggregationPlugin.NumericAggregationPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/NumericAggregationPlugin", "NumericAggregationPlugin")
  @js.native
  open class NumericAggregationPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /* private */ var addWithEpsilonRaw: Any = js.native
    
    def average(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def averagea(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def count(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def counta(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    /* private */ var doAverage: Any = js.native
    
    /* private */ var doCount: Any = js.native
    
    /* private */ var doCounta: Any = js.native
    
    /* private */ var doMax: Any = js.native
    
    /* private */ var doMin: Any = js.native
    
    /* private */ var doProduct: Any = js.native
    
    /* private */ var doStdevP: Any = js.native
    
    /* private */ var doStdevS: Any = js.native
    
    /* private */ var doSum: Any = js.native
    
    /* private */ var doVarP: Any = js.native
    
    /* private */ var doVarS: Any = js.native
    
    /**
      * Performs range operation on given range
      *
      * @param ast - cell range ast
      * @param state
      * @param initialAccValue - initial accumulator value for reducing function
      * @param functionName - function name to use as cache key
      * @param reducingFunction - reducing function
      * @param mapFunction
      * @param coercionFunction
      */
    /* private */ var evaluateRange: Any = js.native
    
    /**
      * Returns list of values for given range and function name
      *
      * If range is dependent on smaller range, list will contain value of smaller range for this function
      * and values of cells that are not present in smaller range
      *
      * @param functionName - function name (e.g. SUM)
      * @param range - cell range
      * @param rangeVertex
      * @param mapFunction
      * @param coercionFunction
      */
    /* private */ var getRangeValues: Any = js.native
    
    /**
      * Corresponds to MAX(Number1, Number2, ...).
      *
      * Returns a max of given numbers.
      *
      * @param ast
      * @param state
      */
    def max(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def maxa(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    /**
      * Corresponds to MIN(Number1, Number2, ...).
      *
      * Returns a min of given numbers.
      *
      * @param ast
      * @param state
      */
    def min(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def mina(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def product(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    /**
      * Reduces procedure arguments with given reducing function
      *
      * @param args
      * @param state
      * @param initialAccValue - "neutral" value (equivalent of 0)
      * @param functionName - function name to use as cache key
      * @param reducingFunction - reducing function
      * @param mapFunction
      * @param coercionFunction
      * */
    /* private */ var reduce: Any = js.native
    
    /* private */ var reduceAggregate: Any = js.native
    
    /* private */ var reduceAggregateA: Any = js.native
    
    def stdeva(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def stdevp(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def stdevpa(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def stdevs(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def subtotal(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    /**
      * Corresponds to SUM(Number1, Number2, ...).
      *
      * Returns a sum of given numbers.
      *
      * @param ast
      * @param state
      */
    def sum(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def sumsq(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def vara(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def varp(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def varpa(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    def vars(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
  }
  /* static members */
  object NumericAggregationPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/NumericAggregationPlugin", "NumericAggregationPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/NumericAggregationPlugin", "NumericAggregationPlugin.aliases")
    @js.native
    def aliases: STDEV = js.native
    inline def aliases_=(x: STDEV): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aliases")(x.asInstanceOf[js.Any])
    
    @JSImport("hyperformula/typings/interpreter/plugin/NumericAggregationPlugin", "NumericAggregationPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: AVERAGE = js.native
    inline def implementedFunctions_=(x: AVERAGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  type BinaryOperation[T] = js.Function2[/* left */ T, /* right */ T, T]
  
  type MapOperation[T] = js.Function1[/* arg */ ExtendedNumber, T]
}
