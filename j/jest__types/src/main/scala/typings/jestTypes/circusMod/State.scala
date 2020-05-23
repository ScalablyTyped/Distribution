package typings.jestTypes.circusMod

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
    currentlyRunningTest: js.UndefOr[Null | TestEntry] = js.undefined,
    expand: js.UndefOr[Boolean] = js.undefined,
    originalGlobalErrorHandlers: GlobalErrorHandlers = null,
    parentProcess: Process = null,
    testNamePattern: js.UndefOr[Null | RegExp] = js.undefined
  ): State = {
    val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock.asInstanceOf[js.Any], hasFocusedTests = hasFocusedTests.asInstanceOf[js.Any], includeTestLocationInResult = includeTestLocationInResult.asInstanceOf[js.Any], rootDescribeBlock = rootDescribeBlock.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any])
    if (!js.isUndefined(currentlyRunningTest)) __obj.updateDynamic("currentlyRunningTest")(currentlyRunningTest.asInstanceOf[js.Any])
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand.get.asInstanceOf[js.Any])
    if (originalGlobalErrorHandlers != null) __obj.updateDynamic("originalGlobalErrorHandlers")(originalGlobalErrorHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(testNamePattern)) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

