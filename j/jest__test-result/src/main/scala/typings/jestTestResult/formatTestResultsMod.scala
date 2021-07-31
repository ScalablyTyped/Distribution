package typings.jestTestResult

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.CodeCoverageFormatter
import typings.jestTestResult.typesMod.CodeCoverageReporter
import typings.jestTestResult.typesMod.FormattedTestResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTestResultsMod {
  
  @JSImport("@jest/test-result/build/formatTestResults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(results: AggregatedResult): FormattedTestResults = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(results.asInstanceOf[js.Any]).asInstanceOf[FormattedTestResults]
  @scala.inline
  def default(results: AggregatedResult, codeCoverageFormatter: Unit, reporter: CodeCoverageReporter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  @scala.inline
  def default(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  @scala.inline
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
}
