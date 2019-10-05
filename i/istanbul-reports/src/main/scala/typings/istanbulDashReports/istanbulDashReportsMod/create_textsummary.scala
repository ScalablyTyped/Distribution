package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typings.istanbulDashReports.istanbulDashReportsStrings.`text-summary`
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_textsummary extends js.Object {
  def apply(name: `text-summary`): Visitor[Node] = js.native
  def apply(name: `text-summary`, options: Partial[Options]): Visitor[Node] = js.native
}

