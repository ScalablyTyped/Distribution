package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestConsole.typesMod.ConsoleBuffer
import typings.jestConsole.typesMod.LogEntry
import typings.jestTestResult.anon.Added
import typings.jestTestResult.anon.End
import typings.jestTypes.configMod.DisplayName
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  var console: js.UndefOr[ConsoleBuffer] = js.native
  var coverage: js.UndefOr[CoverageMapData] = js.native
  var displayName: js.UndefOr[DisplayName] = js.native
  var failureMessage: js.UndefOr[String | Null] = js.native
  var leaks: Boolean = js.native
  var memoryUsage: js.UndefOr[Bytes] = js.native
  var numFailingTests: Double = js.native
  var numPassingTests: Double = js.native
  var numPendingTests: Double = js.native
  var numTodoTests: Double = js.native
  var openHandles: js.Array[Error] = js.native
  var perfStats: End = js.native
  var skipped: Boolean = js.native
  var snapshot: Added = js.native
  var sourceMaps: js.UndefOr[StringDictionary[String]] = js.native
  var testExecError: js.UndefOr[SerializableError] = js.native
  var testFilePath: String = js.native
  var testResults: js.Array[AssertionResult] = js.native
}

object TestResult {
  @scala.inline
  def apply(
    leaks: Boolean,
    numFailingTests: Double,
    numPassingTests: Double,
    numPendingTests: Double,
    numTodoTests: Double,
    openHandles: js.Array[Error],
    perfStats: End,
    skipped: Boolean,
    snapshot: Added,
    testFilePath: String,
    testResults: js.Array[AssertionResult]
  ): TestResult = {
    val __obj = js.Dynamic.literal(leaks = leaks.asInstanceOf[js.Any], numFailingTests = numFailingTests.asInstanceOf[js.Any], numPassingTests = numPassingTests.asInstanceOf[js.Any], numPendingTests = numPendingTests.asInstanceOf[js.Any], numTodoTests = numTodoTests.asInstanceOf[js.Any], openHandles = openHandles.asInstanceOf[js.Any], perfStats = perfStats.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], testFilePath = testFilePath.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
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
    def setLeaks(value: Boolean): Self = this.set("leaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumFailingTests(value: Double): Self = this.set("numFailingTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPassingTests(value: Double): Self = this.set("numPassingTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumPendingTests(value: Double): Self = this.set("numPendingTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumTodoTests(value: Double): Self = this.set("numTodoTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenHandlesVarargs(value: Error*): Self = this.set("openHandles", js.Array(value :_*))
    @scala.inline
    def setOpenHandles(value: js.Array[Error]): Self = this.set("openHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerfStats(value: End): Self = this.set("perfStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipped(value: Boolean): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshot(value: Added): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestFilePath(value: String): Self = this.set("testFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestResultsVarargs(value: AssertionResult*): Self = this.set("testResults", js.Array(value :_*))
    @scala.inline
    def setTestResults(value: js.Array[AssertionResult]): Self = this.set("testResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsoleVarargs(value: LogEntry*): Self = this.set("console", js.Array(value :_*))
    @scala.inline
    def setConsole(value: ConsoleBuffer): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setCoverage(value: CoverageMapData): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureMessage: Self = this.set("failureMessage", js.undefined)
    @scala.inline
    def setFailureMessageNull: Self = this.set("failureMessage", null)
    @scala.inline
    def setMemoryUsage(value: Bytes): Self = this.set("memoryUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryUsage: Self = this.set("memoryUsage", js.undefined)
    @scala.inline
    def setSourceMaps(value: StringDictionary[String]): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    @scala.inline
    def setTestExecError(value: SerializableError): Self = this.set("testExecError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestExecError: Self = this.set("testExecError", js.undefined)
  }
  
}

