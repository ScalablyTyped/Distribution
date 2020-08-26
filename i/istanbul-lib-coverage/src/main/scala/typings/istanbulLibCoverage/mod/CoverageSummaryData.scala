package typings.istanbulLibCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageSummaryData extends js.Object {
  var branches: Totals = js.native
  var functions: Totals = js.native
  var lines: Totals = js.native
  var statements: Totals = js.native
}

object CoverageSummaryData {
  @scala.inline
  def apply(branches: Totals, functions: Totals, lines: Totals, statements: Totals): CoverageSummaryData = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageSummaryData]
  }
  @scala.inline
  implicit class CoverageSummaryDataOps[Self <: CoverageSummaryData] (val x: Self) extends AnyVal {
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
    def setBranches(value: Totals): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctions(value: Totals): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLines(value: Totals): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatements(value: Totals): Self = this.set("statements", value.asInstanceOf[js.Any])
  }
  
}

