package typings.hyperformula

import typings.hyperformula.anon.DATE
import typings.hyperformula.astMod.ProcedureAst
import typings.hyperformula.functionPluginMod.FunctionPlugin
import typings.hyperformula.interpreterInterpreterMod.Interpreter
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.InterpreterValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/DateTimePlugin.DateTimePlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/DateTimePlugin.DateTimePlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/DateTimePlugin.DateTimePlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/DateTimePlugin", "DateTimePlugin")
  @js.native
  open class DateTimePlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /* private */ var countWorkdays: Any = js.native
    
    /**
      * Corresponds to DATE(year, month, day)
      *
      * Converts a provided year, month and day into date
      *
      * @param ast
      * @param state
      */
    def date(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def datedif(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def datevalue(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def day(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def days(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def days360(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var days360Core: Any = js.native
    
    def edate(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def eomonth(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def hour(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def interval(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def isoweeknum(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var isoweeknumCore: Any = js.native
    
    def minute(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to MONTH(date)
      *
      * Returns the month of the year specified by a given date
      *
      * @param ast
      * @param state
      */
    def month(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def networkdays(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var networkdayscore: Any = js.native
    
    def networkdaysintl(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def now(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def second(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var simpleRangeToFilteredHolidays: Any = js.native
    
    /**
      * Corresponds to TEXT(number, format)
      *
      * Tries to convert number to specified date format.
      *
      * @param ast
      * @param state
      */
    def text(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def time(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def timevalue(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def today(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def weekday(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def weeknum(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def workday(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var workdaycore: Any = js.native
    
    def workdayintl(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to YEAR(date)
      *
      * Returns the year specified by a given date
      *
      * @param ast
      * @param state
      */
    def year(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def yearfrac(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object DateTimePlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/DateTimePlugin", "DateTimePlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/DateTimePlugin", "DateTimePlugin.implementedFunctions")
    @js.native
    def implementedFunctions: DATE = js.native
    inline def implementedFunctions_=(x: DATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
