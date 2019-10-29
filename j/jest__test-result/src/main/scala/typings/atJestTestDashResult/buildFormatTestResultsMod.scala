package typings.atJestTestDashResult

import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.CodeCoverageFormatter
import typings.atJestTestDashResult.buildTypesMod.CodeCoverageReporter
import typings.atJestTestDashResult.buildTypesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/test-result/build/formatTestResults", JSImport.Namespace)
@js.native
object buildFormatTestResultsMod extends js.Object {
  def default(results: AggregatedResult): FormattedTestResults = js.native
  def default(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def default(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

