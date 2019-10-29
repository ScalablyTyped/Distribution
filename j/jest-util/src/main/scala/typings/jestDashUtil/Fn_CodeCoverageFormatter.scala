package typings.jestDashUtil

import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.CodeCoverageFormatter
import typings.atJestTestDashResult.buildTypesMod.CodeCoverageReporter
import typings.atJestTestDashResult.buildTypesMod.FormattedTestResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CodeCoverageFormatter extends js.Object {
  def apply(results: AggregatedResult): FormattedTestResults = js.native
  def apply(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def apply(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
}

