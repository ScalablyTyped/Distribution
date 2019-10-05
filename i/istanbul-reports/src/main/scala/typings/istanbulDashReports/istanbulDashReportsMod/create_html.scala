package typings.istanbulDashReports.istanbulDashReportsMod

import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typings.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typings.istanbulDashReports.istanbulDashReportsStrings.html
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_html extends js.Object {
  def apply(name: html): Visitor[Node] = js.native
  def apply(name: html, options: Partial[HtmlOptions]): Visitor[Node] = js.native
}

