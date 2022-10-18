package typings.hyperformula

import typings.hyperformula.anon.COLUMN
import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginInformationPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/InformationPlugin.InformationPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/InformationPlugin.InformationPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/InformationPlugin.InformationPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/InformationPlugin", "InformationPlugin")
  @js.native
  open class InformationPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to COLUMN(reference)
      *
      * Returns column number of a reference or a formula cell if reference not provided
      *
      * @param ast
      * @param state
      */
    def column(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to COLUMNS(range)
      *
      * Returns number of columns in provided range of cells
      *
      * @param ast
      * @param _state
      */
    def columns(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    /**
      * Corresponds to INDEX(range;)
      *
      * Returns specific position in 2d array.
      *
      * @param ast
      * @param state
      */
    def index(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISBINARY(value)
      *
      * Returns true if provided value is a valid binary number
      *
      * @param ast
      * @param state
      */
    def isbinary(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISBLANK(value)
      *
      * Checks whether provided cell reference is empty
      *
      * @param ast
      * @param state
      */
    def isblank(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISERR(value)
      *
      * Returns true if provided value is an error except #N/A!
      *
      * @param ast
      * @param state
      */
    def iserr(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISERROR(value)
      *
      * Checks whether provided value is an error
      *
      * @param ast
      * @param state
      */
    def iserror(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISFORMULA(value)
      *
      * Checks whether referenced cell is a formula
      *
      * @param ast
      * @param state
      */
    def isformula(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISLOGICAL(value)
      *
      * Checks whether provided cell reference is of logical type
      *
      * @param ast
      * @param state
      */
    def islogical(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISNA(value)
      *
      * Returns true if provided value is #N/A! error
      *
      * @param ast
      * @param state
      */
    def isna(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISNONTEXT(value)
      *
      * Checks whether provided cell reference is of logical type
      *
      * @param ast
      * @param state
      */
    def isnontext(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISNUMBER(value)
      *
      * Checks whether provided cell reference is a number
      *
      * @param ast
      * @param state
      */
    def isnumber(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISREF(value)
      *
      * Returns true if provided value is #REF! error
      *
      * @param ast
      * @param state
      */
    def isref(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ISTEXT(value)
      *
      * Checks whether provided cell reference is of logical type
      *
      * @param ast
      * @param state
      */
    def istext(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to NA()
      *
      * Returns #N/A!
      *
      * @param _ast
      * @param _state
      */
    def na(_ast: ProcedureAst, _state: InterpreterState): CellError = js.native
    
    /**
      * Corresponds to ROW(reference)
      *
      * Returns row number of a reference or a formula cell if reference not provided
      *
      * @param ast
      * @param state
      */
    def row(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to ROWS(range)
      *
      * Returns number of rows in provided range of cells
      *
      * @param ast
      * @param _state
      */
    def rows(ast: ProcedureAst, state: InterpreterState): InternalScalarValue = js.native
    
    /**
      * Corresponds to SHEET(value)
      *
      * Returns sheet number of a given value or a formula sheet number if no argument is provided
      *
      * @param ast
      * @param state
      * */
    def sheet(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to SHEETS(value)
      *
      * Returns number of sheet of a given reference or number of all sheets in workbook when no argument is provided.
      * It returns always 1 for a valid reference as 3D references are not supported.
      *
      * @param ast
      * @param state
      * */
    def sheets(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object InformationPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/InformationPlugin", "InformationPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/InformationPlugin", "InformationPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: COLUMN = js.native
    inline def implementedFunctions_=(x: COLUMN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
