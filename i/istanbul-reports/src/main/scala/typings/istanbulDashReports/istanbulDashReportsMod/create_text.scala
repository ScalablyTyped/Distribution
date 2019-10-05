package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typings.istanbulDashReports.Anon_MaxCols
import typings.istanbulDashReports.istanbulDashReportsStrings.text
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_text extends js.Object {
  def apply(name: text): Visitor[Node] = js.native
  def apply(name: text, options: Partial[Options with Anon_MaxCols]): Visitor[Node] = js.native
}

