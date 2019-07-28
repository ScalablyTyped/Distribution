package typings.jsforce.apiAnalyticsMod

import typings.jsforce.connectionMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Analytics")
@js.native
class Analytics () extends js.Object {
  def dashboard(id: String): js.Promise[Dashboard] = js.native
  def dashboards(): js.Promise[js.Array[DashboardInfo]] = js.native
  def dashboards(callback: Callback[js.Array[DashboardInfo]]): js.Promise[js.Array[DashboardInfo]] = js.native
  def report(id: String): js.Promise[Report] = js.native
  def reports(): js.Promise[js.Array[ReportInfo]] = js.native
  def reports(callback: Callback[js.Array[ReportInfo]]): js.Promise[js.Array[ReportInfo]] = js.native
}

