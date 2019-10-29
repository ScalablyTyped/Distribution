package typings.atJestTestDashResult

import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.CodeCoverageFormatter
import typings.atJestTestDashResult.buildTypesMod.CodeCoverageReporter
import typings.atJestTestDashResult.buildTypesMod.FormattedTestResults
import typings.atJestTestDashResult.buildTypesMod.SerializableError
import typings.atJestTestDashResult.buildTypesMod.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result", JSImport.Namespace)
@js.native
object atJestTestDashResultMod extends js.Object {
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}

