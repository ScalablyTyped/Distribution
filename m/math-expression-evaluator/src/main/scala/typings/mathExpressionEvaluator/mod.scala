package typings.mathExpressionEvaluator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("math-expression-evaluator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Mexp
  @JSImport("math-expression-evaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addToken(tokens: js.Array[Token]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addToken")(tokens.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  inline def eval(exp: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def eval(exp: String, mexp: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], mexp.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def eval(exp: String, tokens: js.Array[Token]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def eval(exp: String, tokens: js.Array[Token], pair: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], pair.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def eval(exp: String, tokens: Unit, pair: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], pair.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def lex(inp: String): Mexp = ^.asInstanceOf[js.Dynamic].applyDynamic("lex")(inp.asInstanceOf[js.Any]).asInstanceOf[Mexp]
  inline def lex(inp: String, tokens: js.Array[Token]): Mexp = (^.asInstanceOf[js.Dynamic].applyDynamic("lex")(inp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Mexp]
  
  /* static member */
  @JSImport("math-expression-evaluator", "tokenTypes")
  @js.native
  def tokenTypes: TokenTypes_ = js.native
  inline def tokenTypes_=(x: TokenTypes_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenTypes")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Mexp extends StObject {
    
    def formulaEval(): Mexp = js.native
    
    def postfixEval(): Double | String = js.native
    def postfixEval(pair: js.Object): Double | String = js.native
    
    def toPostfix(): Mexp = js.native
  }
  
  trait Token extends StObject {
    
    var numberOfArguments: js.UndefOr[Double] = js.undefined
    
    var preced: js.UndefOr[Double] = js.undefined
    
    var show: String
    
    var token: String
    
    var `type`: Double
    
    var value: js.UndefOr[String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])] = js.undefined
  }
  object Token {
    
    inline def apply(show: String, token: String, `type`: Double): Token = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setNumberOfArguments(value: Double): Self = StObject.set(x, "numberOfArguments", value.asInstanceOf[js.Any])
      
      inline def setNumberOfArgumentsUndefined: Self = StObject.set(x, "numberOfArguments", js.undefined)
      
      inline def setPreced(value: Double): Self = StObject.set(x, "preced", value.asInstanceOf[js.Any])
      
      inline def setPrecedUndefined: Self = StObject.set(x, "preced", js.undefined)
      
      inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction2(value: (/* a */ Double, /* b */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.FUNCTION_WITH_ONE_ARG
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.NUMBER
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_HIGH_PRECENDENCE
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.CONSTANT
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.OPENING_PARENTHESIS
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.CLOSING_PARENTHESIS
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.DECIMAL
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.POSTFIX_FUNCTION_WITH_ONE_ARG
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.FUNCTION_WITH_N_ARGS
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_LOW_PRECENDENCE
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_PERMUTATION
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.COMMA
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.EVALUATED_FUNCTION
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.EVALUATED_FUNCTION_PARAMETER
    - typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.SPACE
  */
  trait TokenName extends StObject
  object TokenName {
    
    inline def BINARY_OPERATOR_HIGH_PRECENDENCE: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_HIGH_PRECENDENCE = "BINARY_OPERATOR_HIGH_PRECENDENCE".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_HIGH_PRECENDENCE]
    
    inline def BINARY_OPERATOR_LOW_PRECENDENCE: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_LOW_PRECENDENCE = "BINARY_OPERATOR_LOW_PRECENDENCE".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_LOW_PRECENDENCE]
    
    inline def BINARY_OPERATOR_PERMUTATION: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_PERMUTATION = "BINARY_OPERATOR_PERMUTATION".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.BINARY_OPERATOR_PERMUTATION]
    
    inline def CLOSING_PARENTHESIS: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.CLOSING_PARENTHESIS = "CLOSING_PARENTHESIS".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.CLOSING_PARENTHESIS]
    
    inline def COMMA: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.COMMA = "COMMA".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.COMMA]
    
    inline def CONSTANT: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.CONSTANT = "CONSTANT".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.CONSTANT]
    
    inline def DECIMAL: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.DECIMAL = "DECIMAL".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.DECIMAL]
    
    inline def EVALUATED_FUNCTION: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.EVALUATED_FUNCTION = "EVALUATED_FUNCTION".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.EVALUATED_FUNCTION]
    
    inline def EVALUATED_FUNCTION_PARAMETER: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.EVALUATED_FUNCTION_PARAMETER = "EVALUATED_FUNCTION_PARAMETER".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.EVALUATED_FUNCTION_PARAMETER]
    
    inline def FUNCTION_WITH_N_ARGS: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.FUNCTION_WITH_N_ARGS = "FUNCTION_WITH_N_ARGS".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.FUNCTION_WITH_N_ARGS]
    
    inline def FUNCTION_WITH_ONE_ARG: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.FUNCTION_WITH_ONE_ARG = "FUNCTION_WITH_ONE_ARG".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.FUNCTION_WITH_ONE_ARG]
    
    inline def NUMBER: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.NUMBER = "NUMBER".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.NUMBER]
    
    inline def OPENING_PARENTHESIS: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.OPENING_PARENTHESIS = "OPENING_PARENTHESIS".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.OPENING_PARENTHESIS]
    
    inline def POSTFIX_FUNCTION_WITH_ONE_ARG: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.POSTFIX_FUNCTION_WITH_ONE_ARG = "POSTFIX_FUNCTION_WITH_ONE_ARG".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.POSTFIX_FUNCTION_WITH_ONE_ARG]
    
    inline def SPACE: typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.SPACE = "SPACE".asInstanceOf[typings.mathExpressionEvaluator.mathExpressionEvaluatorStrings.SPACE]
  }
  
  /* Inlined {[ K in math-expression-evaluator.math-expression-evaluator.TokenName ]: number} */
  trait TokenTypes_ extends StObject {
    
    var BINARY_OPERATOR_HIGH_PRECENDENCE: Double
    
    var BINARY_OPERATOR_LOW_PRECENDENCE: Double
    
    var BINARY_OPERATOR_PERMUTATION: Double
    
    var CLOSING_PARENTHESIS: Double
    
    var COMMA: Double
    
    var CONSTANT: Double
    
    var DECIMAL: Double
    
    var EVALUATED_FUNCTION: Double
    
    var EVALUATED_FUNCTION_PARAMETER: Double
    
    var FUNCTION_WITH_N_ARGS: Double
    
    var FUNCTION_WITH_ONE_ARG: Double
    
    var NUMBER: Double
    
    var OPENING_PARENTHESIS: Double
    
    var POSTFIX_FUNCTION_WITH_ONE_ARG: Double
    
    var SPACE: Double
  }
  object TokenTypes_ {
    
    inline def apply(
      BINARY_OPERATOR_HIGH_PRECENDENCE: Double,
      BINARY_OPERATOR_LOW_PRECENDENCE: Double,
      BINARY_OPERATOR_PERMUTATION: Double,
      CLOSING_PARENTHESIS: Double,
      COMMA: Double,
      CONSTANT: Double,
      DECIMAL: Double,
      EVALUATED_FUNCTION: Double,
      EVALUATED_FUNCTION_PARAMETER: Double,
      FUNCTION_WITH_N_ARGS: Double,
      FUNCTION_WITH_ONE_ARG: Double,
      NUMBER: Double,
      OPENING_PARENTHESIS: Double,
      POSTFIX_FUNCTION_WITH_ONE_ARG: Double,
      SPACE: Double
    ): TokenTypes_ = {
      val __obj = js.Dynamic.literal(BINARY_OPERATOR_HIGH_PRECENDENCE = BINARY_OPERATOR_HIGH_PRECENDENCE.asInstanceOf[js.Any], BINARY_OPERATOR_LOW_PRECENDENCE = BINARY_OPERATOR_LOW_PRECENDENCE.asInstanceOf[js.Any], BINARY_OPERATOR_PERMUTATION = BINARY_OPERATOR_PERMUTATION.asInstanceOf[js.Any], CLOSING_PARENTHESIS = CLOSING_PARENTHESIS.asInstanceOf[js.Any], COMMA = COMMA.asInstanceOf[js.Any], CONSTANT = CONSTANT.asInstanceOf[js.Any], DECIMAL = DECIMAL.asInstanceOf[js.Any], EVALUATED_FUNCTION = EVALUATED_FUNCTION.asInstanceOf[js.Any], EVALUATED_FUNCTION_PARAMETER = EVALUATED_FUNCTION_PARAMETER.asInstanceOf[js.Any], FUNCTION_WITH_N_ARGS = FUNCTION_WITH_N_ARGS.asInstanceOf[js.Any], FUNCTION_WITH_ONE_ARG = FUNCTION_WITH_ONE_ARG.asInstanceOf[js.Any], NUMBER = NUMBER.asInstanceOf[js.Any], OPENING_PARENTHESIS = OPENING_PARENTHESIS.asInstanceOf[js.Any], POSTFIX_FUNCTION_WITH_ONE_ARG = POSTFIX_FUNCTION_WITH_ONE_ARG.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenTypes_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenTypes_] (val x: Self) extends AnyVal {
      
      inline def setBINARY_OPERATOR_HIGH_PRECENDENCE(value: Double): Self = StObject.set(x, "BINARY_OPERATOR_HIGH_PRECENDENCE", value.asInstanceOf[js.Any])
      
      inline def setBINARY_OPERATOR_LOW_PRECENDENCE(value: Double): Self = StObject.set(x, "BINARY_OPERATOR_LOW_PRECENDENCE", value.asInstanceOf[js.Any])
      
      inline def setBINARY_OPERATOR_PERMUTATION(value: Double): Self = StObject.set(x, "BINARY_OPERATOR_PERMUTATION", value.asInstanceOf[js.Any])
      
      inline def setCLOSING_PARENTHESIS(value: Double): Self = StObject.set(x, "CLOSING_PARENTHESIS", value.asInstanceOf[js.Any])
      
      inline def setCOMMA(value: Double): Self = StObject.set(x, "COMMA", value.asInstanceOf[js.Any])
      
      inline def setCONSTANT(value: Double): Self = StObject.set(x, "CONSTANT", value.asInstanceOf[js.Any])
      
      inline def setDECIMAL(value: Double): Self = StObject.set(x, "DECIMAL", value.asInstanceOf[js.Any])
      
      inline def setEVALUATED_FUNCTION(value: Double): Self = StObject.set(x, "EVALUATED_FUNCTION", value.asInstanceOf[js.Any])
      
      inline def setEVALUATED_FUNCTION_PARAMETER(value: Double): Self = StObject.set(x, "EVALUATED_FUNCTION_PARAMETER", value.asInstanceOf[js.Any])
      
      inline def setFUNCTION_WITH_N_ARGS(value: Double): Self = StObject.set(x, "FUNCTION_WITH_N_ARGS", value.asInstanceOf[js.Any])
      
      inline def setFUNCTION_WITH_ONE_ARG(value: Double): Self = StObject.set(x, "FUNCTION_WITH_ONE_ARG", value.asInstanceOf[js.Any])
      
      inline def setNUMBER(value: Double): Self = StObject.set(x, "NUMBER", value.asInstanceOf[js.Any])
      
      inline def setOPENING_PARENTHESIS(value: Double): Self = StObject.set(x, "OPENING_PARENTHESIS", value.asInstanceOf[js.Any])
      
      inline def setPOSTFIX_FUNCTION_WITH_ONE_ARG(value: Double): Self = StObject.set(x, "POSTFIX_FUNCTION_WITH_ONE_ARG", value.asInstanceOf[js.Any])
      
      inline def setSPACE(value: Double): Self = StObject.set(x, "SPACE", value.asInstanceOf[js.Any])
    }
  }
}
