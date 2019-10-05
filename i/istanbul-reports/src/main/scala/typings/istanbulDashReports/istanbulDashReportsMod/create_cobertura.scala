package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typings.istanbulDashReports.istanbulDashReportsStrings.cobertura
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_cobertura extends js.Object {
  def apply(name: cobertura): Visitor[Node] = js.native
  def apply(name: cobertura, options: Partial[RootedOptions]): Visitor[Node] = js.native
}

