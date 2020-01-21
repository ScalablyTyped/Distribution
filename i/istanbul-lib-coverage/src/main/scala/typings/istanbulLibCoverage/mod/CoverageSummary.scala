package typings.istanbulLibCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-coverage", "CoverageSummary")
@js.native
class CoverageSummary protected () extends js.Object {
  def this(data: CoverageSummary) = this()
  def this(data: CoverageSummaryData) = this()
  var branches: Totals = js.native
  var data: CoverageSummaryData = js.native
  var functions: Totals = js.native
  var lines: Totals = js.native
  var statements: Totals = js.native
  def isEmpty(): Boolean = js.native
  def merge(obj: CoverageSummary): CoverageSummary = js.native
  def toJSON(): CoverageSummaryData = js.native
}

