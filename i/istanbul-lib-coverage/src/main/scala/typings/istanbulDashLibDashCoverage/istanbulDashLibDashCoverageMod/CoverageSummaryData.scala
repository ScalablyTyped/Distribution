package typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageSummaryData extends js.Object {
  var branches: Totals
  var functions: Totals
  var lines: Totals
  var statements: Totals
}

object CoverageSummaryData {
  @scala.inline
  def apply(branches: Totals, functions: Totals, lines: Totals, statements: Totals): CoverageSummaryData = {
    val __obj = js.Dynamic.literal(branches = branches, functions = functions, lines = lines, statements = statements)
  
    __obj.asInstanceOf[CoverageSummaryData]
  }
}

