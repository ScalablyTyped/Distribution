package typings.jestUtil.anon

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.CodeCoverageFormatter
import typings.jestTestResult.typesMod.CodeCoverageReporter
import typings.jestTestResult.typesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallResultsCodeCoverageFormatterReporter extends js.Object {
  def apply(results: AggregatedResult): FormattedTestResults = js.native
  def apply(
    results: AggregatedResult,
    codeCoverageFormatter: js.UndefOr[scala.Nothing],
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def apply(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def apply(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

