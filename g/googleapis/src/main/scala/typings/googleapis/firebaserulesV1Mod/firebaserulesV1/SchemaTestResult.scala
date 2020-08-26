package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Test result message containing the state of the test as well as a
  * description and source position for test failures.
  */
@js.native
trait SchemaTestResult extends js.Object {
  /**
    * Debug messages related to test execution issues encountered during
    * evaluation.  Debug messages may be related to too many or too few
    * invocations of function mocks or to runtime errors that occur during
    * evaluation.  For example: ```Unable to read variable [name:
    * &quot;resource&quot;]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error
    * occurs.  Evaluation of an expression may result in an error. Rules are
    * deny by default, so a `DENY` expectation when an error is generated is
    * valid. When there is a `DENY` with an error, the `SourcePosition` is
    * returned.  E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[SchemaSourcePosition] = js.native
  /**
    * The set of function calls made to service-defined methods.  Function
    * calls are included in the order in which they are encountered during
    * evaluation, are provided for both mocked and unmocked functions, and
    * included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[SchemaFunctionCall]] = js.native
  /**
    * State of the test.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The set of visited expressions for a given test. This returns positions
    * and evaluation results of all visited expressions.
    */
  var visitedExpressions: js.UndefOr[js.Array[SchemaVisitedExpression]] = js.native
}

object SchemaTestResult {
  @scala.inline
  def apply(): SchemaTestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestResult]
  }
  @scala.inline
  implicit class SchemaTestResultOps[Self <: SchemaTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebugMessagesVarargs(value: String*): Self = this.set("debugMessages", js.Array(value :_*))
    @scala.inline
    def setDebugMessages(value: js.Array[String]): Self = this.set("debugMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMessages: Self = this.set("debugMessages", js.undefined)
    @scala.inline
    def setErrorPosition(value: SchemaSourcePosition): Self = this.set("errorPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorPosition: Self = this.set("errorPosition", js.undefined)
    @scala.inline
    def setFunctionCallsVarargs(value: SchemaFunctionCall*): Self = this.set("functionCalls", js.Array(value :_*))
    @scala.inline
    def setFunctionCalls(value: js.Array[SchemaFunctionCall]): Self = this.set("functionCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionCalls: Self = this.set("functionCalls", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setVisitedExpressionsVarargs(value: SchemaVisitedExpression*): Self = this.set("visitedExpressions", js.Array(value :_*))
    @scala.inline
    def setVisitedExpressions(value: js.Array[SchemaVisitedExpression]): Self = this.set("visitedExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitedExpressions: Self = this.set("visitedExpressions", js.undefined)
  }
  
}

