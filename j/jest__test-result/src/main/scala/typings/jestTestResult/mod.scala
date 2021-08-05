package typings.jestTestResult

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.CodeCoverageFormatter
import typings.jestTestResult.typesMod.CodeCoverageReporter
import typings.jestTestResult.typesMod.FormattedTestResults
import typings.jestTestResult.typesMod.SerializableError
import typings.jestTestResult.typesMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/test-result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addResult(aggregatedResults: AggregatedResult, testResult: TestResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addResult")(aggregatedResults.asInstanceOf[js.Any], testResult.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildFailureTestResult(testPath: String, err: SerializableError): TestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFailureTestResult")(testPath.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[TestResult]
  
  inline def formatTestResults(results: AggregatedResult): FormattedTestResults = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any]).asInstanceOf[FormattedTestResults]
  inline def formatTestResults(results: AggregatedResult, codeCoverageFormatter: Unit, reporter: CodeCoverageReporter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  inline def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  inline def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  
  inline def makeEmptyAggregatedTestResult(): AggregatedResult = ^.asInstanceOf[js.Dynamic].applyDynamic("makeEmptyAggregatedTestResult")().asInstanceOf[AggregatedResult]
}
