package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Test result message containing the state of the test as well as a
  * description and source position for test failures.
  */
trait SchemaTestResult extends StObject {
  
  /**
    * Debug messages related to test execution issues encountered during
    * evaluation.  Debug messages may be related to too many or too few
    * invocations of function mocks or to runtime errors that occur during
    * evaluation.  For example: ```Unable to read variable [name:
    * &quot;resource&quot;]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error
    * occurs.  Evaluation of an expression may result in an error. Rules are
    * deny by default, so a `DENY` expectation when an error is generated is
    * valid. When there is a `DENY` with an error, the `SourcePosition` is
    * returned.  E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[SchemaSourcePosition] = js.undefined
  
  /**
    * The set of function calls made to service-defined methods.  Function
    * calls are included in the order in which they are encountered during
    * evaluation, are provided for both mocked and unmocked functions, and
    * included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[SchemaFunctionCall]] = js.undefined
  
  /**
    * State of the test.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * The set of visited expressions for a given test. This returns positions
    * and evaluation results of all visited expressions.
    */
  var visitedExpressions: js.UndefOr[js.Array[SchemaVisitedExpression]] = js.undefined
}
object SchemaTestResult {
  
  inline def apply(): SchemaTestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestResult]
  }
  
  extension [Self <: SchemaTestResult](x: Self) {
    
    inline def setDebugMessages(value: js.Array[String]): Self = StObject.set(x, "debugMessages", value.asInstanceOf[js.Any])
    
    inline def setDebugMessagesUndefined: Self = StObject.set(x, "debugMessages", js.undefined)
    
    inline def setDebugMessagesVarargs(value: String*): Self = StObject.set(x, "debugMessages", js.Array(value :_*))
    
    inline def setErrorPosition(value: SchemaSourcePosition): Self = StObject.set(x, "errorPosition", value.asInstanceOf[js.Any])
    
    inline def setErrorPositionUndefined: Self = StObject.set(x, "errorPosition", js.undefined)
    
    inline def setFunctionCalls(value: js.Array[SchemaFunctionCall]): Self = StObject.set(x, "functionCalls", value.asInstanceOf[js.Any])
    
    inline def setFunctionCallsUndefined: Self = StObject.set(x, "functionCalls", js.undefined)
    
    inline def setFunctionCallsVarargs(value: SchemaFunctionCall*): Self = StObject.set(x, "functionCalls", js.Array(value :_*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVisitedExpressions(value: js.Array[SchemaVisitedExpression]): Self = StObject.set(x, "visitedExpressions", value.asInstanceOf[js.Any])
    
    inline def setVisitedExpressionsUndefined: Self = StObject.set(x, "visitedExpressions", js.undefined)
    
    inline def setVisitedExpressionsVarargs(value: SchemaVisitedExpression*): Self = StObject.set(x, "visitedExpressions", js.Array(value :_*))
  }
}
