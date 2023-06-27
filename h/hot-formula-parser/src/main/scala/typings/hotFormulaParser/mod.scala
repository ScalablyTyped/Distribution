package typings.hotFormulaParser

import typings.hotFormulaParser.anon.Column
import typings.hotFormulaParser.anon.Error
import typings.hotFormulaParser.anon.Index
import typings.hotFormulaParser.hotFormulaParserStrings.DIVSlash0
import typings.hotFormulaParser.hotFormulaParserStrings.ERROR
import typings.hotFormulaParser.hotFormulaParserStrings.NAME
import typings.hotFormulaParser.hotFormulaParserStrings.NSlashA
import typings.hotFormulaParser.hotFormulaParserStrings.NULL
import typings.hotFormulaParser.hotFormulaParserStrings.NUM
import typings.hotFormulaParser.hotFormulaParserStrings.REF
import typings.hotFormulaParser.hotFormulaParserStrings.VALUE
import typings.hotFormulaParser.hotFormulaParserStrings.callCellValue
import typings.hotFormulaParser.hotFormulaParserStrings.callFunction
import typings.hotFormulaParser.hotFormulaParserStrings.callRangeValue
import typings.hotFormulaParser.hotFormulaParserStrings.callVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hot-formula-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hot-formula-parser", "ERROR")
  @js.native
  val ERROR_ : ERROR = js.native
  
  @JSImport("hot-formula-parser", "ERROR_DIV_ZERO")
  @js.native
  val ERROR_DIV_ZERO: DIVSlash0 = js.native
  
  @JSImport("hot-formula-parser", "ERROR_NAME")
  @js.native
  val ERROR_NAME: NAME = js.native
  
  @JSImport("hot-formula-parser", "ERROR_NOT_AVAILABLE")
  @js.native
  val ERROR_NOT_AVAILABLE: NSlashA = js.native
  
  @JSImport("hot-formula-parser", "ERROR_NULL")
  @js.native
  val ERROR_NULL: NULL = js.native
  
  @JSImport("hot-formula-parser", "ERROR_NUM")
  @js.native
  val ERROR_NUM: NUM = js.native
  
  @JSImport("hot-formula-parser", "ERROR_REF")
  @js.native
  val ERROR_REF: REF = js.native
  
  @JSImport("hot-formula-parser", "ERROR_VALUE")
  @js.native
  val ERROR_VALUE: VALUE = js.native
  
  @JSImport("hot-formula-parser", "Parser")
  @js.native
  open class Parser () extends StObject {
    
    /**
      * Retrieves the defined function.
      *
      * @param name - the function name.
      * @returns the handler for the defined function.
      */
    def getFunction(name: String): js.Function1[/* params */ Any, Any] = js.native
    
    /**
      * Retrieves the defined variable.
      *
      * @param name - the variable name.
      * @returns - the value given to the variable.
      */
    def getVariable(name: String): Any = js.native
    
    @JSName("on")
    def on_callCellValue(hook: callCellValue, handler: js.Function2[/* cellCoord */ Column, /* done */ DoneCallback, Unit]): Unit = js.native
    @JSName("on")
    def on_callFunction(
      hook: callFunction,
      handler: js.Function3[/* name */ String, /* params */ Any, /* done */ DoneCallback, Unit]
    ): Unit = js.native
    @JSName("on")
    def on_callRangeValue(
      hook: callRangeValue,
      handler: js.Function3[/* startCellCoord */ Column, /* endCellCoord */ Column, /* done */ DoneCallback, Unit]
    ): Unit = js.native
    /**
      * Hook that listens to reference calls by the {@link parse} method and allows for side effects on that event.
      *
      * @param hook - hook's name.
      * @param handler - the callback to produce the side effect.
      */
    @JSName("on")
    def on_callVariable(hook: callVariable, handler: js.Function2[/* name */ String, /* done */ DoneCallback, Unit]): Unit = js.native
    
    /**
      * Parse formula expression.
      *
      * @param expression - to parse.
      * @returns Returns an object with two properties `error` and `result`.
      */
    def parse(value: String): Error = js.native
    
    /**
      * Allows for the definition of new functions. If the name given to the new function is one of the {@link SUPPORTED_FORMULAS}, the latter will be overwritten.
      *
      * @param name - the function name.
      * @param handler - the callback to produce the side effect.
      * @returns This instance of {@link Parser}
      */
    def setFunction(name: String, handler: js.Function1[/* params */ Any, Any]): Parser = js.native
    
    /**
      * Allows for the definition of new variables. If new definitions variables have the same name as old ones, the latter will be overwritten.
      * Built-in variables are `TRUE`, `FALSE` and `NULL`.
      *
      * @param name - the variable name.
      * @param value - the value given to the variable.
      * @returns This instance of {@link Parser}
      */
    def setVariable(name: String, value: Any): Parser = js.native
  }
  
  @JSImport("hot-formula-parser", "SUPPORTED_FORMULAS")
  @js.native
  val SUPPORTED_FORMULAS: js.Array[Any] = js.native
  
  inline def columnIndexToLabel(column: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("columnIndexToLabel")(column.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def columnLabelToIndex(label: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("columnLabelToIndex")(label.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def error(error: FormulaErrorId): FormulaErrorId | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[FormulaErrorId | Null]
  inline def error(error: FormulaErrorType): FormulaErrorId | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[FormulaErrorId | Null]
  
  inline def extractLabel(label: String): js.Tuple2[Coordinate, Coordinate] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractLabel")(label.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Coordinate, Coordinate]]
  
  inline def rowIndexToLabel(row: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rowIndexToLabel")(row.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rowLabelToIndex(label: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rowLabelToIndex")(label.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toLabel(row: Index, column: Index): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLabel")(row.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Coordinate extends StObject {
    
    var index: Double
    
    var isAbsolute: Boolean
    
    var label: String
  }
  object Coordinate {
    
    inline def apply(index: Double, isAbsolute: Boolean, label: String): Coordinate = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isAbsolute = isAbsolute.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsAbsolute(value: Boolean): Self = StObject.set(x, "isAbsolute", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type DoneCallback = js.Function1[/* value */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignERRORExclamationmark
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignDIVSlash0Exclamationmark
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNAMEQuestionmark
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNSlashA
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNULLExclamationmark
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNUMExclamationmark
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignREFExclamationmark
    - typings.hotFormulaParser.hotFormulaParserStrings.NumbersignVALUEExclamationmark
  */
  trait FormulaErrorId extends StObject
  object FormulaErrorId {
    
    inline def NumbersignDIVSlash0Exclamationmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignDIVSlash0Exclamationmark = "#DIV/0!".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignDIVSlash0Exclamationmark]
    
    inline def NumbersignERRORExclamationmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignERRORExclamationmark = "#ERROR!".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignERRORExclamationmark]
    
    inline def NumbersignNAMEQuestionmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNAMEQuestionmark = "#NAME?".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNAMEQuestionmark]
    
    inline def NumbersignNSlashA: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNSlashA = "#N/A".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNSlashA]
    
    inline def NumbersignNULLExclamationmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNULLExclamationmark = "#NULL!".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNULLExclamationmark]
    
    inline def NumbersignNUMExclamationmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNUMExclamationmark = "#NUM!".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignNUMExclamationmark]
    
    inline def NumbersignREFExclamationmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignREFExclamationmark = "#REF!".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignREFExclamationmark]
    
    inline def NumbersignVALUEExclamationmark: typings.hotFormulaParser.hotFormulaParserStrings.NumbersignVALUEExclamationmark = "#VALUE!".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NumbersignVALUEExclamationmark]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hotFormulaParser.hotFormulaParserStrings.ERROR
    - typings.hotFormulaParser.hotFormulaParserStrings.DIVSlash0
    - typings.hotFormulaParser.hotFormulaParserStrings.NAME
    - typings.hotFormulaParser.hotFormulaParserStrings.NSlashA
    - typings.hotFormulaParser.hotFormulaParserStrings.NULL
    - typings.hotFormulaParser.hotFormulaParserStrings.NUM
    - typings.hotFormulaParser.hotFormulaParserStrings.REF
    - typings.hotFormulaParser.hotFormulaParserStrings.VALUE
  */
  trait FormulaErrorType extends StObject
  object FormulaErrorType {
    
    inline def DIVSlash0: typings.hotFormulaParser.hotFormulaParserStrings.DIVSlash0 = "DIV/0".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.DIVSlash0]
    
    inline def ERROR: typings.hotFormulaParser.hotFormulaParserStrings.ERROR = "ERROR".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.ERROR]
    
    inline def NAME: typings.hotFormulaParser.hotFormulaParserStrings.NAME = "NAME".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NAME]
    
    inline def NSlashA: typings.hotFormulaParser.hotFormulaParserStrings.NSlashA = "N/A".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NSlashA]
    
    inline def NULL: typings.hotFormulaParser.hotFormulaParserStrings.NULL = "NULL".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NULL]
    
    inline def NUM: typings.hotFormulaParser.hotFormulaParserStrings.NUM = "NUM".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.NUM]
    
    inline def REF: typings.hotFormulaParser.hotFormulaParserStrings.REF = "REF".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.REF]
    
    inline def VALUE: typings.hotFormulaParser.hotFormulaParserStrings.VALUE = "VALUE".asInstanceOf[typings.hotFormulaParser.hotFormulaParserStrings.VALUE]
  }
}
