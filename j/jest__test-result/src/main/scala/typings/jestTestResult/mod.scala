package typings.jestTestResult

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.CodeCoverageFormatter
import typings.jestTestResult.typesMod.CodeCoverageReporter
import typings.jestTestResult.typesMod.FormattedTestResults
import typings.jestTestResult.typesMod.SerializableError
import typings.jestTestResult.typesMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/test-result", "addResult")
  @js.native
  def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = js.native
  
  @JSImport("@jest/test-result", "buildFailureTestResult")
  @js.native
  def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = js.native
  
  @JSImport("@jest/test-result", "formatTestResults")
  @js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  @JSImport("@jest/test-result", "formatTestResults")
  @js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: js.UndefOr[scala.Nothing],
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  @JSImport("@jest/test-result", "formatTestResults")
  @js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  @JSImport("@jest/test-result", "formatTestResults")
  @js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  
  @JSImport("@jest/test-result", "makeEmptyAggregatedTestResult")
  @js.native
  def makeEmptyAggregatedTestResult(): AggregatedResult = js.native
}
