package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageSummary extends js.Object {
  var branches: Totals
  var functions: Totals
  var lines: Totals
  var statements: Totals
}

object CoverageSummary {
  @scala.inline
  def apply(branches: Totals, functions: Totals, lines: Totals, statements: Totals): CoverageSummary = {
    val __obj = js.Dynamic.literal(branches = branches, functions = functions, lines = lines, statements = statements)
  
    __obj.asInstanceOf[CoverageSummary]
  }
}

