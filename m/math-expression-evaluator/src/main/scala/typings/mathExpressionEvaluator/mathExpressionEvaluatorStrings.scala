package typings.mathExpressionEvaluator

import typings.mathExpressionEvaluator.mod.TokenName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathExpressionEvaluatorStrings {
  
  @js.native
  sealed trait BINARY_OPERATOR_HIGH_PRECENDENCE
    extends StObject
       with TokenName
  inline def BINARY_OPERATOR_HIGH_PRECENDENCE: BINARY_OPERATOR_HIGH_PRECENDENCE = "BINARY_OPERATOR_HIGH_PRECENDENCE".asInstanceOf[BINARY_OPERATOR_HIGH_PRECENDENCE]
  
  @js.native
  sealed trait BINARY_OPERATOR_LOW_PRECENDENCE
    extends StObject
       with TokenName
  inline def BINARY_OPERATOR_LOW_PRECENDENCE: BINARY_OPERATOR_LOW_PRECENDENCE = "BINARY_OPERATOR_LOW_PRECENDENCE".asInstanceOf[BINARY_OPERATOR_LOW_PRECENDENCE]
  
  @js.native
  sealed trait BINARY_OPERATOR_PERMUTATION
    extends StObject
       with TokenName
  inline def BINARY_OPERATOR_PERMUTATION: BINARY_OPERATOR_PERMUTATION = "BINARY_OPERATOR_PERMUTATION".asInstanceOf[BINARY_OPERATOR_PERMUTATION]
  
  @js.native
  sealed trait CLOSING_PARENTHESIS
    extends StObject
       with TokenName
  inline def CLOSING_PARENTHESIS: CLOSING_PARENTHESIS = "CLOSING_PARENTHESIS".asInstanceOf[CLOSING_PARENTHESIS]
  
  @js.native
  sealed trait COMMA
    extends StObject
       with TokenName
  inline def COMMA: COMMA = "COMMA".asInstanceOf[COMMA]
  
  @js.native
  sealed trait CONSTANT
    extends StObject
       with TokenName
  inline def CONSTANT: CONSTANT = "CONSTANT".asInstanceOf[CONSTANT]
  
  @js.native
  sealed trait DECIMAL
    extends StObject
       with TokenName
  inline def DECIMAL: DECIMAL = "DECIMAL".asInstanceOf[DECIMAL]
  
  @js.native
  sealed trait EVALUATED_FUNCTION
    extends StObject
       with TokenName
  inline def EVALUATED_FUNCTION: EVALUATED_FUNCTION = "EVALUATED_FUNCTION".asInstanceOf[EVALUATED_FUNCTION]
  
  @js.native
  sealed trait EVALUATED_FUNCTION_PARAMETER
    extends StObject
       with TokenName
  inline def EVALUATED_FUNCTION_PARAMETER: EVALUATED_FUNCTION_PARAMETER = "EVALUATED_FUNCTION_PARAMETER".asInstanceOf[EVALUATED_FUNCTION_PARAMETER]
  
  @js.native
  sealed trait FUNCTION_WITH_N_ARGS
    extends StObject
       with TokenName
  inline def FUNCTION_WITH_N_ARGS: FUNCTION_WITH_N_ARGS = "FUNCTION_WITH_N_ARGS".asInstanceOf[FUNCTION_WITH_N_ARGS]
  
  @js.native
  sealed trait FUNCTION_WITH_ONE_ARG
    extends StObject
       with TokenName
  inline def FUNCTION_WITH_ONE_ARG: FUNCTION_WITH_ONE_ARG = "FUNCTION_WITH_ONE_ARG".asInstanceOf[FUNCTION_WITH_ONE_ARG]
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with TokenName
  inline def NUMBER: NUMBER = "NUMBER".asInstanceOf[NUMBER]
  
  @js.native
  sealed trait OPENING_PARENTHESIS
    extends StObject
       with TokenName
  inline def OPENING_PARENTHESIS: OPENING_PARENTHESIS = "OPENING_PARENTHESIS".asInstanceOf[OPENING_PARENTHESIS]
  
  @js.native
  sealed trait POSTFIX_FUNCTION_WITH_ONE_ARG
    extends StObject
       with TokenName
  inline def POSTFIX_FUNCTION_WITH_ONE_ARG: POSTFIX_FUNCTION_WITH_ONE_ARG = "POSTFIX_FUNCTION_WITH_ONE_ARG".asInstanceOf[POSTFIX_FUNCTION_WITH_ONE_ARG]
  
  @js.native
  sealed trait SPACE
    extends StObject
       with TokenName
  inline def SPACE: SPACE = "SPACE".asInstanceOf[SPACE]
}
