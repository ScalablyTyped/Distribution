package typings.atJestTypes.buildCircusMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var currentDescribeBlock: DescribeBlock
  var currentlyRunningTest: js.UndefOr[TestEntry | Null] = js.undefined
  var expand: js.UndefOr[Boolean] = js.undefined
  var hasFocusedTests: Boolean
  var includeTestLocationInResult: Boolean
  var originalGlobalErrorHandlers: js.UndefOr[GlobalErrorHandlers] = js.undefined
  var parentProcess: Process | Null
  var rootDescribeBlock: DescribeBlock
  var testNamePattern: js.UndefOr[RegExp | Null] = js.undefined
  var testTimeout: Double
  var unhandledErrors: js.Array[Exception]
}

object State {
  @scala.inline
  def apply(
    currentDescribeBlock: DescribeBlock,
    hasFocusedTests: Boolean,
    includeTestLocationInResult: Boolean,
    rootDescribeBlock: DescribeBlock,
    testTimeout: Double,
    unhandledErrors: js.Array[Exception],
    currentlyRunningTest: TestEntry = null,
    expand: js.UndefOr[Boolean] = js.undefined,
    originalGlobalErrorHandlers: GlobalErrorHandlers = null,
    parentProcess: Process = null,
    testNamePattern: RegExp = null
  ): State = {
    val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock, hasFocusedTests = hasFocusedTests, includeTestLocationInResult = includeTestLocationInResult, rootDescribeBlock = rootDescribeBlock, testTimeout = testTimeout, unhandledErrors = unhandledErrors)
    if (currentlyRunningTest != null) __obj.updateDynamic("currentlyRunningTest")(currentlyRunningTest)
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (originalGlobalErrorHandlers != null) __obj.updateDynamic("originalGlobalErrorHandlers")(originalGlobalErrorHandlers)
    if (parentProcess != null) __obj.updateDynamic("parentProcess")(parentProcess)
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern)
    __obj.asInstanceOf[State]
  }
}

