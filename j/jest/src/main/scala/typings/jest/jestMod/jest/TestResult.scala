package typings.jest.jestMod.jest

import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Added
import typings.jest.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var console: Maybe[ConsoleBuffer]
  var coverage: js.UndefOr[RawCoverage] = js.undefined
  var failureMessage: Maybe[String]
  var memoryUsage: js.UndefOr[Bytes] = js.undefined
  var numFailingTests: Double
  var numPassingTests: Double
  var numPendingTests: Double
  var perfStats: Anon_End
  var skipped: Boolean
  var snapshot: Anon_Added
  var sourceMaps: StringDictionary[String]
  var testExecError: js.UndefOr[SerializableError] = js.undefined
  var testFilePath: String
  var testResults: js.Array[AssertionResult]
}

object TestResult {
  @scala.inline
  def apply(
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    perfStats: Anon_End,
    skipped: Boolean,
    snapshot: Anon_Added,
    sourceMaps: StringDictionary[String],
    testFilePath: String,
    testResults: js.Array[AssertionResult],
    console: Maybe[ConsoleBuffer] = null,
    coverage: RawCoverage = null,
    failureMessage: Maybe[String] = null,
    memoryUsage: Int | Double = null,
    testExecError: SerializableError = null
  ): TestResult = {
    val __obj = js.Dynamic.literal(numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], sourceMaps = sourceMaps.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    if (console != null) __obj.updateDynamic("console")(console.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (memoryUsage != null) __obj.updateDynamic("memoryUsage")(memoryUsage.asInstanceOf[js.Any])
    if (testExecError != null) __obj.updateDynamic("testExecError")(testExecError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

