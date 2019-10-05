package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typings.istanbulDashReports.Anon_BlockName
import typings.istanbulDashReports.istanbulDashReportsStrings.teamcity
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_teamcity extends js.Object {
  def apply(name: teamcity): Visitor[Node] = js.native
  def apply(name: teamcity, options: Partial[Options with Anon_BlockName]): Visitor[Node] = js.native
}

