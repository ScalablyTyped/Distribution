package typings.hyperformula

import typings.hyperformula.cellMod.CellError
import typings.hyperformula.configMod.Config
import typings.hyperformula.dateTimeHelperMod.DateTimeHelper
import typings.hyperformula.interpreterStateMod.InterpreterState
import typings.hyperformula.interpreterValueMod.ExtendedNumber
import typings.hyperformula.interpreterValueMod.InternalNoErrorScalarValue
import typings.hyperformula.interpreterValueMod.InternalScalarValue
import typings.hyperformula.interpreterValueMod.InterpreterValue
import typings.hyperformula.interpreterValueMod.NumberTypeWithFormat
import typings.hyperformula.interpreterValueMod.RawInterpreterValue
import typings.hyperformula.interpreterValueMod.RawNoErrorScalarValue
import typings.hyperformula.interpreterValueMod.RawScalarValue
import typings.hyperformula.maybeMod.Maybe
import typings.hyperformula.numberLiteralHelperMod.NumberLiteralHelper
import typings.hyperformula.simpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arithmeticHelperMod {
  
  @JSImport("hyperformula/typings/interpreter/ArithmeticHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/interpreter/ArithmeticHelper", "ArithmeticHelper")
  @js.native
  open class ArithmeticHelper protected () extends StObject {
    def this(config: Config, dateTimeHelper: DateTimeHelper, numberLiteralsHelper: NumberLiteralHelper) = this()
    
    def ExtendedNumberFactory(value: Double, typeFormat: NumberTypeWithFormat): ExtendedNumber = js.native
    
    /* private */ val actualEps: Any = js.native
    
    def addWithEpsilon(left: ExtendedNumber, right: ExtendedNumber): ExtendedNumber = js.native
    
    def addWithEpsilonRaw(left: Double, right: Double): Double = js.native
    
    /* private */ var buildRegex: Any = js.native
    
    def coerceComplexExactRanges(args: js.Array[InterpreterValue]): js.Array[complex] | CellError = js.native
    
    def coerceNonDateScalarToMaybeNumber(arg: InternalScalarValue): Maybe[ExtendedNumber] = js.native
    
    def coerceNumbersCoerceRangesDropNulls(args: js.Array[InterpreterValue]): js.Array[Double] | CellError = js.native
    
    def coerceNumbersExactRanges(args: js.Array[InterpreterValue]): js.Array[Double] | CellError = js.native
    
    def coerceScalarToComplex(arg: InternalScalarValue): complex | CellError = js.native
    
    def coerceScalarToNumberOrError(arg: InternalScalarValue): ExtendedNumber | CellError = js.native
    
    /* private */ var coerceStringToComplex: Any = js.native
    
    /* private */ var coerceStringToMaybeCurrencyNumber: Any = js.native
    
    /* private */ var coerceStringToMaybePercentNumber: Any = js.native
    
    def coerceToMaybeNumber(arg: InternalScalarValue): Maybe[ExtendedNumber] = js.native
    
    /* private */ val collator: Any = js.native
    
    /* private */ var compare: Any = js.native
    
    def concat(left: String, right: String): String = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ var currencyMatcher: Any = js.native
    
    /* private */ val dateTimeHelper: Any = js.native
    
    def divide(leftArg: ExtendedNumber, rightArg: ExtendedNumber): ExtendedNumber | CellError = js.native
    
    def eq(left: InternalNoErrorScalarValue, right: InternalNoErrorScalarValue): Boolean = js.native
    
    def eqMatcherFunction(pattern: String): js.Function1[/* arg */ RawInterpreterValue, Boolean] = js.native
    
    def floatCmp(leftArg: ExtendedNumber, rightArg: ExtendedNumber): Double = js.native
    
    def geq(left: InternalNoErrorScalarValue, right: InternalNoErrorScalarValue): Boolean = js.native
    
    def gt(left: InternalNoErrorScalarValue, right: InternalNoErrorScalarValue): Boolean = js.native
    
    def leq(left: InternalNoErrorScalarValue, right: InternalNoErrorScalarValue): Boolean = js.native
    
    def lt(left: InternalNoErrorScalarValue, right: InternalNoErrorScalarValue): Boolean = js.native
    
    def manyToCoercedNumbersDropNulls(args: js.Array[InternalScalarValue]): js.Array[Double] | CellError = js.native
    
    def manyToExactComplex(args: js.Array[InternalScalarValue]): js.Array[complex] | CellError = js.native
    
    def manyToExactNumbers(args: js.Array[InternalScalarValue]): js.Array[Double] | CellError = js.native
    
    /* private */ var manyToNumbers: Any = js.native
    
    def manyToOnlyNumbersDropNulls(args: js.Array[InterpreterValue]): js.Array[Double] | CellError = js.native
    
    def multiply(left: ExtendedNumber, right: ExtendedNumber): ExtendedNumber = js.native
    
    def neq(left: InternalNoErrorScalarValue, right: InternalNoErrorScalarValue): Boolean = js.native
    
    def neqMatcherFunction(pattern: String): js.Function1[/* arg */ RawInterpreterValue, Boolean] = js.native
    
    def nonstrictadd(left: RawScalarValue, right: RawScalarValue): Double | CellError = js.native
    
    /* private */ var normalizeString: Any = js.native
    
    /* private */ val numberLiteralsHelper: Any = js.native
    
    /* private */ var parseComplexToken: Any = js.native
    
    def pow(left: ExtendedNumber, right: ExtendedNumber): Double = js.native
    
    def requiresRegex(pattern: String): Boolean = js.native
    
    def searchString(pattern: String, text: String): Double = js.native
    
    /* private */ var stringCmp: Any = js.native
    
    /**
      * Subtracts two numbers
      *
      * Implementation of subtracting which is used in interpreter.
      *
      * @param left - left operand of subtraction
      * @param right - right operand of subtraction
      * @param eps - precision of comparison
      */
    def subtract(leftArg: ExtendedNumber, rightArg: ExtendedNumber): ExtendedNumber = js.native
    
    def unaryMinus(arg: ExtendedNumber): ExtendedNumber = js.native
    
    def unaryPercent(arg: ExtendedNumber): ExtendedNumber = js.native
    
    def unaryPlus(arg: InternalScalarValue): InternalScalarValue = js.native
  }
  
  inline def coerceBooleanToNumber(arg: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceBooleanToNumber")(arg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def coerceComplexToString(hasReIm: complex): String | CellError = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceComplexToString")(hasReIm.asInstanceOf[js.Any]).asInstanceOf[String | CellError]
  inline def coerceComplexToString(hasReIm: complex, symb: String): String | CellError = (^.asInstanceOf[js.Dynamic].applyDynamic("coerceComplexToString")(hasReIm.asInstanceOf[js.Any], symb.asInstanceOf[js.Any])).asInstanceOf[String | CellError]
  
  inline def coerceEmptyToValue(arg: InternalNoErrorScalarValue): RawNoErrorScalarValue = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceEmptyToValue")(arg.asInstanceOf[js.Any]).asInstanceOf[RawNoErrorScalarValue]
  
  inline def coerceRangeToScalar(arg: SimpleRangeValue, state: InterpreterState): Maybe[InternalScalarValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("coerceRangeToScalar")(arg.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Maybe[InternalScalarValue]]
  
  inline def coerceScalarToBoolean(arg: InternalScalarValue): js.UndefOr[Boolean | CellError] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceScalarToBoolean")(arg.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean | CellError]]
  
  inline def coerceScalarToString(arg: InternalScalarValue): String | CellError = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceScalarToString")(arg.asInstanceOf[js.Any]).asInstanceOf[String | CellError]
  
  inline def coerceToRange(arg: InterpreterValue): SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceToRange")(arg.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue]
  
  inline def coerceToRangeNumbersOrError(arg: InterpreterValue): SimpleRangeValue | CellError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceToRangeNumbersOrError")(arg.asInstanceOf[js.Any]).asInstanceOf[SimpleRangeValue | CellError | Null]
  
  inline def fixNegativeZero(arg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fixNegativeZero")(arg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def forceNormalizeString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forceNormalizeString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isNumberOverflow(arg: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberOverflow")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeString(str: String, form: NormalizationForm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeString")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def numberCmp(leftArg: ExtendedNumber, rightArg: ExtendedNumber): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("numberCmp")(leftArg.asInstanceOf[js.Any], rightArg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def zeroIfEmpty(arg: RawNoErrorScalarValue): RawNoErrorScalarValue = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroIfEmpty")(arg.asInstanceOf[js.Any]).asInstanceOf[RawNoErrorScalarValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hyperformula.hyperformulaStrings.nfc
    - typings.hyperformula.hyperformulaStrings.nfd
    - typings.hyperformula.hyperformulaStrings.nfkc
    - typings.hyperformula.hyperformulaStrings.nfkd
  */
  trait NormalizationForm extends StObject
  object NormalizationForm {
    
    inline def nfc: typings.hyperformula.hyperformulaStrings.nfc = "nfc".asInstanceOf[typings.hyperformula.hyperformulaStrings.nfc]
    
    inline def nfd: typings.hyperformula.hyperformulaStrings.nfd = "nfd".asInstanceOf[typings.hyperformula.hyperformulaStrings.nfd]
    
    inline def nfkc: typings.hyperformula.hyperformulaStrings.nfkc = "nfkc".asInstanceOf[typings.hyperformula.hyperformulaStrings.nfkc]
    
    inline def nfkd: typings.hyperformula.hyperformulaStrings.nfkd = "nfkd".asInstanceOf[typings.hyperformula.hyperformulaStrings.nfkd]
  }
  
  type complex = js.Tuple2[Double, Double]
}
